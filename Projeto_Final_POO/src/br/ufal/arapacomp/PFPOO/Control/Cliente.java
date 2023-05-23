package br.ufal.arapacomp.PFPOO.Control;

import java.util.List;

public class Cliente {

	private List<Cliente> cliente;
	
	public Cliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	public void cadastrarCliente(Cliente clienteModel) {
		this.cliente.add(clienteModel);
	}
}
