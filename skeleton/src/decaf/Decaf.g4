grammar Decaf;

//@header {package decaf;}

options 
{
  //mangleLiteralPrefix = 'TK_';
  language='Java';
  //k=3;
  //testLiterals=false;
}
/*
tokens 
{
  'boolean';
  'break';
  'callout';
  'class';
  'continue';
  'else';
  'for';
  'if';
  'int';
  'return';
  'void';
  TRUE_LITERAL='true';
  FALSE_LITERAL='false';
}


LCURLY options { paraphrase = "{"; testLiterals=true; } : "{";
RCURLY options { paraphrase = "}"; testLiterals=true; } : "}";

COMMA options { paraphrase = ","; testLiterals=true; } : ',' ;
SEMICOLON options { paraphrase = ";"; testLiterals=true; } : ';' ;

LBRACKET options { paraphrase = "["; testLiterals=true; } : '[' ;
RBRACKET options { paraphrase = "]"; testLiterals=true; } : ']' ;

LPAREN options { paraphrase = "("; testLiterals=true; } : '(' ;
RPAREN options { paraphrase = ")"; testLiterals=true; } : ')' ;

ID options { paraphrase = "an identifier"; testLiterals=true; } :
    ( ALPHA | '_' ) ( ALPHA_NUM | '_' )* ;

WS_ : (' ' | '\t' | '\n' {newline();}) {_ttype = Token.SKIP; };

SL_COMMENT : "//" (~'\n')* '\n' {_ttype = Token.SKIP; newline (); };

INT_LITERAL options {testLiterals=true; }: ( DECIMAL_LITERAL | HEX_LITERAL ) ;
CHAR_LITERAL : '\'' (CHAR) '\'';
STRING_LITERAL : '"' (CHAR)* '"';
*/
expr : ADD_OP ;

ADD_OP : '+' | '-' ;
/*
MULT_OP: '*' | '/' | '%' ;

REL_OP : '<' | '>' | "<=" | ">=" ;

EQ_OP : "==" | "!=" ;

AND_OP : "&&" ;

OR_OP : "||" ;

ASSIGN_OP : EQUALS | "+=" | "-=" ;

EQUALS : '=' ;

MINUS : '-' ;

fragment
ESC :  '\\' ('n'|'t'|'\\'|'\"'|'\'') ;

fragment
ALPHA : 'a'..'z' | 'A'..'Z' ;

fragment
ALPHA_NUM : ALPHA | DIGIT ;

fragment
TRUE : "true" ;

fragment
FALSE : "false" ;

fragment
CHAR : '\40'..'\41'
     | '\43'..'\46'
     | '\50'..'\133'
     | '\135'..'\176'
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

*/
