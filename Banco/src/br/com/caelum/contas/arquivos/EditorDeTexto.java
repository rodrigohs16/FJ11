package br.com.caelum.contas.arquivos;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class EditorDeTexto {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream("novo.txt");
		Scanner s = new Scanner (System.in);
		
		while(s.hasNextLine()){
			ps.println(s.nextLine());
		}
	}

}
