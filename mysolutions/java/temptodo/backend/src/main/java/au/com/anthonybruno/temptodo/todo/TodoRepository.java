package au.com.anthonybruno.temptodo.todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoRepository {

    private final Map<String, List<TodoItem>> db = new HashMap<>();

    public TodoRepository() {
        List<TodoItem> items = new ArrayList<>();
        items.add(new TodoItem("Do this task", false));
        items.add(new TodoItem("And this task",true));
        db.put("test", items);
    }

    public List<TodoItem> getTodoItems(String listId) {
        return db.get(listId);
    }

    public TodoItem addTodoItemToList(String listId, TodoItem todoItem) {
        List<TodoItem> items = db.get(listId);
        if (items != null) {
            items.add(todoItem);
        } else {
            throw new RuntimeException("No item with" + listId + " found");
        }
        return todoItem;
    }
}
