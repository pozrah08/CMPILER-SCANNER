// Generated from C:/Users/Shan/IdeaProjects/CMPILER-Scanner/src\JSFMLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSFMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BREAK=2, CASE=3, CHAR=4, CONST=5, CONTINUE=6, DEFAULT=7, DO=8, 
		ELSE=9, FINAL=10, FLOAT=11, FOR=12, IF=13, INT=14, MAIN=15, RETURN=16, 
		STRING=17, SWITCH=18, VOID=19, WHILE=20, INPUT=21, OUTPUT=22, BOOL_LITERAL=23, 
		NULL_LITERAL=24, IDENTIFIER=25, LPAREN=26, RPAREN=27, LBRACE=28, RBRACE=29, 
		LBRACK=30, RBRACK=31, SEMI=32, COMMA=33, DOT=34, QUOTE=35, ASSIGN=36, 
		GT=37, LT=38, BANG=39, QUESTION=40, COLON=41, EQUAL=42, GEQ=43, LEQ=44, 
		NEQ=45, AND=46, OR=47, INC=48, DEC=49, ADD=50, SUB=51, MUL=52, DIV=53, 
		MOD=54, ADD_ASSIGN=55, SUB_ASSIGN=56, MUL_ASSIGN=57, DIV_ASSIGN=58, ELLIPSIS=59, 
		DECIMAL_LITERAL=60, FLOAT_LITERAL=61, CHAR_LITERAL=62, STRING_LITERAL=63, 
		WS=64, COMMENT=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", "DO", 
			"ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "MAIN", "RETURN", "STRING", 
			"SWITCH", "VOID", "WHILE", "INPUT", "OUTPUT", "BOOL_LITERAL", "NULL_LITERAL", 
			"IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "QUOTE", "ASSIGN", "GT", "LT", "BANG", "QUESTION", 
			"COLON", "EQUAL", "GEQ", "LEQ", "NEQ", "AND", "OR", "INC", "DEC", "ADD", 
			"SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "ELLIPSIS", "DECIMAL_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", 
			"STRING_LITERAL", "EscapeSequence", "ExponentPart", "LetterOrDigit", 
			"Digits", "Letter", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolin'", "'cease'", "'option'", "'kachow'", "'fiber'", "'megaman'", 
			"'basic'", "'perform'", "'otherwise'", "'ultimate'", "'coke'", "'repeat'", 
			"'upon'", "'techies'", "'main'", "'respond'", "'thread'", "'choices'", 
			"'faceless'", "'during'", "'inputf'", "'outputf'", null, "'null'", null, 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'\"'", 
			"'='", "'>'", "'<'", "'!'", "'?'", "':'", "'=='", "'>='", "'<='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", 
			"'-='", "'*='", "'/='", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", "MAIN", "RETURN", 
			"STRING", "SWITCH", "VOID", "WHILE", "INPUT", "OUTPUT", "BOOL_LITERAL", 
			"NULL_LITERAL", "IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "QUOTE", "ASSIGN", "GT", 
			"LT", "BANG", "QUESTION", "COLON", "EQUAL", "GEQ", "LEQ", "NEQ", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "ELLIPSIS", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "WS", "COMMENT"
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


	public JSFMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSFMLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u0213\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0137\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\7\32\u0140\n\32\f\32\16\32\u0143\13\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		"-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3"+
		":\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\5=\u019a\n=\3=\6=\u019d\n=\r=\16"+
		"=\u019e\3=\5=\u01a2\n=\5=\u01a4\n=\3=\5=\u01a7\n=\3>\3>\3>\5>\u01ac\n"+
		">\3>\3>\5>\u01b0\n>\3>\5>\u01b3\n>\3>\5>\u01b6\n>\3>\3>\3>\5>\u01bb\n"+
		">\3>\5>\u01be\n>\5>\u01c0\n>\3?\3?\3?\5?\u01c5\n?\3?\3?\3@\3@\3@\7@\u01cc"+
		"\n@\f@\16@\u01cf\13@\3@\3@\3A\3A\3A\3A\5A\u01d7\nA\3A\5A\u01da\nA\3A\5"+
		"A\u01dd\nA\3B\3B\5B\u01e1\nB\3B\3B\3C\3C\5C\u01e7\nC\3D\3D\7D\u01eb\n"+
		"D\fD\16D\u01ee\13D\3D\5D\u01f1\nD\3E\3E\3F\6F\u01f6\nF\rF\16F\u01f7\3"+
		"F\3F\3G\3G\3G\3G\7G\u0200\nG\fG\16G\u0203\13G\3G\3G\3G\3G\3G\3G\7G\u020b"+
		"\nG\fG\16G\u020e\13G\5G\u0210\nG\3G\3G\3\u0201\2H\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"\2\u0083\2\u0085\2\u0087\2\u0089\2\u008bB\u008dC\3\2\21\3\2\63;\4\2NN"+
		"nn\6\2FFHHffhh\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttv"+
		"v\3\2\62\65\3\2\629\4\2GGgg\4\2--//\3\2\62;\4\2\62;aa\6\2&&C\\aac|\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\2\u0229\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0096\3\2\2\2\7\u009c"+
		"\3\2\2\2\t\u00a3\3\2\2\2\13\u00aa\3\2\2\2\r\u00b0\3\2\2\2\17\u00b8\3\2"+
		"\2\2\21\u00be\3\2\2\2\23\u00c6\3\2\2\2\25\u00d0\3\2\2\2\27\u00d9\3\2\2"+
		"\2\31\u00de\3\2\2\2\33\u00e5\3\2\2\2\35\u00ea\3\2\2\2\37\u00f2\3\2\2\2"+
		"!\u00f7\3\2\2\2#\u00ff\3\2\2\2%\u0106\3\2\2\2\'\u010e\3\2\2\2)\u0117\3"+
		"\2\2\2+\u011e\3\2\2\2-\u0125\3\2\2\2/\u0136\3\2\2\2\61\u0138\3\2\2\2\63"+
		"\u013d\3\2\2\2\65\u0144\3\2\2\2\67\u0146\3\2\2\29\u0148\3\2\2\2;\u014a"+
		"\3\2\2\2=\u014c\3\2\2\2?\u014e\3\2\2\2A\u0150\3\2\2\2C\u0152\3\2\2\2E"+
		"\u0154\3\2\2\2G\u0156\3\2\2\2I\u0158\3\2\2\2K\u015a\3\2\2\2M\u015c\3\2"+
		"\2\2O\u015e\3\2\2\2Q\u0160\3\2\2\2S\u0162\3\2\2\2U\u0164\3\2\2\2W\u0167"+
		"\3\2\2\2Y\u016a\3\2\2\2[\u016d\3\2\2\2]\u0170\3\2\2\2_\u0173\3\2\2\2a"+
		"\u0176\3\2\2\2c\u0179\3\2\2\2e\u017c\3\2\2\2g\u017e\3\2\2\2i\u0180\3\2"+
		"\2\2k\u0182\3\2\2\2m\u0184\3\2\2\2o\u0186\3\2\2\2q\u0189\3\2\2\2s\u018c"+
		"\3\2\2\2u\u018f\3\2\2\2w\u0192\3\2\2\2y\u01a3\3\2\2\2{\u01bf\3\2\2\2}"+
		"\u01c1\3\2\2\2\177\u01c8\3\2\2\2\u0081\u01dc\3\2\2\2\u0083\u01de\3\2\2"+
		"\2\u0085\u01e6\3\2\2\2\u0087\u01e8\3\2\2\2\u0089\u01f2\3\2\2\2\u008b\u01f5"+
		"\3\2\2\2\u008d\u020f\3\2\2\2\u008f\u0090\7d\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7n\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2"+
		"\u0095\4\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c"+
		"\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\6\3\2\2\2\u009c\u009d"+
		"\7q\2\2\u009d\u009e\7r\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7p\2\2\u00a2\b\3\2\2\2\u00a3\u00a4\7m\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7q\2\2"+
		"\u00a8\u00a9\7y\2\2\u00a9\n\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7k"+
		"\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7t\2\2\u00af\f"+
		"\3\2\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7i\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7p\2\2"+
		"\u00b7\16\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7"+
		"u\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7e\2\2\u00bd\20\3\2\2\2\u00be\u00bf"+
		"\7r\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7h\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7o\2\2\u00c5\22\3\2\2\2\u00c6"+
		"\u00c7\7q\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7g\2\2"+
		"\u00ca\u00cb\7t\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce"+
		"\7u\2\2\u00ce\u00cf\7g\2\2\u00cf\24\3\2\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2"+
		"\7n\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7c\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7g\2\2\u00d8\26\3\2\2\2\u00d9"+
		"\u00da\7e\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7m\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\30\3\2\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7"+
		"r\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\32"+
		"\3\2\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7q\2\2\u00e8"+
		"\u00e9\7p\2\2\u00e9\34\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7e\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0\u00f1\7u\2\2\u00f1\36\3\2\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7"+
		"c\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6 \3\2\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7r\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7f\2\2\u00fe\"\3\2\2\2\u00ff"+
		"\u0100\7v\2\2\u0100\u0101\7j\2\2\u0101\u0102\7t\2\2\u0102\u0103\7g\2\2"+
		"\u0103\u0104\7c\2\2\u0104\u0105\7f\2\2\u0105$\3\2\2\2\u0106\u0107\7e\2"+
		"\2\u0107\u0108\7j\2\2\u0108\u0109\7q\2\2\u0109\u010a\7k\2\2\u010a\u010b"+
		"\7e\2\2\u010b\u010c\7g\2\2\u010c\u010d\7u\2\2\u010d&\3\2\2\2\u010e\u010f"+
		"\7h\2\2\u010f\u0110\7c\2\2\u0110\u0111\7e\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7n\2\2\u0113\u0114\7g\2\2\u0114\u0115\7u\2\2\u0115\u0116\7u\2\2"+
		"\u0116(\3\2\2\2\u0117\u0118\7f\2\2\u0118\u0119\7w\2\2\u0119\u011a\7t\2"+
		"\2\u011a\u011b\7k\2\2\u011b\u011c\7p\2\2\u011c\u011d\7i\2\2\u011d*\3\2"+
		"\2\2\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120\u0121\7r\2\2\u0121\u0122"+
		"\7w\2\2\u0122\u0123\7v\2\2\u0123\u0124\7h\2\2\u0124,\3\2\2\2\u0125\u0126"+
		"\7q\2\2\u0126\u0127\7w\2\2\u0127\u0128\7v\2\2\u0128\u0129\7r\2\2\u0129"+
		"\u012a\7w\2\2\u012a\u012b\7v\2\2\u012b\u012c\7h\2\2\u012c.\3\2\2\2\u012d"+
		"\u012e\7v\2\2\u012e\u012f\7t\2\2\u012f\u0130\7w\2\2\u0130\u0137\7g\2\2"+
		"\u0131\u0132\7h\2\2\u0132\u0133\7c\2\2\u0133\u0134\7n\2\2\u0134\u0135"+
		"\7u\2\2\u0135\u0137\7g\2\2\u0136\u012d\3\2\2\2\u0136\u0131\3\2\2\2\u0137"+
		"\60\3\2\2\2\u0138\u0139\7p\2\2\u0139\u013a\7w\2\2\u013a\u013b\7n\2\2\u013b"+
		"\u013c\7n\2\2\u013c\62\3\2\2\2\u013d\u0141\5\u0089E\2\u013e\u0140\5\u0085"+
		"C\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\64\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7*\2\2"+
		"\u0145\66\3\2\2\2\u0146\u0147\7+\2\2\u01478\3\2\2\2\u0148\u0149\7}\2\2"+
		"\u0149:\3\2\2\2\u014a\u014b\7\177\2\2\u014b<\3\2\2\2\u014c\u014d\7]\2"+
		"\2\u014d>\3\2\2\2\u014e\u014f\7_\2\2\u014f@\3\2\2\2\u0150\u0151\7=\2\2"+
		"\u0151B\3\2\2\2\u0152\u0153\7.\2\2\u0153D\3\2\2\2\u0154\u0155\7\60\2\2"+
		"\u0155F\3\2\2\2\u0156\u0157\7$\2\2\u0157H\3\2\2\2\u0158\u0159\7?\2\2\u0159"+
		"J\3\2\2\2\u015a\u015b\7@\2\2\u015bL\3\2\2\2\u015c\u015d\7>\2\2\u015dN"+
		"\3\2\2\2\u015e\u015f\7#\2\2\u015fP\3\2\2\2\u0160\u0161\7A\2\2\u0161R\3"+
		"\2\2\2\u0162\u0163\7<\2\2\u0163T\3\2\2\2\u0164\u0165\7?\2\2\u0165\u0166"+
		"\7?\2\2\u0166V\3\2\2\2\u0167\u0168\7@\2\2\u0168\u0169\7?\2\2\u0169X\3"+
		"\2\2\2\u016a\u016b\7>\2\2\u016b\u016c\7?\2\2\u016cZ\3\2\2\2\u016d\u016e"+
		"\7#\2\2\u016e\u016f\7?\2\2\u016f\\\3\2\2\2\u0170\u0171\7(\2\2\u0171\u0172"+
		"\7(\2\2\u0172^\3\2\2\2\u0173\u0174\7~\2\2\u0174\u0175\7~\2\2\u0175`\3"+
		"\2\2\2\u0176\u0177\7-\2\2\u0177\u0178\7-\2\2\u0178b\3\2\2\2\u0179\u017a"+
		"\7/\2\2\u017a\u017b\7/\2\2\u017bd\3\2\2\2\u017c\u017d\7-\2\2\u017df\3"+
		"\2\2\2\u017e\u017f\7/\2\2\u017fh\3\2\2\2\u0180\u0181\7,\2\2\u0181j\3\2"+
		"\2\2\u0182\u0183\7\61\2\2\u0183l\3\2\2\2\u0184\u0185\7\'\2\2\u0185n\3"+
		"\2\2\2\u0186\u0187\7-\2\2\u0187\u0188\7?\2\2\u0188p\3\2\2\2\u0189\u018a"+
		"\7/\2\2\u018a\u018b\7?\2\2\u018br\3\2\2\2\u018c\u018d\7,\2\2\u018d\u018e"+
		"\7?\2\2\u018et\3\2\2\2\u018f\u0190\7\61\2\2\u0190\u0191\7?\2\2\u0191v"+
		"\3\2\2\2\u0192\u0193\7\60\2\2\u0193\u0194\7\60\2\2\u0194\u0195\7\60\2"+
		"\2\u0195x\3\2\2\2\u0196\u01a4\7\62\2\2\u0197\u01a1\t\2\2\2\u0198\u019a"+
		"\5\u0087D\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01a2\3\2\2"+
		"\2\u019b\u019d\7a\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\5\u0087D"+
		"\2\u01a1\u0199\3\2\2\2\u01a1\u019c\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u0196"+
		"\3\2\2\2\u01a3\u0197\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\t\3\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7z\3\2\2\2\u01a8\u01a9\5\u0087"+
		"D\2\u01a9\u01ab\7\60\2\2\u01aa\u01ac\5\u0087D\2\u01ab\u01aa\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01b0\3\2\2\2\u01ad\u01ae\7\60\2\2\u01ae\u01b0\5"+
		"\u0087D\2\u01af\u01a8\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\3\2\2\2"+
		"\u01b1\u01b3\5\u0083B\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b6\t\4\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01c0\3\2\2\2\u01b7\u01bd\5\u0087D\2\u01b8\u01ba\5\u0083B\2"+
		"\u01b9\u01bb\t\4\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be"+
		"\3\2\2\2\u01bc\u01be\t\4\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be"+
		"\u01c0\3\2\2\2\u01bf\u01af\3\2\2\2\u01bf\u01b7\3\2\2\2\u01c0|\3\2\2\2"+
		"\u01c1\u01c4\7)\2\2\u01c2\u01c5\n\5\2\2\u01c3\u01c5\5\u0081A\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7)\2\2\u01c7"+
		"~\3\2\2\2\u01c8\u01cd\7$\2\2\u01c9\u01cc\n\6\2\2\u01ca\u01cc\5\u0081A"+
		"\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb"+
		"\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0"+
		"\u01d1\7$\2\2\u01d1\u0080\3\2\2\2\u01d2\u01d3\7^\2\2\u01d3\u01dd\t\7\2"+
		"\2\u01d4\u01d9\7^\2\2\u01d5\u01d7\t\b\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\t\t\2\2\u01d9\u01d6\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\t\t\2\2\u01dc\u01d2\3\2"+
		"\2\2\u01dc\u01d4\3\2\2\2\u01dd\u0082\3\2\2\2\u01de\u01e0\t\n\2\2\u01df"+
		"\u01e1\t\13\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3"+
		"\2\2\2\u01e2\u01e3\5\u0087D\2\u01e3\u0084\3\2\2\2\u01e4\u01e7\5\u0089"+
		"E\2\u01e5\u01e7\t\f\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u0086\3\2\2\2\u01e8\u01f0\t\f\2\2\u01e9\u01eb\t\r\2\2\u01ea\u01e9\3\2"+
		"\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\t\f\2\2\u01f0\u01ec\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u0088\3\2\2\2\u01f2\u01f3\t\16\2\2\u01f3"+
		"\u008a\3\2\2\2\u01f4\u01f6\t\17\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3"+
		"\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\bF\2\2\u01fa\u008c\3\2\2\2\u01fb\u01fc\7\61\2\2\u01fc\u01fd\7,"+
		"\2\2\u01fd\u0201\3\2\2\2\u01fe\u0200\13\2\2\2\u01ff\u01fe\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7,\2\2\u0205\u0210\7\61\2\2\u0206"+
		"\u0207\7\61\2\2\u0207\u0208\7\61\2\2\u0208\u020c\3\2\2\2\u0209\u020b\n"+
		"\20\2\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u01fb\3\2"+
		"\2\2\u020f\u0206\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\bG\2\2\u0212"+
		"\u008e\3\2\2\2\37\2\u0136\u0141\u0199\u019e\u01a1\u01a3\u01a6\u01ab\u01af"+
		"\u01b2\u01b5\u01ba\u01bd\u01bf\u01c4\u01cb\u01cd\u01d6\u01d9\u01dc\u01e0"+
		"\u01e6\u01ec\u01f0\u01f7\u0201\u020c\u020f\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}