package model;

import java.util.Date;

public class AbastecimentoBomba {
	private int id;
	private Bandeira bandeira;
	private Bomba bomba;
	private Date data;
	private float qtdLitros;
	private float preco;
	
	public AbastecimentoBomba() {
		
	}
	public AbastecimentoBomba(int id, Bandeira bandeira, Bomba bomba, Date data, float qtdLitros, float preco) {
		this.id = id;
		this.bandeira = bandeira;
		this.bomba = bomba;
		this.data = data;
		this.qtdLitros = qtdLitros;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Bandeira getBandeira() {
		return bandeira;
	}
	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	public Bomba getBomba() {
		return bomba;
	}
	public void setBomba(Bomba bomba) {
		this.bomba = bomba;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getQtdLitros() {
		return qtdLitros;
	}
	public void setQtdLitros(float qtdLitros) {
		this.qtdLitros = qtdLitros;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
