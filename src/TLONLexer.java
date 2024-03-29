// Generated from TLON.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, ASSIGN=16, OPAR=17, CPAR=18, 
		OBRACE=19, CBRACE=20, OKEY=21, CKEY=22, COMMA=23, POINTS=24, TRUE=25, 
		FALSE=26, NIL=27, IF=28, ELSE=29, WHILE=30, LOG=31, LEER=32, FOR=33, IN=34, 
		FUNCION=35, END=36, RETORNO=37, IMPORT=38, FROM=39, ASTERISC=40, POINT=41, 
		ID=42, INT=43, FLOAT=44, STRING=45, COMMENT=46, SPACE=47, NEWLINE=48, 
		OTHER=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "POW", "NOT", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
		"CBRACE", "OKEY", "CKEY", "COMMA", "POINTS", "TRUE", "FALSE", "NIL", "IF", 
		"ELSE", "WHILE", "LOG", "LEER", "FOR", "IN", "FUNCION", "END", "RETORNO", 
		"IMPORT", "FROM", "ASTERISC", "POINT", "ID", "INT", "FLOAT", "STRING", 
		"COMMENT", "SPACE", "NEWLINE", "OTHER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "':'", "'true'", "'false'", "'nil'", "'if'", 
		"'else'", "'while'", "'log'", "'leer'", "'for'", "'in'", "'funcion'", 
		"'end funcion'", "'retorno'", "'importar'", "'desde'", "'todo'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "POW", "NOT", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
		"CBRACE", "OKEY", "CKEY", "COMMA", "POINTS", "TRUE", "FALSE", "NIL", "IF", 
		"ELSE", "WHILE", "LOG", "LEER", "FOR", "IN", "FUNCION", "END", "RETORNO", 
		"IMPORT", "FROM", "ASTERISC", "POINT", "ID", "INT", "FLOAT", "STRING", 
		"COMMENT", "SPACE", "NEWLINE", "OTHER"
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


	public TLONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0136\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\3+\7+\u00fd\n+\f+\16+\u0100\13+\3,\6,\u0103"+
		"\n,\r,\16,\u0104\3-\6-\u0108\n-\r-\16-\u0109\3-\3-\7-\u010e\n-\f-\16-"+
		"\u0111\13-\3-\3-\6-\u0115\n-\r-\16-\u0116\5-\u0119\n-\3.\3.\3.\3.\7.\u011f"+
		"\n.\f.\16.\u0122\13.\3.\3.\3/\3/\7/\u0128\n/\f/\16/\u012b\13/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63\3\2\t\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2"+
		"\f\f\17\17$$\4\2\f\f\17\17\5\2\13\13\17\17\"\"\3\2\f\f\2\u013e\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\3e\3\2\2\2\5h\3\2\2\2\7k\3\2\2\2\tn\3\2\2\2\13q\3\2\2\2\rs\3"+
		"\2\2\2\17u\3\2\2\2\21x\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\177\3\2\2\2"+
		"\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2\2\2!"+
		"\u0089\3\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0091\3"+
		"\2\2\2+\u0093\3\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61\u0099\3\2\2\2\63"+
		"\u009b\3\2\2\2\65\u00a0\3\2\2\2\67\u00a6\3\2\2\29\u00aa\3\2\2\2;\u00ad"+
		"\3\2\2\2=\u00b2\3\2\2\2?\u00b8\3\2\2\2A\u00bc\3\2\2\2C\u00c1\3\2\2\2E"+
		"\u00c5\3\2\2\2G\u00c8\3\2\2\2I\u00d0\3\2\2\2K\u00dc\3\2\2\2M\u00e4\3\2"+
		"\2\2O\u00ed\3\2\2\2Q\u00f3\3\2\2\2S\u00f8\3\2\2\2U\u00fa\3\2\2\2W\u0102"+
		"\3\2\2\2Y\u0118\3\2\2\2[\u011a\3\2\2\2]\u0125\3\2\2\2_\u012e\3\2\2\2a"+
		"\u0132\3\2\2\2c\u0134\3\2\2\2ef\7~\2\2fg\7~\2\2g\4\3\2\2\2hi\7(\2\2ij"+
		"\7(\2\2j\6\3\2\2\2kl\7?\2\2lm\7?\2\2m\b\3\2\2\2no\7#\2\2op\7?\2\2p\n\3"+
		"\2\2\2qr\7@\2\2r\f\3\2\2\2st\7>\2\2t\16\3\2\2\2uv\7@\2\2vw\7?\2\2w\20"+
		"\3\2\2\2xy\7>\2\2yz\7?\2\2z\22\3\2\2\2{|\7-\2\2|\24\3\2\2\2}~\7/\2\2~"+
		"\26\3\2\2\2\177\u0080\7,\2\2\u0080\30\3\2\2\2\u0081\u0082\7\61\2\2\u0082"+
		"\32\3\2\2\2\u0083\u0084\7\'\2\2\u0084\34\3\2\2\2\u0085\u0086\7`\2\2\u0086"+
		"\36\3\2\2\2\u0087\u0088\7#\2\2\u0088 \3\2\2\2\u0089\u008a\7?\2\2\u008a"+
		"\"\3\2\2\2\u008b\u008c\7*\2\2\u008c$\3\2\2\2\u008d\u008e\7+\2\2\u008e"+
		"&\3\2\2\2\u008f\u0090\7}\2\2\u0090(\3\2\2\2\u0091\u0092\7\177\2\2\u0092"+
		"*\3\2\2\2\u0093\u0094\7]\2\2\u0094,\3\2\2\2\u0095\u0096\7_\2\2\u0096."+
		"\3\2\2\2\u0097\u0098\7.\2\2\u0098\60\3\2\2\2\u0099\u009a\7<\2\2\u009a"+
		"\62\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7t\2\2\u009d\u009e\7w\2\2\u009e"+
		"\u009f\7g\2\2\u009f\64\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5\66\3\2\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7n\2\2\u00a98\3\2\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7h\2\2\u00ac:\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1<\3\2\2\2\u00b2"+
		"\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7n\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7>\3\2\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7q\2"+
		"\2\u00ba\u00bb\7i\2\2\u00bb@\3\2\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7"+
		"g\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0B\3\2\2\2\u00c1\u00c2"+
		"\7h\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7t\2\2\u00c4D\3\2\2\2\u00c5\u00c6"+
		"\7k\2\2\u00c6\u00c7\7p\2\2\u00c7F\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca"+
		"\7w\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7p\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7h\2"+
		"\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7p\2\2\u00dbJ\3\2\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7q\2\2\u00e3L\3\2\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7q\2\2"+
		"\u00e8\u00e9\7t\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ecN\3\2\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0"+
		"\7u\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7g\2\2\u00f2P\3\2\2\2\u00f3\u00f4"+
		"\7v\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7\7q\2\2\u00f7"+
		"R\3\2\2\2\u00f8\u00f9\7\60\2\2\u00f9T\3\2\2\2\u00fa\u00fe\t\2\2\2\u00fb"+
		"\u00fd\t\3\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ffV\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103"+
		"\t\4\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105X\3\2\2\2\u0106\u0108\t\4\2\2\u0107\u0106\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010f\7\60\2\2\u010c\u010e\t\4\2\2\u010d\u010c\3\2\2\2"+
		"\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0119"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\7\60\2\2\u0113\u0115\t\4\2\2"+
		"\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0107\3\2\2\2\u0118\u0112\3\2\2\2\u0119"+
		"Z\3\2\2\2\u011a\u0120\7$\2\2\u011b\u011f\n\5\2\2\u011c\u011d\7$\2\2\u011d"+
		"\u011f\7$\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0124\7$\2\2\u0124\\\3\2\2\2\u0125\u0129\7%\2\2\u0126"+
		"\u0128\n\6\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\b/\2\2\u012d^\3\2\2\2\u012e\u012f\t\7\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\b\60\2\2\u0131`\3\2\2\2\u0132\u0133\t\b\2\2\u0133b\3\2\2\2\u0134"+
		"\u0135\13\2\2\2\u0135d\3\2\2\2\f\2\u00fe\u0104\u0109\u010f\u0116\u0118"+
		"\u011e\u0120\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}