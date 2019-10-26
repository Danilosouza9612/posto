package model;

import java.util.Date;

public class Abastecimento{
	private int id;
	private Date data;
	private float preco;
	private float qtdLitros;
	private Cliente cliente;
	private Bomba bomba;
	
	
	public Abastecimento(int id, Date data, float preco, float qtdLitros, Cliente cliente, Bomba bomba) {
		this.id = id;
		this.data = data;
		this.preco = preco;
		this.qtdLitros = qtdLitros;
		this.cliente = cliente;
		this.bomba = bomba;
	}

	public Abastecimento() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		if(preco>0) {
			this.preco = preco;
		}else {
			throw new IllegalArgumentException("O preço não deve ser menor ou igual a zero");
		}
	}
	public float getQtdLitros() {
		return qtdLitros;
	}
	public void setQtdLitros(float qtdLitros) {
		if(qtdLitros>0) {
			this.qtdLitros = qtdLitros;
		}else {
			throw new IllegalArgumentException("O preço não deve ser menor ou igual a zero");
		}
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Bomba getBomba() {
		return bomba;
	}
	public void setBomba(Bomba bomba) {
		this.bomba = bomba;
	}
	

}
