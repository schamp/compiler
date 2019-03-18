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
  k=4;
  buildAST=true;
}

program: TK_class ID LCURLY (field_decl)* (method_decl)* RCURLY EOF;


type: TK_int | TK_boolean;

field_decl_item: ID | ID LBRACKET INT_LITERAL RBRACKET;
field_decl_list: field_decl_item (COMMA field_decl_item)*;

field_decl: type field_decl_list SEMICOLON;

param_item: type ID;
param_list: param_item (COMMA param_item)*;

method_decl: (type | TK_void) ID LPAREN (param_list)? RPAREN block;

block: LCURLY (var_decl)* (statement)* RCURLY;

id_list: ID (COMMA ID)* ;

var_decl: type id_list SEMICOLON;

statement: location ASSIGN_OP expr SEMICOLON
         | method_call SEMICOLON
         | if_statement
         | for_statement
         | TK_return (expr)? SEMICOLON
         | TK_break SEMICOLON
         | TK_continue SEMICOLON
         | block
         ;

if_statement: TK_if LPAREN expr RPAREN block (TK_else block)?;

for_statement: TK_for ID EQUALS expr COMMA expr block;

expr: mult_expr ;

mult_expr: add_expr (MULT_OP expr)* ;

add_expr: rel_expr (ADD_OP expr)* ;

rel_expr: and_expr ((REL_OP | EQ_OP) expr)* ;

and_expr: or_expr (AND_OP expr)* ;

or_expr: unary_expr (OR_OP expr)* ;

unary_expr: MINUS expr
          | NOT expr
          | rvalue
          ;

literal: INT_LITERAL
       | CHAR_LITERAL
       | STRING_LITERAL
       ;

rvalue: location
      | literal
      | method_call
      | RPAREN expr LPAREN
      ;


location: ID
        | ID LBRACKET expr RBRACKET
        ;

method_call: ID LPAREN expr_list RPAREN
           | TK_callout LPAREN STR_LITERAL (COMMA expr_list)* RPAREN
           ;

expr_list: expr (COMMA expr)* ;