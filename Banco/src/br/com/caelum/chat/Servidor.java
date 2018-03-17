package br.com.caelum.chat;

import java.util.List;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {

	public static void main(String[] args) throws IOException {
		// inicia o servidor
		new Servidor(5234).executa();
	}

	private int porta;
	private List<PrintStream> clientes;

	public Servidor(int porta) {
		this.porta = porta;
		this.clientes = new ArrayList<PrintStream>();
	}

	public void executa() throws IOException {
		ServerSocket servidor = new ServerSocket(this.porta);
		System.out.println("Porta 12345 aberta!");

		while (true) {
			// aceita cliente
			Socket cliente = servidor.accept();
			System.out.println("Nova conexao com cliente " + cliente.getInetAddress().getHostAddress());

			// adiciona saida do cliente a lista
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			this.clientes.add(ps);

			// cria tratador de cliente numa nova thread
			TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);
			new Thread(tc).start();
		}
	}

	public void distribuiMensagem(String msg) {
		// envia msg para todo mundo
		System.out.println(msg);

		for (PrintStream cliente : this.clientes) {
			cliente.println(msg);
		}
	}

}
