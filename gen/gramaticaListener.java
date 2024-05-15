// Generated from C:/Users/Pichau/Desktop/linguagem/A3_Compiladores/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gramaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gramaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(gramaticaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(gramaticaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(gramaticaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(gramaticaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(gramaticaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(gramaticaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(gramaticaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(gramaticaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#printfStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintfStatement(gramaticaParser.PrintfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#printfStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintfStatement(gramaticaParser.PrintfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#scanfStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanfStatement(gramaticaParser.ScanfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#scanfStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanfStatement(gramaticaParser.ScanfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(gramaticaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(gramaticaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#interation}.
	 * @param ctx the parse tree
	 */
	void enterInteration(gramaticaParser.InterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#interation}.
	 * @param ctx the parse tree
	 */
	void exitInteration(gramaticaParser.InterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramaticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramaticaParser.ExpressionContext ctx);
}