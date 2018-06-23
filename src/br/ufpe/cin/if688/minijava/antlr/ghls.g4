grammar MiniJava;


@header {
package br.ufpe.cin.if688.minijava.antlr;
}

goal: mainClass classDeclaration*;

mainClass
: 
'class' identifier '{' 'public' 'static' 'void' 'main' 
	'(' 'String' '[' ']' identifier ')' 
	'{' statement '}' '}' 
;

classDeclaration
: 
'class' identifier ('extends' identifier)? '{' 
	varDeclaration* methodDeclaration* 
'}'
;

varDeclaration: type identifier ';' ;

methodDeclaration
: 
'public' type identifier '(' (type identifier (',' type identifier)* )? ')' 
'{' varDeclaration* statement* 'return' expression ';' '}' 
;

type:  'int' | 'int' '[' ']' | 'boolean' | identifier ;

statement: block
| ifStmt
| whileStmt
| printStmt
| assignStmt
| arrayAssignStmt
;

block: '{' statement* '}' ;
ifStmt: 'if' '(' expression ')' statement 'else' statement ;
whileStmt: 'while' '(' expression ')' statement ;
printStmt: 'System.out.println' '(' expression ')' ';' ;
assignStmt: identifier '=' expression ';' ;
arrayAssignStmt: identifier '[' expression ']' '=' expression ';' ;

expression:   
| expression op expression // 3
| expression '[' expression ']' // 4
| expression '.' 'length' // 3
| expression '.' identifier '(' (expression (',' expression)* )? ')' //  5+
| '!' expression // 2
| intengerLiteral  // 1
| bool // 1
| identifier // 1
| 'this' // 1
| 'new' 'int' '[' expression ']' // 5
| 'new' identifier '(' ')' // 4
| '(' expression ')' // 3
;

op : ( '&&' | '||' | '%' | '<=' | '<' | '>' |
	'>=' | '==' | '+' | '-' | '*' | '/' | '!='
) ;

bool: BOOL ;
intengerLiteral: INT;
identifier: ID ;

ID: [a-zA-Z_][a-zA-Z_0-9]* ;
INT: [0-9]+ ;
BOOL: ('true' | 'false');
WS: [ \t\r\n]+ -> skip ;
COMMENT   : '/*' .*? '*/' -> skip ;
LINE_COMMENT  
: '//' .*? '\r'? '\n' -> skip;

