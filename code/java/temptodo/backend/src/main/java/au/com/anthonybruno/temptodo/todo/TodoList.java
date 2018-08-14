package au.com.anthonybruno.temptodo.todo;

import java.util.List;
import java.util.Optional;

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

    public Optional<TodoItem> getTodoItemById(long id) {
       return todoItems.stream()
               .filter(item -> item.getId() == id)
               .findAny();
    }
}
