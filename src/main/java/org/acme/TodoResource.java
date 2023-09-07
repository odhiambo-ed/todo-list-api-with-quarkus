package org.acme;

import io.quarkus.arc.lookup.LookupIfProperty.List;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TodoResource {
    // TODO Auto-generated
    private List<Todo> todos = new ArrayList<>();

    @GET
    public List<Todo> getTodos() {
        return todos;
    }
}
