TinyJava:
	jflex TinyJava.jflex

TinyJavaLexer:
	javac TinyJavaLexer.java

TinyJavaLex:
	javac TinyJavaLex.java

clean:
	rm -f *.class TinyJavaLexer.java