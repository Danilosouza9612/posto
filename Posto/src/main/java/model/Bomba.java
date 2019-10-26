package model;

public class Bomba {
	private int id;
	private Posto posto;
	private Combustivel combustivel;
	private float preco;
	private float qtdRestante;
	
	public Bomba() {
		
	}
	
	
	public Bomba(int id, Posto posto, Combustivel combustivel, float preco, float qtdRestante) {
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
