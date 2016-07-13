// Generated from AiMoves.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AiMovesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NEWLINE=15, WHITESPACE=16, 
		Connector=17, Oder=18;
	public static final int
		RULE_file = 0, RULE_command = 1, RULE_choosetype = 2, RULE_move = 3, RULE_movetype = 4, 
		RULE_movedirection = 5;
	public static final String[] ruleNames = {
		"file", "command", "choosetype", "move", "movetype", "movedirection"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Stein'", "'.'", "'Zufälliger'", "'Vorderster'", "'Hinterster'", 
		"'ziehe'", "'springe'", "'zufällig'", "'gerade'", "'zur Seite'", "'diagonal'", 
		"'nach'", "'vorne'", "'hinten'", null, null, "'und'", "'oder'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NEWLINE", "WHITESPACE", "Connector", "Oder"
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
		public List<TerminalNode> Oder() { return getTokens(AiMovesParser.Oder); }
		public TerminalNode Oder(int i) {
			return getToken(AiMovesParser.Oder, i);
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
			setState(12);
			command();
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(16);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Oder) {
						{
						{
						setState(13);
						match(Oder);
						}
						}
						setState(18);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(19);
					match(NEWLINE);
					setState(20);
					command();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(26);
				match(NEWLINE);
				setState(27);
				command();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
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
			setState(35);
			choosetype();
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				match(WHITESPACE);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(41);
			match(T__0);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				match(WHITESPACE);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(47);
			match(Connector);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				match(WHITESPACE);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(53);
			move();
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				match(WHITESPACE);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(59);
			movetype();
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(WHITESPACE);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(66);
				movedirection();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(72);
				match(WHITESPACE);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(78);
				match(T__1);
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
			setState(84);
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
			setState(86);
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
			setState(88);
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
			setState(90);
			match(T__11);
			setState(91);
			match(WHITESPACE);
			setState(92);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13"+
		"\2\3\2\3\2\3\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\6\3.\n\3\r\3\16\3/\3\3\3"+
		"\3\6\3\64\n\3\r\3\16\3\65\3\3\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\7\3@\n\3"+
		"\f\3\16\3C\13\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\7\3L\n\3\f\3\16\3O\13"+
		"\3\3\3\7\3R\n\3\f\3\16\3U\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\2\2\b\2\4\6\b\n\f\2\6\3\2\5\7\3\2\b\t\3\2\n\r\3\2\17\20e\2\16\3\2"+
		"\2\2\4%\3\2\2\2\6V\3\2\2\2\bX\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16\31\5\4"+
		"\3\2\17\21\7\24\2\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3"+
		"\2\2\2\23\25\3\2\2\2\24\22\3\2\2\2\25\26\7\21\2\2\26\30\5\4\3\2\27\22"+
		"\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32 \3\2\2\2\33\31\3"+
		"\2\2\2\34\35\7\21\2\2\35\37\5\4\3\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2"+
		"\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\2\2\3$\3\3\2\2\2%\'\5\6\4\2&("+
		"\7\22\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+-\7\3\2"+
		"\2,.\7\22\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2"+
		"\61\63\7\23\2\2\62\64\7\22\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2"+
		"\2\65\66\3\2\2\2\66\67\3\2\2\2\679\5\b\5\28:\7\22\2\298\3\2\2\2:;\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=A\5\n\6\2>@\7\22\2\2?>\3\2\2\2@C\3"+
		"\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\f\7\2ED\3\2\2\2FI\3"+
		"\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2JL\7\22\2\2KJ\3\2\2\2LO"+
		"\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2PR\7\4\2\2QP\3\2\2\2R"+
		"U\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\5\3\2\2\2US\3\2\2\2VW\t\2\2\2W\7\3\2\2"+
		"\2XY\t\3\2\2Y\t\3\2\2\2Z[\t\4\2\2[\13\3\2\2\2\\]\7\16\2\2]^\7\22\2\2^"+
		"_\t\5\2\2_\r\3\2\2\2\r\22\31 )/\65;AGMS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}