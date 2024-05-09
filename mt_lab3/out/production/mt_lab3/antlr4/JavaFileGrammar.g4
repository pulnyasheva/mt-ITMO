grammar JavaFileGrammar;

program : javaFile EOF;

javaFile : packageRule? (importRule | sep)* programComponent sep*;

packageRule : package sep+ qualifiedName sep* semicolon;
importRule  : importWord sep+ qualifiedName '*'? sep* semicolon;

programComponent : (annotation | sep+)* (class | interface | enum);

class : (modifier sep+)* classWord sep+ NAME sep* '{'
            (field | function | sep )* '}';

interface : (modifier sep+)* interfaceWord sep+ NAME sep* '{'
                        (field | functionDef | sep )* '}';

enum : (modifier sep+)* enumWord sep+ NAME sep* '{' sep*
                   enumsName
                   (semicolon (field | function | sep )*)? '}';

enumName : NAME;

enumsName : enumName sep* (',' sep* enumName sep*)*;

field : (modifier sep+)* type sep+ NAME sep* ('=' sep* defField)? sep* semicolon;

function : (annotation sep+)* (modifier sep+)* (void | type) sep+ nameFunc sep* '(' sep* args? ')' sep* '{'
                content '}';

functionDef : (annotation sep+)* (modifier sep+)* (void | type) sep+ nameFunc sep* '(' sep* args? ')' sep* semicolon;

functionCall : NAME sep* '(' sep* defFields? ')';


ifConstr : if sep* '(' sep* exprsIf sep* ')' sep* '{'
                 content '}' sep*
                 elseConstr?;

elseConstr : else sep* '{' content '}';

whileConstr : while sep* '(' sep* exprsIf sep* ')' sep* '{' content '}';

forConstr : for sep* '(' sep* typeFor sep* NAME sep* '=' sep* number sep* ';' sep*
                         exprsIf sep* ';' sep* changeField sep* ')' sep* '{' content '}';

content : (field | buildFunc sep* semicolon
                 | functionCall sep* semicolon
                 | ifConstr
                 | whileConstr
                 | forConstr
                 | return sep* defField semicolon
                 | break sep* semicolon
                 | changeField sep* semicolon
                 | sep)*;

buildFunc : buildClass ( NAME '.')*  buildname sep* '(' sep* defFields? ')';

buildname : NAME;

buildClass : 'System.' | 'Math.' | 'List.' | 'Map.' | 'Collections.' | 'Math.';

exprIf : '!'? (number | charOrString | NAME | functionCall | bool);

exprsIf : exprIf sep* ( ( cmp | LOGIC ) sep* exprIf sep* )*;

qualifiedName : NAME ( '.' NAME )*;

annotation : '@' NAME;

changeField : NAME sep* ( ('=' | OPERATION '=') sep* defField | '++' | '--' );

defFieldOne : number | charOrString | NAME
               | buildFunc
               | functionCall
               | new sep* qualifiedName ( sep* lt sep* types? gt )? '(' sep* defFields? ')';

defField : defFieldOne sep* (OPERATION sep* defFieldOne sep*)*;

defFields : defField sep* ( ',' sep* defField sep* )*;

type : typeWord | qualifiedName ( sep* lt sep* types gt )?;

types : type sep* ( ',' sep* type sep* )*;

arg : type sep+ NAME;

args : arg sep* ( ',' sep* arg sep* )*;

nameFunc : NAME;

number : NUMBER;
new    : NEW;

lt : LT;
gt : GT;

classWord     : CLASS;
interfaceWord : INTERFACE;
enumWord      : ENUM;
package       : PACKAGE;
importWord    : IMPORT;

void : VOID;

break : BREAK;

if   : IF;
else : ELSE;

while : WHILE;
for   : FOR;

return : RETURN;

typeWord : INT
         | CHAR
         | DOUBLE
         | BYTE
         | LONG
         | FLOAT
         | BOOLEAN;

typeFor : INT
        | LONG;

modifier : PRIVATE
         | PUBLIC
         | PROTECTED
         | STATIC
         | FINAL
         | ABSTRACT;

semicolon : SEMICOLON;
newLine   : NEWLINE;
space     : SPACE;
tab       : TAB;
sep       : newLine | space | tab;

cmp : LT | GT | EQ;

bool : FALSE | TRUE;

charOrString : CHARACTER | STRING;

LT : '<';
GT : '>';
EQ : '==';

PACKAGE   : 'package';
IMPORT    : 'import';
CLASS     : 'class';
INTERFACE : 'interface';
ENUM      : 'enum';

NEW : 'new';

VOID : 'void';

TRUE : 'true';
FALSE : 'false';

BREAK : 'break';

IF   : 'if';
ELSE : 'else';

WHILE : 'while';
FOR   : 'for';

RETURN : 'return';

INT     : 'int';
CHAR    : 'char';
DOUBLE  : 'double';
BYTE    : 'byte';
LONG    : 'long';
FLOAT   : 'float';
BOOLEAN : 'boolean';

PRIVATE      : 'private';
PUBLIC       : 'public';
PROTECTED    : 'protected';
STATIC       : 'static';
FINAL        : 'final';
VOLATILE     : 'volatile';
SYNCHRONIZED : 'synchronized';
ABSTRACT     : 'abstract';
TRANSIENT    : 'transient';

NAME      : [a-zA-Z][a-zA-Z0-9_]*;
NUMBER    : '-'? [0-9]+;
LOGIC     : '&' '&'? | '|' '|'?;
NEWLINE   : '\r'? '\n' | '\r' | '\f';
SPACE     : ' ';
TAB       : '\t';
SEMICOLON : ';';
CHARACTER : '\'' (~['] | '\\\'') '\'';
STRING    : '"' (~["] | '\\\'')* '"';
OPERATION : '+' | '-' | '*' | '/';