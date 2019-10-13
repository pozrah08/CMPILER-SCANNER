// Generated from C:/Users/Shan/IdeaProjects/CMPILER-Scanner/src\Scanner.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, WS=2, LINE_COMMENT=3, LPAREN=4, RPAREN=5, LANGLE=6, RANGLE=7, 
		EQUALS=8, SEMICO=9, ASSIGN=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "WS", "LINE_COMMENT", "LPAREN", "RPAREN", "LANGLE", "RANGLE", 
			"EQUALS", "SEMICO", "ASSIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "'<'", "'>'", "'='", "';'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "WS", "LINE_COMMENT", "LPAREN", "RPAREN", "LANGLE", "RANGLE", 
			"EQUALS", "SEMICO", "ASSIGN"
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fN\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\3\2\5\2\'\n\2\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\3\4\3\4\3\4\7\4\64\n"+
		"\4\f\4\16\4\67\13\4\3\4\5\4:\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\3\2\7\6\2\62;B\\aac|\6\2\f\f\17\17$$^^\4\2$$^"+
		"^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\3&\3\2\2\2\5)\3\2\2\2\7/\3\2\2\2\t?\3\2\2\2\13"+
		"A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27"+
		"\31\t\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33"+
		"\'\3\2\2\2\34\"\7$\2\2\35!\n\3\2\2\36\37\7^\2\2\37!\t\4\2\2 \35\3\2\2"+
		"\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%\'"+
		"\7$\2\2&\30\3\2\2\2&\34\3\2\2\2\'\4\3\2\2\2(*\t\5\2\2)(\3\2\2\2*+\3\2"+
		"\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\b\3\2\2.\6\3\2\2\2/\60\7\61\2\2\60"+
		"\61\7\61\2\2\61\65\3\2\2\2\62\64\n\6\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67\65\3\2\2\28:\7\17\2\298\3\2\2"+
		"\29:\3\2\2\2:;\3\2\2\2;<\7\f\2\2<=\3\2\2\2=>\b\4\2\2>\b\3\2\2\2?@\7*\2"+
		"\2@\n\3\2\2\2AB\7+\2\2B\f\3\2\2\2CD\7>\2\2D\16\3\2\2\2EF\7@\2\2F\20\3"+
		"\2\2\2GH\7?\2\2H\22\3\2\2\2IJ\7=\2\2J\24\3\2\2\2KL\7<\2\2LM\7?\2\2M\26"+
		"\3\2\2\2\n\2\32 \"&+\659\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}