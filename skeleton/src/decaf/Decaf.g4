grammar Decaf;

options
{
  //mangleLiteralPrefix = 'TK_';
  language='Java';
  //k=3;
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

LCURLY : '{';
RCURLY : '}';

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
WS_ : (' ' | '\t' | '\n' | '\f' ) { skip(); };

SL_COMMENT : '//' ( ~'\n' )* '\n' { skip(); };

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
DECIMAL_LITERAL : (DIGIT) (DIGIT)* ;

fragment
HEX_LITERAL : '0' 'x' (HEX_DIGIT) (HEX_DIGIT)* ;

fragment
DIGIT : '0'..'9' ;

fragment
HEX_DIGIT : DIGIT | 'a'..'f' | 'A'..'F' ;

INT_LITERAL : ( DECIMAL_LITERAL | HEX_LITERAL ) ;
CHAR_LITERAL : '\'' (CHAR) '\'';
STRING_LITERAL : '"' (CHAR)* '"';

fragment
ALPHA : 'a'..'z' | 'A'..'Z' ;

fragment
ALPHA_NUM : ALPHA | DIGIT ;

IDENTIFIER : ( ALPHA | '_' ) ( ALPHA_NUM | '_' )* ;

ADD_OP : '+' | '-' ;

MULT_OP: '*' | '/' | '%' ;

REL_OP : '<' | '>' | '<=' | '>=' ;

EQ_OP : '==' | '!=' ;

AND_OP : '&&' ;

OR_OP : '||' ;

ASSIGN_OP : EQUALS | '+=' | '-=' ;

EQUALS : '=' ;

MINUS : '-' ;

expr : ADD_OP ;
