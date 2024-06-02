// Generated from C:/Users/Pichau/Desktop/linguagem/A3_Compiladores/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, STRING=3, IF=4, ELSE=5, FOR=6, WHILE=7, PRINTF=8, SCANF=9, 
		ASSIGN=10, SEMICOLON=11, LPAREN=12, RPAREN=13, LBRACE=14, RBRACE=15, COMMA=16, 
		PLUS=17, MINUS=18, TIMES=19, DIVIDE=20, AMPERSAND=21, POWER=22, OP_RELACIONAL=23, 
		LETTER=24, NUMBER=25, INCREASE=26, REDUCE=27, STRING_LITERAL=28, WS=29, 
		NUMBER_DECIMAL=30;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varNumberDecimalDeclaration = 2, 
		RULE_varNumberDeclaration = 3, RULE_varStringDeclaration = 4, RULE_varDeclaration = 5, 
		RULE_ifStatement = 6, RULE_whileStatement = 7, RULE_assignmentToFor = 8, 
		RULE_forStatement = 9, RULE_ampersandVarStatement = 10, RULE_printfStatement = 11, 
		RULE_scanfStatement = 12, RULE_assignment = 13, RULE_interation = 14, 
		RULE_expression = 15, RULE_mathExpression = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varNumberDecimalDeclaration", "varNumberDeclaration", 
			"varStringDeclaration", "varDeclaration", "ifStatement", "whileStatement", 
			"assignmentToFor", "forStatement", "ampersandVarStatement", "printfStatement", 
			"scanfStatement", "assignment", "interation", "expression", "mathExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'double'", "'string'", "'if'", "'else'", "'for'", "'while'", 
			"'printf'", "'scanf'", "'='", "';'", "'('", "')'", "'{'", "'}'", "','", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'**'", null, null, null, "'++'", 
			"'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DOUBLE", "STRING", "IF", "ELSE", "FOR", "WHILE", "PRINTF", 
			"SCANF", "ASSIGN", "SEMICOLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"COMMA", "PLUS", "MINUS", "TIMES", "DIVIDE", "AMPERSAND", "POWER", "OP_RELACIONAL", 
			"LETTER", "NUMBER", "INCREASE", "REDUCE", "STRING_LITERAL", "WS", "NUMBER_DECIMAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16778206L) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public PrintfStatementContext printfStatement() {
			return getRuleContext(PrintfStatementContext.class,0);
		}
		public ScanfStatementContext scanfStatement() {
			return getRuleContext(ScanfStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InterationContext interation() {
			return getRuleContext(InterationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				printfStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				scanfStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				interation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarNumberDecimalDeclarationContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(gramaticaParser.DOUBLE, 0); }
		public TerminalNode LETTER() { return getToken(gramaticaParser.LETTER, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public TerminalNode NUMBER_DECIMAL() { return getToken(gramaticaParser.NUMBER_DECIMAL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public VarNumberDecimalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNumberDecimalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarNumberDecimalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarNumberDecimalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarNumberDecimalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNumberDecimalDeclarationContext varNumberDecimalDeclaration() throws RecognitionException {
		VarNumberDecimalDeclarationContext _localctx = new VarNumberDecimalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varNumberDecimalDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(DOUBLE);
			setState(51);
			match(LETTER);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(52);
				match(ASSIGN);
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(53);
					match(NUMBER_DECIMAL);
					}
					break;
				case 2:
					{
					setState(54);
					mathExpression(0);
					}
					break;
				}
				}
			}

			setState(59);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarNumberDeclarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public TerminalNode LETTER() { return getToken(gramaticaParser.LETTER, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public VarNumberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNumberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarNumberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarNumberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarNumberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNumberDeclarationContext varNumberDeclaration() throws RecognitionException {
		VarNumberDeclarationContext _localctx = new VarNumberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varNumberDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(INT);
			setState(62);
			match(LETTER);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(63);
				match(ASSIGN);
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(64);
					match(NUMBER);
					}
					break;
				case 2:
					{
					setState(65);
					mathExpression(0);
					}
					break;
				}
				}
			}

			setState(70);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarStringDeclarationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gramaticaParser.STRING, 0); }
		public TerminalNode LETTER() { return getToken(gramaticaParser.LETTER, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gramaticaParser.STRING_LITERAL, 0); }
		public VarStringDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varStringDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarStringDeclarationContext varStringDeclaration() throws RecognitionException {
		VarStringDeclarationContext _localctx = new VarStringDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varStringDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(STRING);
			setState(73);
			match(LETTER);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(74);
				match(ASSIGN);
				setState(75);
				match(STRING_LITERAL);
				}
			}

			setState(78);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarNumberDecimalDeclarationContext varNumberDecimalDeclaration() {
			return getRuleContext(VarNumberDecimalDeclarationContext.class,0);
		}
		public VarNumberDeclarationContext varNumberDeclaration() {
			return getRuleContext(VarNumberDeclarationContext.class,0);
		}
		public VarStringDeclarationContext varStringDeclaration() {
			return getRuleContext(VarStringDeclarationContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				varNumberDecimalDeclaration();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				varNumberDeclaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				varStringDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gramaticaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(gramaticaParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(gramaticaParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(gramaticaParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(gramaticaParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(gramaticaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(IF);
			setState(86);
			match(LPAREN);
			setState(87);
			expression(0);
			setState(88);
			match(RPAREN);
			setState(89);
			match(LBRACE);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				statement();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16778206L) != 0) );
			setState(95);
			match(RBRACE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(96);
				match(ELSE);
				setState(97);
				match(LBRACE);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					statement();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16778206L) != 0) );
				setState(103);
				match(RBRACE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(gramaticaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(gramaticaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gramaticaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(WHILE);
			setState(108);
			match(LPAREN);
			setState(109);
			expression(0);
			setState(110);
			match(RPAREN);
			setState(111);
			match(LBRACE);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				statement();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16778206L) != 0) );
			setState(117);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentToForContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(gramaticaParser.LETTER, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode NUMBER_DECIMAL() { return getToken(gramaticaParser.NUMBER_DECIMAL, 0); }
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(gramaticaParser.DOUBLE, 0); }
		public AssignmentToForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentToFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAssignmentToFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAssignmentToFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAssignmentToFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentToForContext assignmentToFor() throws RecognitionException {
		AssignmentToForContext _localctx = new AssignmentToForContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentToFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==DOUBLE) {
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(122);
			match(LETTER);
			setState(123);
			match(ASSIGN);
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NUMBER_DECIMAL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gramaticaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(gramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(gramaticaParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InterationContext interation() {
			return getRuleContext(InterationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(gramaticaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gramaticaParser.RBRACE, 0); }
		public AssignmentToForContext assignmentToFor() {
			return getRuleContext(AssignmentToForContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(gramaticaParser.LETTER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(FOR);
			setState(127);
			match(LPAREN);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(128);
				assignmentToFor();
				}
				break;
			case 2:
				{
				setState(129);
				match(LETTER);
				}
				break;
			}
			setState(132);
			match(SEMICOLON);
			setState(133);
			expression(0);
			setState(134);
			match(SEMICOLON);
			setState(135);
			interation();
			setState(136);
			match(RPAREN);
			setState(137);
			match(LBRACE);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				statement();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16778206L) != 0) );
			setState(143);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AmpersandVarStatementContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(gramaticaParser.AMPERSAND, 0); }
		public TerminalNode LETTER() { return getToken(gramaticaParser.LETTER, 0); }
		public AmpersandVarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ampersandVarStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAmpersandVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAmpersandVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAmpersandVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmpersandVarStatementContext ampersandVarStatement() throws RecognitionException {
		AmpersandVarStatementContext _localctx = new AmpersandVarStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ampersandVarStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(AMPERSAND);
			setState(146);
			match(LETTER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintfStatementContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(gramaticaParser.PRINTF, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public AmpersandVarStatementContext ampersandVarStatement() {
			return getRuleContext(AmpersandVarStatementContext.class,0);
		}
		public PrintfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrintfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrintfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrintfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintfStatementContext printfStatement() throws RecognitionException {
		PrintfStatementContext _localctx = new PrintfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(PRINTF);
			setState(149);
			match(LPAREN);
			setState(150);
			expression(0);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(151);
				match(COMMA);
				setState(152);
				ampersandVarStatement();
				}
			}

			setState(155);
			match(RPAREN);
			setState(156);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScanfStatementContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(gramaticaParser.SCANF, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public AmpersandVarStatementContext ampersandVarStatement() {
			return getRuleContext(AmpersandVarStatementContext.class,0);
		}
		public ScanfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterScanfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitScanfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitScanfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanfStatementContext scanfStatement() throws RecognitionException {
		ScanfStatementContext _localctx = new ScanfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scanfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(SCANF);
			setState(159);
			match(LPAREN);
			setState(160);
			expression(0);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(161);
				match(COMMA);
				setState(162);
				ampersandVarStatement();
				}
			}

			setState(165);
			match(RPAREN);
			setState(166);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(gramaticaParser.LETTER, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(gramaticaParser.SEMICOLON, 0); }
		public ScanfStatementContext scanfStatement() {
			return getRuleContext(ScanfStatementContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LETTER);
			setState(169);
			match(ASSIGN);
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case LETTER:
			case NUMBER:
			case STRING_LITERAL:
			case NUMBER_DECIMAL:
				{
				setState(170);
				expression(0);
				setState(171);
				match(SEMICOLON);
				}
				break;
			case SCANF:
				{
				setState(173);
				scanfStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterationContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(gramaticaParser.LETTER, 0); }
		public TerminalNode INCREASE() { return getToken(gramaticaParser.INCREASE, 0); }
		public TerminalNode REDUCE() { return getToken(gramaticaParser.REDUCE, 0); }
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(gramaticaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gramaticaParser.MINUS, 0); }
		public InterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterationContext interation() throws RecognitionException {
		InterationContext _localctx = new InterationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(LETTER);
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREASE:
				{
				setState(177);
				match(INCREASE);
				}
				break;
			case REDUCE:
				{
				setState(178);
				match(REDUCE);
				}
				break;
			case PLUS:
			case MINUS:
				{
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				match(NUMBER);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode NUMBER_DECIMAL() { return getToken(gramaticaParser.NUMBER_DECIMAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gramaticaParser.STRING_LITERAL, 0); }
		public TerminalNode LETTER() { return getToken(gramaticaParser.LETTER, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode OP_RELACIONAL() { return getToken(gramaticaParser.OP_RELACIONAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(184);
				mathExpression(0);
				}
				break;
			case 2:
				{
				setState(185);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(186);
				match(NUMBER_DECIMAL);
				}
				break;
			case 4:
				{
				setState(187);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				{
				setState(188);
				match(LETTER);
				}
				break;
			case 6:
				{
				setState(189);
				match(LPAREN);
				setState(190);
				expression(0);
				setState(191);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(195);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(196);
					match(OP_RELACIONAL);
					setState(197);
					expression(7);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MathExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public TerminalNode NUMBER_DECIMAL() { return getToken(gramaticaParser.NUMBER_DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode TIMES() { return getToken(gramaticaParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(gramaticaParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(gramaticaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gramaticaParser.MINUS, 0); }
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		return mathExpression(0);
	}

	private MathExpressionContext mathExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, _parentState);
		MathExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_mathExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(204);
				match(NUMBER);
				}
				break;
			case NUMBER_DECIMAL:
				{
				setState(205);
				match(NUMBER_DECIMAL);
				}
				break;
			case LPAREN:
				{
				setState(206);
				match(LPAREN);
				setState(207);
				mathExpression(0);
				setState(208);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(212);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(213);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						mathExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(215);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(216);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						mathExpression(5);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return mathExpression_sempred((MathExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean mathExpression_sempred(MathExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00e0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b"+
		"\u0002\u0003\u0002:\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0003"+
		"\u0003E\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004M\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\\\b"+
		"\u0006\u000b\u0006\f\u0006]\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006d\b\u0006\u000b\u0006\f\u0006e\u0001\u0006\u0001\u0006"+
		"\u0003\u0006j\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007r\b\u0007\u000b\u0007\f\u0007s\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0003\by\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0083\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u008c\b\t\u000b\t\f\t\u008d"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009a\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a4"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00af\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00b6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00c2\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00c7\b\u000f\n\u000f\f\u000f\u00ca\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00d3\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00db\b\u0010\n\u0010\f\u0010\u00de\t\u0010\u0001"+
		"\u0010\u0000\u0002\u001e \u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0004\u0001\u0000\u0001"+
		"\u0002\u0002\u0000\u0019\u0019\u001e\u001e\u0001\u0000\u0011\u0012\u0001"+
		"\u0000\u0013\u0014\u00f3\u0000%\u0001\u0000\u0000\u0000\u00020\u0001\u0000"+
		"\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000"+
		"\bH\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\fU\u0001\u0000"+
		"\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010x\u0001\u0000\u0000\u0000"+
		"\u0012~\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016"+
		"\u0094\u0001\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000\u001a"+
		"\u00a8\u0001\u0000\u0000\u0000\u001c\u00b0\u0001\u0000\u0000\u0000\u001e"+
		"\u00c1\u0001\u0000\u0000\u0000 \u00d2\u0001\u0000\u0000\u0000\"$\u0003"+
		"\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001\u0000"+
		"\u0000\u0000\'%\u0001\u0000\u0000\u0000(1\u0003\n\u0005\u0000)1\u0003"+
		"\f\u0006\u0000*1\u0003\u000e\u0007\u0000+1\u0003\u0012\t\u0000,1\u0003"+
		"\u0016\u000b\u0000-1\u0003\u0018\f\u0000.1\u0003\u001a\r\u0000/1\u0003"+
		"\u001c\u000e\u00000(\u0001\u0000\u0000\u00000)\u0001\u0000\u0000\u0000"+
		"0*\u0001\u0000\u0000\u00000+\u0001\u0000\u0000\u00000,\u0001\u0000\u0000"+
		"\u00000-\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000"+
		"\u0000\u00001\u0003\u0001\u0000\u0000\u000023\u0005\u0002\u0000\u0000"+
		"39\u0005\u0018\u0000\u000047\u0005\n\u0000\u000058\u0005\u001e\u0000\u0000"+
		"68\u0003 \u0010\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u0000"+
		"8:\u0001\u0000\u0000\u000094\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;<\u0005\u000b\u0000\u0000<\u0005\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0001\u0000\u0000>D\u0005\u0018\u0000\u0000"+
		"?B\u0005\n\u0000\u0000@C\u0005\u0019\u0000\u0000AC\u0003 \u0010\u0000"+
		"B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000"+
		"\u0000D?\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0005\u000b\u0000\u0000G\u0007\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0003\u0000\u0000IL\u0005\u0018\u0000\u0000JK\u0005\n\u0000\u0000"+
		"KM\u0005\u001c\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u000b\u0000\u0000O\t\u0001\u0000"+
		"\u0000\u0000PT\u0003\u0004\u0002\u0000QT\u0003\u0006\u0003\u0000RT\u0003"+
		"\b\u0004\u0000SP\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005\u0004\u0000"+
		"\u0000VW\u0005\f\u0000\u0000WX\u0003\u001e\u000f\u0000XY\u0005\r\u0000"+
		"\u0000Y[\u0005\u000e\u0000\u0000Z\\\u0003\u0002\u0001\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_i\u0005\u000f\u0000\u0000"+
		"`a\u0005\u0005\u0000\u0000ac\u0005\u000e\u0000\u0000bd\u0003\u0002\u0001"+
		"\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005"+
		"\u000f\u0000\u0000hj\u0001\u0000\u0000\u0000i`\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000kl\u0005\u0007\u0000"+
		"\u0000lm\u0005\f\u0000\u0000mn\u0003\u001e\u000f\u0000no\u0005\r\u0000"+
		"\u0000oq\u0005\u000e\u0000\u0000pr\u0003\u0002\u0001\u0000qp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u000f\u0000\u0000"+
		"v\u000f\u0001\u0000\u0000\u0000wy\u0007\u0000\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0018\u0000\u0000{|\u0005\n\u0000\u0000|}\u0007\u0001\u0000\u0000}\u0011"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005\u0006\u0000\u0000\u007f\u0082\u0005"+
		"\f\u0000\u0000\u0080\u0083\u0003\u0010\b\u0000\u0081\u0083\u0005\u0018"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u000b"+
		"\u0000\u0000\u0085\u0086\u0003\u001e\u000f\u0000\u0086\u0087\u0005\u000b"+
		"\u0000\u0000\u0087\u0088\u0003\u001c\u000e\u0000\u0088\u0089\u0005\r\u0000"+
		"\u0000\u0089\u008b\u0005\u000e\u0000\u0000\u008a\u008c\u0003\u0002\u0001"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u000f\u0000"+
		"\u0000\u0090\u0013\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0015\u0000"+
		"\u0000\u0092\u0093\u0005\u0018\u0000\u0000\u0093\u0015\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095\u0096\u0005\f\u0000\u0000"+
		"\u0096\u0099\u0003\u001e\u000f\u0000\u0097\u0098\u0005\u0010\u0000\u0000"+
		"\u0098\u009a\u0003\u0014\n\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\r\u0000\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d\u0017"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\t\u0000\u0000\u009f\u00a0\u0005"+
		"\f\u0000\u0000\u00a0\u00a3\u0003\u001e\u000f\u0000\u00a1\u00a2\u0005\u0010"+
		"\u0000\u0000\u00a2\u00a4\u0003\u0014\n\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\r\u0000\u0000\u00a6\u00a7\u0005\u000b\u0000\u0000"+
		"\u00a7\u0019\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0018\u0000\u0000"+
		"\u00a9\u00ae\u0005\n\u0000\u0000\u00aa\u00ab\u0003\u001e\u000f\u0000\u00ab"+
		"\u00ac\u0005\u000b\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad"+
		"\u00af\u0003\u0018\f\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000\u00b0\u00b5"+
		"\u0005\u0018\u0000\u0000\u00b1\u00b6\u0005\u001a\u0000\u0000\u00b2\u00b6"+
		"\u0005\u001b\u0000\u0000\u00b3\u00b4\u0007\u0002\u0000\u0000\u00b4\u00b6"+
		"\u0005\u0019\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u001d"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\u000f\uffff\uffff\u0000\u00b8"+
		"\u00c2\u0003 \u0010\u0000\u00b9\u00c2\u0005\u0019\u0000\u0000\u00ba\u00c2"+
		"\u0005\u001e\u0000\u0000\u00bb\u00c2\u0005\u001c\u0000\u0000\u00bc\u00c2"+
		"\u0005\u0018\u0000\u0000\u00bd\u00be\u0005\f\u0000\u0000\u00be\u00bf\u0003"+
		"\u001e\u000f\u0000\u00bf\u00c0\u0005\r\u0000\u0000\u00c0\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00b7\u0001\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000"+
		"\u0000\u0000\u00c1\u00ba\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c8\u0001\u0000\u0000\u0000\u00c3\u00c4\n\u0006\u0000"+
		"\u0000\u00c4\u00c5\u0005\u0017\u0000\u0000\u00c5\u00c7\u0003\u001e\u000f"+
		"\u0007\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u001f\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0006\u0010\uffff\uffff\u0000\u00cc\u00d3\u0005\u0019"+
		"\u0000\u0000\u00cd\u00d3\u0005\u001e\u0000\u0000\u00ce\u00cf\u0005\f\u0000"+
		"\u0000\u00cf\u00d0\u0003 \u0010\u0000\u00d0\u00d1\u0005\r\u0000\u0000"+
		"\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d3\u00dc\u0001\u0000\u0000\u0000\u00d4\u00d5\n\u0005\u0000\u0000\u00d5"+
		"\u00d6\u0007\u0003\u0000\u0000\u00d6\u00db\u0003 \u0010\u0006\u00d7\u00d8"+
		"\n\u0004\u0000\u0000\u00d8\u00d9\u0007\u0002\u0000\u0000\u00d9\u00db\u0003"+
		" \u0010\u0005\u00da\u00d4\u0001\u0000\u0000\u0000\u00da\u00d7\u0001\u0000"+
		"\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd!\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u0018%079BDLS]eisx\u0082\u008d"+
		"\u0099\u00a3\u00ae\u00b5\u00c1\u00c8\u00d2\u00da\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}