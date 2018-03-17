class ExercicioX{
	public static void main (String [] args){
	
//Exercício 1
	/*for(int i=150; i<301; i++){
		System.out.println(i);	
	}*/
	
//Exercício 2
/*	int soma = 0;	

	for(int i=0; i<=1000; i++){

	soma += i;	}
	System.out.println(soma);

*/

//Exercício 3
/*
	for(int i=3; i<=100; i++){
		if(i % 3 == 0){
		System.out.println(i);	
			}
		}
*/

//Exercício 4
//foi colocado long na variável fatorial, porque a variável int não suporta mais que 4 bytes. Se trocar n<=20 por n<=10, poderá usar a variável int.
/*	long fatorial = 1;
	
	for(int n = 1; n<=20; n++){
	fatorial *= n;
	System.out.println(fatorial);
	}
*/
//Exercício 5
	for(int a=0, b=1, i=0; i<15; b+=a, a=b-a, i++) {
			System.out.print(a + " ");
		}  

	}
}
