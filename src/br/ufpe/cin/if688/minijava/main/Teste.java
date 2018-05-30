package br.ufpe.cin.if688.minijava.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import br.ufpe.cin.if688.minijava.antlr.MiniJavaLexer;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaParser.GoalContext;

public class Teste {
	
	@Test
    public void Teste() throws Exception {
		File folder = new File("src/test/resources");
		File[] files = folder.listFiles();
		
		for (File file : files) {
			if (file.isFile()) {
				System.out.printf("Analisando o arquivo %s\n", file);
				InputStream stream = new FileInputStream(file);
				ANTLRInputStream input = new ANTLRInputStream(stream);
				MiniJavaLexer lexer = new MiniJavaLexer(input);
				CommonTokenStream token = new CommonTokenStream(lexer);
				MiniJavaParser parser = new MiniJavaParser(token);
				parser.goal();
				assert parser.getNumberOfSyntaxErrors() == 0;
				System.out.printf("Terminou de analisar o arquivo %s\n", file);
			}
		}
    }

	public static void main(String[] args) throws Exception {
		File folder = new File("./resources");
		File[] files = folder.listFiles();
		
		for (File file : files) {
			if (file.isFile()) {
				System.out.printf("Analisando o arquivo %s\n", file);
				InputStream stream = new FileInputStream(file);
				ANTLRInputStream input = new ANTLRInputStream(stream);
				MiniJavaLexer lexer = new MiniJavaLexer(input);
				CommonTokenStream token = new CommonTokenStream(lexer);
				MiniJavaParser parser = new MiniJavaParser(token);
				parser.goal();
				assert parser.getNumberOfSyntaxErrors() == 0;
				System.out.printf("Terminou de analisar o arquivo %s\n", file);
			}
		}
	}
}


