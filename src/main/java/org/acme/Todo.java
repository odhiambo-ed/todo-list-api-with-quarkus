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
    public String getId() {
        return id;
    }

    // Getter for the title
    public String getTitle() {
        return title;
    }

    // Getter for the completed
    public boolean isCompleted() {
        return completed;
    }
}
