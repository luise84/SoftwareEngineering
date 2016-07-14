package ai;// Generated from AiMoves.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AiMovesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, NEWLINE=20, WHITESPACE=21, Connector=22;
	public static final int
		RULE_file = 0, RULE_command = 1, RULE_choosetype = 2, RULE_move = 3, RULE_movetype = 4, 
		RULE_movedirection = 5, RULE_alternativeSymbol = 6, RULE_endline = 7;
	public static final String[] ruleNames = {
		"file", "command", "choosetype", "move", "movetype", "movedirection", 
		"alternativeSymbol", "endline"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Stein'", "'Zufaelliger'", "'Vorderster'", "'Hinterster'", "'zufaelliger'", 
		"'vorderster'", "'hinterster'", "'ziehe'", "'springe'", "'zufaellig'", 
		"'gerade'", "'zur Seite'", "'zur seite'", "'diagonal'", "'nach'", "'vorne'", 
		"'hinten'", "'oder'", "'.'", null, null, "'und'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "NEWLINE", "WHITESPACE", 
		"Connector"
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
	public String getGrammarFileName() { return "AiMoves.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AiMovesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode EOF() { return getToken(AiMovesParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AiMovesParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AiMovesParser.NEWLINE, i);
		}
		public List<AlternativeSymbolContext> alternativeSymbol() {
			return getRuleContexts(AlternativeSymbolContext.class);
		}
		public AlternativeSymbolContext alternativeSymbol(int i) {
			return getRuleContext(AlternativeSymbolContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			command();
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__17) {
						{
						{
						setState(17);
						alternativeSymbol();
						}
						}
						setState(22);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(23);
					match(NEWLINE);
					setState(24);
					command();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(30);
				match(NEWLINE);
				setState(31);
				command();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
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

	public static class CommandContext extends ParserRuleContext {
		public ChoosetypeContext choosetype() {
			return getRuleContext(ChoosetypeContext.class,0);
		}
		public TerminalNode Connector() { return getToken(AiMovesParser.Connector, 0); }
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public MovetypeContext movetype() {
			return getRuleContext(MovetypeContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(AiMovesParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(AiMovesParser.WHITESPACE, i);
		}
		public List<MovedirectionContext> movedirection() {
			return getRuleContexts(MovedirectionContext.class);
		}
		public MovedirectionContext movedirection(int i) {
			return getRuleContext(MovedirectionContext.class,i);
		}
		public List<EndlineContext> endline() {
			return getRuleContexts(EndlineContext.class);
		}
		public EndlineContext endline(int i) {
			return getRuleContext(EndlineContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			choosetype();
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				match(WHITESPACE);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(45);
			match(T__0);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				match(WHITESPACE);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(51);
			match(Connector);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				match(WHITESPACE);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(57);
			move();
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				match(WHITESPACE);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(63);
			movetype();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(WHITESPACE);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(70);
				movedirection();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(76);
				match(WHITESPACE);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(82);
				endline();
				}
				}
				setState(87);
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

	public static class ChoosetypeContext extends ParserRuleContext {
		public ChoosetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choosetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).enterChoosetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).exitChoosetype(this);
		}
	}

	public final ChoosetypeContext choosetype() throws RecognitionException {
		ChoosetypeContext _localctx = new ChoosetypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_choosetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MoveContext extends ParserRuleContext {
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MovetypeContext extends ParserRuleContext {
		public MovetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).enterMovetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).exitMovetype(this);
		}
	}

	public final MovetypeContext movetype() throws RecognitionException {
		MovetypeContext _localctx = new MovetypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_movetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MovedirectionContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(AiMovesParser.WHITESPACE, 0); }
		public MovedirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movedirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).enterMovedirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).exitMovedirection(this);
		}
	}

	public final MovedirectionContext movedirection() throws RecognitionException {
		MovedirectionContext _localctx = new MovedirectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_movedirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__14);
			setState(95);
			match(WHITESPACE);
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AlternativeSymbolContext extends ParserRuleContext {
		public AlternativeSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativeSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).enterAlternativeSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).exitAlternativeSymbol(this);
		}
	}

	public final AlternativeSymbolContext alternativeSymbol() throws RecognitionException {
		AlternativeSymbolContext _localctx = new AlternativeSymbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alternativeSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__17);
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

	public static class EndlineContext extends ParserRuleContext {
		public EndlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).enterEndline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiMovesListener ) ((AiMovesListener)listener).exitEndline(this);
		}
	}

	public final EndlineContext endline() throws RecognitionException {
		EndlineContext _localctx = new EndlineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_endline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__18);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\7\2#\n\2"+
		"\f\2\16\2&\13\2\3\2\3\2\3\3\3\3\6\3,\n\3\r\3\16\3-\3\3\3\3\6\3\62\n\3"+
		"\r\3\16\3\63\3\3\3\3\6\38\n\3\r\3\16\39\3\3\3\3\6\3>\n\3\r\3\16\3?\3\3"+
		"\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\7\3P\n\3"+
		"\f\3\16\3S\13\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\6\3\2\4\t"+
		"\3\2\n\13\3\2\f\20\3\2\22\23k\2\22\3\2\2\2\4)\3\2\2\2\6Z\3\2\2\2\b\\\3"+
		"\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22\35\5\4\3\2\23"+
		"\25\5\16\b\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27"+
		"\31\3\2\2\2\30\26\3\2\2\2\31\32\7\26\2\2\32\34\5\4\3\2\33\26\3\2\2\2\34"+
		"\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36$\3\2\2\2\37\35\3\2\2\2 !\7"+
		"\26\2\2!#\5\4\3\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2"+
		"&$\3\2\2\2\'(\7\2\2\3(\3\3\2\2\2)+\5\6\4\2*,\7\27\2\2+*\3\2\2\2,-\3\2"+
		"\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\61\7\3\2\2\60\62\7\27\2\2\61\60\3"+
		"\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\7"+
		"\30\2\2\668\7\27\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3"+
		"\2\2\2;=\5\b\5\2<>\7\27\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A"+
		"\3\2\2\2AE\5\n\6\2BD\7\27\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2"+
		"FK\3\2\2\2GE\3\2\2\2HJ\5\f\7\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"LQ\3\2\2\2MK\3\2\2\2NP\7\27\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2"+
		"\2RW\3\2\2\2SQ\3\2\2\2TV\5\20\t\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X\5\3\2\2\2YW\3\2\2\2Z[\t\2\2\2[\7\3\2\2\2\\]\t\3\2\2]\t\3\2\2\2^"+
		"_\t\4\2\2_\13\3\2\2\2`a\7\21\2\2ab\7\27\2\2bc\t\5\2\2c\r\3\2\2\2de\7\24"+
		"\2\2e\17\3\2\2\2fg\7\25\2\2g\21\3\2\2\2\r\26\35$-\639?EKQW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}