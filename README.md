# CLikeLangParser
simple lang parser using antlr4 and based on Lua.g4
```
grammar CLikeLang;

start : stat EOF;

stat
    : NAME '=' exp                                                      #assign
    | 'while' '(' cond=exp ')' '{' block=stat* '}'                      #while
    | 'if' '(' cond=exp ')'
        'then' '{' ifBlock=stat* '}'
        ( 'else' '{' elseBlock=stat* '}' )?                             #if
    | exp                                                               #expression
    ;

exp
    : arithExp
    | boolExp
    ;

arithExp
    : <assoc=right> l=arithExp op='^' r=arithExp                         #power
    | op='-' arithExp                                                    #unaryInt
    | <assoc=left> l=arithExp op=('*' | '/') r=arithExp                  #mulDiv
    | <assoc=left> l=arithExp op=('+' | '-') r=arithExp                  #addSub
    | '('arithExp')'                                                     #bracketsArith
    | INT                                                                #myInt
    | NAME                                                               #myString
    ;

boolExp
    : l=arithExp op=('<' | '>' | '<=' | '>=' | '!=' | '==') r=arithExp   #compare
    | op='!' boolExp                                                     #unaryBool
    | <assoc=right> l=boolExp op=('&&' | '||') r=boolExp                 #andOr
    ;

NAME
    : [a-z]
    ;

INT
    : [0-9]+
    ;

WS : (' ' | '\t')+ -> channel(HIDDEN);\
```
