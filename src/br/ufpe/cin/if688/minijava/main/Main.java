package br.ufpe.cin.if688.minijava.main;

import br.ufpe.cin.if688.minijava.ast.BooleanType;
import br.ufpe.cin.if688.minijava.ast.ClassDeclExtends;
import br.ufpe.cin.if688.minijava.ast.ClassDeclList;
import br.ufpe.cin.if688.minijava.ast.ClassDeclSimple;
import br.ufpe.cin.if688.minijava.ast.Identifier;
import br.ufpe.cin.if688.minijava.ast.IdentifierType;
import br.ufpe.cin.if688.minijava.ast.IntegerLiteral;
import br.ufpe.cin.if688.minijava.ast.IntegerType;
import br.ufpe.cin.if688.minijava.ast.MainClass;
import br.ufpe.cin.if688.minijava.ast.MethodDeclList;
import br.ufpe.cin.if688.minijava.ast.Print;
import br.ufpe.cin.if688.minijava.ast.Program;
import br.ufpe.cin.if688.minijava.ast.VarDecl;
import br.ufpe.cin.if688.minijava.ast.VarDeclList;
import br.ufpe.cin.if688.minijava.visitor.PrettyPrintVisitor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import br.ufpe.cin.if688.minijava.antlr.MiniJavaLexer;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser;
import br.ufpe.cin.if688.minijava.antlr.MyVisitor;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.GoalContext;


public class Main {

	public static void main(String[] args) throws IOException {
		MainClass main = new MainClass(
				new Identifier("Teste"), 
				new Identifier("Testando"), 
				new Print(new IntegerLiteral(2))
		);
		
		VarDeclList vdl1 = new VarDeclList();
		vdl1.addElement(new VarDecl(
			new BooleanType(),
			new Identifier("flag")
		));
		vdl1.addElement(new VarDecl(
				new IntegerType(),
				new Identifier("num")
		));
		
		MethodDeclList mdl = new MethodDeclList();
		
		ClassDeclSimple A = new ClassDeclSimple(
				new Identifier("A"), vdl1, mdl
		);
		
		ClassDeclExtends B = new ClassDeclExtends(
				new Identifier("B"), new Identifier("A"), 
				new VarDeclList(), new MethodDeclList()
		);
		
		VarDeclList vdl2 = new VarDeclList();
		vdl2.addElement(new VarDecl(
				new IdentifierType("A"),
				new Identifier("obj")
		));
		ClassDeclSimple C = new ClassDeclSimple(
				new Identifier("C"), vdl2, new MethodDeclList()
		);
		
		ClassDeclList cdl = new ClassDeclList();
		cdl.addElement(A);
		cdl.addElement(B);
		cdl.addElement(C);

//		Program p = new Program(main, cdl);
//
//		PrettyPrintVisitor ppv = new PrettyPrintVisitor();
//		ppv.visit(p);
		
		File folder = new File("./resources");
		File[] files = folder.listFiles();
		
		for (File file : files) {
			if (file.isFile()) {
				System.out.printf("Analisando o arquivo %s\n", file);
				InputStream stream = new FileInputStream(file);
				ANTLRInputStream input = new ANTLRInputStream(stream);
				MiniJavaLexer lexer = new MiniJavaLexer(input);
				CommonTokenStream token = new CommonTokenStream(lexer);
//				MiniJavaParser parser = new MiniJavaParser(token);
				Program prog = (Program) new MyVisitor().visit(new MiniJavaParser(token).goal());
				prog.accept(new PrettyPrintVisitor());
				System.out.printf("Terminou de analisar o arquivo %s\n", file);
			}
		}
		
		
//		Program p;
	}

}
