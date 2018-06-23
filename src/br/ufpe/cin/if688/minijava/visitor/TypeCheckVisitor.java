package br.ufpe.cin.if688.minijava.visitor;

import javax.management.openmbean.ArrayType;

import br.ufpe.cin.if688.minijava.ast.And;
import br.ufpe.cin.if688.minijava.ast.ArrayAssign;
import br.ufpe.cin.if688.minijava.ast.ArrayLength;
import br.ufpe.cin.if688.minijava.ast.ArrayLookup;
import br.ufpe.cin.if688.minijava.ast.Assign;
import br.ufpe.cin.if688.minijava.ast.Block;
import br.ufpe.cin.if688.minijava.ast.BooleanType;
import br.ufpe.cin.if688.minijava.ast.Call;
import br.ufpe.cin.if688.minijava.ast.ClassDeclExtends;
import br.ufpe.cin.if688.minijava.ast.ClassDeclSimple;
import br.ufpe.cin.if688.minijava.ast.False;
import br.ufpe.cin.if688.minijava.ast.Formal;
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
import br.ufpe.cin.if688.minijava.ast.Minus;
import br.ufpe.cin.if688.minijava.ast.NewArray;
import br.ufpe.cin.if688.minijava.ast.NewObject;
import br.ufpe.cin.if688.minijava.ast.Not;
import br.ufpe.cin.if688.minijava.ast.Plus;
import br.ufpe.cin.if688.minijava.ast.Print;
import br.ufpe.cin.if688.minijava.ast.Program;
import br.ufpe.cin.if688.minijava.ast.This;
import br.ufpe.cin.if688.minijava.ast.Times;
import br.ufpe.cin.if688.minijava.ast.True;
import br.ufpe.cin.if688.minijava.ast.Type;
import br.ufpe.cin.if688.minijava.ast.VarDecl;
import br.ufpe.cin.if688.minijava.ast.While;
import br.ufpe.cin.if688.minijava.symboltable.SymbolTable;
import br.ufpe.cin.if688.minijava.symboltable.Class;
import br.ufpe.cin.if688.minijava.symboltable.Method;

public class TypeCheckVisitor implements IVisitor<Type> {

