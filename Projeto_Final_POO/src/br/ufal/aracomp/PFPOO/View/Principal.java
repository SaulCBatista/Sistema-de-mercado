package br.ufal.aracomp.PFPOO.View;

import br.ufal.arapacomp.PFPOO.Control.Cadastros;

public class Principal {
	
	public static void main(String[] args) {
		
		TelaLogin tela = new TelaLogin();
		tela.iniciar();
		
		Cadastros cadastros = new Cadastros();
		cadastros.cadastrarCliente("cliente@gmail.com", "cliente", "cliente");
		cadastros.cadastrarProduto("Macarrão", 2, 2.49);
		cadastros.cadastrarProduto("Molho de tomate", 1, 1.49);
		cadastros.cadastrarProduto("Sorvete", 7, 9.99);
		cadastros.cadastrarProduto("Miojo", 1, 1.99);
	}
}