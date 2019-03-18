// Generated from /Users/thomaskim/proj/compiler/skeleton/src/decaf/Decaf.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BREAK=2, CALLOUT=3, CLASS=4, CONTINUE=5, ELSE=6, FALSE=7, FOR=8, 
		IF=9, INT=10, RETURN=11, TRUE=12, VOID=13, LCURLY=14, RCURLY=15, COMMA=16, 
		SEMICOLON=17, LBRACKET=18, RBRACKET=19, LPAREN=20, RPAREN=21, WS_=22, 
		SL_COMMENT=23, INT_LITERAL=24, CHAR_LITERAL=25, STRING_LITERAL=26, IDENTIFIER=27, 
		MINUS=28, PLUS=29, TIMES=30, DIV=31, MOD=32, LT=33, GT=34, LTE=35, GTE=36, 
		EQ=37, NEQ=38, AND=39, OR=40, EQUALS=41, PLUS_EQUALS=42, MINUS_EQUALS=43, 
		NOT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FALSE", "FOR", 
		"IF", "INT", "RETURN", "TRUE", "VOID", "LCURLY", "RCURLY", "COMMA", "SEMICOLON", 
		"LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "WS_", "SL_COMMENT", "INT_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "ESC", "CHAR", "DECIMAL_LITERAL", "HEX_LITERAL", 
		"HEX_DIGIT", "DIGIT", "ALPHA", "ALPHA_NUM", "IDENTIFIER", "MINUS", "PLUS", 
		"TIMES", "DIV", "MOD", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "AND", "OR", 
		"EQUALS", "PLUS_EQUALS", "MINUS_EQUALS", "NOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'break'", "'callout'", "'class'", "'continue'", "'else'", 
		"'false'", "'for'", "'if'", "'int'", "'return'", "'true'", "'void'", "'{'", 
		"'}'", "','", "';'", "'['", "']'", "'('", "')'", null, null, null, null, 
		null, null, "'-'", "'+'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'!='", "'&&'", "'||'", "'='", "'+='", "'-='", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "BREAK", "CALLOUT", "CLASS", "CONTINUE", "ELSE", "FALSE", 
		"FOR", "IF", "INT", "RETURN", "TRUE", "VOID", "LCURLY", "RCURLY", "COMMA", 
		"SEMICOLON", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "WS_", "SL_COMMENT", 
		"INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "IDENTIFIER", "MINUS", 
		"PLUS", "TIMES", "DIV", "MOD", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", 
		"AND", "OR", "EQUALS", "PLUS_EQUALS", "MINUS_EQUALS", "NOT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21:
			WS__action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS__action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u013c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\7\30\u00cf\n\30\f\30\16\30\u00d2\13\30\3\30\3"+
		"\30\3\30\3\31\3\31\5\31\u00d9\n\31\3\32\3\32\3\32\3\32\3\33\3\33\7\33"+
		"\u00e1\n\33\f\33\16\33\u00e4\13\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\5\35\u00ed\n\35\3\36\6\36\u00f0\n\36\r\36\16\36\u00f1\3\37\3\37\3\37"+
		"\3\37\6\37\u00f8\n\37\r\37\16\37\u00f9\3 \3 \5 \u00fe\n \3!\3!\3\"\3\""+
		"\3#\3#\5#\u0106\n#\3$\3$\5$\u010a\n$\3$\3$\7$\u010e\n$\f$\16$\u0111\13"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3."+
		"\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\29\2;\2=\2?\2A\2C\2E\2G\35I\36K\37M O!Q\"S#U$W%Y&["+
		"\'](_)a*c+e,g-i.\3\2\t\5\2\13\f\16\16\"\"\3\2\f\f\7\2$$))^^ppvv\6\2\""+
		"#%(*]_\u0080\4\2CHch\3\2\62;\4\2C\\c|\2\u013e\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3"+
		"\2\2\2\3k\3\2\2\2\5s\3\2\2\2\7y\3\2\2\2\t\u0081\3\2\2\2\13\u0087\3\2\2"+
		"\2\r\u0090\3\2\2\2\17\u0095\3\2\2\2\21\u009b\3\2\2\2\23\u009f\3\2\2\2"+
		"\25\u00a2\3\2\2\2\27\u00a6\3\2\2\2\31\u00ad\3\2\2\2\33\u00b2\3\2\2\2\35"+
		"\u00b7\3\2\2\2\37\u00b9\3\2\2\2!\u00bb\3\2\2\2#\u00bd\3\2\2\2%\u00bf\3"+
		"\2\2\2\'\u00c1\3\2\2\2)\u00c3\3\2\2\2+\u00c5\3\2\2\2-\u00c7\3\2\2\2/\u00ca"+
		"\3\2\2\2\61\u00d8\3\2\2\2\63\u00da\3\2\2\2\65\u00de\3\2\2\2\67\u00e7\3"+
		"\2\2\29\u00ec\3\2\2\2;\u00ef\3\2\2\2=\u00f3\3\2\2\2?\u00fd\3\2\2\2A\u00ff"+
		"\3\2\2\2C\u0101\3\2\2\2E\u0105\3\2\2\2G\u0109\3\2\2\2I\u0112\3\2\2\2K"+
		"\u0114\3\2\2\2M\u0116\3\2\2\2O\u0118\3\2\2\2Q\u011a\3\2\2\2S\u011c\3\2"+
		"\2\2U\u011e\3\2\2\2W\u0120\3\2\2\2Y\u0123\3\2\2\2[\u0126\3\2\2\2]\u0129"+
		"\3\2\2\2_\u012c\3\2\2\2a\u012f\3\2\2\2c\u0132\3\2\2\2e\u0134\3\2\2\2g"+
		"\u0137\3\2\2\2i\u013a\3\2\2\2kl\7d\2\2lm\7q\2\2mn\7q\2\2no\7n\2\2op\7"+
		"g\2\2pq\7c\2\2qr\7p\2\2r\4\3\2\2\2st\7d\2\2tu\7t\2\2uv\7g\2\2vw\7c\2\2"+
		"wx\7m\2\2x\6\3\2\2\2yz\7e\2\2z{\7c\2\2{|\7n\2\2|}\7n\2\2}~\7q\2\2~\177"+
		"\7w\2\2\177\u0080\7v\2\2\u0080\b\3\2\2\2\u0081\u0082\7e\2\2\u0082\u0083"+
		"\7n\2\2\u0083\u0084\7c\2\2\u0084\u0085\7u\2\2\u0085\u0086\7u\2\2\u0086"+
		"\n\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7w\2\2"+
		"\u008e\u008f\7g\2\2\u008f\f\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n"+
		"\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\16\3\2\2\2\u0095\u0096"+
		"\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099"+
		"\u009a\7g\2\2\u009a\20\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7t\2\2\u009e\22\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1"+
		"\24\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\26\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7w\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7p\2\2\u00ac\30\3\2\2\2\u00ad"+
		"\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\32\3\2\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7"+
		"k\2\2\u00b5\u00b6\7f\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8\36"+
		"\3\2\2\2\u00b9\u00ba\7\177\2\2\u00ba \3\2\2\2\u00bb\u00bc\7.\2\2\u00bc"+
		"\"\3\2\2\2\u00bd\u00be\7=\2\2\u00be$\3\2\2\2\u00bf\u00c0\7]\2\2\u00c0"+
		"&\3\2\2\2\u00c1\u00c2\7_\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4*"+
		"\3\2\2\2\u00c5\u00c6\7+\2\2\u00c6,\3\2\2\2\u00c7\u00c8\t\2\2\2\u00c8\u00c9"+
		"\b\27\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\7\61\2\2\u00cc"+
		"\u00d0\3\2\2\2\u00cd\u00cf\n\3\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\b\30\3\2\u00d5\60\3\2\2"+
		"\2\u00d6\u00d9\5=\37\2\u00d7\u00d9\5;\36\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\62\3\2\2\2\u00da\u00db\7)\2\2\u00db\u00dc\59\35\2\u00dc"+
		"\u00dd\7)\2\2\u00dd\64\3\2\2\2\u00de\u00e2\7$\2\2\u00df\u00e1\59\35\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6"+
		"\66\3\2\2\2\u00e7\u00e8\7^\2\2\u00e8\u00e9\t\4\2\2\u00e98\3\2\2\2\u00ea"+
		"\u00ed\t\5\2\2\u00eb\u00ed\5\67\34\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed:\3\2\2\2\u00ee\u00f0\5A!\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2<\3\2\2\2\u00f3"+
		"\u00f4\7\62\2\2\u00f4\u00f5\7z\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\5?"+
		" \2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa>\3\2\2\2\u00fb\u00fe\5A!\2\u00fc\u00fe\t\6\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe@\3\2\2\2\u00ff\u0100\t\7\2\2"+
		"\u0100B\3\2\2\2\u0101\u0102\t\b\2\2\u0102D\3\2\2\2\u0103\u0106\5C\"\2"+
		"\u0104\u0106\5A!\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106F\3\2"+
		"\2\2\u0107\u010a\5C\"\2\u0108\u010a\7a\2\2\u0109\u0107\3\2\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010f\3\2\2\2\u010b\u010e\5E#\2\u010c\u010e\7a\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110H\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113"+
		"\7/\2\2\u0113J\3\2\2\2\u0114\u0115\7-\2\2\u0115L\3\2\2\2\u0116\u0117\7"+
		",\2\2\u0117N\3\2\2\2\u0118\u0119\7\61\2\2\u0119P\3\2\2\2\u011a\u011b\7"+
		"\'\2\2\u011bR\3\2\2\2\u011c\u011d\7>\2\2\u011dT\3\2\2\2\u011e\u011f\7"+
		"@\2\2\u011fV\3\2\2\2\u0120\u0121\7>\2\2\u0121\u0122\7?\2\2\u0122X\3\2"+
		"\2\2\u0123\u0124\7@\2\2\u0124\u0125\7?\2\2\u0125Z\3\2\2\2\u0126\u0127"+
		"\7?\2\2\u0127\u0128\7?\2\2\u0128\\\3\2\2\2\u0129\u012a\7#\2\2\u012a\u012b"+
		"\7?\2\2\u012b^\3\2\2\2\u012c\u012d\7(\2\2\u012d\u012e\7(\2\2\u012e`\3"+
		"\2\2\2\u012f\u0130\7~\2\2\u0130\u0131\7~\2\2\u0131b\3\2\2\2\u0132\u0133"+
		"\7?\2\2\u0133d\3\2\2\2\u0134\u0135\7-\2\2\u0135\u0136\7?\2\2\u0136f\3"+
		"\2\2\2\u0137\u0138\7/\2\2\u0138\u0139\7?\2\2\u0139h\3\2\2\2\u013a\u013b"+
		"\7#\2\2\u013bj\3\2\2\2\16\2\u00d0\u00d8\u00e2\u00ec\u00f1\u00f9\u00fd"+
		"\u0105\u0109\u010d\u010f\4\3\27\2\3\30\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}