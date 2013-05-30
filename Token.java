/*
    Token.java
    Programmer: Ka Son Chan KaSonChan@my.unt.edu
    Class: CSCE 3650, Spring 2013
    Due: Feb 6, 2013
    cse06.cse.unt.edu
*/

class Token {

  private TokenClass symbol;	// current token
  private String lexeme;	// lexeme

  public Token () { }

  public Token (TokenClass symbol) {
    this (symbol, null);
  }

  public Token (TokenClass symbol, String lexeme) {
    this . symbol = symbol;
    this . lexeme  = lexeme;
  }

  public TokenClass symbol () { return symbol; }

  public String lexeme () { return lexeme; }

  public String toString () {
    switch (symbol) {
      case ARGS :      return "(keyword, args) ";
      case BOOLEAN :   return "(keyword, boolean) ";
      case CLASS :     return "(keyword, class) ";
      case ELSE :      return "(keyword, else) ";
      case FALSE :     return "(keyword, false) ";
      case IF :        return "(keyword, if) ";
      case IMPORT :    return "(keyword, import) ";
      case IN :        return "(keyword, in) ";
      case INT :       return "(keyword, int) ";
      case JAVAUTIL :  return "(keyword, java.util.*) ";
      case MAIN:      return "(keyword, main) ";
      case NEW :       return "(keyword, new) ";
      case NEXTINT :   return "(keyword, nextInt) ";
      case OUT :       return "(keyword, out) ";
      case PRINTLN :   return "(keyword, println) ";
      case PUBLIC :    return "(keyword, public) ";
      case RETURN :    return "(keyword, return) ";
      case SCANNER :   return "(keyword, Scanner) ";
      case STATIC :    return "(keyword, static) ";
      case STRING :    return "(keyword, String) ";
      case SYSTEM :    return "(keyword, System) ";
      case THIS :      return "(keyword, this) ";
      case TRUE :      return "(keyword, true) ";
      case VOID :      return "(keyword, void) ";
      case WHILE :     return "(keyword, while) ";
      case ASSIGN :    return "(operator, =) ";
      case ADD_OP :    return "(operator, " + lexeme + ") ";
      case MULT_OP :   return "(operator, " + lexeme + ") ";
      case REL_OP :    return "(operator, " + lexeme + ") ";
      case NOT :       return "(operator, !) ";
      case AND :       return "(operator, &&) ";
      case OR :        return "(operator, ||) ";
      case LPAREN :    return "(operator, () ";
      case RPAREN :    return "(operator, )) ";
      case LBRACK :    return "(operator, [) ";
      case RBRACK :    return "(operator, ]) ";
      case LBRACE :    return "(punctuation, {) ";
      case RBRACE :    return "(punctuation, }) ";
      case COMMA :     return "(punctuation, ,) ";
      case DOT :       return "(punctuation, .) ";
      case SEMICOLON : return "(punctuation, ;) ";
      case ID :        return "(identifier, " + lexeme + ") ";
      case INTEGER :   return "(integer, " + lexeme + ") ";
      default : 
	ErrorMessage . print (0, "Unrecognized token");
        return null;
    }
  }
}