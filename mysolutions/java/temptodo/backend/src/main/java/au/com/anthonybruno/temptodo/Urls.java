package au.com.anthonybruno.temptodo;

import au.com.anthonybruno.temptodo.todo.TodoController;
import au.com.anthonybruno.temptodo.todo.TodoItem;
import au.com.anthonybruno.temptodo.todo.TodoList;
import au.com.anthonybruno.temptodo.todo.TodoRepository;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

import static au.com.anthonybruno.temptodo.json.JsonMapper.toJsonObject;
import static au.com.anthonybruno.temptodo.json.JsonMapper.toJsonString;
import static spark.Spark.*;

public class Urls {

    public static final String baseUrl = "/api/v1";

    private final TodoController todoCtrl = new TodoController(new TodoRepository());

    public Urls() {
        path("/api/v1", this::createTodosEndpoints);
    }

    private void createTodosEndpoints() {
        post("/todos", (request, response) -> {
            ObjectNode json = toJsonObject(request.body(), ObjectNode.class);
            TodoList createdList = todoCtrl.createNewTodoList(json.get("id").asText());
            return toJsonString(createdList);
        });
        path("/todos/:id", () -> {
            get("", (request, response) -> {
                String id = request.params("id");
                List<TodoItem> list = todoCtrl.getItems(id);
                return toJsonString(list);

            });
            post("", (request, response) -> {
                String id = request.params("id");

                ObjectNode json = toJsonObject(request.body(), ObjectNode.class);
                String text = json.get("text").asText();
                TodoItem todoItem = new TodoItem(text, false);
                return toJsonString(todoCtrl.addItem(id, todoItem));

            });
        });
    }

}
