// Generated from C:/Users/Pichau/Desktop/linguagem/A3_Compiladores/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gramaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(gramaticaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(gramaticaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(gramaticaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(gramaticaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#printfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfStatement(gramaticaParser.PrintfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#scanfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanfStatement(gramaticaParser.ScanfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(gramaticaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#interation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteration(gramaticaParser.InterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gramaticaParser.ExpressionContext ctx);
}