package ai;// Generated from AiMoves.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AiMovesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, NEWLINE=20, WHITESPACE=21, Connector=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "NEWLINE", "WHITESPACE", "Connector"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00d9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\6\25\u00d0\n\25\r\25"+
		"\16\25\u00d1\3\26\3\26\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30\3\2\4\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u00d9\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\65\3\2\2"+
		"\2\7A\3\2\2\2\tL\3\2\2\2\13W\3\2\2\2\rc\3\2\2\2\17n\3\2\2\2\21y\3\2\2"+
		"\2\23\177\3\2\2\2\25\u0087\3\2\2\2\27\u0091\3\2\2\2\31\u0098\3\2\2\2\33"+
		"\u00a2\3\2\2\2\35\u00ac\3\2\2\2\37\u00b5\3\2\2\2!\u00ba\3\2\2\2#\u00c0"+
		"\3\2\2\2%\u00c7\3\2\2\2\'\u00cc\3\2\2\2)\u00cf\3\2\2\2+\u00d3\3\2\2\2"+
		"-\u00d5\3\2\2\2/\60\7U\2\2\60\61\7v\2\2\61\62\7g\2\2\62\63\7k\2\2\63\64"+
		"\7p\2\2\64\4\3\2\2\2\65\66\7\\\2\2\66\67\7w\2\2\678\7h\2\289\7c\2\29:"+
		"\7g\2\2:;\7n\2\2;<\7n\2\2<=\7k\2\2=>\7i\2\2>?\7g\2\2?@\7t\2\2@\6\3\2\2"+
		"\2AB\7X\2\2BC\7q\2\2CD\7t\2\2DE\7f\2\2EF\7g\2\2FG\7t\2\2GH\7u\2\2HI\7"+
		"v\2\2IJ\7g\2\2JK\7t\2\2K\b\3\2\2\2LM\7J\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2"+
		"PQ\7g\2\2QR\7t\2\2RS\7u\2\2ST\7v\2\2TU\7g\2\2UV\7t\2\2V\n\3\2\2\2WX\7"+
		"|\2\2XY\7w\2\2YZ\7h\2\2Z[\7c\2\2[\\\7g\2\2\\]\7n\2\2]^\7n\2\2^_\7k\2\2"+
		"_`\7i\2\2`a\7g\2\2ab\7t\2\2b\f\3\2\2\2cd\7x\2\2de\7q\2\2ef\7t\2\2fg\7"+
		"f\2\2gh\7g\2\2hi\7t\2\2ij\7u\2\2jk\7v\2\2kl\7g\2\2lm\7t\2\2m\16\3\2\2"+
		"\2no\7j\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2rs\7g\2\2st\7t\2\2tu\7u\2\2uv\7"+
		"v\2\2vw\7g\2\2wx\7t\2\2x\20\3\2\2\2yz\7|\2\2z{\7k\2\2{|\7g\2\2|}\7j\2"+
		"\2}~\7g\2\2~\22\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7r\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\u0085\7i\2\2\u0085"+
		"\u0086\7g\2\2\u0086\24\3\2\2\2\u0087\u0088\7|\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008a\7h\2\2\u008a\u008b\7c\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2"+
		"\u008d\u008e\7n\2\2\u008e\u008f\7k\2\2\u008f\u0090\7i\2\2\u0090\26\3\2"+
		"\2\2\u0091\u0092\7i\2\2\u0092\u0093\7g\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7f\2\2\u0096\u0097\7g\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\7|\2\2\u0099\u009a\7w\2\2\u009a\u009b\7t\2\2\u009b\u009c\7\"\2\2\u009c"+
		"\u009d\7U\2\2\u009d\u009e\7g\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7v\2\2"+
		"\u00a0\u00a1\7g\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7|\2\2\u00a3\u00a4\7"+
		"w\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7u\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\34\3\2\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7"+
		"c\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00b4\7n\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7"+
		"\7c\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7j\2\2\u00b9 \3\2\2\2\u00ba\u00bb"+
		"\7x\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\"\3\2\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2"+
		"\u00c6$\3\2\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7g\2"+
		"\2\u00ca\u00cb\7t\2\2\u00cb&\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd(\3\2\2"+
		"\2\u00ce\u00d0\t\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2*\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4"+
		",\3\2\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7f\2\2\u00d8"+
		".\3\2\2\2\4\2\u00d1\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}