package br.com.caelum.contas;

import java.io.FileNotFoundException;

public class TestaErro {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		// try{
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		metodo1();
		// }catch(ArrayIndexOutOfBoundsException e){
		// e.printStackTrace();
		// }

		System.out.println("fim do main");

	}

	public static void metodo1() {
		System.out.println("Inicio do Metodo 1");
		// try{
		try {
			metodo2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// }catch(ArrayIndexOutOfBoundsException e){
		// e.printStackTrace();
		// }
		System.out.println("fim do metodo 1");
	}

	
	public static void metodo2() throws Exception {
		System.out.println("Inicio do metodo 2");
		int[] array = new int[10];
		
		try{
		for (int i = 0; i < 15; i++) {
			//try {
				array[i] = i * i;
				System.out.println(array[i]);}
			} catch (ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("Deu ruim");
			}
			
		
		System.out.println("fim do metodo 2");
	}

}