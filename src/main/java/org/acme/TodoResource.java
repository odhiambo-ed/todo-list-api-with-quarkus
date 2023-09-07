package org.acme;

import java.util.ArrayList;

import io.quarkus.arc.lookup.LookupIfProperty.List;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TodoResource {
    // TODO Auto-generated
    private List<Todo> todos = new ArrayList<>();

    @GET
    public List<Todo> listTodos() {
        return todos;
    }

    @POST
    public Todo addTodo(Todo todo) {
        // Generate a unique ID for the todo (e.g., UUID)
        // Add the todo to the list
        todos.add(todo);
        return todo;
    }

    @PUT
    @Path("/{id}")
    public Todo updateTodo(@PathParam("id") String id, Todo updatedTodo) {
        // Find and update the todo with the given ID
        // Return the updated todo
        return updatedTodo;
    }

    @DELETE
    @Path("/{id}")
    public void deleteTodo(@PathParam("id") String id) {
        // Remove the todo with the given ID from the list
    }


}
