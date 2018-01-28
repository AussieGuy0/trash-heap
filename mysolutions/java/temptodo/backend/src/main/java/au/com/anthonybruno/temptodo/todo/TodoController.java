package au.com.anthonybruno.temptodo.todo;

import java.util.List;

public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoItem addItem(String listId, TodoItem todoItem) {
        return todoRepository.addTodoItemToList(listId, todoItem);
    }

    public List<TodoItem> getItems(String listId) {
        return todoRepository.getTodoItems(listId);
    }

    public TodoList createNewTodoList(String id) {
        return  todoRepository.createNewTodoList(id);
    }

    public TodoItem updateTodoItem(String listId, long todoItemId, TodoItem todoItem) {
        return todoRepository.updateTodoItem(listId, todoItemId, todoItem);
    }
}
