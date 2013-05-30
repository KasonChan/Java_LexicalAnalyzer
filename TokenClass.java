/*
    TokenClass.java
    Programmer: Ka Son Chan KaSonChan@my.unt.edu
    Class: CSCE 3650, Spring 2013
    Due: Feb 6, 2013
    cse06.cse.unt.edu
*/

public enum TokenClass {
  EOF, 
  // keywords
  ARGS, BOOLEAN, CLASS, ELSE, FALSE, IF, IN, INT, IMPORT, JAVAUTIL, MAIN, 
  NEW, NEXTINT, OUT, PRINTLN, PUBLIC, RETURN, SCANNER, STATIC, 
  STRING, SYSTEM, THIS, TRUE, VOID, WHILE,
  // punctuation
  COMMA, DOT, SEMICOLON, LBRACE, RBRACE, 
  // operators
  LBRACK, RBRACK, LPAREN, RPAREN, ASSIGN, ADD_OP, MULT_OP, REL_OP, AND, OR, NOT,
  // ids and integers
  ID, INTEGER
}
