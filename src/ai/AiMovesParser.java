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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NEWLINE=15, WHITESPACE=16, 
		Connector=17;
	public static final int
		RULE_file = 0, RULE_command = 1, RULE_choosetype = 2, RULE_move = 3, RULE_movetype = 4, 
		RULE_movedirection = 5;
	public static final String[] ruleNames = {
		"file", "command", "choosetype", "move", "movetype", "movedirection"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Stein'", "'.'", "'Zufälliger'", "'Vorderster'", "'Hinterster'", 
		"'ziehe'", "'springe'", "'zufällig'", "'gerade'", "'zur Seite'", "'diagonal'", 
		"'nach'", "'vorne'", "'hinten'", null, null, "'und'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NEWLINE", "WHITESPACE", "Connector"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			command();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(13);
				match(NEWLINE);
				setState(14);
				command();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
			setState(22);
			choosetype();
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				match(WHITESPACE);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(28);
			match(T__0);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				match(WHITESPACE);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(34);
			match(Connector);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(WHITESPACE);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(40);
			move();
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				match(WHITESPACE);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(46);
			movetype();
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					match(WHITESPACE);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(53);
				movedirection();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(59);
				match(WHITESPACE);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__1);
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
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
			setState(73);
			match(T__11);
			setState(74);
			match(WHITESPACE);
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\6\3\33\n\3\r\3\16\3\34\3\3\3\3\6\3!\n\3\r\3\16\3"+
		"\"\3\3\3\3\6\3\'\n\3\r\3\16\3(\3\3\3\3\6\3-\n\3\r\3\16\3.\3\3\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\7\3?\n\3\f\3"+
		"\16\3B\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b"+
		"\2\4\6\b\n\f\2\6\3\2\5\7\3\2\b\t\3\2\n\r\3\2\17\20Q\2\16\3\2\2\2\4\30"+
		"\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16\23\5\4\3\2\17"+
		"\20\7\21\2\2\20\22\5\4\3\2\21\17\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23"+
		"\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30"+
		"\32\5\6\4\2\31\33\7\22\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\36\3\2\2\2\36 \7\3\2\2\37!\7\22\2\2 \37\3\2\2\2!\"\3\2"+
		"\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$&\7\23\2\2%\'\7\22\2\2&%\3\2\2\2"+
		"\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*,\5\b\5\2+-\7\22\2\2,+\3\2\2"+
		"\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\64\5\n\6\2\61\63\7\22"+
		"\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2"+
		"\2\66\64\3\2\2\2\679\5\f\7\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2"+
		";@\3\2\2\2<:\3\2\2\2=?\7\22\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2"+
		"\2AC\3\2\2\2B@\3\2\2\2CD\7\4\2\2D\5\3\2\2\2EF\t\2\2\2F\7\3\2\2\2GH\t\3"+
		"\2\2H\t\3\2\2\2IJ\t\4\2\2J\13\3\2\2\2KL\7\16\2\2LM\7\22\2\2MN\t\5\2\2"+
		"N\r\3\2\2\2\n\23\34\"(.\64:@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}