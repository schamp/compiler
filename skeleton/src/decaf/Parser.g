header {package decaf;}

options
{
  mangleLiteralPrefix = "TK_";
  language="Java";
}

class DecafParser extends Parser;
options
{
  importVocab=DecafScanner;
  k=3;
  buildAST=true;
}

program: TK_class ID LCURLY (field_decl)* (method_decl)* RCURLY EOF ;

field_decl: type
    ( ID | (ID LBRACKET INT_LITERAL RBRACKET) COMMA)*
    ( ID | (ID LBRACKET INT_LITERAL RBRACKET) ) SEMICOLON
    ;

method_decl: (type | TK_void) ID LPAREN (type ID (COMMA type ID)*)? RPAREN block ;

block: LCURLY (var_decl)* (statement)* RCURLY ;

var_decl: type (ID COMMA)* ID SEMICOLON ;

type: TK_int | TK_boolean ;

statement: location ASSIGN_OP expr
         | method_call
         | TK_if LPAREN expr RPAREN block (TK_else block)?
         | TK_for ID EQ expr COMMA expr block
         | TK_return (expr)? SEMICOLON
         | TK_break SEMICOLON
         | TK_continue SEMICOLON
         | block
         ;

method_call: method_name LPAREN (type ID (COMMA type ID)*)? RPAREN
           | TK_callout LPAREN STRING_LITERAL (COMMA (callout_arg)+ COMMA)? RPAREN
           ;

method_name: ID ;

location: ID |  ID LBRACKET expr RBRACKET ;

expr: expr_prime bin_op expr_prime ;

expr_prime: location
    | method_call
    | literal
    | HYPHEN expr_prime
    | BANG expr_prime
    | LPAREN expr_prime RPAREN
    ;

callout_arg: expr | STRING_LITERAL ;

bin_op: ARITH_OP | REL_OP | EQ_OP | COND_OP ;

literal: INT_LITERAL | CHAR_LITERAL | TRUE_LITERAL | FALSE_LITERAL ;
