// Generated from MiniJava.g4 by ANTLR 4.4

package br.ufpe.cin.if688.minijava.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__40=1, T__39=2, T__38=3, T__37=4, T__36=5, T__35=6, T__34=7, T__33=8, 
		T__32=9, T__31=10, T__30=11, T__29=12, T__28=13, T__27=14, T__26=15, T__25=16, 
		T__24=17, T__23=18, T__22=19, T__21=20, T__20=21, T__19=22, T__18=23, 
		T__17=24, T__16=25, T__15=26, T__14=27, T__13=28, T__12=29, T__11=30, 
		T__10=31, T__9=32, T__8=33, T__7=34, T__6=35, T__5=36, T__4=37, T__3=38, 
		T__2=39, T__1=40, T__0=41, ID=42, INT=43, BOOL=44, WS=45, COMMENT=46, 
		LINE_COMMENT=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'"
	};
	public static final String[] ruleNames = {
		"T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", 
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"ID", "INT", "BOOL", "WS", "COMMENT", "LINE_COMMENT"
	};


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0144\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\7+\u010b"+
		"\n+\f+\16+\u010e\13+\3,\6,\u0111\n,\r,\16,\u0112\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\5-\u011e\n-\3.\6.\u0121\n.\r.\16.\u0122\3.\3.\3/\3/\3/\3/\7/\u012b"+
		"\n/\f/\16/\u012e\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0139\n\60"+
		"\f\60\16\60\u013c\13\60\3\60\5\60\u013f\n\60\3\60\3\60\3\60\3\60\4\u012c"+
		"\u013a\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\6\5\2C\\aac"+
		"|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u014a\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7h\3"+
		"\2\2\2\to\3\2\2\2\13s\3\2\2\2\rz\3\2\2\2\17}\3\2\2\2\21\u0083\3\2\2\2"+
		"\23\u0086\3\2\2\2\25\u008c\3\2\2\2\27\u008e\3\2\2\2\31\u0093\3\2\2\2\33"+
		"\u0095\3\2\2\2\35\u0098\3\2\2\2\37\u009a\3\2\2\2!\u00a2\3\2\2\2#\u00a4"+
		"\3\2\2\2%\u00a7\3\2\2\2\'\u00aa\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2"+
		"-\u00b2\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2\63\u00bb\3\2\2\2\65\u00c3"+
		"\3\2\2\2\67\u00d6\3\2\2\29\u00d9\3\2\2\2;\u00db\3\2\2\2=\u00de\3\2\2\2"+
		"?\u00e0\3\2\2\2A\u00e7\3\2\2\2C\u00e9\3\2\2\2E\u00f0\3\2\2\2G\u00f2\3"+
		"\2\2\2I\u00f4\3\2\2\2K\u00fb\3\2\2\2M\u00fd\3\2\2\2O\u0102\3\2\2\2Q\u0104"+
		"\3\2\2\2S\u0106\3\2\2\2U\u0108\3\2\2\2W\u0110\3\2\2\2Y\u011d\3\2\2\2["+
		"\u0120\3\2\2\2]\u0126\3\2\2\2_\u0134\3\2\2\2ab\7\61\2\2b\4\3\2\2\2cd\7"+
		"o\2\2de\7c\2\2ef\7k\2\2fg\7p\2\2g\6\3\2\2\2hi\7n\2\2ij\7g\2\2jk\7p\2\2"+
		"kl\7i\2\2lm\7v\2\2mn\7j\2\2n\b\3\2\2\2op\7p\2\2pq\7g\2\2qr\7y\2\2r\n\3"+
		"\2\2\2st\7t\2\2tu\7g\2\2uv\7v\2\2vw\7w\2\2wx\7t\2\2xy\7p\2\2y\f\3\2\2"+
		"\2z{\7#\2\2{|\7?\2\2|\16\3\2\2\2}~\7e\2\2~\177\7n\2\2\177\u0080\7c\2\2"+
		"\u0080\u0081\7u\2\2\u0081\u0082\7u\2\2\u0082\20\3\2\2\2\u0083\u0084\7"+
		"~\2\2\u0084\u0085\7~\2\2\u0085\22\3\2\2\2\u0086\u0087\7y\2\2\u0087\u0088"+
		"\7j\2\2\u0088\u0089\7k\2\2\u0089\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b"+
		"\24\3\2\2\2\u008c\u008d\7=\2\2\u008d\26\3\2\2\2\u008e\u008f\7x\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0091\7k\2\2\u0091\u0092\7f\2\2\u0092\30\3\2\2\2\u0093"+
		"\u0094\7}\2\2\u0094\32\3\2\2\2\u0095\u0096\7(\2\2\u0096\u0097\7(\2\2\u0097"+
		"\34\3\2\2\2\u0098\u0099\7?\2\2\u0099\36\3\2\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7z\2\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2"+
		"\u009f\u00a0\7f\2\2\u00a0\u00a1\7u\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7\177"+
		"\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7h\2\2\u00a6$\3\2"+
		"\2\2\u00a7\u00a8\7>\2\2\u00a8\u00a9\7?\2\2\u00a9&\3\2\2\2\u00aa\u00ab"+
		"\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7v\2\2\u00ad(\3\2\2\2\u00ae\u00af"+
		"\7*\2\2\u00af*\3\2\2\2\u00b0\u00b1\7,\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7"+
		"v\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7u\2\2\u00b6."+
		"\3\2\2\2\u00b7\u00b8\7.\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7\60\2\2\u00ba"+
		"\62\3\2\2\2\u00bb\u00bc\7d\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7q\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7p\2\2"+
		"\u00c2\64\3\2\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c5\7{\2\2\u00c5\u00c6\7"+
		"u\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca"+
		"\7\60\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7\60\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7k\2"+
		"\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5"+
		"\7p\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7\u00d8\7?\2\2\u00d88"+
		"\3\2\2\2\u00d9\u00da\7]\2\2\u00da:\3\2\2\2\u00db\u00dc\7?\2\2\u00dc\u00dd"+
		"\7?\2\2\u00dd<\3\2\2\2\u00de\u00df\7>\2\2\u00df>\3\2\2\2\u00e0\u00e1\7"+
		"U\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5\u00e6\7i\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8B\3"+
		"\2\2\2\u00e9\u00ea\7r\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7d\2\2\u00ec"+
		"\u00ed\7n\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7e\2\2\u00efD\3\2\2\2\u00f0"+
		"\u00f1\7@\2\2\u00f1F\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3H\3\2\2\2\u00f4\u00f5"+
		"\7u\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fa\7e\2\2\u00faJ\3\2\2\2\u00fb\u00fc\7\'\2\2\u00fc"+
		"L\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7u\2\2\u0100"+
		"\u0101\7g\2\2\u0101N\3\2\2\2\u0102\u0103\7+\2\2\u0103P\3\2\2\2\u0104\u0105"+
		"\7-\2\2\u0105R\3\2\2\2\u0106\u0107\7/\2\2\u0107T\3\2\2\2\u0108\u010c\t"+
		"\2\2\2\u0109\u010b\t\3\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dV\3\2\2\2\u010e\u010c\3\2\2\2"+
		"\u010f\u0111\t\4\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113X\3\2\2\2\u0114\u0115\7v\2\2\u0115\u0116"+
		"\7t\2\2\u0116\u0117\7w\2\2\u0117\u011e\7g\2\2\u0118\u0119\7h\2\2\u0119"+
		"\u011a\7c\2\2\u011a\u011b\7n\2\2\u011b\u011c\7u\2\2\u011c\u011e\7g\2\2"+
		"\u011d\u0114\3\2\2\2\u011d\u0118\3\2\2\2\u011eZ\3\2\2\2\u011f\u0121\t"+
		"\5\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b.\2\2\u0125\\\3\2\2\2"+
		"\u0126\u0127\7\61\2\2\u0127\u0128\7,\2\2\u0128\u012c\3\2\2\2\u0129\u012b"+
		"\13\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012d\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130"+
		"\7,\2\2\u0130\u0131\7\61\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b/\2\2\u0133"+
		"^\3\2\2\2\u0134\u0135\7\61\2\2\u0135\u0136\7\61\2\2\u0136\u013a\3\2\2"+
		"\2\u0137\u0139\13\2\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u013f\7\17\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\7\f\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b\60"+
		"\2\2\u0143`\3\2\2\2\n\2\u010c\u0112\u011d\u0122\u012c\u013a\u013e\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}