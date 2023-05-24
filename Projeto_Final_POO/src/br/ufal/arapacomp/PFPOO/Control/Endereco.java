package br.ufal.arapacomp.PFPOO.Control;

import java.util.List;

import br.ufal.aracomp.PFPOO.Model.EnderecoModel;

public class Endereco {

	private List<EnderecoModel> endereco;
	
	public Endereco() {
	}
	
	public void cadastrarEndereco(EnderecoModel enderecoModel) {
		this.endereco.add(enderecoModel);
	}
}
