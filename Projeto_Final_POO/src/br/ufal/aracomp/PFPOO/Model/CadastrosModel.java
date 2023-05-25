 package br.ufal.aracomp.PFPOO.Model;

import br.ufal.arapacomp.PFPOO.Control.Administrador;
import br.ufal.arapacomp.PFPOO.Control.Cliente;
import br.ufal.arapacomp.PFPOO.Control.Endereco;
import br.ufal.arapacomp.PFPOO.Control.Produto;

public class CadastrosModel {

	private static int quantClientes;
	private static int quantProdutos;
	private static int quantAdministrador;
	private static Cliente listaCliente = Cliente.instaciar();
	private static Administrador listaAdministrador = new Administrador("padrao@gmail.com", "123456", "padrao");
	private static Produto listaProduto = Produto.instaciar();
	private static Endereco listaEndereco = new Endereco();
	
	private CadastrosModel () {
	}
	
	public static ClienteModel criarCadastroCliente(String login, String senha, String nome) {
		quantClientes++;
		ClienteModel cliente = new ClienteModel(login, senha, nome);
		listaCliente.cadastrarCliente(cliente);
		return cliente;
	}
	
	public static EnderecoModel criarCadastroEndereco(int cep, String bairro, String rua, int numero) {
		EnderecoModel endereco = new EnderecoModel(cep, bairro, rua, numero);
		listaEndereco.cadastrarEndereco(endereco);
		return endereco;
	}
	
	public static ProdutoModel criarCadastroProduto(String nome, double precoCompra, double precoVenda) {
		quantProdutos++;
		ProdutoModel produto = new ProdutoModel(quantProdutos, nome, precoCompra, precoVenda);
		listaProduto.cadastrarProduto(produto);
		return produto;
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
