 package br.ufal.aracomp.PFPOO.Control;

public class Cliente {
	private String login;
	private String senha;
	private String nome;
	
	public Cliente(String login, String senha, String nome) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
