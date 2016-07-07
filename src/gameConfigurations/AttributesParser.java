// Generated from C:\Users\Luise\01Luise_Ordner\StudiumMI\Master\semester1\SE\Uebung4_Semesterprojekt\SoftwareEngineering\src\gameConfigurations\Attributes.g4 by ANTLR 4.5.3
package gameConfigurations;

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
public class AttributesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NEWLINE=7, Value=8, Comma=9, 
		Folder=10, File=11, Drive=12, Separator=13, Whitespace=14;
	public static final int
		RULE_file = 0, RULE_color = 1, RULE_computerplayer = 2, RULE_player = 3, 
		RULE_path = 4;
	public static final String[] ruleNames = {
		"file", "color", "computerplayer", "player", "path"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Spielfeldfarbe'", "'RGB('", "')'", "'Bildpfad des Computerspielers'", 
		"'Bildpfad des Spielers'", "'\\'", null, null, "','", null, null, null, 
		"':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "NEWLINE", "Value", "Comma", 
		"Folder", "File", "Drive", "Separator", "Whitespace"
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
	public String getGrammarFileName() { return "Attributes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AttributesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AttributesParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AttributesParser.NEWLINE, i);
		}
		public ComputerplayerContext computerplayer() {
			return getRuleContext(ComputerplayerContext.class,0);
		}
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AttributesParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			color();
			setState(11);
			match(NEWLINE);
			setState(12);
			computerplayer();
			setState(13);
			match(NEWLINE);
			setState(14);
			player();
			setState(15);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(AttributesParser.Separator, 0); }
		public List<TerminalNode> Value() { return getTokens(AttributesParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(AttributesParser.Value, i);
		}
		public List<TerminalNode> Comma() { return getTokens(AttributesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AttributesParser.Comma, i);
		}
		public List<TerminalNode> Whitespace() { return getTokens(AttributesParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(AttributesParser.Whitespace, i);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(T__0);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(18);
				match(Whitespace);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(Separator);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(25);
				match(Whitespace);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(T__1);
			setState(32);
			match(Value);
			setState(33);
			match(Comma);
			setState(34);
			match(Value);
			setState(35);
			match(Comma);
			setState(36);
			match(Value);
			setState(37);
			match(T__2);
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

	public static class ComputerplayerContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(AttributesParser.Separator, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<TerminalNode> Whitespace() { return getTokens(AttributesParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(AttributesParser.Whitespace, i);
		}
		public ComputerplayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computerplayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterComputerplayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitComputerplayer(this);
		}
	}

	public final ComputerplayerContext computerplayer() throws RecognitionException {
		ComputerplayerContext _localctx = new ComputerplayerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_computerplayer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__3);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(40);
				match(Whitespace);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(Separator);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(47);
				match(Whitespace);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			path();
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

	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(AttributesParser.Separator, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<TerminalNode> Whitespace() { return getTokens(AttributesParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(AttributesParser.Whitespace, i);
		}
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitPlayer(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_player);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__4);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(56);
				match(Whitespace);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(Separator);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(63);
				match(Whitespace);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			path();
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

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> Folder() { return getTokens(AttributesParser.Folder); }
		public TerminalNode Folder(int i) {
			return getToken(AttributesParser.Folder, i);
		}
		public TerminalNode File() { return getToken(AttributesParser.File, 0); }
		public TerminalNode Drive() { return getToken(AttributesParser.Drive, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_path);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if (_la==Drive) {
				{
				setState(71);
				match(Drive);
				}
			}

			setState(75);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(74);
				match(T__5);
				}
			}

			setState(77);
			match(Folder);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					match(T__5);
					setState(79);
					match(Folder);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(85);
			match(T__5);
			setState(86);
			match(File);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\7\4\63\n\4"+
		"\f\4\16\4\66\13\4\3\4\3\4\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\7\5"+
		"C\n\5\f\5\16\5F\13\5\3\5\3\5\3\6\5\6K\n\6\3\6\5\6N\n\6\3\6\3\6\3\6\7\6"+
		"S\n\6\f\6\16\6V\13\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2^\2\f\3\2\2\2"+
		"\4\23\3\2\2\2\6)\3\2\2\2\b9\3\2\2\2\nJ\3\2\2\2\f\r\5\4\3\2\r\16\7\t\2"+
		"\2\16\17\5\6\4\2\17\20\7\t\2\2\20\21\5\b\5\2\21\22\7\2\2\3\22\3\3\2\2"+
		"\2\23\27\7\3\2\2\24\26\7\20\2\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2"+
		"\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\36\7\17\2\2\33\35\7"+
		"\20\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2"+
		"\2\2 \36\3\2\2\2!\"\7\4\2\2\"#\7\n\2\2#$\7\13\2\2$%\7\n\2\2%&\7\13\2\2"+
		"&\'\7\n\2\2\'(\7\5\2\2(\5\3\2\2\2)-\7\6\2\2*,\7\20\2\2+*\3\2\2\2,/\3\2"+
		"\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\64\7\17\2\2\61\63\7"+
		"\20\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67"+
		"\3\2\2\2\66\64\3\2\2\2\678\5\n\6\28\7\3\2\2\29=\7\7\2\2:<\7\20\2\2;:\3"+
		"\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\7\17\2\2AC"+
		"\7\20\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2"+
		"GH\5\n\6\2H\t\3\2\2\2IK\7\16\2\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\7\b\2"+
		"\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OT\7\f\2\2PQ\7\b\2\2QS\7\f\2\2RP\3\2\2"+
		"\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\b\2\2XY\7\r\2"+
		"\2Y\13\3\2\2\2\13\27\36-\64=DJMT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}