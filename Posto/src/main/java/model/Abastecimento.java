package model;

import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Abastecimento{
	private int id;
	private Date data;
	private float preco;
	private float qtdLitros;
	private Cliente cliente;
	private Bomba bomba;
	
	@JsonCreator
	public Abastecimento(@JsonProperty("id") int id,
						 @JsonProperty("qtdLitros") float qtdLitros, 
						 @JsonProperty("cliente") Cliente cliente, 
						 @JsonProperty("bomba") Bomba bomba) {
		this.id=id;
		this.data = Calendar.getInstance().getTime();
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
