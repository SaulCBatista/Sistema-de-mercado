package br.ufal.arapacomp.PFPOO.Control;

import br.ufal.aracomp.PFPOO.Model.CadastrosModel;

public class Cadastros {
	
	private Produto produto = new Produto();
	private Administrador administrador = new Administrador("padrao@gmail.com", "123456", "padrao");
	
	public Cadastros() {
	}
	
	public void cadastrarCliente(String login, String senha, String nome) {
		CadastrosModel.criarCadastroCliente(login, senha, nome);
	}
	
	public void cadastrarAdministrador(String login, String senha, String nome) {
		CadastrosModel.criarCadastroAdministrador(login, senha, nome);
	}
	
	public void cadastrarProduto(String nome, double precoCompra, double PrecoVenda) {
		CadastrosModel.criarCadastroProduto(nome, precoCompra, PrecoVenda);
	}
	
	public void cadastrarEndereco(int cep, String bairro, String rua, int numero) {
		CadastrosModel.criarCadastroEndereco(cep, bairro, rua, numero);
	}
	
	public void listarProdutos() {
		produto.listarProdutos();
	}
	
	public Boolean verificarAdmPadrao(String login, String senha) {
		return administrador.verificarAdmPadrao(login, senha);
	}
}