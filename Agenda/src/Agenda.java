
public class Agenda {

	public static void main(String[] args) {
		
		System.out.println("Agenda de contatos");
		
		Contato contato = new Contato();
		
		contato.setNome("Salinas");
		contato.setTelefone("12345678");
		
		System.out.println(contato.getNome());
		
		System.out.println(contato.imprimeTudao());
	}

}
