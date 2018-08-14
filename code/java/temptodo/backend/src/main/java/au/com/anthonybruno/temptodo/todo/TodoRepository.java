package au.com.anthonybruno.temptodo.todo;

import au.com.anthonybruno.temptodo.exception.ResourceNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoRepository {

    private final Map<String, TodoList> db = new HashMap<>();

    public TodoRepository() {
        List<TodoItem> items = new ArrayList<>();
        items.add(new TodoItem(1,"Do this task", false));
        items.add(new TodoItem(2,"And this task",true));
        db.put("test", new TodoList("text", items));
    }

    public List<TodoItem> getTodoItems(String listId) {
        return db.get(listId).getTodoItems();
    }

    public TodoItem addTodoItemToList(String listId, TodoItem todoItem) {
        List<TodoItem> items = db.get(listId).getTodoItems();
        if (items != null) {
            items.add(todoItem); //TODO: Generate id of todoitem
        } else {
            throw new ResourceNotFoundException("No TodoList with " + listId + " found");
        }
        return todoItem;
    }

    public TodoList createNewTodoList(String id) {
        TodoList todoList = new TodoList(id, new ArrayList<>());
        db.put(todoList.getId(), todoList);
        return todoList;
    }

    public TodoItem updateTodoItem(String listId, long todoItemId, TodoItem updatedItem) {
        TodoList todoList = db.get(listId);
        if (todoList == null) {
            throw new ResourceNotFoundException("No TodoList with " + listId + " found");
        }
        List<TodoItem> todoItems = todoList.getTodoItems();
        TodoItem newItem = new TodoItem(todoItemId, updatedItem.getText(), updatedItem.isCompleted());
        for (int i = 0; i < todoItems.size(); i++) {
            TodoItem curr = todoItems.get(i);
            if (curr.getId() ==  todoItemId) {
                todoItems.remove(i);
                todoItems.add(newItem);
            }

        }
        return newItem;
    }
}
