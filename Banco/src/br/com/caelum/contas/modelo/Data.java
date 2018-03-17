package br.com.caelum.contas.modelo;
class Data{
	
	int dia;
	int mes;
	int ano;
	
	String formataData(){
		return dia + "/" + mes + "/" + ano; 
	}
}