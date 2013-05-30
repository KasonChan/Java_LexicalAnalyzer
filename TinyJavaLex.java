/*
    TinyJavaLex.java
    Programmer: Ka Son Chan KaSonChan@my.unt.edu
    Class: CSCE 3650, Spring 2013
    Due: Feb 6, 2013
    cse06.cse.unt.edu
*/

public class TinyJavaLex {

  private static final int MAX_TOKENS = 2000;

  public static void main (String args []) throws java.io.IOException {

    int i, n;
    Token [] token = new Token [MAX_TOKENS];
    TinyJavaLexer lexer = new TinyJavaLexer (System . in);

    System . out . println ("Source Program");
    System . out . println ("--------------");
    System . out . println ();

    n = -1;
    do {
      if (n < MAX_TOKENS)
        token [++n] = lexer . nextToken ();
      else
	ErrorMessage . print (0, "Maximum number of tokens exceeded");
    } while (token [n] . symbol () != TokenClass . EOF);

    System . out . println ();
    System . out . println ("List of Tokens");
    System . out . println ("--------------");
    System . out . println ();
    for (i = 0; i < n; i++)
      System . out . println (token [i]);
    System . out . println ();
  }

}