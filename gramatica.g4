grammar gramatica;
ASSIGN: '=';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';

OP_RELACIONAL: '>'|'<'|'>='|'<='|'!='|'==';
STRING: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+('.'[0-9]+)?;

STRING_LITERAL: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;

// Definição da gramática
program: statement*;

statement:
    varDeclaration SEMICOLON
    | ifStatement
    | whileStatement
    | forStatement
    | printfStatement SEMICOLON
    | scanfStatement SEMICOLON
    | assignment SEMICOLON
    | interation;

varDeclaration: ('int' | 'double' | 'string') STRING (ASSIGN expression);

ifStatement: 'if' LPAREN expression RPAREN LBRACE statement+ RBRACE ('else' LBRACE statement+ RBRACE)?;

whileStatement: 'while' LPAREN expression RPAREN LBRACE statement+ RBRACE;

forStatement:
    'for' LPAREN assignment SEMICOLON expression SEMICOLON interation RPAREN LBRACE statement+ RBRACE;

printfStatement: 'printf' LPAREN expression RPAREN;

scanfStatement: 'scanf' LPAREN STRING RPAREN;

assignment: STRING ASSIGN expression;

interation: STRING ('++'|'--') SEMICOLON;

expression:
    expression (TIMES|DIVIDE) expression
    | expression (PLUS|MINUS) expression
    | expression OP_RELACIONAL expression
    | NUMBER
    | STRING_LITERAL
    | STRING
    | LPAREN expression RPAREN
    ;