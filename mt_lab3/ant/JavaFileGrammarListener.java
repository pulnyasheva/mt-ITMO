// Generated from ./antlr4/JavaFileGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaFileGrammarParser}.
 */
public interface JavaFileGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaFileGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaFileGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(JavaFileGrammarParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(JavaFileGrammarParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaFileGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaFileGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(JavaFileGrammarParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(JavaFileGrammarParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(JavaFileGrammarParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(JavaFileGrammarParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#packageRule}.
	 * @param ctx the parse tree
	 */
	void enterPackageRule(JavaFileGrammarParser.PackageRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#packageRule}.
	 * @param ctx the parse tree
	 */
	void exitPackageRule(JavaFileGrammarParser.PackageRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#importRule}.
	 * @param ctx the parse tree
	 */
	void enterImportRule(JavaFileGrammarParser.ImportRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#importRule}.
	 * @param ctx the parse tree
	 */
	void exitImportRule(JavaFileGrammarParser.ImportRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#javaCode}.
	 * @param ctx the parse tree
	 */
	void enterJavaCode(JavaFileGrammarParser.JavaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#javaCode}.
	 * @param ctx the parse tree
	 */
	void exitJavaCode(JavaFileGrammarParser.JavaCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(JavaFileGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(JavaFileGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaFileGrammarParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaFileGrammarParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(JavaFileGrammarParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(JavaFileGrammarParser.NewLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(JavaFileGrammarParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(JavaFileGrammarParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(JavaFileGrammarParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(JavaFileGrammarParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JavaFileGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JavaFileGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(JavaFileGrammarParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(JavaFileGrammarParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#sep}.
	 * @param ctx the parse tree
	 */
	void enterSep(JavaFileGrammarParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#sep}.
	 * @param ctx the parse tree
	 */
	void exitSep(JavaFileGrammarParser.SepContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaFileGrammarParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaFileGrammarParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#charOrString}.
	 * @param ctx the parse tree
	 */
	void enterCharOrString(JavaFileGrammarParser.CharOrStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#charOrString}.
	 * @param ctx the parse tree
	 */
	void exitCharOrString(JavaFileGrammarParser.CharOrStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaFileGrammarParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaFileGrammarParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#typeRule}.
	 * @param ctx the parse tree
	 */
	void enterTypeRule(JavaFileGrammarParser.TypeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#typeRule}.
	 * @param ctx the parse tree
	 */
	void exitTypeRule(JavaFileGrammarParser.TypeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#enumRule}.
	 * @param ctx the parse tree
	 */
	void enterEnumRule(JavaFileGrammarParser.EnumRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#enumRule}.
	 * @param ctx the parse tree
	 */
	void exitEnumRule(JavaFileGrammarParser.EnumRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#package}.
	 * @param ctx the parse tree
	 */
	void enterPackage(JavaFileGrammarParser.PackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#package}.
	 * @param ctx the parse tree
	 */
	void exitPackage(JavaFileGrammarParser.PackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#importWord}.
	 * @param ctx the parse tree
	 */
	void enterImportWord(JavaFileGrammarParser.ImportWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#importWord}.
	 * @param ctx the parse tree
	 */
	void exitImportWord(JavaFileGrammarParser.ImportWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFileGrammarParser#javaFile}.
	 * @param ctx the parse tree
	 */
	void enterJavaFile(JavaFileGrammarParser.JavaFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFileGrammarParser#javaFile}.
	 * @param ctx the parse tree
	 */
	void exitJavaFile(JavaFileGrammarParser.JavaFileContext ctx);
}