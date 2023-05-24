package br.ufal.arapacomp.PFPOO.Control;

import java.util.List;

import br.ufal.aracomp.PFPOO.Model.CadastrosModel;
import br.ufal.aracomp.PFPOO.Model.ClienteModel;

public class Cadastros {
	
	private Produto produto = new Produto();
	
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
}