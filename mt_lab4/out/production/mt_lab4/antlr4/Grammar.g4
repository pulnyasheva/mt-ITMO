grammar Grammar;

program : nameGrammar startTerm grammarRule+ EOF;

nameGrammar : 'grammar' TOKEN ';';

grammarRule : grammarParserRule | lexicalAnalyzerRule;

startTerm : 'start' TOKEN ';';

grammarParserRule : TOKEN arguments? returnType? ':' variants ';';

arguments : '(' argument (',' argument)* ')';
argument  : type argName;
type      : TOKEN | NAME;
argName   : NAME;

returnType : 'return' nameClass;
nameClass  :  (TOKEN | NAME | '.')*;

variants : variant ('|' variant)*;
variant  : term+ returnTerm?;

term : TOKEN attrs? DEF?;

attrs : '(' attr ('(' attr)* ')';
attr  : NAME;

returnTerm : '[' (TOKEN | DEF) ']';

lexicalAnalyzerRule : TOKEN ':' token ';'
                    | '->' token ';';

token : STRING | REGEX;

NAME   : [a-z][a-zA-Z0-9_]*;
TOKEN  : [A-Z][a-zA-Z0-9_]*;
REGEX  : '\'' (~('\'') | '\\\'')* '\'';
STRING : '"' (~["] | '\\"')* '"';
DEF    : '{' ~[{}]+ '}';
WS     : [ \r\n\t] -> skip;
