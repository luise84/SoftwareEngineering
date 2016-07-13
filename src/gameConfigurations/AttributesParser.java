package gameConfigurations;// Generated from Attributes.g4 by ANTLR 4.5.3
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NEWLINE=21, Value=22, Comma=23, Folder=24, 
		File=25, Separator=26, Whitespace=27;
	public static final int
		RULE_file = 0, RULE_color = 1, RULE_computerplayer = 2, RULE_player = 3, 
		RULE_playfield = 4, RULE_level = 5, RULE_path = 6, RULE_pType = 7, RULE_lType = 8;
	public static final String[] ruleNames = {
		"file", "color", "computerplayer", "player", "playfield", "level", "path", 
		"pType", "lType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Spielfeldfarbe'", "'RGB('", "')'", "'Bildpfad des Computerspielers'", 
		"'Bildpfad des Spielers'", "'Spielfeldtyp'", "'Level'", "'\\'", "'Renpaarden'", 
		"'renpaarden'", "'Le Zug'", "'le zug'", "'Classic'", "'classic'", "'Free'", 
		"'free'", "'Straight'", "'straight'", "'Diagonal'", "'diagonal'", null, 
		null, "','", null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "NEWLINE", "Value", 
		"Comma", "Folder", "File", "Separator", "Whitespace"
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
		public PlayfieldContext playfield() {
			return getRuleContext(PlayfieldContext.class,0);
		}
		public LevelContext level() {
			return getRuleContext(LevelContext.class,0);
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
			setState(18);
			color();
			setState(19);
			match(NEWLINE);
			setState(20);
			computerplayer();
			setState(21);
			match(NEWLINE);
			setState(22);
			player();
			setState(23);
			match(NEWLINE);
			setState(24);
			playfield();
			setState(25);
			match(NEWLINE);
			setState(26);
			level();
			setState(27);
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
			setState(29);
			match(T__0);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(30);
				match(Whitespace);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(Separator);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(37);
				match(Whitespace);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__1);
			setState(44);
			match(Value);
			setState(45);
			match(Comma);
			setState(46);
			match(Value);
			setState(47);
			match(Comma);
			setState(48);
			match(Value);
			setState(49);
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
			setState(51);
			match(T__3);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(52);
				match(Whitespace);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(Separator);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(59);
				match(Whitespace);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
			setState(67);
			match(T__4);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(68);
				match(Whitespace);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(Separator);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(75);
				match(Whitespace);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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

	public static class PlayfieldContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(AttributesParser.Separator, 0); }
		public PTypeContext pType() {
			return getRuleContext(PTypeContext.class,0);
		}
		public List<TerminalNode> Whitespace() { return getTokens(AttributesParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(AttributesParser.Whitespace, i);
		}
		public PlayfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterPlayfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitPlayfield(this);
		}
	}

	public final PlayfieldContext playfield() throws RecognitionException {
		PlayfieldContext _localctx = new PlayfieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_playfield);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__5);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(84);
				match(Whitespace);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(Separator);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(91);
				match(Whitespace);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			pType();
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

	public static class LevelContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(AttributesParser.Separator, 0); }
		public LTypeContext lType() {
			return getRuleContext(LTypeContext.class,0);
		}
		public List<TerminalNode> Whitespace() { return getTokens(AttributesParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(AttributesParser.Whitespace, i);
		}
		public LevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitLevel(this);
		}
	}

	public final LevelContext level() throws RecognitionException {
		LevelContext _localctx = new LevelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__6);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(100);
				match(Whitespace);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(Separator);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(107);
				match(Whitespace);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			lType();
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
		public TerminalNode Folder() { return getToken(AttributesParser.Folder, 0); }
		public TerminalNode File() { return getToken(AttributesParser.File, 0); }
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
		enterRule(_localctx, 12, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(Folder);
			setState(116);
			match(T__7);
			setState(117);
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

	public static class PTypeContext extends ParserRuleContext {
		public PTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterPType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitPType(this);
		}
	}

	public final PTypeContext pType() throws RecognitionException {
		PTypeContext _localctx = new PTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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

	public static class LTypeContext extends ParserRuleContext {
		public LTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterLType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitLType(this);
		}
	}

	public final LTypeContext lType() throws RecognitionException {
		LTypeContext _localctx = new LTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lType);
		int _la;
		try {
			setState(124);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				} else {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3\"\n\3\f\3\16\3%\13"+
		"\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4\3\4\3"+
		"\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\5\3\5"+
		"\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3\6\3"+
		"\6\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\n\177\n\n\3\n\2\2\13\2\4\6"+
		"\b\n\f\16\20\22\2\6\3\2\13\20\3\2\21\22\3\2\23\24\3\2\25\26\u0083\2\24"+
		"\3\2\2\2\4\37\3\2\2\2\6\65\3\2\2\2\bE\3\2\2\2\nU\3\2\2\2\fe\3\2\2\2\16"+
		"u\3\2\2\2\20y\3\2\2\2\22~\3\2\2\2\24\25\5\4\3\2\25\26\7\27\2\2\26\27\5"+
		"\6\4\2\27\30\7\27\2\2\30\31\5\b\5\2\31\32\7\27\2\2\32\33\5\n\6\2\33\34"+
		"\7\27\2\2\34\35\5\f\7\2\35\36\7\2\2\3\36\3\3\2\2\2\37#\7\3\2\2 \"\7\35"+
		"\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&*\7"+
		"\34\2\2\')\7\35\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2"+
		",*\3\2\2\2-.\7\4\2\2./\7\30\2\2/\60\7\31\2\2\60\61\7\30\2\2\61\62\7\31"+
		"\2\2\62\63\7\30\2\2\63\64\7\5\2\2\64\5\3\2\2\2\659\7\6\2\2\668\7\35\2"+
		"\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<"+
		"@\7\34\2\2=?\7\35\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2"+
		"\2B@\3\2\2\2CD\5\16\b\2D\7\3\2\2\2EI\7\7\2\2FH\7\35\2\2GF\3\2\2\2HK\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LP\7\34\2\2MO\7\35\2\2N"+
		"M\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5\16\b\2"+
		"T\t\3\2\2\2UY\7\b\2\2VX\7\35\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z\\\3\2\2\2[Y\3\2\2\2\\`\7\34\2\2]_\7\35\2\2^]\3\2\2\2_b\3\2\2\2`^\3"+
		"\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\5\20\t\2d\13\3\2\2\2ei\7\t\2\2"+
		"fh\7\35\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2"+
		"\2lp\7\34\2\2mo\7\35\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2"+
		"\2\2rp\3\2\2\2st\5\22\n\2t\r\3\2\2\2uv\7\32\2\2vw\7\n\2\2wx\7\33\2\2x"+
		"\17\3\2\2\2yz\t\2\2\2z\21\3\2\2\2{\177\t\3\2\2|\177\t\4\2\2}\177\t\5\2"+
		"\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\23\3\2\2\2\r#*9@IPY`ip~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}