package br.ufpe.cin.if688.minijava.antlr;

import java.nio.channels.AcceptPendingException;
import java.util.Iterator;

import org.antlr.runtime.misc.IntArray;
import org.antlr.v4.Tool.OptionArgType;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.maven.model.Plugin;

import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.ArrayAssignStmtContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.AssignStmtContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.BlockContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.BoolContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.ClassDeclarationContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.ExpressionContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.GoalContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.IdentifierContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.IfStmtContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.IntengerLiteralContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.MainClassContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.MethodDeclarationContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.OpContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.PrintStmtContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.StatementContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.TypeContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.VarDeclarationContext;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.WhileStmtContext;
import br.ufpe.cin.if688.minijava.ast.And;
import br.ufpe.cin.if688.minijava.ast.ArrayAssign;
import br.ufpe.cin.if688.minijava.ast.ArrayLength;
import br.ufpe.cin.if688.minijava.ast.ArrayLookup;
import br.ufpe.cin.if688.minijava.ast.Assign;
import br.ufpe.cin.if688.minijava.ast.Block;
import br.ufpe.cin.if688.minijava.ast.BooleanType;
import br.ufpe.cin.if688.minijava.ast.Call;
import br.ufpe.cin.if688.minijava.ast.ClassDecl;
import br.ufpe.cin.if688.minijava.ast.ClassDeclExtends;
import br.ufpe.cin.if688.minijava.ast.ClassDeclList;
import br.ufpe.cin.if688.minijava.ast.ClassDeclSimple;
import br.ufpe.cin.if688.minijava.ast.Exp;
import br.ufpe.cin.if688.minijava.ast.ExpList;
import br.ufpe.cin.if688.minijava.ast.False;
import br.ufpe.cin.if688.minijava.ast.Formal;
import br.ufpe.cin.if688.minijava.ast.FormalList;
import br.ufpe.cin.if688.minijava.ast.Identifier;
import br.ufpe.cin.if688.minijava.ast.IdentifierExp;
import br.ufpe.cin.if688.minijava.ast.IdentifierType;
import br.ufpe.cin.if688.minijava.ast.If;
import br.ufpe.cin.if688.minijava.ast.IntArrayType;
import br.ufpe.cin.if688.minijava.ast.IntegerLiteral;
import br.ufpe.cin.if688.minijava.ast.IntegerType;
import br.ufpe.cin.if688.minijava.ast.LessThan;
import br.ufpe.cin.if688.minijava.ast.MainClass;
import br.ufpe.cin.if688.minijava.ast.MethodDecl;
import br.ufpe.cin.if688.minijava.ast.MethodDeclList;
import br.ufpe.cin.if688.minijava.ast.Minus;
import br.ufpe.cin.if688.minijava.ast.NewArray;
import br.ufpe.cin.if688.minijava.ast.NewObject;
import br.ufpe.cin.if688.minijava.ast.Not;
import br.ufpe.cin.if688.minijava.ast.Plus;
import br.ufpe.cin.if688.minijava.ast.Print;
import br.ufpe.cin.if688.minijava.ast.Program;
import br.ufpe.cin.if688.minijava.ast.Statement;
import br.ufpe.cin.if688.minijava.ast.StatementList;
import br.ufpe.cin.if688.minijava.ast.This;
import br.ufpe.cin.if688.minijava.ast.Times;
import br.ufpe.cin.if688.minijava.ast.True;
import br.ufpe.cin.if688.minijava.ast.Type;
import br.ufpe.cin.if688.minijava.ast.VarDecl;
import br.ufpe.cin.if688.minijava.ast.VarDeclList;
import br.ufpe.cin.if688.minijava.ast.While;
import br.ufpe.cin.if688.minijava.visitor.IVisitor;


public class MyVisitor implements MiniJavaVisitor<Object> {

	public Object visit(ParseTree pt) {
		// TODO Auto-generated method stub
		return pt.accept(this);
	}

