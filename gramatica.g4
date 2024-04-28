grammar gramatica;
// Definição dos tokens
NUMBER : [0-9]+ ;
DOUBLE : [0-9]+'.'[0-9]+ ;
ID : [a-zA-Z0-9_]+ ;
ASSIGN: '=';
COMMA: ',';
PLUS: '+';
MINUS: '-';
TIMES: '*';
POW:'^';
DIVIDE: '/';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
LSQUAREBRACE: '[';
RSQUAREBRACE: ']';
OP_RELACIONAL: '>'|'<'|'>='|'<='|'!=';
STRING : '"' .*? '"' ;
WS : [ \t\r\n]+ -> skip ;


// Definição das regras da gramática
program : declarationClass ;

declarationClass: visibility (ID)+ (LBRACE statement+ RBRACE);

statement : declarationTypeVar | ifStatement | forLoop | whileLoop | inputStatement | outputStatement | teste;

visibility: 'public'| 'private'|'protected';
dataType: 'int'| 'String'| 'double';

typeInt: 'int' ID ASSIGN NUMBER SEMICOLON;
typeString: 'String' ID ASSIGN  STRING SEMICOLON;
typeDouble: 'double' ID ASSIGN DOUBLE SEMICOLON;

declarationTypeVar: visibility (typeInt| typeDouble| typeString);

declarationVar: dataType ID  ASSIGN NUMBER|DOUBLE|STRING;
assignment: ID ASSIGN NUMBER|DOUBLE|STRING;

expression : relaExpr | addExpr;

addExpr : mulExpr ((PLUS | MINUS) mulExpr)*;

mulExpr : powExpr ((TIMES | DIVIDE) powExpr)*;

powExpr : atom (POW atom)?;

teste: ID ASSIGN addExpr SEMICOLON;

atom : NUMBER
     | STRING
     | ID
     | LPAREN expression RPAREN;

relaExpr:(ID|NUMBER) OP_RELACIONAL (ID|NUMBER);

ifStatement : 'if' LPAREN expression RPAREN LBRACE statement+ RBRACE ('else' LBRACE statement+ RBRACE)? ;

whileLoop : 'while' LPAREN expression RPAREN LBRACE statement+ RBRACE ;

forLoop : 'for' LPAREN (assignment | declarationVar)? SEMICOLON expression? SEMICOLON ID '++'? RPAREN LBRACE statement+ RBRACE ;

inputStatement : 'scanf' LPAREN ID RPAREN SEMICOLON;

outputStatement : 'printf' LPAREN expression RPAREN SEMICOLON;

