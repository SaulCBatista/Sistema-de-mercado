package br.ufal.arapacomp.PFPOO.Control;

import java.util.ArrayList;
import java.util.List;

import br.ufal.aracomp.PFPOO.Model.ClienteModel;

public class Cliente {

	private List<ClienteModel> cliente = new ArrayList<ClienteModel>();
	
	public Cliente() {
	}
	
	public void cadastrarCliente(ClienteModel clienteModel) {
		cliente.add(clienteModel);
		System.out.println("Cliente cadastrado com sucesso!");
	}
}
