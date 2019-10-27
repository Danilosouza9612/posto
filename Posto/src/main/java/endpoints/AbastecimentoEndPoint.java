package endpoints;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import controller.AbastecimentoController;
import model.Abastecimento;

@Path("/abastecimento")
public class AbastecimentoEndPoint {
	private AbastecimentoController context;
	
	public AbastecimentoEndPoint() throws SQLException {
		this.context = new AbastecimentoController();
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String novoAbastecimento(String json) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		this.context.novoAbastecimento(mapper.readValue(json, Abastecimento.class));
		return "Inserido inventário com sucesso";
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String listarAbastecimentos(String json) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		ListarAbastecimentoParam param = mapper.readValue(json, ListarAbastecimentoParam.class);
		return mapper.writeValueAsString(this.context.listarAbastecimentos(param.getData(), param.getPostoId()));
	}
}
