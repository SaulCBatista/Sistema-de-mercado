package br.ufal.arapacomp.PFPOO.Control;

import java.util.ArrayList;
import java.util.List;

import br.ufal.aracomp.PFPOO.Model.AdministradorModel;

public class Administrador {

	private List<AdministradorModel> administrador = new ArrayList<AdministradorModel>();;
	private AdministradorModel administradorPadrão = new AdministradorModel("padrao@gmail.com", "123456", "padrao");
	
	public Administrador() {
	}
	
	public void cadastrarAdministrador(AdministradorModel administradorModel) {
		this.administrador.add(administradorModel);
	}
}
