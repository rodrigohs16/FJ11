class TestaConta{
	public static void main(String[] args){

		Conta c1 = new Conta();
		c1.numero = 224;
		c1.agencia = "03431-0";
		c1.titular = "Salinas";
		c1.deposita(20000.0);
		c1.limite = 5000.0;
		//c1.data_aber = "24/02/2018";
		Data data = new Data();//ligacão
		c1.dataDeAbertura = data;

	 	//Mostra o valor da conta
		c1.recuperaDadosParaImpressao();
	
		//Sacando 10.000
		//c1.saca(30000);- Não foi mais usado, pois o foi usado o código mais abaixo.
	
		//Mostra o valor com valor sacado
		c1.recuperaDadosParaImpressao();

		boolean sacou = c1.saca(1000);
		if(sacou){
			System.out.println("Sacado");
		}else{
			System.out.println("Não foi possível sacar.");
			}
		
	
		System.out.println("Rendimento mensal: " + c1.calculaRendimento());
		System.out.println(c1.recuperaDadosParaImpressao());
	}
}
