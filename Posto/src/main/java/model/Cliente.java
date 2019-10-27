package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	
	public Cliente() {
		
	}
	@JsonCreator
	public Cliente(@JsonProperty("id") int id, 
				   @JsonProperty("nome") String nome, 
				   @JsonProperty("cpf") String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	

}
