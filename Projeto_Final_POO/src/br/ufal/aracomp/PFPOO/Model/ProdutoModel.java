package br.ufal.aracomp.PFPOO.Model;

public class ProdutoModel {
	
	private int ID;
	private String nome;
	private double precoCompra;
	private double precoVenda;
	
	ProdutoModel(int ID, String nome, double precoCompra, double precoVenda) {
		this.ID = ID;
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCompra() {
		return this.precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPrecoVenda() {
		return this.precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
}
