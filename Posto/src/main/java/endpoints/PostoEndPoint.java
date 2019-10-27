package endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import controller.PostoController;

@Path("/posto")
public class PostoEndPoint {
	private PostoController context;
	
	public PostoEndPoint() {
		this.context = new PostoController();
	}
	@Path("/faturamentos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String listarFaturamentos() throws JsonProcessingException, Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(context.listarFaturamentos());
	}
}
