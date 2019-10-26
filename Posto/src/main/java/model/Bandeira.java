package model;

public class Bandeira {
	private int id;
	private String nome;
	private String url;
	
	public Bandeira() {
	}
	
	public Bandeira(int id, String nome, String url) {
		super();
		this.id = id;
		this.nome = nome;
		this.url = url;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
