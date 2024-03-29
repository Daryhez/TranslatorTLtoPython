grammar TLON;

parse
 : from_input | from_file
 ;

from_input
 : stat NEWLINE
 ;

from_file
 : (stat|NEWLINE)* EOF
 ;

stat
 : simple_stat
 | compound_stat
 ;

compound_stat
 : if_stat
 | while_stat
 | for_stat
 | funcion
 ;

simple_stat
 : assignment
 | log
 | leer
 | importar
 | atom NEWLINE
 | expr
 | OTHER
 ;

assignment
 : variable ASSIGN (assignment|expr)
 ;

if_stat
 : if_condition_block (else_if_sy)* (else_sy)?
 ;

if_condition_block
 : IF condition_block
 ;
 
else_sy
 : ELSE  stat_block
 ; 
 
else_if_sy
 : ELSE IF condition_block
 ;
 
while_stat
 : WHILE expr stat_block
 ;

for_stat
 : FOR ID IN expr stat_block
 ;

log
 : LOG OPAR expr CPAR
 ;

leer
 : LEER OPAR expr CPAR
 ;

funcion
 : FUNCION ID OPAR (parametro (COMMA parametro)*)? CPAR (NEWLINE|stat|retornar)* END
 ;

importar
 : IMPORT ID (POINT ID)*
 | FROM ID IMPORT ID
 ;

retornar
 : RETORNO OPAR expr CPAR NEWLINE
 ;

condition_block
 : expr NEWLINE? stat_block
 ;

stat_block
 : OBRACE (stat|retornar|NEWLINE)* CBRACE
 | (stat|retornar) NEWLINE
 ;

array
 : OKEY (expr (COMMA expr)*)? CKEY
 | OKEY start=expr POINTS (step=expr POINTS)? end=expr CKEY
 ;

accessarray
 : variable OKEY expr CKEY
 ;

accesstoobject
 : variable POINT variableaccessarray
 ;

 variableaccessarray
 : variable
 | accessarray
 ;

variable
 : call_function
 | ID (POINT ID)* OKEY expr CKEY
 ; 

call_function
 : ID (POINT ID)* (OPAR (expr (COMMA expr)*)? CPAR)?
 ;
 
parametro
 : ID (ASSIGN expr)?
 ;

expr
 : <assoc=right>left=expr POW right=expr        #powExpr
 | MINUS expr                                   #unaryMinusExpr
 | NOT expr                                     #notExpr
 | left=expr op=(MULT|DIV|MOD) right=expr       #multiplicationExpr
 | left=expr op=(PLUS|MINUS) right=expr         #additiveExpr
 | left=expr op=(LTEQ|GTEQ|LT|GT) right=expr    #relationalExpr
 | left=expr op=(EQ|NEQ) right=expr             #equalityExpr
 | left=expr AND right=expr                     #andExpr
 | left=expr OR right=expr                      #orExpr
 | OPAR expr CPAR 						        #parExpr
 | atom                                         #atomExpr
 ;

atom
 : (INT|FLOAT)  #numberAtom
 | (TRUE|FALSE) #booleanAtom
 | STRING       #stringAtom
 | array		#arrayAtom
 | objeto		#objetoAtom
 | accessarray  #accessToarray
 | accesstoobject #accessObject
 | variable		#accessVariable
 | NIL          #nilAtom
 ;

objeto
 : OBRACE (keyvalue (COMMA keyvalue)*)? CBRACE
 ;

keyvalue
 : ID POINTS expr
 ;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
OKEY : '[';
CKEY : ']';
COMMA : ',';
POINTS: ':';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
LOG : 'log';
LEER : 'leer';
FOR : 'for';
IN : 'in';
FUNCION: 'funcion';
END: 'end funcion';
RETORNO: 'retorno';
IMPORT: 'importar';
FROM: 'desde';
ASTERISC: 'todo';
POINT: '.';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r] -> skip
 ;

NEWLINE
 : [\n]
 ;

OTHER
 : .
 ;
