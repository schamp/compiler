grammar Decaf;

options
{
  language='Java';
  //testLiterals=false;
}

BOOLEAN : 'boolean' ;
BREAK : 'break' ;
CALLOUT : 'callout' ;
CLASS : 'class' ;
CONTINUE : 'continue' ;
ELSE : 'else' ;
FALSE : 'false' ;
FOR : 'for' ;
IF : 'if' ;
INT : 'int' ;
RETURN : 'return' ;
TRUE : 'true' ;
VOID : 'void' ;

LCURLY : '{' ;
RCURLY : '}' ;

COMMA : ',' ;
SEMICOLON : ';' ;

LBRACKET : '[' ;
RBRACKET : ']' ;

LPAREN : '(' ;
RPAREN : ')' ;

// strictly speaking form feed \f (0xC) is not in the Decaf grammar
// but the errors it was producing were hard to handle with our tests
// since we're not likely to use or encounter it in the real world,
// let's make life easy by just considering it whitespace.
WS_ : (' ' | '\t' | '\n' | '\f' ) { skip(); } ;

SL_COMMENT : '//' ( ~'\n' )* '\n' { skip(); } ;

INT_LITERAL : HEX_LITERAL | DECIMAL_LITERAL ;
CHAR_LITERAL : '\'' (CHAR) '\'' ;
STRING_LITERAL : '"' (CHAR)* '"' ;

fragment
ESC :  '\\' ('n'|'t'|'\\'|'"'|'\'') ;

// these must be hex, not octal!
fragment
CHAR : '\u0020'..'\u0021'
     | '\u0023'..'\u0026'
     | '\u0028'..'\u005B'
     | '\u005D'..'\u007E'
     | ESC
     ;

fragment
DECIMAL_LITERAL : DIGIT+;

fragment
HEX_LITERAL : '0x' HEX_DIGIT+ ;

fragment
DIGIT : [0-9] ;

fragment
ALPHA : [a-zA-Z] ;

fragment
ALPHA_NUM : ALPHA | DIGIT ;

IDENTIFIER : ( ALPHA | '_' )+ ;

ADD_OP : '+' | '-' ;

MULT_OP: '*' | '/' | '%' ;

REL_OP : '<' | '>' | '<=' | '>=' ;

EQ_OP : '==' | '!=' ;

AND_OP : '&&' ;

OR_OP : '||' ;

ASSIGN_OP : EQUALS | '+=' | '-=' ;

EQUALS : '=' ;

MINUS : '-' ;

NOT : '!' ;

/* parser rules */

program : CLASS IDENTIFIER LCURLY (field_decl)* (method_decl)* RCURLY EOF ;


type : INT | BOOLEAN ;

field_decl_item : IDENTIFIER | IDENTIFIER LBRACKET INT_LITERAL RBRACKET ;
field_decl_list : field_decl_item (COMMA field_decl_item)* ;

field_decl : type field_decl_list SEMICOLON ;

param_item : type IDENTIFIER ;
param_list : param_item (COMMA param_item)* ;

method_decl : (type | VOID) IDENTIFIER LPAREN (param_list)? RPAREN block ;

block : LCURLY (var_decl)* (statement)* RCURLY ;

id_list : IDENTIFIER (COMMA IDENTIFIER)* ;

var_decl : type id_list SEMICOLON ;

statement : location ASSIGN_OP expr SEMICOLON
          | method_call SEMICOLON
          | if_statement
          | for_statement
          | RETURN (expr)? SEMICOLON
          | BREAK SEMICOLON
          | CONTINUE SEMICOLON
          | block
          ;

if_statement : IF LPAREN expr RPAREN block (ELSE block)? ;

for_statement : FOR IDENTIFIER EQUALS expr COMMA expr block ;

expr : mult_expr ;

mult_expr : add_expr (MULT_OP expr)* ;

add_expr : rel_expr (ADD_OP expr)* ;

rel_expr : and_expr ((REL_OP | EQ_OP) expr)* ;

and_expr : or_expr (AND_OP expr)* ;

or_expr : unary_expr (OR_OP expr)* ;

unary_expr : MINUS expr
           | NOT expr
           | rvalue
           ;

literal : INT_LITERAL
        | CHAR_LITERAL
        | STRING_LITERAL
        ;

rvalue : method_call
       | location
       | literal
       | RPAREN expr LPAREN
       ;


location : IDENTIFIER LBRACKET expr RBRACKET
         | IDENTIFIER
         ;

method_call : IDENTIFIER LPAREN ( expr_list )* RPAREN
            | CALLOUT LPAREN STRING_LITERAL (COMMA expr_list)* RPAREN
            ;

expr_list : expr (COMMA expr)* ;
