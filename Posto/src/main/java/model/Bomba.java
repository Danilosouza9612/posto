package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Bomba {
	private int id;
	private Posto posto;
	private Combustivel combustivel;
	private float preco;
	private float qtdRestante;
	
	public Bomba() {
		
	}
	
	@JsonCreator
	public Bomba(@JsonProperty("id") int id,
				 @JsonProperty("posto") Posto posto, 
				 @JsonProperty("combustivel") Combustivel combustivel, 
				 @JsonProperty("preco") float preco, 
				 @JsonProperty("qtdRestante") float qtdRestante) {
		this.id = id;
		this.posto = posto;
		this.combustivel = combustivel;
		this.preco = preco;
		this.qtdRestante = qtdRestante;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Posto getPosto() {
		return posto;
	}
	public void setPosto(Posto posto) {
		this.posto = posto;
	}
	public Combustivel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getQtdRestante() {
		return qtdRestante;
	}
	public void setQtdRestante(float qtdRestante) {
		this.qtdRestante = qtdRestante;
	}
}
