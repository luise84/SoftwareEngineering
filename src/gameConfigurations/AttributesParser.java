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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, NEWLINE=28, Value=29, Comma=30, Folder=31, 
		File=32, Separator=33, Whitespace=34;
	public static final int
		RULE_file = 0, RULE_color = 1, RULE_computerplayer = 2, RULE_player = 3, 
		RULE_playfield = 4, RULE_level = 5, RULE_ai = 6, RULE_path = 7, RULE_pType = 8, 
		RULE_lType = 9, RULE_aiType = 10;
	public static final String[] ruleNames = {
		"file", "color", "computerplayer", "player", "playfield", "level", "ai", 
		"path", "pType", "lType", "aiType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Spielfeldfarbe'", "'RGB('", "')'", "'Bildpfad des Computerspielers'", 
		"'Bildpfad des Spielers'", "'Spielfeldtyp'", "'Level'", "'AI'", "'\\'", 
		"'Renpaarden'", "'renpaarden'", "'Le Zug'", "'le zug'", "'Classic'", "'classic'", 
		"'Free'", "'free'", "'Straight'", "'straight'", "'Diagonal'", "'diagonal'", 
		"'easy'", "'Easy'", "'Medium'", "'medium'", "'hard'", "'Hard'", null, 
		null, "','", null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NEWLINE", "Value", "Comma", "Folder", "File", 
		"Separator", "Whitespace"
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
		public AiContext ai() {
			return getRuleContext(AiContext.class,0);
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
			setState(22);
			color();
			setState(23);
			match(NEWLINE);
			setState(24);
			computerplayer();
			setState(25);
			match(NEWLINE);
			setState(26);
			player();
			setState(27);
			match(NEWLINE);
			setState(28);
			playfield();
			setState(29);
			match(NEWLINE);
			setState(30);
			level();
			setState(31);
			match(NEWLINE);
			setState(32);
			ai();
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
			setState(35);
			match(T__0);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(36);
				match(Whitespace);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(Separator);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(43);
				match(Whitespace);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__1);
			setState(50);
			match(Value);
			setState(51);
			match(Comma);
			setState(52);
			match(Value);
			setState(53);
			match(Comma);
			setState(54);
			match(Value);
			setState(55);
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
			setState(57);
			match(T__3);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(58);
				match(Whitespace);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(Separator);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(65);
				match(Whitespace);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
			setState(73);
			match(T__4);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(74);
				match(Whitespace);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(Separator);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(81);
				match(Whitespace);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
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
			setState(89);
			match(T__5);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(90);
				match(Whitespace);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(Separator);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(97);
				match(Whitespace);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
			setState(105);
			match(T__6);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(106);
				match(Whitespace);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(Separator);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(113);
				match(Whitespace);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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

	public static class AiContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(AttributesParser.Separator, 0); }
		public AiTypeContext aiType() {
			return getRuleContext(AiTypeContext.class,0);
		}
		public List<TerminalNode> Whitespace() { return getTokens(AttributesParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(AttributesParser.Whitespace, i);
		}
		public AiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterAi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitAi(this);
		}
	}

	public final AiContext ai() throws RecognitionException {
		AiContext _localctx = new AiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ai);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__7);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(122);
				match(Whitespace);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(Separator);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(129);
				match(Whitespace);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			aiType();
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
		enterRule(_localctx, 14, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(Folder);
			setState(138);
			match(T__8);
			setState(139);
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
		enterRule(_localctx, 16, RULE_pType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_lType);
		int _la;
		try {
			setState(146);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
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

	public static class AiTypeContext extends ParserRuleContext {
		public AiTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aiType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterAiType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitAiType(this);
		}
	}

	public final AiTypeContext aiType() throws RecognitionException {
		AiTypeContext _localctx = new AiTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aiType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u0099\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\7\4E\n"+
		"\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\5\3\5\7\5"+
		"U\n\5\f\5\16\5X\13\5\3\5\3\5\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3\6\7"+
		"\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\7\3\7"+
		"\7\7u\n\7\f\7\16\7x\13\7\3\7\3\7\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b"+
		"\3\b\3\b\7\b\u0085\n\b\f\b\16\b\u0088\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\5\13\u0095\n\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\7\3\2\f\21\3\2\22\23\3\2\24\25\3\2\26\27\3\2\30\35\u009b\2"+
		"\30\3\2\2\2\4%\3\2\2\2\6;\3\2\2\2\bK\3\2\2\2\n[\3\2\2\2\fk\3\2\2\2\16"+
		"{\3\2\2\2\20\u008b\3\2\2\2\22\u008f\3\2\2\2\24\u0094\3\2\2\2\26\u0096"+
		"\3\2\2\2\30\31\5\4\3\2\31\32\7\36\2\2\32\33\5\6\4\2\33\34\7\36\2\2\34"+
		"\35\5\b\5\2\35\36\7\36\2\2\36\37\5\n\6\2\37 \7\36\2\2 !\5\f\7\2!\"\7\36"+
		"\2\2\"#\5\16\b\2#$\7\2\2\3$\3\3\2\2\2%)\7\3\2\2&(\7$\2\2\'&\3\2\2\2(+"+
		"\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,\60\7#\2\2-/\7$\2\2"+
		".-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3"+
		"\2\2\2\63\64\7\4\2\2\64\65\7\37\2\2\65\66\7 \2\2\66\67\7\37\2\2\678\7"+
		" \2\289\7\37\2\29:\7\5\2\2:\5\3\2\2\2;?\7\6\2\2<>\7$\2\2=<\3\2\2\2>A\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BF\7#\2\2CE\7$\2\2DC\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\20\t\2J\7\3"+
		"\2\2\2KO\7\7\2\2LN\7$\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3"+
		"\2\2\2QO\3\2\2\2RV\7#\2\2SU\7$\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2WY\3\2\2\2XV\3\2\2\2YZ\5\20\t\2Z\t\3\2\2\2[_\7\b\2\2\\^\7$\2\2]\\"+
		"\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bf\7#\2\2ce"+
		"\7$\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij"+
		"\5\22\n\2j\13\3\2\2\2ko\7\t\2\2ln\7$\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rv\7#\2\2su\7$\2\2ts\3\2\2\2ux\3\2\2\2v"+
		"t\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\5\24\13\2z\r\3\2\2\2{\177\7"+
		"\n\2\2|~\7$\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0086\7#\2\2\u0083\u0085"+
		"\7$\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5\26"+
		"\f\2\u008a\17\3\2\2\2\u008b\u008c\7!\2\2\u008c\u008d\7\13\2\2\u008d\u008e"+
		"\7\"\2\2\u008e\21\3\2\2\2\u008f\u0090\t\2\2\2\u0090\23\3\2\2\2\u0091\u0095"+
		"\t\3\2\2\u0092\u0095\t\4\2\2\u0093\u0095\t\5\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\25\3\2\2\2\u0096\u0097\t\6\2"+
		"\2\u0097\27\3\2\2\2\17)\60?FOV_fov\177\u0086\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}