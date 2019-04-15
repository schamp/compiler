// Generated from /Users/thomaskim/proj/compiler/skeleton/src/decaf/Decaf.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_fieldDeclItem = 2, RULE_fieldDeclList = 3, 
		RULE_fieldDecl = 4, RULE_paramItem = 5, RULE_paramList = 6, RULE_methodDecl = 7, 
		RULE_block = 8, RULE_idList = 9, RULE_varDecl = 10, RULE_statement = 11, 
		RULE_expr = 12, RULE_literal = 13, RULE_location = 14, RULE_methodCall = 15, 
		RULE_exprList = 16;
	public static final String[] ruleNames = {
		"program", "type", "fieldDeclItem", "fieldDeclList", "fieldDecl", "paramItem", 
		"paramList", "methodDecl", "block", "idList", "varDecl", "statement", 
		"expr", "literal", "location", "methodCall", "exprList"
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

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DecafParser.IDENTIFIER, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(CLASS);
			setState(35);
			match(IDENTIFIER);
			setState(36);
			match(LCURLY);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(37);
					fieldDecl();
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << VOID))) != 0)) {
				{
				{
				setState(43);
				methodDecl();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(RCURLY);
			setState(50);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclItemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DecafParser.IDENTIFIER, 0); }
		public TerminalNode LBRACKET() { return getToken(DecafParser.LBRACKET, 0); }
		public TerminalNode INT_LITERAL() { return getToken(DecafParser.INT_LITERAL, 0); }
		public TerminalNode RBRACKET() { return getToken(DecafParser.RBRACKET, 0); }
		public FieldDeclItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclItem; }
	}

	public final FieldDeclItemContext fieldDeclItem() throws RecognitionException {
		FieldDeclItemContext _localctx = new FieldDeclItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldDeclItem);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(IDENTIFIER);
				setState(56);
				match(LBRACKET);
				setState(57);
				match(INT_LITERAL);
				setState(58);
				match(RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclListContext extends ParserRuleContext {
		public List<FieldDeclItemContext> fieldDeclItem() {
			return getRuleContexts(FieldDeclItemContext.class);
		}
		public FieldDeclItemContext fieldDeclItem(int i) {
			return getRuleContext(FieldDeclItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public FieldDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclList; }
	}

	public final FieldDeclListContext fieldDeclList() throws RecognitionException {
		FieldDeclListContext _localctx = new FieldDeclListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			fieldDeclItem();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62);
				match(COMMA);
				setState(63);
				fieldDeclItem();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclListContext fieldDeclList() {
			return getRuleContext(FieldDeclListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			type();
			setState(70);
			fieldDeclList();
			setState(71);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamItemContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DecafParser.IDENTIFIER, 0); }
		public ParamItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramItem; }
	}

	public final ParamItemContext paramItem() throws RecognitionException {
		ParamItemContext _localctx = new ParamItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			type();
			setState(74);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamItemContext> paramItem() {
			return getRuleContexts(ParamItemContext.class);
		}
		public ParamItemContext paramItem(int i) {
			return getRuleContext(ParamItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			paramItem();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77);
				match(COMMA);
				setState(78);
				paramItem();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DecafParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(DecafParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DecafParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(84);
				type();
				}
				break;
			case VOID:
				{
				setState(85);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			match(IDENTIFIER);
			setState(89);
			match(LPAREN);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(90);
				paramList();
				}
			}

			setState(93);
			match(RPAREN);
			setState(94);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LCURLY);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INT) {
				{
				{
				setState(97);
				varDecl();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << LCURLY) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(103);
				statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DecafParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DecafParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IDENTIFIER);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				match(IDENTIFIER);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			type();
			setState(120);
			idList();
			setState(121);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueStmtContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class IfStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(DecafParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DecafParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class MethodCallStmtContext extends StatementContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public MethodCallStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssignStmtContext extends StatementContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(DecafParser.EQUALS, 0); }
		public TerminalNode PLUS_EQUALS() { return getToken(DecafParser.PLUS_EQUALS, 0); }
		public TerminalNode MINUS_EQUALS() { return getToken(DecafParser.MINUS_EQUALS, 0); }
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class BreakStmtContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class BlockStmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForStmtContext extends StatementContext {
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DecafParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(DecafParser.EQUALS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DecafParser.COMMA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				location();
				setState(124);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << PLUS_EQUALS) | (1L << MINUS_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				expr(0);
				setState(126);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new MethodCallStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				methodCall();
				setState(129);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(IF);
				setState(132);
				match(LPAREN);
				setState(133);
				expr(0);
				setState(134);
				match(RPAREN);
				setState(135);
				block();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(136);
					match(ELSE);
					setState(137);
					block();
					}
				}

				}
				break;
			case 4:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(FOR);
				setState(141);
				match(IDENTIFIER);
				setState(142);
				match(EQUALS);
				setState(143);
				expr(0);
				setState(144);
				match(COMMA);
				setState(145);
				expr(0);
				setState(146);
				block();
				}
				break;
			case 5:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(RETURN);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLOUT) | (1L << FALSE) | (1L << TRUE) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << MINUS) | (1L << NOT))) != 0)) {
					{
					setState(149);
					expr(0);
					}
				}

				setState(152);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				match(BREAK);
				setState(154);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(CONTINUE);
				setState(156);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocationExprContext extends ExprContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LocationExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(DecafParser.AND, 0); }
		public TerminalNode OR() { return getToken(DecafParser.OR, 0); }
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExprContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(DecafParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(DecafParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(DecafParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(DecafParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DecafParser.MINUS, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CompExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(DecafParser.LT, 0); }
		public TerminalNode LTE() { return getToken(DecafParser.LTE, 0); }
		public TerminalNode GT() { return getToken(DecafParser.GT, 0); }
		public TerminalNode GTE() { return getToken(DecafParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(DecafParser.NEQ, 0); }
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(DecafParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DecafParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(DecafParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(DecafParser.NOT, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MethodCallExprContext extends ExprContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new MethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				methodCall();
				}
				break;
			case 2:
				{
				_localctx = new LocationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				location();
				}
				break;
			case 3:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(LPAREN);
				setState(165);
				expr(0);
				setState(166);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				expr(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(173);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(174);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(176);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LTE) | (1L << GTE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(182);
						match(AND);
						setState(183);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(185);
						match(OR);
						setState(186);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharLiteralContext extends LiteralContext {
		public TerminalNode CHAR_LITERAL() { return getToken(DecafParser.CHAR_LITERAL, 0); }
		public CharLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class BoolLiteralContext extends LiteralContext {
		public TerminalNode TRUE() { return getToken(DecafParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DecafParser.FALSE, 0); }
		public BoolLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class IntLiteralContext extends LiteralContext {
		public TerminalNode INT_LITERAL() { return getToken(DecafParser.INT_LITERAL, 0); }
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(INT_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(STRING_LITERAL);
				}
				break;
			case FALSE:
			case TRUE:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	 
		public LocationContext() { }
		public void copyFrom(LocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdArrayLocationContext extends LocationContext {
		public TerminalNode IDENTIFIER() { return getToken(DecafParser.IDENTIFIER, 0); }
		public TerminalNode LBRACKET() { return getToken(DecafParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(DecafParser.RBRACKET, 0); }
		public IdArrayLocationContext(LocationContext ctx) { copyFrom(ctx); }
	}
	public static class IdLocationContext extends LocationContext {
		public TerminalNode IDENTIFIER() { return getToken(DecafParser.IDENTIFIER, 0); }
		public IdLocationContext(LocationContext ctx) { copyFrom(ctx); }
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_location);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new IdArrayLocationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(IDENTIFIER);
				setState(199);
				match(LBRACKET);
				setState(200);
				expr(0);
				setState(201);
				match(RBRACKET);
				}
				break;
			case 2:
				_localctx = new IdLocationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DecafParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(DecafParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DecafParser.RPAREN, 0); }
		public List<ExprListContext> exprList() {
			return getRuleContexts(ExprListContext.class);
		}
		public ExprListContext exprList(int i) {
			return getRuleContext(ExprListContext.class,i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodCall);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(IDENTIFIER);
				setState(207);
				match(LPAREN);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLOUT) | (1L << FALSE) | (1L << TRUE) | (1L << LPAREN) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << MINUS) | (1L << NOT))) != 0)) {
					{
					{
					setState(208);
					exprList();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(RPAREN);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(CALLOUT);
				setState(216);
				match(LPAREN);
				setState(217);
				match(STRING_LITERAL);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(218);
					match(COMMA);
					setState(219);
					exprList();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			expr(0);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					match(COMMA);
					setState(230);
					expr(0);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\7\2/\n\2\f\2\16\2\62\13\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\7\5C\n\5"+
		"\f\5\16\5F\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\7\bR\n\b\f\b\16"+
		"\bU\13\b\3\t\3\t\5\tY\n\t\3\t\3\t\3\t\5\t^\n\t\3\t\3\t\3\t\3\n\3\n\7\n"+
		"e\n\n\f\n\16\nh\13\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13u\n\13\f\13\16\13x\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a1\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ad\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u00be\n\16\f\16\16\16\u00c1\13\16\3\17\3\17\3\17\3\17\5\17\u00c7"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cf\n\20\3\21\3\21\3\21\7\21"+
		"\u00d4\n\21\f\21\16\21\u00d7\13\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00df\n\21\f\21\16\21\u00e2\13\21\3\21\5\21\u00e5\n\21\3\22\3\22\3\22"+
		"\7\22\u00ea\n\22\f\22\16\22\u00ed\13\22\3\22\2\3\32\23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\t\4\2\3\3\f\f\3\2+-\4\2\36\36..\3\2 \"\3"+
		"\2\36\37\3\2#(\4\2\t\t\16\16\2\u0101\2$\3\2\2\2\4\66\3\2\2\2\6=\3\2\2"+
		"\2\b?\3\2\2\2\nG\3\2\2\2\fK\3\2\2\2\16N\3\2\2\2\20X\3\2\2\2\22b\3\2\2"+
		"\2\24q\3\2\2\2\26y\3\2\2\2\30\u00a0\3\2\2\2\32\u00ac\3\2\2\2\34\u00c6"+
		"\3\2\2\2\36\u00ce\3\2\2\2 \u00e4\3\2\2\2\"\u00e6\3\2\2\2$%\7\6\2\2%&\7"+
		"\35\2\2&*\7\20\2\2\')\5\n\6\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2"+
		"+\60\3\2\2\2,*\3\2\2\2-/\5\20\t\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\21\2\2\64\65\7\2\2\3\65"+
		"\3\3\2\2\2\66\67\t\2\2\2\67\5\3\2\2\28>\7\35\2\29:\7\35\2\2:;\7\24\2\2"+
		";<\7\32\2\2<>\7\25\2\2=8\3\2\2\2=9\3\2\2\2>\7\3\2\2\2?D\5\6\4\2@A\7\22"+
		"\2\2AC\5\6\4\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FD\3"+
		"\2\2\2GH\5\4\3\2HI\5\b\5\2IJ\7\23\2\2J\13\3\2\2\2KL\5\4\3\2LM\7\35\2\2"+
		"M\r\3\2\2\2NS\5\f\7\2OP\7\22\2\2PR\5\f\7\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2"+
		"\2ST\3\2\2\2T\17\3\2\2\2US\3\2\2\2VY\5\4\3\2WY\7\17\2\2XV\3\2\2\2XW\3"+
		"\2\2\2YZ\3\2\2\2Z[\7\35\2\2[]\7\26\2\2\\^\5\16\b\2]\\\3\2\2\2]^\3\2\2"+
		"\2^_\3\2\2\2_`\7\27\2\2`a\5\22\n\2a\21\3\2\2\2bf\7\20\2\2ce\5\26\f\2d"+
		"c\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gl\3\2\2\2hf\3\2\2\2ik\5\30\r\2"+
		"ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\21\2"+
		"\2p\23\3\2\2\2qv\7\35\2\2rs\7\22\2\2su\7\35\2\2tr\3\2\2\2ux\3\2\2\2vt"+
		"\3\2\2\2vw\3\2\2\2w\25\3\2\2\2xv\3\2\2\2yz\5\4\3\2z{\5\24\13\2{|\7\23"+
		"\2\2|\27\3\2\2\2}~\5\36\20\2~\177\t\3\2\2\177\u0080\5\32\16\2\u0080\u0081"+
		"\7\23\2\2\u0081\u00a1\3\2\2\2\u0082\u0083\5 \21\2\u0083\u0084\7\23\2\2"+
		"\u0084\u00a1\3\2\2\2\u0085\u0086\7\13\2\2\u0086\u0087\7\26\2\2\u0087\u0088"+
		"\5\32\16\2\u0088\u0089\7\27\2\2\u0089\u008c\5\22\n\2\u008a\u008b\7\b\2"+
		"\2\u008b\u008d\5\22\n\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u00a1\3\2\2\2\u008e\u008f\7\n\2\2\u008f\u0090\7\35\2\2\u0090\u0091\7"+
		"+\2\2\u0091\u0092\5\32\16\2\u0092\u0093\7\22\2\2\u0093\u0094\5\32\16\2"+
		"\u0094\u0095\5\22\n\2\u0095\u00a1\3\2\2\2\u0096\u0098\7\r\2\2\u0097\u0099"+
		"\5\32\16\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u00a1\7\23\2\2\u009b\u009c\7\4\2\2\u009c\u00a1\7\23\2\2\u009d\u009e"+
		"\7\7\2\2\u009e\u00a1\7\23\2\2\u009f\u00a1\5\22\n\2\u00a0}\3\2\2\2\u00a0"+
		"\u0082\3\2\2\2\u00a0\u0085\3\2\2\2\u00a0\u008e\3\2\2\2\u00a0\u0096\3\2"+
		"\2\2\u00a0\u009b\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\31\3\2\2\2\u00a2\u00a3\b\16\1\2\u00a3\u00ad\5 \21\2\u00a4\u00ad\5\36"+
		"\20\2\u00a5\u00ad\5\34\17\2\u00a6\u00a7\7\26\2\2\u00a7\u00a8\5\32\16\2"+
		"\u00a8\u00a9\7\27\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab\u00ad"+
		"\5\32\16\b\u00ac\u00a2\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a5\3\2\2\2"+
		"\u00ac\u00a6\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00bf\3\2\2\2\u00ae\u00af"+
		"\f\7\2\2\u00af\u00b0\t\5\2\2\u00b0\u00be\5\32\16\b\u00b1\u00b2\f\6\2\2"+
		"\u00b2\u00b3\t\6\2\2\u00b3\u00be\5\32\16\7\u00b4\u00b5\f\5\2\2\u00b5\u00b6"+
		"\t\7\2\2\u00b6\u00be\5\32\16\6\u00b7\u00b8\f\4\2\2\u00b8\u00b9\7)\2\2"+
		"\u00b9\u00be\5\32\16\5\u00ba\u00bb\f\3\2\2\u00bb\u00bc\7*\2\2\u00bc\u00be"+
		"\5\32\16\4\u00bd\u00ae\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b4\3\2\2\2"+
		"\u00bd\u00b7\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\33\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c7\7\32\2\2\u00c3\u00c7\7\33\2\2\u00c4\u00c7\7\34\2\2\u00c5\u00c7"+
		"\t\b\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\35\3\2\2\2\u00c8\u00c9\7\35\2\2\u00c9\u00ca\7\24"+
		"\2\2\u00ca\u00cb\5\32\16\2\u00cb\u00cc\7\25\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cf\7\35\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\37\3\2\2"+
		"\2\u00d0\u00d1\7\35\2\2\u00d1\u00d5\7\26\2\2\u00d2\u00d4\5\"\22\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00e5\7\27\2\2\u00d9"+
		"\u00da\7\5\2\2\u00da\u00db\7\26\2\2\u00db\u00e0\7\34\2\2\u00dc\u00dd\7"+
		"\22\2\2\u00dd\u00df\5\"\22\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e5\7\27\2\2\u00e4\u00d0\3\2\2\2\u00e4\u00d9\3\2\2\2\u00e5"+
		"!\3\2\2\2\u00e6\u00eb\5\32\16\2\u00e7\u00e8\7\22\2\2\u00e8\u00ea\5\32"+
		"\16\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00eb\3\2\2\2\30*\60=DSX]flv\u008c"+
		"\u0098\u00a0\u00ac\u00bd\u00bf\u00c6\u00ce\u00d5\u00e0\u00e4\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}