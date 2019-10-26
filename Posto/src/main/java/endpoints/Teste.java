package endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Teste")
public class Teste {
	
	@GET
	public String teste() {
		return "Teste";
	}
}
