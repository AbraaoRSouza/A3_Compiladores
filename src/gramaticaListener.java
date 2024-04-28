// Generated from C:/Users/Pichau/Desktop/Estudos Java-Spring/linguagem/gramatica.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link gramaticaParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(gramaticaParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(gramaticaParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(gramaticaParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(gramaticaParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typeInt}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(gramaticaParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typeInt}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(gramaticaParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typeString}.
	 * @param ctx the parse tree
	 */
	void enterTypeString(gramaticaParser.TypeStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typeString}.
	 * @param ctx the parse tree
	 */
	void exitTypeString(gramaticaParser.TypeStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#typeDouble}.
	 * @param ctx the parse tree
	 */
	void enterTypeDouble(gramaticaParser.TypeDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#typeDouble}.
	 * @param ctx the parse tree
	 */
	void exitTypeDouble(gramaticaParser.TypeDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gramaticaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gramaticaParser.DeclarationContext ctx);
}