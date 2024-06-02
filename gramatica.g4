grammar gramatica;

import Token;

// Definição da gramática
programa: declaracoes*;

declaracoes:
    declaracaoVariavel
    | estruturaIf
    | estruturaWhile
    | estruturaFor
    | estruturaPrintf
    | estruturaScanf
    | atribuicaoVariavel
    | interacao;

declaracaoVariavelDouble: DOUBLE LETRAS (IGUAL (NUMEROS_DECIMAL|expressaoMatematica))? PONTOVIRGULA;

declaracaoVariavelInt: INT LETRAS (IGUAL (NUMEROS|expressaoMatematica))? PONTOVIRGULA;

declaracaoVariavelString: STRING LETRAS (IGUAL STRING_LITERAL)? PONTOVIRGULA;

declaracaoVariavel: declaracaoVariavelDouble | declaracaoVariavelInt | declaracaoVariavelString;

estruturaIf: IF LPAREN expressao? RPAREN LBRACE declaracoes+ RBRACE (ELSE LBRACE declaracoes+ RBRACE)?;

estruturaWhile: WHILE LPAREN expressao RPAREN LBRACE declaracoes+ RBRACE;

atribuicaoFor: (INT|DOUBLE)? LETRAS (IGUAL (NUMEROS | NUMEROS_DECIMAL))?;

estruturaFor:
    FOR LPAREN (atribuicaoFor|LETRAS) PONTOVIRGULA expressao PONTOVIRGULA interacao RPAREN LBRACE declaracoes+ RBRACE;

leituraVar:E_COMERCIAL LETRAS;

estruturaPrintf:PRINTF LPAREN expressao (VIRGULA LETRAS)? RPAREN PONTOVIRGULA;

estruturaScanf:SCANF LPAREN expressao (VIRGULA leituraVar)? RPAREN PONTOVIRGULA;

atribuicaoVariavel: LETRAS IGUAL expressao PONTOVIRGULA;

interacao: LETRAS (INCREMENTO|DECREMENTO|((MAIS|MENOS) NUMEROS)) PONTOVIRGULA?;

expressao:
     NUMEROS
    | NUMEROS_DECIMAL
    | STRING_LITERAL
    | LETRAS
    | expressaoMatematica
    | relacional
    | logico
    | LPAREN expressao RPAREN
    ;

relacional: expressaoRelacional (OP_RELACIONAL expressaoRelacional)+;

logico: expressaoLogico (OP_LOGICO expressaoLogico)+;

expressaoRelacional:
    | NUMEROS
    | NUMEROS_DECIMAL
    | LETRAS
    | LPAREN expressaoRelacional RPAREN
    ;

expressaoLogico:
    expressaoMatematica
    | relacional
    | NUMEROS
    | NUMEROS_DECIMAL
    | LETRAS
    | LPAREN expressaoLogico RPAREN
    ;

expressaoMatematica:
    term ((MAIS|MENOS) term)*;

term:
    fator ((MULT|DIVISAO) fator)*;

fator:
    NUMEROS
    |NUMEROS_DECIMAL
    | LPAREN expressaoMatematica RPAREN;