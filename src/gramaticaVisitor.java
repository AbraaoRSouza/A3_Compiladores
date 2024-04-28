// Generated from C:/Users/Pichau/Desktop/Estudos Java-Spring/linguagem/gramatica.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link gramaticaParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(gramaticaParser.VisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(gramaticaParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typeInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(gramaticaParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typeString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeString(gramaticaParser.TypeStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#typeDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDouble(gramaticaParser.TypeDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gramaticaParser.DeclarationContext ctx);
}