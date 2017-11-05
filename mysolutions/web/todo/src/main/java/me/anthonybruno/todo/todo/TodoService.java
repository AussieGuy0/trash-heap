package me.anthonybruno.todo.todo;

import java.util.*;

public class TodoService {

    private Map<Long, TodoItem> todoDb = new HashMap<>();
    {
        todoDb.put(0L, new TodoItem(0, false, "This a todo item", new Date()));
        todoDb.put(1L, new TodoItem(1,true, "This a another todo item", new Date()));
    }

    public long addTodoItem(String text) {
        TodoItem todoItem = new TodoItem(generateId(), false, text, new Date());
        todoDb.put(todoItem.getId(), todoItem);
        return todoItem.getId();
    }

    public TodoItem getTodoItem(long id) {
        return todoDb.get(id);
    }

    public boolean editTodoItem(long id, TodoItem todoItem) {
        todoDb.put(id, todoItem);
        return true;
    }

    public boolean deleteTodoItem(long id) {
        return todoDb.remove(id) != null;
    }

    public Collection<TodoItem> getAll() {
        return todoDb.values();
    }

    private long generateId() {
        return todoDb.size();
    }
}
