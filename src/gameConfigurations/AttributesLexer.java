// Generated from C:\Users\Luise\01Luise_Ordner\StudiumMI\Master\semester1\SE\Uebung4_Semesterprojekt\SoftwareEngineering\src\gameConfigurations\Attributes.g4 by ANTLR 4.5.3
package gameConfigurations;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AttributesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NEWLINE=7, Value=8, Comma=9, 
		Folder=10, File=11, Drive=12, Separator=13, Whitespace=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NEWLINE", "Value", "Comma", 
		"Folder", "File", "Drive", "Separator", "Whitespace"
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


	public AttributesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Attributes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\6\bm\n\b\r\b\16\bn\3\t\6\tr\n\t\r\t\16\ts\3\n\3\n\3\13\6\13y\n\13\r"+
		"\13\16\13z\3\13\6\13~\n\13\r\13\16\13\177\5\13\u0082\n\13\3\f\6\f\u0085"+
		"\n\f\r\f\16\f\u0086\3\f\6\f\u008a\n\f\r\f\16\f\u008b\5\f\u008e\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\3\2\7\4\2\f\f\17\17\3\2\62;\4\2C\\c|\3"+
		"\2c|\5\2\13\f\17\17\"\"\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3"+
		"\37\3\2\2\2\5.\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13S\3\2\2\2\ri\3\2\2"+
		"\2\17l\3\2\2\2\21q\3\2\2\2\23u\3\2\2\2\25\u0081\3\2\2\2\27\u008d\3\2\2"+
		"\2\31\u009e\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37 \7U\2\2 !\7r"+
		"\2\2!\"\7k\2\2\"#\7g\2\2#$\7n\2\2$%\7h\2\2%&\7g\2\2&\'\7n\2\2\'(\7f\2"+
		"\2()\7h\2\2)*\7c\2\2*+\7t\2\2+,\7d\2\2,-\7g\2\2-\4\3\2\2\2./\7T\2\2/\60"+
		"\7I\2\2\60\61\7D\2\2\61\62\7*\2\2\62\6\3\2\2\2\63\64\7+\2\2\64\b\3\2\2"+
		"\2\65\66\7D\2\2\66\67\7k\2\2\678\7n\2\289\7f\2\29:\7r\2\2:;\7h\2\2;<\7"+
		"c\2\2<=\7f\2\2=>\7\"\2\2>?\7f\2\2?@\7g\2\2@A\7u\2\2AB\7\"\2\2BC\7E\2\2"+
		"CD\7q\2\2DE\7o\2\2EF\7r\2\2FG\7w\2\2GH\7v\2\2HI\7g\2\2IJ\7t\2\2JK\7u\2"+
		"\2KL\7r\2\2LM\7k\2\2MN\7g\2\2NO\7n\2\2OP\7g\2\2PQ\7t\2\2QR\7u\2\2R\n\3"+
		"\2\2\2ST\7D\2\2TU\7k\2\2UV\7n\2\2VW\7f\2\2WX\7r\2\2XY\7h\2\2YZ\7c\2\2"+
		"Z[\7f\2\2[\\\7\"\2\2\\]\7f\2\2]^\7g\2\2^_\7u\2\2_`\7\"\2\2`a\7U\2\2ab"+
		"\7r\2\2bc\7k\2\2cd\7g\2\2de\7n\2\2ef\7g\2\2fg\7t\2\2gh\7u\2\2h\f\3\2\2"+
		"\2ij\7^\2\2j\16\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2o\20\3\2\2\2pr\t\3\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\22"+
		"\3\2\2\2uv\7.\2\2v\24\3\2\2\2wy\t\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{\u0082\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081x\3\2\2\2\u0081}\3\2\2\2"+
		"\u0082\26\3\2\2\2\u0083\u0085\t\5\2\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008e\3\2\2\2\u0088"+
		"\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0084\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u009c\7\60\2\2\u0090\u0091\7"+
		"r\2\2\u0091\u0092\7p\2\2\u0092\u009d\7i\2\2\u0093\u0094\7R\2\2\u0094\u0095"+
		"\7P\2\2\u0095\u009d\7I\2\2\u0096\u0097\7L\2\2\u0097\u0098\7R\2\2\u0098"+
		"\u009d\7I\2\2\u0099\u009a\7l\2\2\u009a\u009b\7r\2\2\u009b\u009d\7i\2\2"+
		"\u009c\u0090\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0099"+
		"\3\2\2\2\u009d\30\3\2\2\2\u009e\u009f\t\4\2\2\u009f\u00a0\7<\2\2\u00a0"+
		"\32\3\2\2\2\u00a1\u00a2\7<\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\t\6\2\2\u00a4"+
		"\36\3\2\2\2\f\2nsz\177\u0081\u0086\u008b\u008d\u009c\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}