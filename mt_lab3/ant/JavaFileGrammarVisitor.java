// Generated from ./antlr4/JavaFileGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaFileGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaFileGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaFileGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(JavaFileGrammarParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaFileGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(JavaFileGrammarParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(JavaFileGrammarParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#packageRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageRule(JavaFileGrammarParser.PackageRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#importRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportRule(JavaFileGrammarParser.ImportRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#javaCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaCode(JavaFileGrammarParser.JavaCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(JavaFileGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JavaFileGrammarParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(JavaFileGrammarParser.NewLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(JavaFileGrammarParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#tab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTab(JavaFileGrammarParser.TabContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JavaFileGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(JavaFileGrammarParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(JavaFileGrammarParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaFileGrammarParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#charOrString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharOrString(JavaFileGrammarParser.CharOrStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaFileGrammarParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#typeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRule(JavaFileGrammarParser.TypeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#enumRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumRule(JavaFileGrammarParser.EnumRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(JavaFileGrammarParser.PackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#importWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportWord(JavaFileGrammarParser.ImportWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFileGrammarParser#javaFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaFile(JavaFileGrammarParser.JavaFileContext ctx);
}