package me.anthonybruno.todo.model;

import java.util.Date;

public class TodoItem {

    private long id;
    private boolean done;
    private String text;
    private Date dateAdded;

    public TodoItem() {

    }

    public TodoItem(long id, boolean done, String text, Date dateAdded) {
        this.id = id;
        this.done = done;
        this.text = text;
        this.dateAdded = dateAdded;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
