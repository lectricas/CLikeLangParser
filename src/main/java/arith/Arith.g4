grammar Arith;

//start returns [main.ArithNode result]: e EOF { $result = $e.result; };
start: e EOF;

e //returns [main.ArithNode result]
   : e1=e operation='*' e2=e #binaryOperation//{ $result = main.NodesKt.createBinOpNode($e1.result, $e2.result, '*'); }
   | e1=e operation='/' e2=e #binaryOperation//{ $result = main.NodesKt.createBinOpNode($e1.result, $e2.result, '/'); }
   | e1=e operation='+' e2=e #binaryOperation//{ $result = main.NodesKt.createBinOpNode($e1.result, $e2.result, '+'); }
   | e1=e operation='-' e2=e #binaryOperation//{ $result = main.NodesKt.createBinOpNode($e1.result, $e2.result, '-'); }
   | '(' e ')' #brackets
   | N #number;//{ $result = $a.result; };
//   | a #number;//{ $result = $a.result; };

//a returns [main.ArithNode result]: N { $result = main.NodesKt.createNumNode($N.getText()); }
//   | '(' e ')' { $result = $e.result; };

//a : N | '(' e ')' ;

N: [0-9]+;

WS: [ \t\n] -> skip;