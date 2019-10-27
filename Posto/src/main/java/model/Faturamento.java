package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Faturamento {
	private Posto posto;
	private float faturamento;
	
	@JsonIgnore
	public Posto getPosto() {
		return posto;
	}
	@JsonProperty("posto")
	public String getNomePosto() {
		return this.posto.getNomeFantasia();
	}
	public void setPosto(Posto posto) {
		this.posto = posto;
	}
	public float getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(float faturamento) {
		this.faturamento = faturamento;
	}
}
