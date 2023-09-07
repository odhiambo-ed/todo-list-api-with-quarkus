package org.acme;

public class Todo {
    // TODO Auto-generated constructor stub
    private String id;
    private String title;
    private boolean completed;

    // No-arg constructor
    public Todo() {
    }

    public Todo(String id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    // Getter for the id
    public void getId() {
        return id;
    }
}
