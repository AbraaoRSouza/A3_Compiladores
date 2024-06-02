grammar gramatica;

import Token;

// Definição da gramática
program: statement*;

statement:
    varDeclaration
    | ifStatement
    | whileStatement
    | forStatement
    | printfStatement
    | scanfStatement
    | assignment
    | interation;



varNumberDecimalDeclaration: DOUBLE LETTER (ASSIGN (NUMBER_DECIMAL|mathExpression))? SEMICOLON;

varNumberDeclaration: INT LETTER (ASSIGN (NUMBER|mathExpression))? SEMICOLON;

varStringDeclaration: STRING LETTER (ASSIGN STRING_LITERAL)? SEMICOLON;

varDeclaration: varNumberDecimalDeclaration | varNumberDeclaration | varStringDeclaration;

ifStatement: IF LPAREN expression RPAREN LBRACE statement+ RBRACE (ELSE LBRACE statement+ RBRACE)?;

whileStatement: WHILE LPAREN expression RPAREN LBRACE statement+ RBRACE;

assignmentToFor: (INT|DOUBLE)? LETTER (ASSIGN (NUMBER | NUMBER_DECIMAL))?;

forStatement:
    FOR LPAREN (assignmentToFor|LETTER) SEMICOLON expression SEMICOLON interation RPAREN LBRACE statement+ RBRACE;

ampersandVarStatement:AMPERSAND LETTER;

printfStatement:PRINTF LPAREN expression (COMMA ampersandVarStatement)? RPAREN SEMICOLON;

scanfStatement:SCANF LPAREN expression (COMMA ampersandVarStatement)? RPAREN SEMICOLON;

assignment: LETTER ASSIGN (expression SEMICOLON|scanfStatement);

interation: LETTER (INCREASE|REDUCE|((PLUS|MINUS) NUMBER)) SEMICOLON?;

expression:
     mathExpression
    | expression OP_RELACIONAL expression
    | NUMBER
    | NUMBER_DECIMAL
    | STRING_LITERAL
    | LETTER
    | LPAREN expression RPAREN
    ;

mathExpression:
 mathExpression (TIMES|DIVIDE) mathExpression
    | mathExpression (PLUS|MINUS) mathExpression
    | NUMBER
    | NUMBER_DECIMAL
    | LPAREN mathExpression RPAREN;
