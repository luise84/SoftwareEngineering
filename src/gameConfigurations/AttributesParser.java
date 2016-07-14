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
		T__24=25, T__25=26, T__26=27, T__27=28, NEWLINE=29, Value=30, Comma=31, 
		Folder=32, File=33, Separator=34, Whitespace=35;
	public static final int
		RULE_file = 0, RULE_color = 1, RULE_computerplayer = 2, RULE_player = 3, 
		RULE_playfield = 4, RULE_fieldnumber = 5, RULE_level = 6, RULE_ai = 7, 
		RULE_path = 8, RULE_pType = 9, RULE_lType = 10, RULE_aiType = 11;
	public static final String[] ruleNames = {
		"file", "color", "computerplayer", "player", "playfield", "fieldnumber", 
		"level", "ai", "path", "pType", "lType", "aiType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Spielfeldfarbe'", "'RGB('", "')'", "'Bildpfad des Computerspielers'", 
		"'Bildpfad des Spielers'", "'Spielfeldtyp'", "'Spielfeldanzahl'", "'Level'", 
		"'AI'", "'\\'", "'Renpaarden'", "'renpaarden'", "'Le Zug'", "'le zug'", 
		"'Classic'", "'classic'", "'Free'", "'free'", "'Straight'", "'straight'", 
		"'Diagonal'", "'diagonal'", "'easy'", "'Easy'", "'Medium'", "'medium'", 
		"'hard'", "'Hard'", null, null, "','", null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NEWLINE", "Value", "Comma", "Folder", "File", 
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
		public FieldnumberContext fieldnumber() {
			return getRuleContext(FieldnumberContext.class,0);
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
			setState(24);
			color();
			setState(25);
			match(NEWLINE);
			setState(26);
			computerplayer();
			setState(27);
			match(NEWLINE);
			setState(28);
			player();
			setState(29);
			match(NEWLINE);
			setState(30);
			playfield();
			setState(31);
			match(NEWLINE);
			setState(32);
			fieldnumber();
			setState(33);
			match(NEWLINE);
			setState(34);
			level();
			setState(35);
			match(NEWLINE);
			setState(36);
			ai();
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
			setState(39);
			match(T__0);
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
			match(T__1);
			setState(54);
			match(Value);
			setState(55);
			match(Comma);
			setState(56);
			match(Value);
			setState(57);
			match(Comma);
			setState(58);
			match(Value);
			setState(59);
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
			setState(61);
			match(T__3);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(62);
				match(Whitespace);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(Separator);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(69);
				match(Whitespace);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
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
			setState(77);
			match(T__4);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(78);
				match(Whitespace);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(Separator);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(85);
				match(Whitespace);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
			setState(93);
			match(T__5);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(94);
				match(Whitespace);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(Separator);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(101);
				match(Whitespace);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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

	public static class FieldnumberContext extends ParserRuleContext {
		public TerminalNode Separator() { return getToken(AttributesParser.Separator, 0); }
		public TerminalNode Value() { return getToken(AttributesParser.Value, 0); }
		public List<TerminalNode> Whitespace() { return getTokens(AttributesParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(AttributesParser.Whitespace, i);
		}
		public FieldnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).enterFieldnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributesListener ) ((AttributesListener)listener).exitFieldnumber(this);
		}
	}

	public final FieldnumberContext fieldnumber() throws RecognitionException {
		FieldnumberContext _localctx = new FieldnumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldnumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__6);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(110);
				match(Whitespace);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(Separator);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(117);
				match(Whitespace);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(Value);
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
		enterRule(_localctx, 12, RULE_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__7);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(126);
				match(Whitespace);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(Separator);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(133);
				match(Whitespace);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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
		enterRule(_localctx, 14, RULE_ai);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__8);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(142);
				match(Whitespace);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(Separator);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(149);
				match(Whitespace);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
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
		enterRule(_localctx, 16, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Folder);
			setState(158);
			match(T__9);
			setState(159);
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
		enterRule(_localctx, 18, RULE_pType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_lType);
		int _la;
		try {
			setState(166);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
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
		enterRule(_localctx, 22, RULE_aiType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\7\3\63\n\3\f\3\16\3"+
		"\66\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4B\n\4\f\4\16\4E\13"+
		"\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\5\3\5\7\5R\n\5\f\5\16\5U"+
		"\13\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\6\3\6\7\6b\n\6\f\6\16"+
		"\6e\13\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\7\7r\n\7\f\7"+
		"\16\7u\13\7\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\7\3\7\3\b\3\b\7\b\u0082"+
		"\n\b\f\b\16\b\u0085\13\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\b"+
		"\3\b\3\t\3\t\7\t\u0092\n\t\f\t\16\t\u0095\13\t\3\t\3\t\7\t\u0099\n\t\f"+
		"\t\16\t\u009c\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\f\u00a9"+
		"\n\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\3\2\r\22\3\2"+
		"\23\24\3\2\25\26\3\2\27\30\3\2\31\36\u00b0\2\32\3\2\2\2\4)\3\2\2\2\6?"+
		"\3\2\2\2\bO\3\2\2\2\n_\3\2\2\2\fo\3\2\2\2\16\177\3\2\2\2\20\u008f\3\2"+
		"\2\2\22\u009f\3\2\2\2\24\u00a3\3\2\2\2\26\u00a8\3\2\2\2\30\u00aa\3\2\2"+
		"\2\32\33\5\4\3\2\33\34\7\37\2\2\34\35\5\6\4\2\35\36\7\37\2\2\36\37\5\b"+
		"\5\2\37 \7\37\2\2 !\5\n\6\2!\"\7\37\2\2\"#\5\f\7\2#$\7\37\2\2$%\5\16\b"+
		"\2%&\7\37\2\2&\'\5\20\t\2\'(\7\2\2\3(\3\3\2\2\2)-\7\3\2\2*,\7%\2\2+*\3"+
		"\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\64\7$\2"+
		"\2\61\63\7%\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2"+
		"\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\4\2\289\7 \2\29:\7!\2\2:;\7 \2\2"+
		";<\7!\2\2<=\7 \2\2=>\7\5\2\2>\5\3\2\2\2?C\7\6\2\2@B\7%\2\2A@\3\2\2\2B"+
		"E\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FJ\7$\2\2GI\7%\2\2HG"+
		"\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\5\22\n\2"+
		"N\7\3\2\2\2OS\7\7\2\2PR\7%\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VZ\7$\2\2WY\7%\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\5\22\n\2^\t\3\2\2\2_c\7\b\2\2`b\7%\2"+
		"\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fj\7$\2"+
		"\2gi\7%\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2"+
		"\2mn\5\24\13\2n\13\3\2\2\2os\7\t\2\2pr\7%\2\2qp\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vz\7$\2\2wy\7%\2\2xw\3\2\2\2y|\3\2"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7 \2\2~\r\3\2\2\2\177\u0083"+
		"\7\n\2\2\u0080\u0082\7%\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u008a\7$\2\2\u0087\u0089\7%\2\2\u0088\u0087\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\5\26\f\2\u008e\17\3\2\2\2\u008f\u0093\7\13"+
		"\2\2\u0090\u0092\7%\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u009a\7$\2\2\u0097\u0099\7%\2\2\u0098\u0097\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\5\30\r\2\u009e\21\3\2\2\2\u009f\u00a0\7\"\2"+
		"\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\7#\2\2\u00a2\23\3\2\2\2\u00a3\u00a4"+
		"\t\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a9\t\3\2\2\u00a6\u00a9\t\4\2\2\u00a7"+
		"\u00a9\t\5\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\27\3\2\2\2\u00aa\u00ab\t\6\2\2\u00ab\31\3\2\2\2\21-\64CJSZ"+
		"cjsz\u0083\u008a\u0093\u009a\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}