%%
%{
  private void echo () { System . out . print (yytext ()); }

  public int position () { return yycolumn; }
%}

%class TinyJavaLexer
%unicode
%line
%column
%function nextToken
%type Token
%eofval{
  return new Token (TokenClass . EOF); 
%eofval}

Identifier = [:letter:]("_"?([:letter:] | [:digit:]))*
Integer = [:digit:] [:digit:]*
Comment = "//".*

%%
[ \t\n] { echo (); }
{Comment} { echo (); }
";" { echo (); return new Token (TokenClass . SEMICOLON); }
"."	{ echo (); return new Token (TokenClass . DOT); }
","	{ echo (); return new Token (TokenClass . COMMA); }
"{"	{ echo (); return new Token (TokenClass . LBRACE); }
"}"	{ echo (); return new Token (TokenClass . RBRACE); }
"["	{ echo (); return new Token (TokenClass . LBRACK); }
"]"	{ echo (); return new Token (TokenClass . RBRACK); }
"(" { echo (); return new Token (TokenClass . LPAREN); }
")" { echo (); return new Token (TokenClass . RPAREN); }
"!" { echo (); return new Token (TokenClass . NOT); }
"&&" { echo (); return new Token (TokenClass . AND); }
"||" { echo (); return new Token (TokenClass . OR); }
"<"	{ echo (); return new Token (TokenClass . REL_OP, "<"); }
"<=" { echo (); return new Token (TokenClass . REL_OP, "<="); }
">"	{ echo (); return new Token (TokenClass . REL_OP, ">"); }
">=" { echo (); return new Token (TokenClass . REL_OP, ">="); }
"==" { echo (); return new Token (TokenClass . REL_OP, "=="); }
"!=" { echo (); return new Token (TokenClass . REL_OP, "!="); }
"+"	{ echo (); return new Token (TokenClass . ADD_OP, "+"); }
"-"	{ echo (); return new Token (TokenClass . ADD_OP, "-"); }
"*"	{ echo (); return new Token (TokenClass . MULT_OP, "*"); }
"/"	{ echo (); return new Token (TokenClass . MULT_OP, "/"); }
"="	{ echo (); return new Token (TokenClass . ASSIGN); }
args { echo (); return new Token (TokenClass . ARGS); }
boolean { echo (); return new Token (TokenClass . BOOLEAN); }
class { echo (); return new Token (TokenClass . CLASS); }
else { echo (); return new Token (TokenClass . ELSE); }
false { echo (); return new Token (TokenClass . FALSE); }
if { echo (); return new Token (TokenClass . IF); }
in { echo (); return new Token (TokenClass . IN); }
int { echo (); return new Token (TokenClass . INT); }
import { echo (); return new Token (TokenClass . IMPORT); }
"java.util.*" { echo (); return new Token (TokenClass . JAVAUTIL); }
main { echo (); return new Token (TokenClass . MAIN); }
new { echo (); return new Token (TokenClass . NEW); }
nextInt { echo (); return new Token (TokenClass . NEXTINT); }
out { echo (); return new Token (TokenClass . OUT); }
println { echo (); return new Token (TokenClass . PRINTLN); }
public { echo (); return new Token (TokenClass . PUBLIC); }
return { echo (); return new Token (TokenClass . RETURN); }
Scanner { echo (); return new Token (TokenClass . SCANNER); }
static { echo (); return new Token (TokenClass . STATIC); }
String { echo (); return new Token (TokenClass . STRING); }
System { echo (); return new Token (TokenClass . SYSTEM); }
this { echo (); return new Token (TokenClass . THIS); }
true { echo (); return new Token (TokenClass . TRUE); }
void { echo (); return new Token (TokenClass . VOID); }
while { echo (); return new Token (TokenClass . WHILE); }
{Integer} { echo (); return new Token (TokenClass . INTEGER, yytext ()); }
{Identifier} { echo (); return new Token (TokenClass . ID, yytext ()); }
. { echo (); ErrorMessage . print (yychar, "Illegal character"); }