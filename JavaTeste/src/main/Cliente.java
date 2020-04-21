package main;

public class Cliente {
	
	private String nome;
	private String email;
	private PerfilEnum perfil;
	
	public Cliente(String nome, String email, PerfilEnum perfil) {
		this.nome = nome;
		this.email = email;
		this.perfil = perfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmial() {
		return email;
	}

	public void setEmial(String emial) {
		this.email = emial;
	}

	public PerfilEnum getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEnum perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", perfil=" + perfil + "]";
	}
	
	
	
	

}
