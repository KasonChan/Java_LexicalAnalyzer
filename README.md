Java_LexicalAnalyzer
====================

This program use jflex tool to automatically construct a lexical analyzer for TinyJava from a set of regular expressions specifying tokens.

####Instructions to compile and test run the program: 
(1) To compile the program, enter:
<pre>make clean TinyJava TinyJavaLexer TinyJavaLex</pre>

(2) To execute the program, enter:
<pre>java TinyJavaLex < Tests/Test1.java</pre>
    
(3) To clean up all the generated files, enter:
<pre>make clean</pre>
