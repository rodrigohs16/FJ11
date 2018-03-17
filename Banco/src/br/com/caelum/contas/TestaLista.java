package br.com.caelum.contas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestaLista {

	public static void main(String[] args) {
		List <String> lista = new LinkedList<>();
		
		lista.add("Paulo");
		lista.add("Guilherme");
		lista.add("Carlos");
		//lista.add(38);
		
		System.out.println(lista);
		System.out.println(lista.contains("Paulo"));
		
		lista.remove("Guilherme");
		System.out.println(lista);
		
		System.out.println(lista.size());
		
		Set<String> linguagem = new HashSet<>();
		linguagem.add("Java");
		linguagem.add("Cobol");
		linguagem.add("C");
		linguagem.add("Java");
		System.out.println(linguagem);
	}

}
