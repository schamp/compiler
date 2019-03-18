header {package decaf;}

options 
{
  mangleLiteralPrefix = "TK_";
  language="Java";
}

class DecafScanner extends Lexer;
options 
{
  k=3;
  testLiterals=false;
}

tokens 
{
  "boolean";
  "break";
  "callout";
  "class";
  "continue";
  "else";
  "for";
  "if";
  "int";
  "return";
  "void";
  TRUE_LITERAL="true";
  FALSE_LITERAL="false";
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

ADD_OP : '+' | '-' ;

MULT_OP: '*' | '/' | '%' ;

REL_OP : '<' | '>' | "<=" | ">=" ;

EQ_OP : "==" | "!=" ;

AND_OP : "&&" ;

OR_OP : "||" ;

ASSIGN_OP : EQUALS | "+=" | "-=" ;

EQUALS : '=' ;

MINUS : '-' ;

protected
ESC :  '\\' ('n'|'t'|'\\'|'\"'|'\'') ;

protected
ALPHA : 'a'..'z' | 'A'..'Z' ;

protected
ALPHA_NUM : ALPHA | DIGIT ;

protected
TRUE : "true" ;

protected
FALSE : "false" ;

protected
CHAR : '\40'..'\41'
     | '\43'..'\46'
     | '\50'..'\133'
     | '\135'..'\176'
     | ESC
     ;

protected
DECIMAL_LITERAL : (DIGIT) (DIGIT)* ;

protected
HEX_LITERAL : '0' 'x' (HEX_DIGIT) (HEX_DIGIT)* ;

protected
DIGIT : '0'..'9' ;

protected
HEX_DIGIT : DIGIT | 'a'..'f' | 'A'..'F' ;
