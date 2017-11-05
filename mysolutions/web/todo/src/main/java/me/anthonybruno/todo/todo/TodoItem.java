package me.anthonybruno.todo.todo;

import me.anthonybruno.todo.login.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "todo")
public class TodoItem {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private boolean done;

    @Column
    private String text;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dateAdded;

    @ManyToOne
    @JoinColumn(name = "username")
    private User author;

    public TodoItem() {

    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
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
