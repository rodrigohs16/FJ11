package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel, Comparable {

	@Override
	public boolean saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voce tentou sacar " + valor + ". Favor sacar valor positivo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor + 0.10);
		return true;
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public int compareTo(Object o) {
		//if(o intanceof Conta){}
		ContaCorrente cc = (ContaCorrente)o;
		return (int) (getSaldo() - cc.getSaldo());
				
	}

}
