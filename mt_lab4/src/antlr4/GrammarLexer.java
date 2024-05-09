// Generated from ./src/antlr4/Grammar.g4 by ANTLR 4.13.1
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NAME=14, TOKEN=15, REGEX=16, STRING=17, 
		DEF=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "NAME", "TOKEN", "REGEX", "STRING", 
			"DEF", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "'start'", "':'", "'('", "','", "')'", "'return'", 
			"'.'", "'|'", "'['", "']'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NAME", "TOKEN", "REGEX", "STRING", "DEF", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\u0004\u0000\u0013\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0005\rT\b\r\n\r\f\rW\t\r\u0001\u000e\u0001\u000e\u0005\u000e[\b\u000e"+
		"\n\u000e\f\u000e^\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000fd\b\u000f\n\u000f\f\u000fg\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010o\b\u0010"+
		"\n\u0010\f\u0010r\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0004\u0011x\b\u0011\u000b\u0011\f\u0011y\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0007\u0001\u0000az\u0004"+
		"\u000009AZ__az\u0001\u0000AZ\u0001\u0000\'\'\u0001\u0000\"\"\u0002\u0000"+
		"{{}}\u0003\u0000\t\n\r\r  \u0087\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000"+
		"\u0003/\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u00077"+
		"\u0001\u0000\u0000\u0000\t9\u0001\u0000\u0000\u0000\u000b;\u0001\u0000"+
		"\u0000\u0000\r=\u0001\u0000\u0000\u0000\u000f?\u0001\u0000\u0000\u0000"+
		"\u0011F\u0001\u0000\u0000\u0000\u0013H\u0001\u0000\u0000\u0000\u0015J"+
		"\u0001\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019N\u0001\u0000"+
		"\u0000\u0000\u001bQ\u0001\u0000\u0000\u0000\u001dX\u0001\u0000\u0000\u0000"+
		"\u001f_\u0001\u0000\u0000\u0000!j\u0001\u0000\u0000\u0000#u\u0001\u0000"+
		"\u0000\u0000%}\u0001\u0000\u0000\u0000\'(\u0005g\u0000\u0000()\u0005r"+
		"\u0000\u0000)*\u0005a\u0000\u0000*+\u0005m\u0000\u0000+,\u0005m\u0000"+
		"\u0000,-\u0005a\u0000\u0000-.\u0005r\u0000\u0000.\u0002\u0001\u0000\u0000"+
		"\u0000/0\u0005;\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005s\u0000"+
		"\u000023\u0005t\u0000\u000034\u0005a\u0000\u000045\u0005r\u0000\u0000"+
		"56\u0005t\u0000\u00006\u0006\u0001\u0000\u0000\u000078\u0005:\u0000\u0000"+
		"8\b\u0001\u0000\u0000\u00009:\u0005(\u0000\u0000:\n\u0001\u0000\u0000"+
		"\u0000;<\u0005,\u0000\u0000<\f\u0001\u0000\u0000\u0000=>\u0005)\u0000"+
		"\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005r\u0000\u0000@A\u0005e\u0000"+
		"\u0000AB\u0005t\u0000\u0000BC\u0005u\u0000\u0000CD\u0005r\u0000\u0000"+
		"DE\u0005n\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005.\u0000\u0000"+
		"G\u0012\u0001\u0000\u0000\u0000HI\u0005|\u0000\u0000I\u0014\u0001\u0000"+
		"\u0000\u0000JK\u0005[\u0000\u0000K\u0016\u0001\u0000\u0000\u0000LM\u0005"+
		"]\u0000\u0000M\u0018\u0001\u0000\u0000\u0000NO\u0005-\u0000\u0000OP\u0005"+
		">\u0000\u0000P\u001a\u0001\u0000\u0000\u0000QU\u0007\u0000\u0000\u0000"+
		"RT\u0007\u0001\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u001c\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000X\\\u0007\u0002\u0000\u0000"+
		"Y[\u0007\u0001\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u001e\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_e\u0005\'\u0000\u0000`d"+
		"\b\u0003\u0000\u0000ab\u0005\\\u0000\u0000bd\u0005\'\u0000\u0000c`\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000hi\u0005\'\u0000\u0000i \u0001\u0000\u0000"+
		"\u0000jp\u0005\"\u0000\u0000ko\b\u0004\u0000\u0000lm\u0005\\\u0000\u0000"+
		"mo\u0005\"\u0000\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005\"\u0000"+
		"\u0000t\"\u0001\u0000\u0000\u0000uw\u0005{\u0000\u0000vx\b\u0005\u0000"+
		"\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005"+
		"}\u0000\u0000|$\u0001\u0000\u0000\u0000}~\u0007\u0006\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u0012\u0000\u0000\u0080&\u0001"+
		"\u0000\u0000\u0000\b\u0000U\\cenpy\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}