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
		IGUAL=10, PONTOVIRGULA=11, LPAREN=12, RPAREN=13, LBRACE=14, RBRACE=15, 
		VIRGULA=16, MAIS=17, MENOS=18, MULT=19, DIVISAO=20, E_COMERCIAL=21, OP_RELACIONAL=22, 
		OP_LOGICO=23, LETRAS=24, NUMEROS=25, INCREMENTO=26, DECREMENTO=27, STRING_LITERAL=28, 
		WS=29, NUMEROS_DECIMAL=30;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_declaracaoVariavelDouble = 2, 
		RULE_declaracaoVariavelInt = 3, RULE_declaracaoVariavelString = 4, RULE_declaracaoVariavel = 5, 
		RULE_estruturaIf = 6, RULE_estruturaWhile = 7, RULE_atribuicaoFor = 8, 
		RULE_estruturaFor = 9, RULE_leituraVar = 10, RULE_estruturaPrintf = 11, 
		RULE_estruturaScanf = 12, RULE_atribuicaoVariavel = 13, RULE_interacao = 14, 
		RULE_expressao = 15, RULE_relacional = 16, RULE_logico = 17, RULE_expressaoRelacional = 18, 
		RULE_expressaoLogico = 19, RULE_expressaoMatematica = 20, RULE_term = 21, 
		RULE_fator = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "declaracaoVariavelDouble", "declaracaoVariavelInt", 
			"declaracaoVariavelString", "declaracaoVariavel", "estruturaIf", "estruturaWhile", 
			"atribuicaoFor", "estruturaFor", "leituraVar", "estruturaPrintf", "estruturaScanf", 
			"atribuicaoVariavel", "interacao", "expressao", "relacional", "logico", 
			"expressaoRelacional", "expressaoLogico", "expressaoMatematica", "term", 
			"fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'double'", "'string'", "'if'", "'else'", "'for'", "'while'", 
			"'printf'", "'scanf'", "'='", "';'", "'('", "')'", "'{'", "'}'", "','", 
			"'+'", "'-'", "'*'", "'/'", "'&'", null, null, null, null, "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DOUBLE", "STRING", "IF", "ELSE", "FOR", "WHILE", "PRINTF", 
			"SCANF", "IGUAL", "PONTOVIRGULA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"VIRGULA", "MAIS", "MENOS", "MULT", "DIVISAO", "E_COMERCIAL", "OP_RELACIONAL", 
			"OP_LOGICO", "LETRAS", "NUMEROS", "INCREMENTO", "DECREMENTO", "STRING_LITERAL", 
			"WS", "NUMEROS_DECIMAL"
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
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16778206L) != 0)) {
				{
				{
				setState(46);
				declaracoes();
				}
				}
				setState(51);
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
	public static class DeclaracoesContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public EstruturaIfContext estruturaIf() {
			return getRuleContext(EstruturaIfContext.class,0);
		}
		public EstruturaWhileContext estruturaWhile() {
			return getRuleContext(EstruturaWhileContext.class,0);
		}
		public EstruturaForContext estruturaFor() {
			return getRuleContext(EstruturaForContext.class,0);
		}
		public EstruturaPrintfContext estruturaPrintf() {
			return getRuleContext(EstruturaPrintfContext.class,0);
		}
		public EstruturaScanfContext estruturaScanf() {
			return getRuleContext(EstruturaScanfContext.class,0);
		}
		public AtribuicaoVariavelContext atribuicaoVariavel() {
			return getRuleContext(AtribuicaoVariavelContext.class,0);
		}
		public InteracaoContext interacao() {
			return getRuleContext(InteracaoContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				declaracaoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				estruturaIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				estruturaWhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				estruturaFor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				estruturaPrintf();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				estruturaScanf();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				atribuicaoVariavel();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				interacao();
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
	public static class DeclaracaoVariavelDoubleContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(gramaticaParser.DOUBLE, 0); }
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public TerminalNode PONTOVIRGULA() { return getToken(gramaticaParser.PONTOVIRGULA, 0); }
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public TerminalNode NUMEROS_DECIMAL() { return getToken(gramaticaParser.NUMEROS_DECIMAL, 0); }
		public ExpressaoMatematicaContext expressaoMatematica() {
			return getRuleContext(ExpressaoMatematicaContext.class,0);
		}
		public DeclaracaoVariavelDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavelDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracaoVariavelDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracaoVariavelDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeclaracaoVariavelDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelDoubleContext declaracaoVariavelDouble() throws RecognitionException {
		DeclaracaoVariavelDoubleContext _localctx = new DeclaracaoVariavelDoubleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVariavelDouble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DOUBLE);
			setState(63);
			match(LETRAS);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(64);
				match(IGUAL);
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(65);
					match(NUMEROS_DECIMAL);
					}
					break;
				case 2:
					{
					setState(66);
					expressaoMatematica();
					}
					break;
				}
				}
			}

			setState(71);
			match(PONTOVIRGULA);
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
	public static class DeclaracaoVariavelIntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public TerminalNode PONTOVIRGULA() { return getToken(gramaticaParser.PONTOVIRGULA, 0); }
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public TerminalNode NUMEROS() { return getToken(gramaticaParser.NUMEROS, 0); }
		public ExpressaoMatematicaContext expressaoMatematica() {
			return getRuleContext(ExpressaoMatematicaContext.class,0);
		}
		public DeclaracaoVariavelIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavelInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracaoVariavelInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracaoVariavelInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeclaracaoVariavelInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelIntContext declaracaoVariavelInt() throws RecognitionException {
		DeclaracaoVariavelIntContext _localctx = new DeclaracaoVariavelIntContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoVariavelInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(INT);
			setState(74);
			match(LETRAS);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(75);
				match(IGUAL);
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(76);
					match(NUMEROS);
					}
					break;
				case 2:
					{
					setState(77);
					expressaoMatematica();
					}
					break;
				}
				}
			}

			setState(82);
			match(PONTOVIRGULA);
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
	public static class DeclaracaoVariavelStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gramaticaParser.STRING, 0); }
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public TerminalNode PONTOVIRGULA() { return getToken(gramaticaParser.PONTOVIRGULA, 0); }
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gramaticaParser.STRING_LITERAL, 0); }
		public DeclaracaoVariavelStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavelString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracaoVariavelString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracaoVariavelString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeclaracaoVariavelString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelStringContext declaracaoVariavelString() throws RecognitionException {
		DeclaracaoVariavelStringContext _localctx = new DeclaracaoVariavelStringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoVariavelString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(STRING);
			setState(85);
			match(LETRAS);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(86);
				match(IGUAL);
				setState(87);
				match(STRING_LITERAL);
				}
			}

			setState(90);
			match(PONTOVIRGULA);
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
	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public DeclaracaoVariavelDoubleContext declaracaoVariavelDouble() {
			return getRuleContext(DeclaracaoVariavelDoubleContext.class,0);
		}
		public DeclaracaoVariavelIntContext declaracaoVariavelInt() {
			return getRuleContext(DeclaracaoVariavelIntContext.class,0);
		}
		public DeclaracaoVariavelStringContext declaracaoVariavelString() {
			return getRuleContext(DeclaracaoVariavelStringContext.class,0);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeclaracaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracaoVariavel);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				declaracaoVariavelDouble();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				declaracaoVariavelInt();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				declaracaoVariavelString();
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
	public static class EstruturaIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gramaticaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(gramaticaParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(gramaticaParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(gramaticaParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(gramaticaParser.RBRACE, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(gramaticaParser.ELSE, 0); }
		public EstruturaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEstruturaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEstruturaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEstruturaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaIfContext estruturaIf() throws RecognitionException {
		EstruturaIfContext _localctx = new EstruturaIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_estruturaIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IF);
			setState(98);
			match(LPAREN);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1396707328L) != 0)) {
				{
				setState(99);
				expressao();
				}
			}

			setState(102);
			match(RPAREN);
			setState(103);
			match(LBRACE);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				declaracoes();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16778206L) != 0) );
			setState(109);
			match(RBRACE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(110);
				match(ELSE);
				setState(111);
				match(LBRACE);
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(112);
					declaracoes();
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
	public static class EstruturaWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(gramaticaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(gramaticaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gramaticaParser.RBRACE, 0); }
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public EstruturaWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEstruturaWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEstruturaWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEstruturaWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaWhileContext estruturaWhile() throws RecognitionException {
		EstruturaWhileContext _localctx = new EstruturaWhileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_estruturaWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(WHILE);
			setState(122);
			match(LPAREN);
			setState(123);
			expressao();
			setState(124);
			match(RPAREN);
			setState(125);
			match(LBRACE);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				declaracoes();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16778206L) != 0) );
			setState(131);
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
	public static class AtribuicaoForContext extends ParserRuleContext {
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(gramaticaParser.DOUBLE, 0); }
		public TerminalNode NUMEROS() { return getToken(gramaticaParser.NUMEROS, 0); }
		public TerminalNode NUMEROS_DECIMAL() { return getToken(gramaticaParser.NUMEROS_DECIMAL, 0); }
		public AtribuicaoForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAtribuicaoFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAtribuicaoFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAtribuicaoFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoForContext atribuicaoFor() throws RecognitionException {
		AtribuicaoForContext _localctx = new AtribuicaoForContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atribuicaoFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==DOUBLE) {
				{
				setState(133);
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

			setState(136);
			match(LETRAS);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(137);
				match(IGUAL);
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==NUMEROS || _la==NUMEROS_DECIMAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class EstruturaForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gramaticaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(gramaticaParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(gramaticaParser.PONTOVIRGULA, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public InteracaoContext interacao() {
			return getRuleContext(InteracaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(gramaticaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(gramaticaParser.RBRACE, 0); }
		public AtribuicaoForContext atribuicaoFor() {
			return getRuleContext(AtribuicaoForContext.class,0);
		}
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public EstruturaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEstruturaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEstruturaFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEstruturaFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaForContext estruturaFor() throws RecognitionException {
		EstruturaForContext _localctx = new EstruturaForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_estruturaFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(FOR);
			setState(142);
			match(LPAREN);
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(143);
				atribuicaoFor();
				}
				break;
			case 2:
				{
				setState(144);
				match(LETRAS);
				}
				break;
			}
			setState(147);
			match(PONTOVIRGULA);
			setState(148);
			expressao();
			setState(149);
			match(PONTOVIRGULA);
			setState(150);
			interacao();
			setState(151);
			match(RPAREN);
			setState(152);
			match(LBRACE);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				declaracoes();
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16778206L) != 0) );
			setState(158);
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
	public static class LeituraVarContext extends ParserRuleContext {
		public TerminalNode E_COMERCIAL() { return getToken(gramaticaParser.E_COMERCIAL, 0); }
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public LeituraVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leituraVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLeituraVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLeituraVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLeituraVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeituraVarContext leituraVar() throws RecognitionException {
		LeituraVarContext _localctx = new LeituraVarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_leituraVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(E_COMERCIAL);
			setState(161);
			match(LETRAS);
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
	public static class EstruturaPrintfContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(gramaticaParser.PRINTF, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode PONTOVIRGULA() { return getToken(gramaticaParser.PONTOVIRGULA, 0); }
		public TerminalNode VIRGULA() { return getToken(gramaticaParser.VIRGULA, 0); }
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public EstruturaPrintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaPrintf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEstruturaPrintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEstruturaPrintf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEstruturaPrintf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaPrintfContext estruturaPrintf() throws RecognitionException {
		EstruturaPrintfContext _localctx = new EstruturaPrintfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_estruturaPrintf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(PRINTF);
			setState(164);
			match(LPAREN);
			setState(165);
			expressao();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(166);
				match(VIRGULA);
				setState(167);
				match(LETRAS);
				}
			}

			setState(170);
			match(RPAREN);
			setState(171);
			match(PONTOVIRGULA);
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
	public static class EstruturaScanfContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(gramaticaParser.SCANF, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public TerminalNode PONTOVIRGULA() { return getToken(gramaticaParser.PONTOVIRGULA, 0); }
		public TerminalNode VIRGULA() { return getToken(gramaticaParser.VIRGULA, 0); }
		public LeituraVarContext leituraVar() {
			return getRuleContext(LeituraVarContext.class,0);
		}
		public EstruturaScanfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaScanf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEstruturaScanf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEstruturaScanf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEstruturaScanf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaScanfContext estruturaScanf() throws RecognitionException {
		EstruturaScanfContext _localctx = new EstruturaScanfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_estruturaScanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(SCANF);
			setState(174);
			match(LPAREN);
			setState(175);
			expressao();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(176);
				match(VIRGULA);
				setState(177);
				leituraVar();
				}
			}

			setState(180);
			match(RPAREN);
			setState(181);
			match(PONTOVIRGULA);
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
	public static class AtribuicaoVariavelContext extends ParserRuleContext {
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTOVIRGULA() { return getToken(gramaticaParser.PONTOVIRGULA, 0); }
		public AtribuicaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAtribuicaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAtribuicaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAtribuicaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoVariavelContext atribuicaoVariavel() throws RecognitionException {
		AtribuicaoVariavelContext _localctx = new AtribuicaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atribuicaoVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(LETRAS);
			setState(184);
			match(IGUAL);
			setState(185);
			expressao();
			setState(186);
			match(PONTOVIRGULA);
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
	public static class InteracaoContext extends ParserRuleContext {
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public TerminalNode INCREMENTO() { return getToken(gramaticaParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(gramaticaParser.DECREMENTO, 0); }
		public TerminalNode PONTOVIRGULA() { return getToken(gramaticaParser.PONTOVIRGULA, 0); }
		public TerminalNode NUMEROS() { return getToken(gramaticaParser.NUMEROS, 0); }
		public TerminalNode MAIS() { return getToken(gramaticaParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(gramaticaParser.MENOS, 0); }
		public InteracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInteracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInteracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInteracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteracaoContext interacao() throws RecognitionException {
		InteracaoContext _localctx = new InteracaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LETRAS);
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENTO:
				{
				setState(189);
				match(INCREMENTO);
				}
				break;
			case DECREMENTO:
				{
				setState(190);
				match(DECREMENTO);
				}
				break;
			case MAIS:
			case MENOS:
				{
				{
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==MAIS || _la==MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				match(NUMEROS);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTOVIRGULA) {
				{
				setState(195);
				match(PONTOVIRGULA);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode NUMEROS() { return getToken(gramaticaParser.NUMEROS, 0); }
		public TerminalNode NUMEROS_DECIMAL() { return getToken(gramaticaParser.NUMEROS_DECIMAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(gramaticaParser.STRING_LITERAL, 0); }
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public ExpressaoMatematicaContext expressaoMatematica() {
			return getRuleContext(ExpressaoMatematicaContext.class,0);
		}
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(NUMEROS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(NUMEROS_DECIMAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(LETRAS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				expressaoMatematica();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				relacional();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				logico();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				match(LPAREN);
				setState(206);
				expressao();
				setState(207);
				match(RPAREN);
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
	public static class RelacionalContext extends ParserRuleContext {
		public List<ExpressaoRelacionalContext> expressaoRelacional() {
			return getRuleContexts(ExpressaoRelacionalContext.class);
		}
		public ExpressaoRelacionalContext expressaoRelacional(int i) {
			return getRuleContext(ExpressaoRelacionalContext.class,i);
		}
		public List<TerminalNode> OP_RELACIONAL() { return getTokens(gramaticaParser.OP_RELACIONAL); }
		public TerminalNode OP_RELACIONAL(int i) {
			return getToken(gramaticaParser.OP_RELACIONAL, i);
		}
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			expressaoRelacional();
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				match(OP_RELACIONAL);
				setState(213);
				expressaoRelacional();
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OP_RELACIONAL );
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
	public static class LogicoContext extends ParserRuleContext {
		public List<ExpressaoLogicoContext> expressaoLogico() {
			return getRuleContexts(ExpressaoLogicoContext.class);
		}
		public ExpressaoLogicoContext expressaoLogico(int i) {
			return getRuleContext(ExpressaoLogicoContext.class,i);
		}
		public List<TerminalNode> OP_LOGICO() { return getTokens(gramaticaParser.OP_LOGICO); }
		public TerminalNode OP_LOGICO(int i) {
			return getToken(gramaticaParser.OP_LOGICO, i);
		}
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			expressaoLogico();
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				match(OP_LOGICO);
				setState(220);
				expressaoLogico();
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OP_LOGICO );
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
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public TerminalNode NUMEROS() { return getToken(gramaticaParser.NUMEROS, 0); }
		public TerminalNode NUMEROS_DECIMAL() { return getToken(gramaticaParser.NUMEROS_DECIMAL, 0); }
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpressaoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressaoRelacional);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PONTOVIRGULA:
			case RPAREN:
			case VIRGULA:
			case OP_RELACIONAL:
			case OP_LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NUMEROS:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(NUMEROS);
				}
				break;
			case NUMEROS_DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(NUMEROS_DECIMAL);
				}
				break;
			case LETRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(LETRAS);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(LPAREN);
				setState(230);
				expressaoRelacional();
				setState(231);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicoContext extends ParserRuleContext {
		public ExpressaoMatematicaContext expressaoMatematica() {
			return getRuleContext(ExpressaoMatematicaContext.class,0);
		}
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public TerminalNode NUMEROS() { return getToken(gramaticaParser.NUMEROS, 0); }
		public TerminalNode NUMEROS_DECIMAL() { return getToken(gramaticaParser.NUMEROS_DECIMAL, 0); }
		public TerminalNode LETRAS() { return getToken(gramaticaParser.LETRAS, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressaoLogicoContext expressaoLogico() {
			return getRuleContext(ExpressaoLogicoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public ExpressaoLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpressaoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpressaoLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpressaoLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoLogicoContext expressaoLogico() throws RecognitionException {
		ExpressaoLogicoContext _localctx = new ExpressaoLogicoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressaoLogico);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				expressaoMatematica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				relacional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(NUMEROS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(NUMEROS_DECIMAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(LETRAS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				match(LPAREN);
				setState(241);
				expressaoLogico();
				setState(242);
				match(RPAREN);
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
	public static class ExpressaoMatematicaContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MAIS() { return getTokens(gramaticaParser.MAIS); }
		public TerminalNode MAIS(int i) {
			return getToken(gramaticaParser.MAIS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(gramaticaParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(gramaticaParser.MENOS, i);
		}
		public ExpressaoMatematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMatematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpressaoMatematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpressaoMatematica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpressaoMatematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoMatematicaContext expressaoMatematica() throws RecognitionException {
		ExpressaoMatematicaContext _localctx = new ExpressaoMatematicaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressaoMatematica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			term();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIS || _la==MENOS) {
				{
				{
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==MAIS || _la==MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(248);
				term();
				}
				}
				setState(253);
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
	public static class TermContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(gramaticaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(gramaticaParser.MULT, i);
		}
		public List<TerminalNode> DIVISAO() { return getTokens(gramaticaParser.DIVISAO); }
		public TerminalNode DIVISAO(int i) {
			return getToken(gramaticaParser.DIVISAO, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			fator();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVISAO) {
				{
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIVISAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				fator();
				}
				}
				setState(261);
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
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUMEROS() { return getToken(gramaticaParser.NUMEROS, 0); }
		public TerminalNode NUMEROS_DECIMAL() { return getToken(gramaticaParser.NUMEROS_DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(gramaticaParser.LPAREN, 0); }
		public ExpressaoMatematicaContext expressaoMatematica() {
			return getRuleContext(ExpressaoMatematicaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gramaticaParser.RPAREN, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fator);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMEROS:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(NUMEROS);
				}
				break;
			case NUMEROS_DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(NUMEROS_DECIMAL);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(LPAREN);
				setState(265);
				expressaoMatematica();
				setState(266);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u010f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000"+
		"\f\u00003\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b"+
		"\u0002\u0003\u0002F\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0003"+
		"\u0003Q\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004Y\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006e\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006j\b\u0006\u000b\u0006\f\u0006k\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006r\b\u0006\u000b\u0006\f\u0006s\u0001"+
		"\u0006\u0001\u0006\u0003\u0006x\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0080\b\u0007\u000b"+
		"\u0007\f\u0007\u0081\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u0087\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u008c\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0092\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0004\t\u009b\b\t\u000b\t\f\t\u009c\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00a9\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b3\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00c2\b\u000e\u0001\u000e\u0003\u000e"+
		"\u00c5\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00d2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00d7\b\u0010\u000b\u0010\f\u0010\u00d8\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0004\u0011\u00de\b\u0011\u000b\u0011\f\u0011\u00df\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00ea\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00f5\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u00fa\b\u0014\n\u0014\f\u0014\u00fd\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u0102\b\u0015\n\u0015\f\u0015\u0105\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u010d\b\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0004\u0001\u0000\u0001\u0002\u0002\u0000\u0019\u0019\u001e\u001e\u0001"+
		"\u0000\u0011\u0012\u0001\u0000\u0013\u0014\u012a\u00001\u0001\u0000\u0000"+
		"\u0000\u0002<\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006"+
		"I\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000"+
		"\u0000\fa\u0001\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010"+
		"\u0086\u0001\u0000\u0000\u0000\u0012\u008d\u0001\u0000\u0000\u0000\u0014"+
		"\u00a0\u0001\u0000\u0000\u0000\u0016\u00a3\u0001\u0000\u0000\u0000\u0018"+
		"\u00ad\u0001\u0000\u0000\u0000\u001a\u00b7\u0001\u0000\u0000\u0000\u001c"+
		"\u00bc\u0001\u0000\u0000\u0000\u001e\u00d1\u0001\u0000\u0000\u0000 \u00d3"+
		"\u0001\u0000\u0000\u0000\"\u00da\u0001\u0000\u0000\u0000$\u00e9\u0001"+
		"\u0000\u0000\u0000&\u00f4\u0001\u0000\u0000\u0000(\u00f6\u0001\u0000\u0000"+
		"\u0000*\u00fe\u0001\u0000\u0000\u0000,\u010c\u0001\u0000\u0000\u0000."+
		"0\u0003\u0002\u0001\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0001\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u00004=\u0003\n\u0005\u00005=\u0003"+
		"\f\u0006\u00006=\u0003\u000e\u0007\u00007=\u0003\u0012\t\u00008=\u0003"+
		"\u0016\u000b\u00009=\u0003\u0018\f\u0000:=\u0003\u001a\r\u0000;=\u0003"+
		"\u001c\u000e\u0000<4\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000\u0000"+
		"<6\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000"+
		"\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0005\u0002\u0000\u0000"+
		"?E\u0005\u0018\u0000\u0000@C\u0005\n\u0000\u0000AD\u0005\u001e\u0000\u0000"+
		"BD\u0003(\u0014\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DF\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u000b\u0000\u0000H\u0005\u0001"+
		"\u0000\u0000\u0000IJ\u0005\u0001\u0000\u0000JP\u0005\u0018\u0000\u0000"+
		"KN\u0005\n\u0000\u0000LO\u0005\u0019\u0000\u0000MO\u0003(\u0014\u0000"+
		"NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000"+
		"\u0000PK\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0005\u000b\u0000\u0000S\u0007\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0003\u0000\u0000UX\u0005\u0018\u0000\u0000VW\u0005\n\u0000\u0000"+
		"WY\u0005\u001c\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z[\u0005\u000b\u0000\u0000[\t\u0001\u0000"+
		"\u0000\u0000\\`\u0003\u0004\u0002\u0000]`\u0003\u0006\u0003\u0000^`\u0003"+
		"\b\u0004\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^"+
		"\u0001\u0000\u0000\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0005\u0004"+
		"\u0000\u0000bd\u0005\f\u0000\u0000ce\u0003\u001e\u000f\u0000dc\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005"+
		"\r\u0000\u0000gi\u0005\u000e\u0000\u0000hj\u0003\u0002\u0001\u0000ih\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mw\u0005\u000f\u0000"+
		"\u0000no\u0005\u0005\u0000\u0000oq\u0005\u000e\u0000\u0000pr\u0003\u0002"+
		"\u0001\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0005\u000f\u0000\u0000vx\u0001\u0000\u0000\u0000wn\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\r\u0001\u0000\u0000\u0000yz\u0005\u0007"+
		"\u0000\u0000z{\u0005\f\u0000\u0000{|\u0003\u001e\u000f\u0000|}\u0005\r"+
		"\u0000\u0000}\u007f\u0005\u000e\u0000\u0000~\u0080\u0003\u0002\u0001\u0000"+
		"\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u000f\u0000\u0000\u0084"+
		"\u000f\u0001\u0000\u0000\u0000\u0085\u0087\u0007\u0000\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008b\u0005\u0018\u0000\u0000\u0089"+
		"\u008a\u0005\n\u0000\u0000\u008a\u008c\u0007\u0001\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0011"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0006\u0000\u0000\u008e\u0091"+
		"\u0005\f\u0000\u0000\u008f\u0092\u0003\u0010\b\u0000\u0090\u0092\u0005"+
		"\u0018\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u000b\u0000\u0000\u0094\u0095\u0003\u001e\u000f\u0000\u0095\u0096\u0005"+
		"\u000b\u0000\u0000\u0096\u0097\u0003\u001c\u000e\u0000\u0097\u0098\u0005"+
		"\r\u0000\u0000\u0098\u009a\u0005\u000e\u0000\u0000\u0099\u009b\u0003\u0002"+
		"\u0001\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u000f"+
		"\u0000\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0015"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0018\u0000\u0000\u00a2\u0015\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0005\b\u0000\u0000\u00a4\u00a5\u0005\f\u0000"+
		"\u0000\u00a5\u00a8\u0003\u001e\u000f\u0000\u00a6\u00a7\u0005\u0010\u0000"+
		"\u0000\u00a7\u00a9\u0005\u0018\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005\r\u0000\u0000\u00ab\u00ac\u0005\u000b\u0000\u0000"+
		"\u00ac\u0017\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\t\u0000\u0000\u00ae"+
		"\u00af\u0005\f\u0000\u0000\u00af\u00b2\u0003\u001e\u000f\u0000\u00b0\u00b1"+
		"\u0005\u0010\u0000\u0000\u00b1\u00b3\u0003\u0014\n\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005\r\u0000\u0000\u00b5\u00b6\u0005\u000b"+
		"\u0000\u0000\u00b6\u0019\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0018"+
		"\u0000\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u00ba\u0003\u001e\u000f"+
		"\u0000\u00ba\u00bb\u0005\u000b\u0000\u0000\u00bb\u001b\u0001\u0000\u0000"+
		"\u0000\u00bc\u00c1\u0005\u0018\u0000\u0000\u00bd\u00c2\u0005\u001a\u0000"+
		"\u0000\u00be\u00c2\u0005\u001b\u0000\u0000\u00bf\u00c0\u0007\u0002\u0000"+
		"\u0000\u00c0\u00c2\u0005\u0019\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005\u000b\u0000"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u001d\u0001\u0000\u0000\u0000\u00c6\u00d2\u0005\u0019\u0000"+
		"\u0000\u00c7\u00d2\u0005\u001e\u0000\u0000\u00c8\u00d2\u0005\u001c\u0000"+
		"\u0000\u00c9\u00d2\u0005\u0018\u0000\u0000\u00ca\u00d2\u0003(\u0014\u0000"+
		"\u00cb\u00d2\u0003 \u0010\u0000\u00cc\u00d2\u0003\"\u0011\u0000\u00cd"+
		"\u00ce\u0005\f\u0000\u0000\u00ce\u00cf\u0003\u001e\u000f\u0000\u00cf\u00d0"+
		"\u0005\r\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00c6\u0001"+
		"\u0000\u0000\u0000\u00d1\u00c7\u0001\u0000\u0000\u0000\u00d1\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000\u0000\u00d1\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d2\u001f\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0003$\u0012\u0000\u00d4\u00d5\u0005\u0016"+
		"\u0000\u0000\u00d5\u00d7\u0003$\u0012\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9!\u0001\u0000\u0000\u0000"+
		"\u00da\u00dd\u0003&\u0013\u0000\u00db\u00dc\u0005\u0017\u0000\u0000\u00dc"+
		"\u00de\u0003&\u0013\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0#\u0001\u0000\u0000\u0000\u00e1\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e2\u00ea\u0005\u0019\u0000\u0000\u00e3\u00ea\u0005"+
		"\u001e\u0000\u0000\u00e4\u00ea\u0005\u0018\u0000\u0000\u00e5\u00e6\u0005"+
		"\f\u0000\u0000\u00e6\u00e7\u0003$\u0012\u0000\u00e7\u00e8\u0005\r\u0000"+
		"\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e2\u0001\u0000\u0000\u0000\u00e9\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ea%\u0001\u0000\u0000\u0000\u00eb\u00f5\u0003(\u0014\u0000\u00ec"+
		"\u00f5\u0003 \u0010\u0000\u00ed\u00f5\u0005\u0019\u0000\u0000\u00ee\u00f5"+
		"\u0005\u001e\u0000\u0000\u00ef\u00f5\u0005\u0018\u0000\u0000\u00f0\u00f1"+
		"\u0005\f\u0000\u0000\u00f1\u00f2\u0003&\u0013\u0000\u00f2\u00f3\u0005"+
		"\r\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f4\u00ec\u0001\u0000\u0000\u0000\u00f4\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f4\u00ee\u0001\u0000\u0000\u0000\u00f4\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f5\'\u0001\u0000\u0000"+
		"\u0000\u00f6\u00fb\u0003*\u0015\u0000\u00f7\u00f8\u0007\u0002\u0000\u0000"+
		"\u00f8\u00fa\u0003*\u0015\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc)\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fe\u0103\u0003,\u0016\u0000\u00ff\u0100\u0007"+
		"\u0003\u0000\u0000\u0100\u0102\u0003,\u0016\u0000\u0101\u00ff\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104+\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u010d\u0005\u0019\u0000"+
		"\u0000\u0107\u010d\u0005\u001e\u0000\u0000\u0108\u0109\u0005\f\u0000\u0000"+
		"\u0109\u010a\u0003(\u0014\u0000\u010a\u010b\u0005\r\u0000\u0000\u010b"+
		"\u010d\u0001\u0000\u0000\u0000\u010c\u0106\u0001\u0000\u0000\u0000\u010c"+
		"\u0107\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000\u0000\u0000\u010d"+
		"-\u0001\u0000\u0000\u0000\u001d1<CENPX_dksw\u0081\u0086\u008b\u0091\u009c"+
		"\u00a8\u00b2\u00c1\u00c4\u00d1\u00d8\u00df\u00e9\u00f4\u00fb\u0103\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}