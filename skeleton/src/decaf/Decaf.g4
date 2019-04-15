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
CHAR: '\u0020'..'\u0021'
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

program : CLASS IDENTIFIER LCURLY (fieldDecl)* (methodDecl)* RCURLY EOF ;

type : INT | BOOLEAN ;

fieldDeclItem : IDENTIFIER | IDENTIFIER LBRACKET INT_LITERAL RBRACKET ;
fieldDeclList : fieldDeclItem (COMMA fieldDeclItem)* ;

fieldDecl : type fieldDeclList SEMICOLON ;

paramItem : type IDENTIFIER ;
paramList : paramItem (COMMA paramItem)* ;

methodDecl : (type | VOID) IDENTIFIER LPAREN (paramList)? RPAREN block ;

block : LCURLY (varDecl)* (statement)* RCURLY ;

idList : IDENTIFIER (COMMA IDENTIFIER)* ;

varDecl : type idList SEMICOLON ;

statement : location ( EQUALS | PLUS_EQUALS | MINUS_EQUALS ) expr SEMICOLON # AssignStmt
          | methodCall SEMICOLON                                            # MethodCallStmt
          | IF LPAREN expr RPAREN block (ELSE block)?                       # IfStmt
          | FOR IDENTIFIER EQUALS expr COMMA expr block                     # ForStmt
          | RETURN (expr)? SEMICOLON                                        # ReturnStmt
          | BREAK SEMICOLON                                                 # BreakStmt
          | CONTINUE SEMICOLON                                              # ContinueStmt
          | block                                                           # BlockStmt
          ;

expr : methodCall # MethodCallExpr
     | location   # LocationExpr
     | literal    # LiteralExpr
     | LPAREN expr RPAREN # ParenExpr
     | ( MINUS | NOT ) expr # UnaryExpr
     | expr (TIMES | DIV | MOD ) expr  # AddExpr
     | expr ( PLUS | MINUS ) expr      # AddExpr
     | expr (LT | LTE | GT | GTE | EQ | NEQ ) expr # CompExpr
     | expr AND expr # BoolExpr
     | expr OR expr  # BoolExpr
    ;

literal : INT_LITERAL     # IntLiteral
        | CHAR_LITERAL    # CharLiteral
        | STRING_LITERAL  # StringLiteral
        | (TRUE | FALSE)  # BoolLiteral
        ;

location: IDENTIFIER LBRACKET expr RBRACKET  # IdArrayLocation
        | IDENTIFIER                         # IdLocation
        ;

methodCall: IDENTIFIER LPAREN ( exprList )* RPAREN
            | CALLOUT LPAREN STRING_LITERAL (COMMA exprList)* RPAREN
            ;

exprList : expr (COMMA expr)* ;
