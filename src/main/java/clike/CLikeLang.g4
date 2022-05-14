grammar CLikeLang;


stat
    : NAME '=' exp
    | 'while' exp 'do' '{' block '}'
    | 'if' exp 'then' '{' block '}' ( 'else' '{' block '}' )?
    ;

exp
    : 'nil' | 'false' | 'true'
    | NAME
    | number
    | <assoc=right> exp operatorPower exp
    | operatorUnary exp
    | exp operatorMulDiv exp
    | exp operatorAddSub exp
    | exp operatorComparison exp
    | exp operatorAnd exp
    | exp operatorOr exp
    | '(' exp ')'
    ;

block
    : stat* retstat?
    ;

retstat
    : 'return' exp?
    ;

operatorOr
	: '||';

operatorAnd
	: '&&';

operatorComparison
	: '<' | '>' | '<=' | '>=' | '/=' | '==';

operatorAddSub
	: '+' | '-';

operatorMulDiv
	: '*' | '/';

operatorUnary
    : '-';

operatorPower
    : '^';

number
    : INT
    ;

NAME
    : [a-z]
    ;

INT
    : Digit+
    ;

Digit
    : [0-9]
    ;

WS: [ \t\n] -> skip;