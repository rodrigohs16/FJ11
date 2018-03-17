class TestaContaComModificador{
	public static void main(String[] args){

	/*	Conta c1 = new Conta();
		c1.setNumero(50);
		c1.setTitular("Salinas");
		c1.deposita(5000);
		c1.setLimite(1000);	

		System.out.println(c1.getTitular() + " " + c1.getSaldo());*/

		//Traz o limite, pois o construtor está declarado na classe Conta. O objeto criado aqui está sem o parâmetro da referência da Conta, fazendo com que pegue o limite do construtor
		Conta contaComLimite = new Conta();
		System.out.println(contaComLimite.getLimite());
		
		//Este limite vai trazer 0, pois foi criado o objeto contaComTitular, passando como parâmetro a classe Conta(com_parâmetro); Ex:Conta("Salinas").
		Conta contaComTitular = new Conta("Salinas");
		System.out.println(contaComTitular.getTitular());
		System.out.println(contaComTitular.getLimite());
	}
}
