package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {
	public double getBonificacao(){
		return getSalario()*0.1 + 1000;
	}
	
}
