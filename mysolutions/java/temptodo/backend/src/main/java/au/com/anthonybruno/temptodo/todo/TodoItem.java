package au.com.anthonybruno.temptodo.todo;

public class TodoItem {

    private final long id;
    private final String text;
    private final boolean completed;

    public TodoItem(long id, String text, boolean completed) {
        this.id = id;
        this.text = text;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public boolean isCompleted() {
        return completed;
    }
}
