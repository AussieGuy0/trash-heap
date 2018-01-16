package au.com.anthonybruno.temptodo.todo;

import java.util.List;

public class TodoList {

    private final String id;
    private final List<TodoItem> todoItems;

    public TodoList(String id, List<TodoItem> todoItems) {
        this.id = id;
        this.todoItems = todoItems;
    }

    public String getId() {
        return id;
    }

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }
}
