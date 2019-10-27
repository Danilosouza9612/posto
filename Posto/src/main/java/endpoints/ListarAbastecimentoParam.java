package endpoints;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class ListarAbastecimentoParam {
	@JsonDeserialize(using = DateDeserialize.class)
	private Date data;
	private int postoId;
	
	@JsonCreator
	public ListarAbastecimentoParam(@JsonProperty("data") Date data,
									@JsonProperty("postoId")int postoId) {
		this.data = data;
		this.postoId = postoId;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getPostoId() {
		return postoId;
	}

	public void setPostoId(int postoId) {
		this.postoId = postoId;
	}
	
	
	
}
