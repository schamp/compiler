package decaf;

import decaf.generated.*;
import java.io.*;
import java6035.tools.CLI.*;
import org.antlr.v4.runtime.*;

class Main {
    public static void main(String[] args) {
        try {
        	CLI.parse (args, new String[0]);
        	
        	InputStream inputStream = args.length == 0 ?
                    System.in : new java.io.FileInputStream(CLI.infile);

        	if (CLI.target == CLI.SCAN)
        	{
        		DecafLexer lexer = new DecafLexer(CharStreams.fromStream(inputStream));
        		Token token;
        		boolean done = false;
        		while (!done)
        		{
        			try
        			{
		        		for (token=lexer.nextToken(); token.getType()!=DecafParser.EOF; token=lexer.nextToken())
		        		{
		        			String type = "";
		        			String text = token.getText();

		        			switch (token.getType())
		        			{
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
//							default:
//								type = " "+Integer.toString(token.getType());
//								break;
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
        	else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT)
        	{
        	/*	DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
        		DecafParser parser = new DecafParser (lexer);
                parser.program();
                */
        	}
        	
        } catch(Exception e) {
        	// print the error:
            System.out.println(CLI.infile+" "+e);
            System.exit(1);
        }
    }
}

