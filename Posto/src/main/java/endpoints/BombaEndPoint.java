package endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import controller.BombaController;

@Path("/bombas")
public class BombaEndPoint {
	private BombaController context;
	
	public BombaEndPoint() {
		this.context = new BombaController();
	}
	@Path("/poucaquantidade")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String bombasComPoucaQuantidade() throws JsonProcessingException, Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(this.context.bombasComPoucaQuantidade());
	}
}
