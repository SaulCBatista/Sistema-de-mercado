package br.ufal.arapacomp.PFPOO.Control;

import java.util.ArrayList;
import java.util.List;

import br.ufal.aracomp.PFPOO.Model.ProdutoModel;

public class Produto {

	private List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();
	private static Produto produto;
	
	private Produto() {
	}
	
	public static Produto instaciar() {
		if(produto == null) {
			produto = new Produto();
		}
		return produto;
	}
	
	public void cadastrarProduto(ProdutoModel produtoModel) {
		this.produtos.add(produtoModel);
	}
	
	public void listarProdutosAdm() {
		for(ProdutoModel produto : produtos) {			
			System.out.println("ID: " + produto.getID() + " | Nome: " + produto.getNome() + " | Preço de compra: " + produto.getPrecoCompra() + " | Preço de venda: " + produto.getPrecoVenda());
		}
	}
	
	public void listarProdutosCliente() {
		for(ProdutoModel produto : produtos) {			
			System.out.println("ID: " + produto.getID() + " | Nome: " + produto.getNome() + " | Preço de venda: " + produto.getPrecoVenda());
		}
	}
	
	public double vender(String ID, String nome) {
		double total = 0;
		for(ProdutoModel produto : produtos) {			
			if(ID.equals(Integer.toString(produto.getID())) || (nome.equalsIgnoreCase(produto.getNome()))) {
				total = produto.getPrecoVenda();
			}
		}
		return total;
	}
}
