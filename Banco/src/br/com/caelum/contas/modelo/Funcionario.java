package br.com.caelum.contas.modelo;

public abstract class Funcionario {
	private int maticula;
	private String nome;
	private String cpf;
	private String rg;
	private String cargo;
	private double salario;
	
	
	public int getMaticula() {
		return maticula;
	}
	public void setMaticula(int maticula) {
		this.maticula = maticula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonificacao();	
   
}
