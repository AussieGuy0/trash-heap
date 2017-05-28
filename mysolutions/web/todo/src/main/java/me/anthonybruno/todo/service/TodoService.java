package me.anthonybruno.todo.service;

import me.anthonybruno.todo.model.TodoItem;

import java.util.HashMap;
import java.util.Map;

public class TodoService {

    private Map<Long, TodoItem> todoDb = new HashMap<>();

    public long addTodoItem(TodoItem todoItem) {
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

}
