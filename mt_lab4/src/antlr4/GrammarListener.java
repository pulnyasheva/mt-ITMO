// Generated from ./src/antlr4/Grammar.g4 by ANTLR 4.13.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nameGrammar}.
	 * @param ctx the parse tree
	 */
	void enterNameGrammar(GrammarParser.NameGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nameGrammar}.
	 * @param ctx the parse tree
	 */
	void exitNameGrammar(GrammarParser.NameGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#startTerm}.
	 * @param ctx the parse tree
	 */
	void enterStartTerm(GrammarParser.StartTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#startTerm}.
	 * @param ctx the parse tree
	 */
	void exitStartTerm(GrammarParser.StartTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarParserRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarParserRule(GrammarParser.GrammarParserRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarParserRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarParserRule(GrammarParser.GrammarParserRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argName}.
	 * @param ctx the parse tree
	 */
	void enterArgName(GrammarParser.ArgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argName}.
	 * @param ctx the parse tree
	 */
	void exitArgName(GrammarParser.ArgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(GrammarParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(GrammarParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nameClass}.
	 * @param ctx the parse tree
	 */
	void enterNameClass(GrammarParser.NameClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nameClass}.
	 * @param ctx the parse tree
	 */
	void exitNameClass(GrammarParser.NameClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variants}.
	 * @param ctx the parse tree
	 */
	void enterVariants(GrammarParser.VariantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variants}.
	 * @param ctx the parse tree
	 */
	void exitVariants(GrammarParser.VariantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(GrammarParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(GrammarParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(GrammarParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(GrammarParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(GrammarParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(GrammarParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnTerm}.
	 * @param ctx the parse tree
	 */
	void enterReturnTerm(GrammarParser.ReturnTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnTerm}.
	 * @param ctx the parse tree
	 */
	void exitReturnTerm(GrammarParser.ReturnTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexicalAnalyzerRule}.
	 * @param ctx the parse tree
	 */
	void enterLexicalAnalyzerRule(GrammarParser.LexicalAnalyzerRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexicalAnalyzerRule}.
	 * @param ctx the parse tree
	 */
	void exitLexicalAnalyzerRule(GrammarParser.LexicalAnalyzerRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(GrammarParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(GrammarParser.TokenContext ctx);
}