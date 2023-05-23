 package br.ufal.aracomp.PFPOO.Model;

import br.ufal.arapacomp.PFPOO.Control.Cliente;

public class Cadastros {

	private static int quantClientes;
	private static int quantProdutos;
	private static int quantAdministrador;
	
	private Cadastros () {
		
	}
	
	public static ClienteModel criarCadastroCliente(String login, String senha, String nome) {
		quantClientes++;
		return new ClienteModel(login, senha, nome);
	}
	
	public static AdministradorModel criarCadastroAdministrador(String login, String senha, String nome) {
		quantAdministrador++;
		return new AdministradorModel(login, senha, nome);
	}
	
	public static EnderecoModel criarCadastroEndereco(int cep, String bairro, String rua, int numero) {
		return new EnderecoModel(cep, bairro, rua, numero);
	}
	
	public static ProdutoModel criarCadastroProduto(String nome, double precoCompra, double precoVenda) {
		quantProdutos++;
		return new ProdutoModel(quantProdutos, nome, precoCompra, precoVenda);
	}
	
	public static int quantClientes() {
		return quantClientes;
	}
	
	public static int quantAdministrador() {
		return quantAdministrador;
	}
	
	public static int quantProdutos() {
		return quantProdutos;
	}
}
