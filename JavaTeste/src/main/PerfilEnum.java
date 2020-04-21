package main;

public enum PerfilEnum {
	
	GERENTE(1, "gerent")
	,USUARIO (2, "usuario")
	,CLIENTE (3, "cliente");
	
	private int cod;
	private String descricao;
	
	private PerfilEnum (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
