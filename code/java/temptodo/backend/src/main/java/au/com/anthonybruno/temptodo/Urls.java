package au.com.anthonybruno.temptodo;

import au.com.anthonybruno.temptodo.exception.ResourceNotFoundException;
import au.com.anthonybruno.temptodo.todo.TodoController;
import au.com.anthonybruno.temptodo.todo.TodoItem;
import au.com.anthonybruno.temptodo.todo.TodoList;
import au.com.anthonybruno.temptodo.todo.TodoRepository;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static au.com.anthonybruno.temptodo.json.JsonMapper.toJsonObject;
import static au.com.anthonybruno.temptodo.json.JsonMapper.toJsonString;
import static spark.Spark.*;

public class Urls {

    private static final Logger log = LoggerFactory.getLogger("requests");
    public static final String baseUrl = "/api/v1";

    private final TodoController todoCtrl = new TodoController(new TodoRepository());

    public Urls() {
        path("/api/v1", this::createTodosEndpoints);
        before(((request, response) -> {
            log.info("Received {} request to {}", request.requestMethod(), request.pathInfo());
        }));
        exception(ResourceNotFoundException.class, (exception, request, response) -> {
            response.body(String.valueOf(exception.toJson()));
            response.status(exception.getStatusCode());
        });
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
                TodoItem todoItem = new TodoItem(1, text, false);
                return toJsonString(todoCtrl.addItem(id, todoItem));
            });

            put("/:itemId", (request, response) -> {
                String id = request.params("id");
                long itemId = Long.parseLong(request.params("itemId"));

                ObjectNode json = toJsonObject(request.body(), ObjectNode.class);
                String text = json.get("text").asText();
                boolean completed = json.get("completed").booleanValue();
                TodoItem todoItem = new TodoItem(-1, text, completed);

                return toJsonString(todoCtrl.updateTodoItem(id, itemId, todoItem));
            });
        });
    }

}
