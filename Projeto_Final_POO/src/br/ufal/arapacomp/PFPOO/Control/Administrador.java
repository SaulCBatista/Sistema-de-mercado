package br.ufal.arapacomp.PFPOO.Control;

import java.util.ArrayList;
import java.util.List;

import br.ufal.aracomp.PFPOO.Model.AdministradorModel;

public class Administrador {

	private List<AdministradorModel> administrador = new ArrayList<AdministradorModel>();;
	private AdministradorModel administradorPadrão;
	
	public Administrador(String login, String senha, String nome) {
		administradorPadrão = new AdministradorModel(login, senha, nome);
	}
	
	public void cadastrarAdministrador(AdministradorModel administradorModel) {
		this.administrador.add(administradorModel);
	}
	
	public Boolean verificarAdmPadrao(String login, String senha) {
		boolean autetico = false;
		
		if ((login.equals(this.administradorPadrão.getLogin())) && (senha.equals(this.administradorPadrão.getSenha()) )) {
			autetico = true;
		}
		
		return autetico;
	}
}
