// Generated from C:/Users/Pichau/Desktop/linguagem/A3_Compiladores/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(gramaticaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(gramaticaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracaoVariavelDouble}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavelDouble(gramaticaParser.DeclaracaoVariavelDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracaoVariavelDouble}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavelDouble(gramaticaParser.DeclaracaoVariavelDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracaoVariavelInt}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavelInt(gramaticaParser.DeclaracaoVariavelIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracaoVariavelInt}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavelInt(gramaticaParser.DeclaracaoVariavelIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracaoVariavelString}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavelString(gramaticaParser.DeclaracaoVariavelStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracaoVariavelString}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavelString(gramaticaParser.DeclaracaoVariavelStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(gramaticaParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(gramaticaParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#estruturaIf}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaIf(gramaticaParser.EstruturaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#estruturaIf}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaIf(gramaticaParser.EstruturaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#estruturaWhile}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaWhile(gramaticaParser.EstruturaWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#estruturaWhile}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaWhile(gramaticaParser.EstruturaWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#atribuicaoFor}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoFor(gramaticaParser.AtribuicaoForContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#atribuicaoFor}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoFor(gramaticaParser.AtribuicaoForContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#estruturaFor}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaFor(gramaticaParser.EstruturaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#estruturaFor}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaFor(gramaticaParser.EstruturaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#leituraVar}.
	 * @param ctx the parse tree
	 */
	void enterLeituraVar(gramaticaParser.LeituraVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#leituraVar}.
	 * @param ctx the parse tree
	 */
	void exitLeituraVar(gramaticaParser.LeituraVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#estruturaPrintf}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaPrintf(gramaticaParser.EstruturaPrintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#estruturaPrintf}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaPrintf(gramaticaParser.EstruturaPrintfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#estruturaScanf}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaScanf(gramaticaParser.EstruturaScanfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#estruturaScanf}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaScanf(gramaticaParser.EstruturaScanfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoVariavel(gramaticaParser.AtribuicaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoVariavel(gramaticaParser.AtribuicaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#interacao}.
	 * @param ctx the parse tree
	 */
	void enterInteracao(gramaticaParser.InteracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#interacao}.
	 * @param ctx the parse tree
	 */
	void exitInteracao(gramaticaParser.InteracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(gramaticaParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(gramaticaParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#logico}.
	 * @param ctx the parse tree
	 */
	void enterLogico(gramaticaParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#logico}.
	 * @param ctx the parse tree
	 */
	void exitLogico(gramaticaParser.LogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(gramaticaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(gramaticaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoLogico}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogico(gramaticaParser.ExpressaoLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoLogico}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogico(gramaticaParser.ExpressaoLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoMatematica(gramaticaParser.ExpressaoMatematicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoMatematica(gramaticaParser.ExpressaoMatematicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(gramaticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(gramaticaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(gramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(gramaticaParser.FatorContext ctx);
}