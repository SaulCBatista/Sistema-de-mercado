package br.ufal.arapacomp.PFPOO.Control;

import java.util.ArrayList;
import java.util.List;

import br.ufal.aracomp.PFPOO.Model.ProdutoModel;

public class Produto {

	private List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();
	
	public Produto() {
	}
	
	public void cadastrarProduto(ProdutoModel produtoModel) {
		this.produtos.add(produtoModel);
		System.out.println("Produto cadastrado com sucesso!");
	}
	
	public void listarProdutos() {
		for(ProdutoModel produto : produtos) {			
			System.out.println("ID: " + produto.getID() + "Nome: " + produto.getNome() + "Preço de compra: " + produto.getPrecoCompra() + "Preço de venda: " + produto.getPrecoVenda());
		}
	}
}
