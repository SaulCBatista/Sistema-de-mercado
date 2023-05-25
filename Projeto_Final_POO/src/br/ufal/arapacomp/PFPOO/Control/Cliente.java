package br.ufal.arapacomp.PFPOO.Control;

import java.util.ArrayList;
import java.util.List;

import br.ufal.aracomp.PFPOO.Model.ClienteModel;

public class Cliente {

	private List<ClienteModel> clientes = new ArrayList<ClienteModel>();
	private static Cliente cliente;
	
	private Cliente() {
	}
	
	public static Cliente instaciar() {
		if(cliente == null) {
			cliente = new Cliente();
		}
		return cliente;
	}
	
	public void cadastrarCliente(ClienteModel clienteModel) {
		clientes.add(clienteModel);
	}
	
	public Boolean verificarCliente(String login, String senha) {
		boolean autetico = false;
		
		for(ClienteModel cliente : clientes) {
			if(login.equals(cliente.getLogin()) && senha.equals(cliente.getSenha())) {
				autetico = true;
			}
		}
		return autetico;
	}
}