	private SymbolTable symbolTable;
	private Method currMethod;
	private Class currClass;
	private String mainClassId;

	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		this.mainClassId = n.i1.toString();
		this.currClass = this.symbolTable.getClass(mainClassId);
		this.currMethod = this.symbolTable.getMethod("main", mainClassId);
		
		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);
		
		this.currClass = null;
		this.currMethod = null;
		
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		this.currClass = this.symbolTable.getClass(n.i.toString());
		n.i.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		this.currClass = null;
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		String classId = n.i.toString();
		this.currClass = this.symbolTable.getClass(n.i.toString());
		assert n.j != null : "Classe extensora deve ser definida";
		String parentId = n.j.toString();
		assert !parentId.equals(this.mainClassId) : "Classe main não pode ser extendida";
		n.i.accept(this);
		n.j.accept(this);
		do {
			assert !classId.equals(parentId) : "Herança cíclica detectada";
			parentId = symbolTable.getClass(parentId).parent();
		} while (!parentId.isEmpty() && parentId != null);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		this.currClass = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		n.i.accept(this);
		return n.t.accept(this);
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		this.currMethod = this.symbolTable.getMethod(n.i.toString(), this.currClass.getId());
		Type t = n.t.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		assert this.symbolTable.compareTypes(n.e.accept(this), t) : "Tipo de retorno e tipo retornado são diferentes";
		this.currMethod = null;
		return t;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.i.accept(this);
		return n.t;
	}

	public Type visit(IntArrayType n) {
		return n;
	}

	public Type visit(BooleanType n) {
		return n;
	}

	public Type visit(IntegerType n) {
		return n;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return n;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		assert this.symbolTable.compareTypes(n.e.accept(this), new BooleanType()) : "Expressão deve ser booleana";
		n.s1.accept(this);
		n.s2.accept(this);
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		assert this.symbolTable.compareTypes(n.e.accept(this), new BooleanType()) : "Expressão deve ser booleana";
		n.s.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		Type t = this.symbolTable.getVarType(this.currMethod, this.currClass, n.i.toString());
		assert this.symbolTable.compareTypes(n.e.accept(this), t) : String.format("%s não é do tipo declarado %s", n.i.toString(), t.toString());
		n.i.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		Type t = this.symbolTable.getVarType(this.currMethod, this.currClass, n.i.toString());
		assert this.symbolTable.compareTypes(t, n.i.accept(this)) : "Declaração com tipos diferentes";
		n.e1.accept(this);
		assert this.symbolTable.compareTypes(n.e2.accept(this), new IntegerType()) : "Inteiro esperado";
		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {
		assert this.symbolTable.compareTypes(n.e1.accept(this), new BooleanType()) : "Expressão booleana esperada";
		assert this.symbolTable.compareTypes(n.e2.accept(this), new BooleanType()) : "Expressão booleana esperada";
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		assert this.symbolTable.compareTypes(n.e1.accept(this), new IntegerType()) : "Inteiro esperado";
		assert this.symbolTable.compareTypes(n.e2.accept(this), new IntegerType()) : "Inteiro esperado";
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		assert this.symbolTable.compareTypes(n.e1.accept(this), new IntegerType()) : "Inteiro esperado";
		assert this.symbolTable.compareTypes(n.e2.accept(this), new IntegerType()) : "Inteiro esperado";
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		assert this.symbolTable.compareTypes(n.e1.accept(this), new IntegerType()) : "Inteiro esperado";
		assert this.symbolTable.compareTypes(n.e2.accept(this), new IntegerType()) : "Inteiro esperado";
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		assert this.symbolTable.compareTypes(n.e1.accept(this), new IntegerType()) : "Inteiro esperado";
		assert this.symbolTable.compareTypes(n.e2.accept(this), new IntegerType()) : "Inteiro esperado";
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		assert this.symbolTable.compareTypes(n.e1.accept(this), new IntArrayType()) : "IntArrayType esperado";
		assert this.symbolTable.compareTypes(n.e2.accept(this), new IntegerType()) : "Inteiro esperado";
		return new IntegerType();
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		assert this.symbolTable.compareTypes(n.e.accept(this), new IntArrayType()) : "IntArrayType esperado";
		return new IntegerType();
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {
		Type t = n.e.accept(this);
		if (n.e instanceof This)
			return this.currClass.getMethod(n.i.toString()).type();
		if (t instanceof IdentifierType) {
			Class cls = this.symbolTable.getClass(((IdentifierType) t).s);
			Method mtd = this.symbolTable.getMethod(n.i.toString(), cls.getId());
			Class curr = this.currClass;
			this.currClass = cls;
			for (int i = 0; i < n.el.size(); i++) {
				assert mtd.getParamAt(i) != null : "Parâmetro inválido ou ausente";
				assert this.symbolTable.compareTypes(mtd.getParamAt(i).type(), n.el.elementAt(i).accept(this)) : "Parâmetros com tipos inválidos";
			}
			assert mtd.getParamAt(n.el.size()) == null : "Parâmetro excedente";
			this.currClass = curr;
			return n.i.accept(this);
		}
		
		return this.currClass.getMethod(n.i.toString()).type();
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		if (n.s.equals("true")) return new True().accept(this);
		else if (n.s.equals("false")) return new False().accept(this);
		return this.symbolTable.getVarType(this.currMethod, this.currClass, n.s);
	}

	public Type visit(This n) {
		return this.currClass.type();
	}

	// Exp e;
	public Type visit(NewArray n) {
		if (this.currMethod.getId().equals("main")) {
			assert n.e.accept(this) instanceof IdentifierType : "Tamanho de array inválido nos parâmetros do método main";
			return n.e.accept(this);
		}
		assert this.symbolTable.compareTypes(n.e.accept(this), new IntegerType()) : String.format("Tamanho de array inválido (Classe %s, metodo %s)", this.currClass.getId(), this.currMethod.getId());
		return new IntArrayType();
	}

	// Identifier i;
	public Type visit(NewObject n) {
		return n.i.accept(this);
	}

	// Exp e;
	public Type visit(Not n) {
		assert this.symbolTable.compareTypes(n.e.accept(this), new BooleanType()) : "Negando tipo não booleano";
		return new BooleanType();
	}

	// String s;
	public Type visit(Identifier n) {
		String i = n.toString();
		if (this.symbolTable.containsClass(i)) return new IdentifierType(i);
		if (this.currClass.containsMethod(i)) return this.currClass.getMethod(i).type();
		if (this.currClass.containsVar(i)) return this.currClass.getVar(i).type();
		if (this.currMethod.containsVar(i)) return this.currMethod.getVar(i).type();
		if (this.currMethod.containsParam(i)) return this.currMethod.getParam(i).type();
		return this.symbolTable.getVarType(this.currMethod, this.currClass, i);
//		if (this.currClass.containsVar(i)) 
//			return this.symbolTable.getVarType(this.currMethod, this.currClass, i);
//		if (this.currClass.containsMethod(i))
//			return this.symbolTable.getMethodType(i, this.currClass.getId());
//		if (this.currMethod != null) {
//			if (this.currMethod.containsVar(i))
//				return this.currMethod.getVar(i).type();
//			if (this.currMethod.containsParam(i))
//				return this.currMethod.getParam(i).type();
//		}
//		// is class?
//		Class cls = this.symbolTable.getClass(i);
//		if (cls == null) throw new Error(String.format("Identificador %s não existe", i));
//		return cls.type();
	}
}
