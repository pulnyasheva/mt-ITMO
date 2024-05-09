// Generated from ./antlr4/JavaFileGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaFileGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, FOR=4, WHILE=5, IF=6, ELSE=7, SWITCH=8, CASE=9, 
		DEFAULT=10, NEW=11, THROW=12, THROWS=13, TRY=14, CATCH=15, FINALLY=16, 
		RETURN=17, VOID=18, INT=19, CHAR=20, DOUBLE=21, BYTE=22, LONG=23, FLOAT=24, 
		BOOLEAN=25, TRUE=26, FALSE=27, NULL=28, EXTENDS=29, IMPLEMENTS=30, SUPER=31, 
		THIS=32, CLASS=33, INTERFACE=34, ENUM=35, PRIVATE=36, PUBLIC=37, PROTECTED=38, 
		ABSTRACT=39, STATIC=40, FINAL=41, VOLATILE=42, SYNCHRONIZED=43, OTHERCHAR=44, 
		BRACE=45, STAR=46, POINT=47, COMMA=48, SEMICOLON=49, NAME=50, CHARACTER=51, 
		NEWLINE=52, SPACE=53, TAB=54, NUMBER=55, STRING=56;
	public static final int
		RULE_program = 0, RULE_keyword = 1, RULE_type = 2, RULE_enum = 3, RULE_modifiers = 4, 
		RULE_packageRule = 5, RULE_importRule = 6, RULE_javaCode = 7, RULE_name = 8, 
		RULE_qualifiedName = 9, RULE_newLine = 10, RULE_space = 11, RULE_tab = 12, 
		RULE_number = 13, RULE_symbol = 14, RULE_sep = 15, RULE_annotation = 16, 
		RULE_charOrString = 17, RULE_enumConstant = 18, RULE_typeRule = 19, RULE_enumRule = 20, 
		RULE_package = 21, RULE_importWord = 22, RULE_javaFile = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "keyword", "type", "enum", "modifiers", "packageRule", "importRule", 
			"javaCode", "name", "qualifiedName", "newLine", "space", "tab", "number", 
			"symbol", "sep", "annotation", "charOrString", "enumConstant", "typeRule", 
			"enumRule", "package", "importWord", "javaFile"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'package'", "'import'", "'for'", "'while'", "'if'", "'else'", 
			"'switch'", "'case'", "'default'", "'new'", "'throw'", "'throws'", "'try'", 
			"'catch'", "'finally'", "'return'", "'void'", "'int'", "'char'", "'double'", 
			"'byte'", "'long'", "'float'", "'boolean'", "'true'", "'false'", "'null'", 
			"'extends'", "'implements'", "'super'", "'this'", "'class'", "'interface'", 
			"'enum'", "'private'", "'public'", "'protected'", "'abstract'", "'static'", 
			"'final'", "'volatile'", "'synchronized'", null, "'{'", "'*'", "'.'", 
			"','", "';'", null, null, null, "' '", "'\\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "FOR", "WHILE", "IF", "ELSE", "SWITCH", "CASE", 
			"DEFAULT", "NEW", "THROW", "THROWS", "TRY", "CATCH", "FINALLY", "RETURN", 
			"VOID", "INT", "CHAR", "DOUBLE", "BYTE", "LONG", "FLOAT", "BOOLEAN", 
			"TRUE", "FALSE", "NULL", "EXTENDS", "IMPLEMENTS", "SUPER", "THIS", "CLASS", 
			"INTERFACE", "ENUM", "PRIVATE", "PUBLIC", "PROTECTED", "ABSTRACT", "STATIC", 
			"FINAL", "VOLATILE", "SYNCHRONIZED", "OTHERCHAR", "BRACE", "STAR", "POINT", 
			"COMMA", "SEMICOLON", "NAME", "CHARACTER", "NEWLINE", "SPACE", "TAB", 
			"NUMBER", "STRING"
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

	@Override
	public String getGrammarFileName() { return "JavaFileGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaFileGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public JavaFileContext javaFile() {
			return getRuleContext(JavaFileContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaFileGrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			javaFile();
			setState(49);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaFileGrammarParser.FOR, 0); }
		public TerminalNode WHILE() { return getToken(JavaFileGrammarParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(JavaFileGrammarParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(JavaFileGrammarParser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(JavaFileGrammarParser.SWITCH, 0); }
		public TerminalNode CASE() { return getToken(JavaFileGrammarParser.CASE, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaFileGrammarParser.DEFAULT, 0); }
		public TerminalNode NEW() { return getToken(JavaFileGrammarParser.NEW, 0); }
		public TerminalNode THROW() { return getToken(JavaFileGrammarParser.THROW, 0); }
		public TerminalNode THROWS() { return getToken(JavaFileGrammarParser.THROWS, 0); }
		public TerminalNode TRY() { return getToken(JavaFileGrammarParser.TRY, 0); }
		public TerminalNode CATCH() { return getToken(JavaFileGrammarParser.CATCH, 0); }
		public TerminalNode FINALLY() { return getToken(JavaFileGrammarParser.FINALLY, 0); }
		public TerminalNode RETURN() { return getToken(JavaFileGrammarParser.RETURN, 0); }
		public TerminalNode VOID() { return getToken(JavaFileGrammarParser.VOID, 0); }
		public TerminalNode INT() { return getToken(JavaFileGrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(JavaFileGrammarParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaFileGrammarParser.DOUBLE, 0); }
		public TerminalNode BYTE() { return getToken(JavaFileGrammarParser.BYTE, 0); }
		public TerminalNode LONG() { return getToken(JavaFileGrammarParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaFileGrammarParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaFileGrammarParser.BOOLEAN, 0); }
		public TerminalNode TRUE() { return getToken(JavaFileGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaFileGrammarParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JavaFileGrammarParser.NULL, 0); }
		public TerminalNode EXTENDS() { return getToken(JavaFileGrammarParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaFileGrammarParser.IMPLEMENTS, 0); }
		public TerminalNode SUPER() { return getToken(JavaFileGrammarParser.SUPER, 0); }
		public TerminalNode THIS() { return getToken(JavaFileGrammarParser.THIS, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8589934576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaFileGrammarParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaFileGrammarParser.INTERFACE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaFileGrammarParser.ENUM, 0); }
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ENUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifiersContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(JavaFileGrammarParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(JavaFileGrammarParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaFileGrammarParser.PROTECTED, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaFileGrammarParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(JavaFileGrammarParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaFileGrammarParser.FINAL, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaFileGrammarParser.VOLATILE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaFileGrammarParser.SYNCHRONIZED, 0); }
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17523466567680L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageRuleContext extends ParserRuleContext {
		public PackageContext package_() {
			return getRuleContext(PackageContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaFileGrammarParser.SEMICOLON, 0); }
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public PackageRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterPackageRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitPackageRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitPackageRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageRuleContext packageRule() throws RecognitionException {
		PackageRuleContext _localctx = new PackageRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_packageRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			package_();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(60);
				sep();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			qualifiedName();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(67);
				sep();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportRuleContext extends ParserRuleContext {
		public ImportWordContext importWord() {
			return getRuleContext(ImportWordContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaFileGrammarParser.SEMICOLON, 0); }
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public TerminalNode STAR() { return getToken(JavaFileGrammarParser.STAR, 0); }
		public ImportRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterImportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitImportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitImportRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRuleContext importRule() throws RecognitionException {
		ImportRuleContext _localctx = new ImportRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			importWord();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(76);
				sep();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			qualifiedName();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(83);
				match(STAR);
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(86);
				sep();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JavaCodeContext extends ParserRuleContext {
		public TypeRuleContext typeRule() {
			return getRuleContext(TypeRuleContext.class,0);
		}
		public EnumRuleContext enumRule() {
			return getRuleContext(EnumRuleContext.class,0);
		}
		public JavaCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterJavaCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitJavaCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitJavaCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaCodeContext javaCode() throws RecognitionException {
		JavaCodeContext _localctx = new JavaCodeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_javaCode);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				typeRule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				enumRule();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JavaFileGrammarParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> POINT() { return getTokens(JavaFileGrammarParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(JavaFileGrammarParser.POINT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			name();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POINT) {
				{
				{
				setState(101);
				match(POINT);
				setState(102);
				name();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(JavaFileGrammarParser.NEWLINE, 0); }
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_newLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(JavaFileGrammarParser.SPACE, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(SPACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(JavaFileGrammarParser.TAB, 0); }
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitTab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitTab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(TAB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JavaFileGrammarParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode OTHERCHAR() { return getToken(JavaFileGrammarParser.OTHERCHAR, 0); }
		public TerminalNode NAME() { return getToken(JavaFileGrammarParser.NAME, 0); }
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public TerminalNode BRACE() { return getToken(JavaFileGrammarParser.BRACE, 0); }
		public TerminalNode STAR() { return getToken(JavaFileGrammarParser.STAR, 0); }
		public TerminalNode POINT() { return getToken(JavaFileGrammarParser.POINT, 0); }
		public TerminalNode COMMA() { return getToken(JavaFileGrammarParser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaFileGrammarParser.SEMICOLON, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_symbol);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OTHERCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(OTHERCHAR);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(NAME);
				}
				break;
			case NEWLINE:
			case SPACE:
			case TAB:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				sep();
				}
				break;
			case BRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(BRACE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(STAR);
				}
				break;
			case POINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(POINT);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(COMMA);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SepContext extends ParserRuleContext {
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sep);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				newLine();
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				space();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				tab();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JavaFileGrammarParser.NAME, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__0);
			setState(132);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharOrStringContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(JavaFileGrammarParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(JavaFileGrammarParser.STRING, 0); }
		public CharOrStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charOrString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterCharOrString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitCharOrString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitCharOrString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharOrStringContext charOrString() throws RecognitionException {
		CharOrStringContext _localctx = new CharOrStringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_charOrString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==CHARACTER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JavaFileGrammarParser.NAME, 0); }
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeRuleContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode BRACE() { return getToken(JavaFileGrammarParser.BRACE, 0); }
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public List<CharOrStringContext> charOrString() {
			return getRuleContexts(CharOrStringContext.class);
		}
		public CharOrStringContext charOrString(int i) {
			return getRuleContext(CharOrStringContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<TypeRuleContext> typeRule() {
			return getRuleContexts(TypeRuleContext.class);
		}
		public TypeRuleContext typeRule(int i) {
			return getRuleContext(TypeRuleContext.class,i);
		}
		public List<EnumRuleContext> enumRule() {
			return getRuleContexts(EnumRuleContext.class);
		}
		public EnumRuleContext enumRule(int i) {
			return getRuleContext(EnumRuleContext.class,i);
		}
		public TypeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterTypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitTypeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitTypeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRuleContext typeRule() throws RecognitionException {
		TypeRuleContext _localctx = new TypeRuleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31542720858161152L) != 0)) {
				{
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case PUBLIC:
				case PROTECTED:
				case ABSTRACT:
				case STATIC:
				case FINAL:
				case VOLATILE:
				case SYNCHRONIZED:
					{
					setState(138);
					modifiers();
					}
					break;
				case NEWLINE:
				case SPACE:
				case TAB:
					{
					setState(139);
					sep();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			type();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(146);
				sep();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			name();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(153);
				sep();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(BRACE);
			setState(168); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(160);
						charOrString();
						}
						break;
					case 2:
						{
						setState(161);
						number();
						}
						break;
					case 3:
						{
						setState(162);
						modifiers();
						}
						break;
					case 4:
						{
						setState(163);
						keyword();
						}
						break;
					case 5:
						{
						setState(164);
						annotation();
						}
						break;
					case 6:
						{
						setState(165);
						symbol();
						}
						break;
					case 7:
						{
						setState(166);
						typeRule();
						}
						break;
					case 8:
						{
						setState(167);
						enumRule();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumRuleContext extends ParserRuleContext {
		public EnumContext enum_() {
			return getRuleContext(EnumContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode BRACE() { return getToken(JavaFileGrammarParser.BRACE, 0); }
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaFileGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaFileGrammarParser.COMMA, i);
		}
		public List<CharOrStringContext> charOrString() {
			return getRuleContexts(CharOrStringContext.class);
		}
		public CharOrStringContext charOrString(int i) {
			return getRuleContext(CharOrStringContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<TypeRuleContext> typeRule() {
			return getRuleContexts(TypeRuleContext.class);
		}
		public TypeRuleContext typeRule(int i) {
			return getRuleContext(TypeRuleContext.class,i);
		}
		public List<EnumRuleContext> enumRule() {
			return getRuleContexts(EnumRuleContext.class);
		}
		public EnumRuleContext enumRule(int i) {
			return getRuleContext(EnumRuleContext.class,i);
		}
		public EnumRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterEnumRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitEnumRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitEnumRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumRuleContext enumRule() throws RecognitionException {
		EnumRuleContext _localctx = new EnumRuleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31542720858161152L) != 0)) {
				{
				setState(174);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case PUBLIC:
				case PROTECTED:
				case ABSTRACT:
				case STATIC:
				case FINAL:
				case VOLATILE:
				case SYNCHRONIZED:
					{
					setState(172);
					modifiers();
					}
					break;
				case NEWLINE:
				case SPACE:
				case TAB:
					{
					setState(173);
					sep();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			enum_();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(180);
				sep();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			name();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(187);
				sep();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(BRACE);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					sep();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(200);
				enumConstant();
				}
				break;
			}
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(212);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEWLINE:
					case SPACE:
					case TAB:
						{
						setState(203);
						sep();
						}
						break;
					case COMMA:
						{
						setState(204);
						match(COMMA);
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
							{
							{
							setState(205);
							sep();
							}
							}
							setState(210);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(211);
						enumConstant();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(225); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(217);
						charOrString();
						}
						break;
					case 2:
						{
						setState(218);
						number();
						}
						break;
					case 3:
						{
						setState(219);
						modifiers();
						}
						break;
					case 4:
						{
						setState(220);
						keyword();
						}
						break;
					case 5:
						{
						setState(221);
						annotation();
						}
						break;
					case 6:
						{
						setState(222);
						symbol();
						}
						break;
					case 7:
						{
						setState(223);
						typeRule();
						}
						break;
					case 8:
						{
						setState(224);
						enumRule();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageContext extends ParserRuleContext {
		public PackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportWordContext extends ParserRuleContext {
		public ImportWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterImportWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitImportWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitImportWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportWordContext importWord() throws RecognitionException {
		ImportWordContext _localctx = new ImportWordContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_importWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JavaFileContext extends ParserRuleContext {
		public PackageRuleContext packageRule() {
			return getRuleContext(PackageRuleContext.class,0);
		}
		public List<ImportRuleContext> importRule() {
			return getRuleContexts(ImportRuleContext.class);
		}
		public ImportRuleContext importRule(int i) {
			return getRuleContext(ImportRuleContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public List<JavaCodeContext> javaCode() {
			return getRuleContexts(JavaCodeContext.class);
		}
		public JavaCodeContext javaCode(int i) {
			return getRuleContext(JavaCodeContext.class,i);
		}
		public JavaFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).enterJavaFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFileGrammarListener ) ((JavaFileGrammarListener)listener).exitJavaFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFileGrammarVisitor ) return ((JavaFileGrammarVisitor<? extends T>)visitor).visitJavaFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaFileContext javaFile() throws RecognitionException {
		JavaFileContext _localctx = new JavaFileContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_javaFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(233);
				packageRule();
				}
			}

			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(238);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(236);
						importRule();
						}
						break;
					case NEWLINE:
					case SPACE:
					case TAB:
						{
						setState(237);
						sep();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31542780987703296L) != 0)) {
				{
				{
				setState(243);
				javaCode();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		"\u0004\u00018\u00fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		">\b\u0005\n\u0005\f\u0005A\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"E\b\u0005\n\u0005\f\u0005H\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006N\b\u0006\n\u0006\f\u0006Q\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006U\b\u0006\u0001\u0006\u0005\u0006X\b\u0006\n\u0006"+
		"\f\u0006[\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007a\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\th\b\t\n"+
		"\t\f\tk\t\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e}\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0082\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u008d\b\u0013\n\u0013\f\u0013\u0090\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0094\b\u0013\n\u0013\f\u0013\u0097\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u009b\b\u0013\n\u0013\f\u0013\u009e"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u00a9\b\u0013\u000b"+
		"\u0013\f\u0013\u00aa\u0001\u0014\u0001\u0014\u0005\u0014\u00af\b\u0014"+
		"\n\u0014\f\u0014\u00b2\t\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00b6"+
		"\b\u0014\n\u0014\f\u0014\u00b9\t\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u00bd\b\u0014\n\u0014\f\u0014\u00c0\t\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00c4\b\u0014\n\u0014\f\u0014\u00c7\t\u0014\u0001\u0014\u0003\u0014"+
		"\u00ca\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00cf\b"+
		"\u0014\n\u0014\f\u0014\u00d2\t\u0014\u0001\u0014\u0005\u0014\u00d5\b\u0014"+
		"\n\u0014\f\u0014\u00d8\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00e2"+
		"\b\u0014\u000b\u0014\f\u0014\u00e3\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0003\u0017\u00eb\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00ef\b\u0017\n\u0017\f\u0017\u00f2\t\u0017\u0001\u0017\u0005"+
		"\u0017\u00f5\b\u0017\n\u0017\f\u0017\u00f8\t\u0017\u0001\u0017\u0000\u0000"+
		"\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.\u0000\u0004\u0001\u0000\u0004 \u0001\u0000"+
		"!\"\u0001\u0000$+\u0002\u00003388\u0112\u00000\u0001\u0000\u0000\u0000"+
		"\u00023\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u00067"+
		"\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000"+
		"\u0000\fK\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000\u0000\u0010"+
		"b\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014l\u0001"+
		"\u0000\u0000\u0000\u0016n\u0001\u0000\u0000\u0000\u0018p\u0001\u0000\u0000"+
		"\u0000\u001ar\u0001\u0000\u0000\u0000\u001c|\u0001\u0000\u0000\u0000\u001e"+
		"\u0081\u0001\u0000\u0000\u0000 \u0083\u0001\u0000\u0000\u0000\"\u0086"+
		"\u0001\u0000\u0000\u0000$\u0088\u0001\u0000\u0000\u0000&\u008e\u0001\u0000"+
		"\u0000\u0000(\u00b0\u0001\u0000\u0000\u0000*\u00e5\u0001\u0000\u0000\u0000"+
		",\u00e7\u0001\u0000\u0000\u0000.\u00ea\u0001\u0000\u0000\u000001\u0003"+
		".\u0017\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000\u0000\u0000"+
		"34\u0007\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u000056\u0007\u0001"+
		"\u0000\u00006\u0005\u0001\u0000\u0000\u000078\u0005#\u0000\u00008\u0007"+
		"\u0001\u0000\u0000\u00009:\u0007\u0002\u0000\u0000:\t\u0001\u0000\u0000"+
		"\u0000;?\u0003*\u0015\u0000<>\u0003\u001e\u000f\u0000=<\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BF\u0003"+
		"\u0012\t\u0000CE\u0003\u001e\u000f\u0000DC\u0001\u0000\u0000\u0000EH\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u00051\u0000\u0000"+
		"J\u000b\u0001\u0000\u0000\u0000KO\u0003,\u0016\u0000LN\u0003\u001e\u000f"+
		"\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RT\u0003\u0012\t\u0000SU\u0005.\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UY\u0001\u0000\u0000\u0000"+
		"VX\u0003\u001e\u000f\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u00051\u0000\u0000]\r\u0001"+
		"\u0000\u0000\u0000^a\u0003&\u0013\u0000_a\u0003(\u0014\u0000`^\u0001\u0000"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000a\u000f\u0001\u0000\u0000\u0000"+
		"bc\u00052\u0000\u0000c\u0011\u0001\u0000\u0000\u0000di\u0003\u0010\b\u0000"+
		"ef\u0005/\u0000\u0000fh\u0003\u0010\b\u0000ge\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000j\u0013\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005"+
		"4\u0000\u0000m\u0015\u0001\u0000\u0000\u0000no\u00055\u0000\u0000o\u0017"+
		"\u0001\u0000\u0000\u0000pq\u00056\u0000\u0000q\u0019\u0001\u0000\u0000"+
		"\u0000rs\u00057\u0000\u0000s\u001b\u0001\u0000\u0000\u0000t}\u0005,\u0000"+
		"\u0000u}\u00052\u0000\u0000v}\u0003\u001e\u000f\u0000w}\u0005-\u0000\u0000"+
		"x}\u0005.\u0000\u0000y}\u0005/\u0000\u0000z}\u00050\u0000\u0000{}\u0005"+
		"1\u0000\u0000|t\u0001\u0000\u0000\u0000|u\u0001\u0000\u0000\u0000|v\u0001"+
		"\u0000\u0000\u0000|w\u0001\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000"+
		"|y\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u001d\u0001\u0000\u0000\u0000~\u0082\u0003\u0014\n\u0000\u007f"+
		"\u0082\u0003\u0016\u000b\u0000\u0080\u0082\u0003\u0018\f\u0000\u0081~"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u001f\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\u0001\u0000\u0000\u0084\u0085\u00052\u0000\u0000\u0085!\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0007\u0003\u0000\u0000\u0087#\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u00052\u0000\u0000\u0089%\u0001\u0000\u0000\u0000\u008a"+
		"\u008d\u0003\b\u0004\u0000\u008b\u008d\u0003\u001e\u000f\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u0095\u0003\u0004\u0002\u0000\u0092\u0094"+
		"\u0003\u001e\u000f\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u009c\u0003\u0010\b\u0000\u0099\u009b\u0003"+
		"\u001e\u000f\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009f\u00a8\u0005-\u0000\u0000\u00a0\u00a9\u0003\""+
		"\u0011\u0000\u00a1\u00a9\u0003\u001a\r\u0000\u00a2\u00a9\u0003\b\u0004"+
		"\u0000\u00a3\u00a9\u0003\u0002\u0001\u0000\u00a4\u00a9\u0003 \u0010\u0000"+
		"\u00a5\u00a9\u0003\u001c\u000e\u0000\u00a6\u00a9\u0003&\u0013\u0000\u00a7"+
		"\u00a9\u0003(\u0014\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\'\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0003\b\u0004\u0000\u00ad\u00af\u0003\u001e"+
		"\u000f\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b7\u0003\u0006"+
		"\u0003\u0000\u00b4\u00b6\u0003\u001e\u000f\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00be\u0003\u0010"+
		"\b\u0000\u00bb\u00bd\u0003\u001e\u000f\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c5\u0005-\u0000\u0000"+
		"\u00c2\u00c4\u0003\u001e\u000f\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003$\u0012\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00d6\u0001\u0000\u0000\u0000\u00cb\u00d5\u0003\u001e\u000f\u0000\u00cc"+
		"\u00d0\u00050\u0000\u0000\u00cd\u00cf\u0003\u001e\u000f\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\u0003$\u0012\u0000\u00d4\u00cb\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00e1\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00e2\u0003"+
		"\"\u0011\u0000\u00da\u00e2\u0003\u001a\r\u0000\u00db\u00e2\u0003\b\u0004"+
		"\u0000\u00dc\u00e2\u0003\u0002\u0001\u0000\u00dd\u00e2\u0003 \u0010\u0000"+
		"\u00de\u00e2\u0003\u001c\u000e\u0000\u00df\u00e2\u0003&\u0013\u0000\u00e0"+
		"\u00e2\u0003(\u0014\u0000\u00e1\u00d9\u0001\u0000\u0000\u0000\u00e1\u00da"+
		"\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4)\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005\u0002\u0000\u0000\u00e6+\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000\u00e8-\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0003\n\u0005\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0003\f\u0006\u0000\u00ed\u00ef\u0003\u001e\u000f\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f6\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f5\u0003\u000e\u0007\u0000\u00f4"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"/\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u001e?F"+
		"OTY`i|\u0081\u008c\u008e\u0095\u009c\u00a8\u00aa\u00ae\u00b0\u00b7\u00be"+
		"\u00c5\u00c9\u00d0\u00d4\u00d6\u00e1\u00e3\u00ea\u00ee\u00f0\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}