grammar Project_AST;

options {
    language = Java;
    output = AST;
}

tokens {
    PROGRAM;
    INCLUDES;
    GLOBAL_DECLS;
    STRUCT_DEF;
    STRUCT_MEMBERS;
    VAR_DECL;
    FUNC_DEF;
    PARAMS;
    BLOCK;
    ARRAY_INIT;
    INIT_LIST;
    CASE_STMT;
    FOR_INIT;
}

@members {
String s="";
}
// Parser Rules
program
    : includeDirectives globalDeclarations EOF -> ^(PROGRAM includeDirectives globalDeclarations)
    ;
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
  // The finally clause is the last part a rule executes before returning.
  finally { s = s + "Exit..."+"\n"; }
includeDirectives
    : includeDirective* -> ^(INCLUDES includeDirective*)
    ;

includeDirective
    : '#include' '<' libraryName '>' -> ^('#include' libraryName)
    ;

libraryName
    : 'stdio.h'
    | 'string.h'
    | 'ctype.h'
    | 'stdlib.h'
    | 'time.h'
    | ID '.h'
    ;

globalDeclarations
    : (structDefinition | globalVariableDeclaration | functionDefinition)* -> ^(GLOBAL_DECLS structDefinition* globalVariableDeclaration* functionDefinition*)
    ;

structDefinition
    : 'struct' ID '{' structMembers '}' ';' -> ^(STRUCT_DEF ID structMembers)
    ;

structMembers
    : (variableDeclaration)+ -> ^(STRUCT_MEMBERS variableDeclaration+)
    ;

variableDeclaration
    : dataType declarator ';' -> ^(VAR_DECL dataType declarator)
    ;

declarator
    : ID
    | ID '[' constantExpression? ']'
    | '*' ID
    ;

constantExpression
    : INT_LITERAL
    | ID
    ;

globalVariableDeclaration
    : dataType declarator ('=' initializer)? ';' -> ^(VAR_DECL dataType declarator initializer?)
    ;

initializer
    : expression
    | arrayInitializer
    ;

arrayInitializer
    : '{' initializerList? '}' -> ^(ARRAY_INIT initializerList?)
    ;

initializerList
    : initializer (',' initializer)* -> ^(INIT_LIST initializer+)
    ;

functionDefinition
    : (retType=dataType | 'void') ID '(' parameterList? ')' compoundStatement 
      -> ^(FUNC_DEF $retType? ID parameterList? compoundStatement)
    ;

parameterList
    : parameter (',' parameter)* -> ^(PARAMS parameter+)
    ;

parameter
    : dataType ID ('[' ']')?
    | dataType '*' ID
    ;

compoundStatement
    : '{' statement* '}' -> ^(BLOCK statement*)
    ;

statement
    : compoundStatement
    | localVariableDeclaration
    | ifStatement
    | switchStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    | returnStatement
    | printStatement
    | BREAK ';'
    | CONTINUE ';'
    | expressionStatement
    ;

printStatement
    : 'printf' '(' stringArg? (',' expression)* ')' ';'
    ;

stringArg
    : STRING_LITERAL
    ;

localVariableDeclaration
    : dataType declarator ('=' initializer)? ';' -> ^(VAR_DECL dataType declarator initializer?)
    ;

ifStatement
    : 'if' '(' expression ')' statement (options {greedy=true;} : 'else' statement)?
    ;

switchStatement
    : 'switch' '(' expression ')' '{' caseStatement* defaultStatement? '}'
    ;

caseStatement
    : 'case' INT_LITERAL ':' statement* -> ^(CASE_STMT INT_LITERAL statement*)
    ;

defaultStatement
    : 'default' ':' statement*
    ;

forStatement
    : 'for' '(' forInit? ';' expression? ';' expression? ')' statement
    ;

forInit
    : forVarDeclaration
    | expression -> ^(FOR_INIT expression)
    ;

forVarDeclaration
    : dataType declarator ('=' initializer)?
    ;

whileStatement
    : 'while' '(' expression ')' statement
    ;

doWhileStatement
    : 'do' statement 'while' '(' expression ')' ';'
    ;

returnStatement
    : 'return' expression? ';'
    ;

expressionStatement
    : expression? ';'
    ;

expression
    : term ((op=('+'|'-'|compareOp|logicOp) term)* (assignmentOp^ expression)?)
    ;

compareOp
    : '==' | '!=' | '<' | '>' | '<=' | '>='
    ;

logicOp
    : '&&' | '||'
    ;

assignmentOp
    : '=' | '+=' | '-=' | '*=' | '/=' | '%='
    ;

term
    : factor ((MULT^ | DIV^ | MOD^) factor)*
    ;

factor
    : (prefixOp^)* value postfixOp*
    ;

prefixOp
    : '!' | '~' | '+' | '-' | '++' | '--' | '&' | '*'
    ;

postfixOp
    : '++'
    | '--'
    | '[' expression ']'
    | '(' expressionList? ')'
    | '.' ID
    | '->' ID
    ;

value
    : ID
    | INT_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | CHAR_LITERAL
    | '(' expression ')'
    ;

expressionList 
    : expression (',' expression)*
    ;

dataType
    : 'int'
    | 'char'
    | 'float'
    | 'double'
    | 'long'
    | 'short'
    | 'unsigned'
    | 'signed'
    | 'struct' ID
    ;

// Lexer Rules
MULT : '*' ;
DIV  : '/' ;
MOD  : '%' ;

BREAK : 'break';
CONTINUE : 'continue';
ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT_LITERAL : ('0'..'9')+ ;
FLOAT_LITERAL : ('0'..'9')+ '.' ('0'..'9')* ;
STRING_LITERAL : '"' StringCharacter* '"' ;
CHAR_LITERAL : '\'' StringCharacter '\'' ;
fragment StringCharacter : ~('\\'|'\''|'"') | '\\' . ;
WS : (' '|'\t'|'\r'|'\n')+ { $channel = HIDDEN; } ;
COMMENT : '/*' (options {greedy=false;} : .)* '*/' { $channel = HIDDEN; } ;
LINE_COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' { $channel = HIDDEN; } ;