package Uebung3.Uebung3_3.ComputerMoves;// Generated from Move.g4 by ANTLR 4.5
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
public class MoveParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Separator=1, SimpleRow=2, SimplePosition=3, LineBreak=4;
	public static final int
		RULE_file = 0, RULE_row = 1, RULE_move = 2;
	public static final String[] ruleNames = {
		"file", "row", "move"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", null, null, "'\r\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Separator", "SimpleRow", "SimplePosition", "LineBreak"
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
	public String getGrammarFileName() { return "Move.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MoveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MoveParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			row();
			setState(7);
			row();
			setState(8);
			row();
			setState(9);
			row();
			setState(10);
			row();
			setState(11);
			row();
			setState(12);
			row();
			setState(13);
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

	public static class RowContext extends ParserRuleContext {
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public TerminalNode LineBreak() { return getToken(MoveParser.LineBreak, 0); }
		public TerminalNode EOF() { return getToken(MoveParser.EOF, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_row);
		try {
			setState(25);
			switch (_input.LA(1)) {
			case SimpleRow:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(15);
				move();
				setState(16);
				move();
				setState(17);
				move();
				setState(18);
				move();
				setState(19);
				move();
				setState(20);
				move();
				setState(21);
				move();
				setState(22);
				match(LineBreak);
				}
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(EOF);
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode SimpleRow() { return getToken(MoveParser.SimpleRow, 0); }
		public TerminalNode SimplePosition() { return getToken(MoveParser.SimplePosition, 0); }
		public TerminalNode Separator() { return getToken(MoveParser.Separator, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(SimpleRow);
			setState(28);
			match(SimplePosition);
			setState(29);
			match(Separator);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\"\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\37\2\b"+
		"\3\2\2\2\4\33\3\2\2\2\6\35\3\2\2\2\b\t\5\4\3\2\t\n\5\4\3\2\n\13\5\4\3"+
		"\2\13\f\5\4\3\2\f\r\5\4\3\2\r\16\5\4\3\2\16\17\5\4\3\2\17\20\7\2\2\3\20"+
		"\3\3\2\2\2\21\22\5\6\4\2\22\23\5\6\4\2\23\24\5\6\4\2\24\25\5\6\4\2\25"+
		"\26\5\6\4\2\26\27\5\6\4\2\27\30\5\6\4\2\30\31\7\6\2\2\31\34\3\2\2\2\32"+
		"\34\7\2\2\3\33\21\3\2\2\2\33\32\3\2\2\2\34\5\3\2\2\2\35\36\7\4\2\2\36"+
		"\37\7\5\2\2\37 \7\3\2\2 \7\3\2\2\2\3\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}