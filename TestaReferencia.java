class TestaReferencia{
	public static void main(String[] args){
	
	Conta c1 = new Conta();
	c1.numero = 10;
	c1.titular = "Salinas";

	Conta c2 = new Conta();
	c2.numero = 10;
	c2.titular = "Salinas";

	System.out.println(c1==c2);//Vai dar false, porque a referencia destas duas contas são diferentes.Desenho no caderno.

	c1=c2;//c1 pegou a referencia do objeto do c2.
	c2.numero = 20;
	System.out.println(c1.numero);
}}
