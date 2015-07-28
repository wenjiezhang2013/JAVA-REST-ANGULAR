package jackzhang.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.Path;

@Path("hello")
public class HelloWorldResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayhello() {
	   return "hello";
	}
}