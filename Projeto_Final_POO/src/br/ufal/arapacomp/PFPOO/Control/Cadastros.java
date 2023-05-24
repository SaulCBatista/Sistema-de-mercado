package br.ufal.arapacomp.PFPOO.Control;

import br.ufal.aracomp.PFPOO.Model.CadastrosModel;

public class Cadastros {
	
	private Produto produto = Produto.instaciar();
	private Cliente cliente = Cliente.instaciar();
	private Administrador administrador = new Administrador("padrao@gmail.com", "123456", "padrao");
	
	public Cadastros() {
	}
	
	public void cadastrarCliente(String login, String senha, String nome) {
		CadastrosModel.criarCadastroCliente(login, senha, nome);
	}
	
	public Boolean verificarCliente(String login, String senha) {
		return cliente.verificarCliente(login, senha);
	}
	
	public Boolean verificarAdmPadrao(String login, String senha) {
		return administrador.verificarAdministrador(login, senha);
	}
	
	public void cadastrarProduto(String nome, double precoCompra, double PrecoVenda) {
		CadastrosModel.criarCadastroProduto(nome, precoCompra, PrecoVenda);
	}
	
	public void cadastrarEndereco(int cep, String bairro, String rua, int numero) {
		CadastrosModel.criarCadastroEndereco(cep, bairro, rua, numero);
	}
	
	public void listarProdutosAdm() {
		produto.listarProdutosAdm();
	}
	
	public void listaProdutosCliente() {
		produto.listarProdutosCliente();
	}
}