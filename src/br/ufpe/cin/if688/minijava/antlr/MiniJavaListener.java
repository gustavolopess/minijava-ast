// Generated from MiniJava.g4 by ANTLR 4.4

package br.ufpe.cin.if688.minijava.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(@NotNull MiniJavaParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(@NotNull MiniJavaParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(@NotNull MiniJavaParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(@NotNull MiniJavaParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#intengerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntengerLiteral(@NotNull MiniJavaParser.IntengerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#intengerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntengerLiteral(@NotNull MiniJavaParser.IntengerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull MiniJavaParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull MiniJavaParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(@NotNull MiniJavaParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(@NotNull MiniJavaParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayAssignStmt}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignStmt(@NotNull MiniJavaParser.ArrayAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayAssignStmt}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignStmt(@NotNull MiniJavaParser.ArrayAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(@NotNull MiniJavaParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(@NotNull MiniJavaParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(@NotNull MiniJavaParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(@NotNull MiniJavaParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MiniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MiniJavaParser.BlockContext ctx);
}