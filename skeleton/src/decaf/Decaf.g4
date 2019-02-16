grammar Decaf;

options
{
  language='Java';
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
WS_ : ( ' ' | '\t' | '\n' | '\f' ) { skip(); } ;

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
HEX_DIGIT : ( DIGIT | [a-fA-F] ) ;

fragment
DIGIT : [0-9] ;

fragment
ALPHA : [a-zA-Z] ;

fragment
ALPHA_NUM : ALPHA | DIGIT ;

IDENTIFIER : ( ALPHA | '_' ) ( ALPHA_NUM | '_' )* ;

MINUS : '-' ;
PLUS : '+' ;

TIMES : '*' ;
DIV : '/' ;
MOD : '%' ;

LT : '<' ;
GT : '>' ;
LTE : '<=' ;
GTE : '>=' ;

EQ : '==' ;
NEQ : '!=' ;

AND : '&&' ;
OR : '||' ;

EQUALS : '=' ;
PLUS_EQUALS : '+=' ;
MINUS_EQUALS : '-=' ;

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

statement : location ( EQUALS | PLUS_EQUALS | MINUS_EQUALS ) expr SEMICOLON # AssignStmt
          | method_call SEMICOLON                                           # MethodCallStmt
          | IF LPAREN expr RPAREN block (ELSE block)?                       # IfStmt
          | FOR IDENTIFIER EQUALS expr COMMA expr block                     # ForStmt
          | RETURN (expr)? SEMICOLON                                        # ReturnStmt
          | BREAK SEMICOLON                                                 # BreakStmt
          | CONTINUE SEMICOLON                                              # ContinueStmt
          | block                                                           # BlockStmt
          ;

expr : method_call
     | location
     | literal
     | LPAREN expr RPAREN
     | ( MINUS | NOT ) expr
     | expr (TIMES | DIV | MOD ) expr
     | expr ( PLUS | MINUS ) expr
     | expr (LT | LTE | GT | GTE | EQ | NEQ ) expr
     | expr AND expr
     | expr OR expr
     ;

literal : INT_LITERAL
        | CHAR_LITERAL
        | STRING_LITERAL
        ;

location : IDENTIFIER LBRACKET expr RBRACKET
         | IDENTIFIER
         ;

method_call : IDENTIFIER LPAREN ( expr_list )* RPAREN
            | CALLOUT LPAREN STRING_LITERAL (COMMA expr_list)* RPAREN
            ;

expr_list : expr (COMMA expr)* ;
