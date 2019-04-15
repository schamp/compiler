package decaf;

import decaf.generated.*;
import java.io.*;
import java.util.Map;
import java6035.tools.CLI.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

// from https://stackoverflow.com/questions/18132078/handling-errors-in-antlr4#26573239
class ThrowingErrorListener extends BaseErrorListener {

	public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
		throws ParseCancellationException {
		throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
	}
}

class Main {

	public static boolean isTraceOn() {
		Map<String, String> env = System.getenv();
		String trace = env.get("TRACE");
		if (trace != null) {
			System.out.println("TRACE: " + trace);
			return trace.equals("1");
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		try {
			CLI.parse (args, new String[0]);

			InputStream inputStream = args.length == 0 ? System.in : new java.io.FileInputStream(CLI.infile);
	
			if (CLI.target == CLI.SCAN) {
				DecafLexer lexer = new DecafLexer(CharStreams.fromStream(inputStream));

				Token token;
				boolean done = false;
				while (!done) {
					try {
						for (token=lexer.nextToken(); token.getType()!=DecafParser.EOF; token=lexer.nextToken()) {
							String type = "";
							String text = token.getText();

							switch (token.getType()) {
							case DecafLexer.IDENTIFIER:
								type = " IDENTIFIER";
								break;
							case DecafLexer.STRING_LITERAL:
								type = " STRINGLITERAL";
								break;
							case DecafLexer.CHAR_LITERAL:
								type = " CHARLITERAL";
								break;
							case DecafLexer.INT_LITERAL:
								type = " INTLITERAL";
								break;
							case DecafLexer.TRUE:
							case DecafLexer.FALSE:
								type = " BOOLEANLITERAL" ;
								break;
							}
							System.out.println (token.getLine() + type + " " + text);
						}
						done = true;
					} catch(Exception e) {
						// print the error:
						System.out.println(CLI.infile+" "+e);
						//lexer.consume ();
					}
				}
			}
			else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT) {
				DecafLexer lexer = new DecafLexer(CharStreams.fromStream(inputStream));
				lexer.removeErrorListeners();
				lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

				CommonTokenStream tokens = new CommonTokenStream(lexer);

				DecafParser parser = new DecafParser (tokens);
				parser.removeErrorListeners();
				parser.addErrorListener(ThrowingErrorListener.INSTANCE);
				parser.setTrace(isTraceOn());

				parser.program();
			}
			else if (CLI.target == CLI.INTER) {
				DecafLexer lexer = new DecafLexer(CharStreams.fromStream(inputStream));
				lexer.removeErrorListeners();
				lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

				CommonTokenStream tokens = new CommonTokenStream(lexer);

				DecafParser parser = new DecafParser (tokens);
				parser.removeErrorListeners();
				parser.addErrorListener(ThrowingErrorListener.INSTANCE);
				parser.setTrace(isTraceOn());
				ParseTree tree = parser.program();
				DecafSemanticVisitor visitor = new DecafSemanticVisitor();
				visitor.visit(tree);
			}

		} catch(Exception e) {
			// print the error:
			System.out.println(CLI.infile+" "+e);
			System.exit(1);
		}
	}
}

