package jackzhang.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.Path;

@Path("/todo")
public class TodoResource {
	// This method is called if XML is request
	@GET
	@Produces({ MediaType.APPLICATION_XML})
	public Todo getXML() {
		Todo todo = new Todo();
		todo.setName("First todo");
		todo.setSummary("This is my first todo");
		todo.setDescription("This is my first todo");
		return todo;
	}

	// This method is called if JSON is request
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Todo getJSON() {
		Todo todo = new Todo();
		todo.setName("First todo");
		todo.setSummary("This is my first todo");
		todo.setDescription("This is my first todo");
		return todo;
	}

	// This can be used to test the integration with the browser
	@GET
	@Produces({ MediaType.TEXT_XML })
	public Todo getHTML() {
		Todo todo = new Todo();
		todo.setName("First todo");
		todo.setSummary("This is my first todo");
		todo.setDescription("This is my first todo");
		return todo;
	}
}