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
	 * Visit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(gramaticaParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracaoVariavelDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavelDouble(gramaticaParser.DeclaracaoVariavelDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracaoVariavelInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavelInt(gramaticaParser.DeclaracaoVariavelIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracaoVariavelString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavelString(gramaticaParser.DeclaracaoVariavelStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavel(gramaticaParser.DeclaracaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#estruturaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaIf(gramaticaParser.EstruturaIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#estruturaWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaWhile(gramaticaParser.EstruturaWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#atribuicaoFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoFor(gramaticaParser.AtribuicaoForContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#estruturaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaFor(gramaticaParser.EstruturaForContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#leituraVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeituraVar(gramaticaParser.LeituraVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#estruturaPrintf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaPrintf(gramaticaParser.EstruturaPrintfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#estruturaScanf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruturaScanf(gramaticaParser.EstruturaScanfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoVariavel(gramaticaParser.AtribuicaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#interacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteracao(gramaticaParser.InteracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#interacaoString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteracaoString(gramaticaParser.InteracaoStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(gramaticaParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico(gramaticaParser.LogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(gramaticaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressaoLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLogico(gramaticaParser.ExpressaoLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoMatematica(gramaticaParser.ExpressaoMatematicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(gramaticaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(gramaticaParser.FatorContext ctx);
}