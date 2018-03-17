package br.com.caelum.contas.modelo;

/**
 * 
 * @author Rodrigo Salinas
 *
 */
public abstract class Conta {

	public abstract String getTipo();// {
	// return "Conta";
	// }

	private int numero;
	private String agencia;
	private String titular;
	protected double saldo;
	private double limite;
	private Data dataDeAbertura;

	// Numero
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	// Agencia
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAgencia() {
		return agencia;
	}

	// Titular
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	// Não vamos usar o setSaldo, pois o usuario pode mudar saldo.
	/*
	 * public void setSaldo(double saldo){ this.saldo = saldo; }
	 */
	// Saldo
	public double getSaldo() {
		return saldo;
	}

	// Limite
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	// Data
	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}

	// Construtor - Segundo JavaBeans, deve criar um construtor vazio, ou seja,
	// sem parâmetro.
	public Conta() {
		limite = 1000;
	}

	// Construtor passando como parâmetro o Titular, ou seja, obrigando que
	// tenha o Titular quando a conta seja criada.
	public Conta(String titular) {
		this.titular = titular;
	}

	/**
	 * 
	 * @param valor
	 *            Valor a ser sacado da conta
	 * @return true se sacou
	 */
	public boolean saca(double valor) {
		// saldo + limite >= valor - foi criado desta forma para que quando
		// tentar sacar um valor negativo, não deva ficar com saldo positivo, ou
		// seja, menos com menos = mais.
		if (valor > 0 && saldo + limite >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voce tentou depositar " + valor + ". Favor depositar valor positivo");
		} else {
			saldo += valor;
		}
	}

	public double calculaRendimento() {
		double calcula;
		calcula = saldo * 0.1;
		return calcula;
		// return saldo * 0.1 - poderia fazer assim também. Mais sucinto.
	}

	String recuperaDadosParaImpressao() {
		String dados = "Titular: " + titular;
		dados += "\nSaldo: " + saldo;
		dados += "\n" + dataDeAbertura.formataData();
		dados += "\n-------------";
		return dados;
	}

	public void transfere(Conta destino, double valor) {
		if (saca(valor)) {
			destino.deposita(valor);
		}

	}

	/*
	 * public void transfere(double valor, Conta conta){ this.saca(valor);
	 * conta.deposita(valor); }
	 */

}