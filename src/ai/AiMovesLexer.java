// Generated from AiMoves.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AiMovesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NEWLINE=15, WHITESPACE=16, 
		Connector=17, Oder=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "NEWLINE", "WHITESPACE", "Connector", 
		"Oder"
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


	public AiMovesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AiMoves.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20"+
		"\u0097\n\20\r\20\16\20\u0098\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\4\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t;\3\2\2"+
		"\2\13F\3\2\2\2\rQ\3\2\2\2\17W\3\2\2\2\21_\3\2\2\2\23i\3\2\2\2\25p\3\2"+
		"\2\2\27z\3\2\2\2\31\u0083\3\2\2\2\33\u0088\3\2\2\2\35\u008e\3\2\2\2\37"+
		"\u0096\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u00a0\3\2\2\2\'(\7U\2\2"+
		"()\7v\2\2)*\7g\2\2*+\7k\2\2+,\7p\2\2,\4\3\2\2\2-.\7\60\2\2.\6\3\2\2\2"+
		"/\60\7\\\2\2\60\61\7w\2\2\61\62\7h\2\2\62\63\7\u00c5\2\2\63\64\7\u00a6"+
		"\2\2\64\65\7n\2\2\65\66\7n\2\2\66\67\7k\2\2\678\7i\2\289\7g\2\29:\7t\2"+
		"\2:\b\3\2\2\2;<\7X\2\2<=\7q\2\2=>\7t\2\2>?\7f\2\2?@\7g\2\2@A\7t\2\2AB"+
		"\7u\2\2BC\7v\2\2CD\7g\2\2DE\7t\2\2E\n\3\2\2\2FG\7J\2\2GH\7k\2\2HI\7p\2"+
		"\2IJ\7v\2\2JK\7g\2\2KL\7t\2\2LM\7u\2\2MN\7v\2\2NO\7g\2\2OP\7t\2\2P\f\3"+
		"\2\2\2QR\7|\2\2RS\7k\2\2ST\7g\2\2TU\7j\2\2UV\7g\2\2V\16\3\2\2\2WX\7u\2"+
		"\2XY\7r\2\2YZ\7t\2\2Z[\7k\2\2[\\\7p\2\2\\]\7i\2\2]^\7g\2\2^\20\3\2\2\2"+
		"_`\7|\2\2`a\7w\2\2ab\7h\2\2bc\7\u00c5\2\2cd\7\u00a6\2\2de\7n\2\2ef\7n"+
		"\2\2fg\7k\2\2gh\7i\2\2h\22\3\2\2\2ij\7i\2\2jk\7g\2\2kl\7t\2\2lm\7c\2\2"+
		"mn\7f\2\2no\7g\2\2o\24\3\2\2\2pq\7|\2\2qr\7w\2\2rs\7t\2\2st\7\"\2\2tu"+
		"\7U\2\2uv\7g\2\2vw\7k\2\2wx\7v\2\2xy\7g\2\2y\26\3\2\2\2z{\7f\2\2{|\7k"+
		"\2\2|}\7c\2\2}~\7i\2\2~\177\7q\2\2\177\u0080\7p\2\2\u0080\u0081\7c\2\2"+
		"\u0081\u0082\7n\2\2\u0082\30\3\2\2\2\u0083\u0084\7p\2\2\u0084\u0085\7"+
		"c\2\2\u0085\u0086\7e\2\2\u0086\u0087\7j\2\2\u0087\32\3\2\2\2\u0088\u0089"+
		"\7x\2\2\u0089\u008a\7q\2\2\u008a\u008b\7t\2\2\u008b\u008c\7p\2\2\u008c"+
		"\u008d\7g\2\2\u008d\34\3\2\2\2\u008e\u008f\7j\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\u0093\7g\2\2\u0093\u0094\7p\2\2"+
		"\u0094\36\3\2\2\2\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099 \3\2\2\2\u009a"+
		"\u009b\t\3\2\2\u009b\"\3\2\2\2\u009c\u009d\7w\2\2\u009d\u009e\7p\2\2\u009e"+
		"\u009f\7f\2\2\u009f$\3\2\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7f\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7t\2\2\u00a4&\3\2\2\2\4\2\u0098\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}