	public Object visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object visitOp(OpContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object visitMethodDeclaration(MethodDeclarationContext ctx) {
		Type type = (Type) ctx.type(0).accept(this);
		Identifier id = (Identifier) ctx.identifier(0).accept(this);
		
		FormalList fl = new FormalList();
		Iterator<TypeContext> itt = (Iterator<TypeContext>) ctx.type().iterator();
		Iterator<IdentifierContext> itid = (Iterator<IdentifierContext>) ctx.identifier().iterator();
		itt.next();
		itid.next();
		while (itid.hasNext() && itt.hasNext()) {
			Formal f = new Formal((Type) itt.next().accept(this), (Identifier) itid.next().accept(this));
			fl.addElement(f);
		}
		
		VarDeclList varList = new VarDeclList();
		Iterator<VarDeclarationContext> iVarDec = (Iterator<VarDeclarationContext>) ctx.varDeclaration().iterator();
		while (iVarDec.hasNext())
			varList.addElement((VarDecl) iVarDec.next().accept(this));
		
		StatementList stmList = new StatementList();
		Iterator<StatementContext> itStm = (Iterator<StatementContext>) ctx.statement().iterator();
		while (itStm.hasNext())
			stmList.addElement((Statement) itStm.next().accept(this));
		
		Exp exp = (Exp) ctx.expression().accept(this);
		return new MethodDecl(type, id, fl, varList, stmList, exp);
		
	}

	public Object visitGoal(GoalContext ctx) {
		MainClass mc = (MainClass) ctx.mainClass().accept(this);
		ClassDeclList cdl = new ClassDeclList();
		Iterator<ClassDeclarationContext> itClassDecl = (Iterator<ClassDeclarationContext>) ctx.classDeclaration().iterator();
		while (itClassDecl.hasNext()) cdl.addElement((ClassDecl) itClassDecl.next().accept(this));
		return new Program(mc, cdl);
	}

	public Object visitExpression(ExpressionContext ctx) {
		int children = ctx.getChildCount();
		if (children >= 5) {
			if (ctx.getStart().getText().equals("new"))
				return new NewArray((Exp) ctx.expression(0).accept(this));
			Exp e0 = (Exp) ctx.expression(0).accept(this);
			ExpList el = new ExpList();
			Iterator<ExpressionContext> itExp = (Iterator<ExpressionContext>) ctx.expression().iterator();
			while (itExp.hasNext()) el.addElement((Exp) itExp.next().accept(this));
			Identifier id = (Identifier) ctx.identifier().accept(this);
			return new Call(e0, id, el);
		} else if (children == 4) {
			if (ctx.getStart().getText().equals("new")) 
				return new NewObject((Identifier) ctx.identifier().accept(this));
			Exp e0 = (Exp) ctx.expression(0).accept(this);
			Exp e1 = (Exp) ctx.expression(1).accept(this);
			return new ArrayLookup(e0, e1);
		} else if (children == 3) {
			if (ctx.op() != null) {
				String txt = ctx.op().getText();
				Exp e0 = (Exp) ctx.expression(0).accept(this);
				Exp e1 = (Exp) ctx.expression(1).accept(this);
				if (txt.equals("+")) return new Plus(e0, e1);
				else if (txt.equals("-")) return new Minus(e0, e1);
				else if (txt.equals("&&")) return new And(e0, e1);
				else if (txt.equals("<")) return new LessThan(e0, e1);
				else return new Times(e0, e1);
			} else if (ctx.getStart().getText().equals("(")) {
				return (Exp) ctx.expression(0).accept(this);
			} else {
				return new ArrayLength((Exp) ctx.expression(0).accept(this));
			}
		} else if (children == 2) {
			return new Not((Exp) ctx.expression(0).accept(this));
		} else {
			if (ctx.identifier() != null) return new IdentifierExp(ctx.identifier().getText());
			else if (ctx.intengerLiteral() != null) return (IntegerLiteral) ctx.intengerLiteral().accept(this);
			else if (ctx.bool() != null) return visitBool(ctx.bool());
			else return new This();
		}
	}

	public Object visitMainClass(MainClassContext ctx) {
		// TODO Auto-generated method stub
		Identifier i0 = (Identifier) ctx.identifier(0).accept(this);
		Identifier i1 = (Identifier) ctx.identifier(1).accept(this);
		Statement stmt = (Statement) ctx.statement().accept(this);
		return new MainClass(i0, i1, stmt);
	}

	public Object visitStatement(StatementContext ctx) {
		if (ctx.block() != null) return visitBlock(ctx.block());
		else if (ctx.ifStmt() != null) return visitIfStmt(ctx.ifStmt());
		else if (ctx.whileStmt() != null) return visitWhileStmt(ctx.whileStmt());
		else if (ctx.printStmt() != null) return visitPrintStmt(ctx.printStmt());
		else if (ctx.assignStmt() != null) return visitAssignStmt(ctx.assignStmt());
		else return visitArrayAssignStmt(ctx.arrayAssignStmt());
	}
	
	public Object visitWhileStmt(WhileStmtContext ctx) {
		Exp e = (Exp) ctx.expression().accept(this);
		Statement s = (Statement) ctx.statement().accept(this);
		return new While(e, s);
	}

	public Object visitAssignStmt(AssignStmtContext ctx) {
		Identifier i = (Identifier) ctx.identifier().accept(this);
		Exp e = (Exp) ctx.expression().accept(this);
		return new Assign(i, e);
	}

	public Object visitArrayAssignStmt(ArrayAssignStmtContext ctx) {
		Identifier i = (Identifier) ctx.identifier().accept(this);
		Exp e0 = (Exp) ctx.expression(0).accept(this);
		Exp e1 = (Exp) ctx.expression(1).accept(this);
		return new ArrayAssign(i, e0, e1);
	}

	public Object visitPrintStmt(PrintStmtContext ctx) {
		Exp e = (Exp) ctx.expression().accept(this);
		return new Print(e);
	}

	public Object visitIfStmt(IfStmtContext ctx) {
		Exp e = (Exp) ctx.expression().accept(this);
		Statement s0 = (Statement) ctx.statement(0).accept(this);
		Statement s1 = (Statement) ctx.statement(1).accept(this);
		return new If(e, s0, s1);
	}

	public Object visitBlock(BlockContext ctx) {
		StatementList sl = new StatementList();
		Iterator<StatementContext> itS = (Iterator<StatementContext>) ctx.statement().iterator();
		while (itS.hasNext()) sl.addElement((Statement) itS.next().accept(this));
		return new Block(sl);
	}



	public Object visitType(TypeContext ctx) {
		String txt = ctx.getText();
		if (txt.equals("boolean")) return new BooleanType();
		else if (txt.equals("int")) return new IntegerType();
		else if (txt.equals("int[]")) return new IntArrayType();
		return new IdentifierType(txt);
	}

	public Object visitVarDeclaration(VarDeclarationContext ctx) {
		Type t = (Type) ctx.type().accept(this);
		Identifier i = (Identifier) ctx.identifier().accept(this);
		return new VarDecl(t, i);
	}

	public Object visitClassDeclaration(ClassDeclarationContext ctx) {
		Identifier id = (Identifier) ctx.identifier(0).accept(this);
		
		VarDeclList vdl = new VarDeclList();
		Iterator<VarDeclarationContext> ivdl = (Iterator<VarDeclarationContext>) ctx.varDeclaration().iterator();
		while (ivdl.hasNext()) vdl.addElement((VarDecl) ivdl.next().accept(this));
		
		MethodDeclList mdl = new MethodDeclList();
		Iterator<MethodDeclarationContext> imdl = (Iterator<MethodDeclarationContext>) ctx.methodDeclaration().iterator();
		while (imdl.hasNext()) mdl.addElement((MethodDecl)imdl.next().accept(this));
		
		if (ctx.identifier().size() > 1) {
			Identifier id2 = (Identifier) ctx.identifier(1).accept(this);
			return new ClassDeclExtends(id, id2, vdl, mdl);
		}
		return new ClassDeclSimple(id, vdl, mdl);
	}

	public Object visitIdentifier(IdentifierContext ctx) {
		return new Identifier(ctx.getText());
	}

	public Object visitIntengerLiteral(IntengerLiteralContext ctx) {
		return new IntegerLiteral(Integer.parseInt(ctx.getText()));
	}

	public Object visitBool(BoolContext ctx) {
		if (ctx.getText() == "true") return new True();
		return new False();
	}

	

	
}
