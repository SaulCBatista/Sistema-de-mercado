package br.ufal.arapacomp.PFPOO.Control;

import java.util.ArrayList;
import java.util.List;

import br.ufal.aracomp.PFPOO.Model.AdministradorModel;

public class Administrador {

	private AdministradorModel administradorPadrão;
	
	public Administrador(String login, String senha, String nome) {
		administradorPadrão = new AdministradorModel(login, senha, nome);
	}
	
	public Boolean verificarAdministrador(String login, String senha) {
		boolean autetico = false;
		
		if ((login.equals(this.administradorPadrão.getLogin())) && (senha.equals(this.administradorPadrão.getSenha()) )) {
			autetico = true;
		}
		
		return autetico;
	}
}
