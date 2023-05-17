 package br.ufal.aracomp.PFPOO.Control;

public class Cadastros {

	private static int quantClientes;
	private static int quantProdutos;
	private static int quantFuncionarios;
	
	private Cadastros () {
		
	}
	
	public static Cliente cadastrarCliente(String login, String senha, String nome) {
		quantClientes++;
		return new Cliente(login, senha, nome);
	}
	
	public static Endereco cadastrarEndereco(int cep, String bairro, String rua, int numero) {
		quantProdutos++;
		return new Endereco(cep, bairro, rua, numero);
	}
	
	public static Produto cadastrarProduto(String nome, double precoCompra, double precoVenda) {
		quantFuncionarios++;
		return new Produto(quantProdutos, nome, precoCompra, precoVenda);
	}
	
	public static int quantClientes() {
		return quantClientes;
	}
	
	public static int quantProdutos() {
		return quantProdutos;
	}
	
	public static int quantFuncionarios() {
		return quantFuncionarios;
	}
}
