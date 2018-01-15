package au.com.anthonybruno.temptodo.todo;

public class TodoItem {

    public final String text;
    public final boolean completed;

    public TodoItem(String text, boolean completed) {
        this.text = text;
        this.completed = completed;
    }

    public String getText() {
        return text;
    }

    public boolean isCompleted() {
        return completed;
    }
}
