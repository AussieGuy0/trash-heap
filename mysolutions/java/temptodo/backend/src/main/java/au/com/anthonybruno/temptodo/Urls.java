package au.com.anthonybruno.temptodo;

import au.com.anthonybruno.temptodo.todo.TodoController;
import au.com.anthonybruno.temptodo.todo.TodoItem;
import au.com.anthonybruno.temptodo.todo.TodoRepository;

import java.util.List;

import static au.com.anthonybruno.temptodo.JsonMapper.toJsonString;
import static spark.Spark.*;

public class Urls {

    public static final String baseUrl = "/api/v1";

    private final TodoController todoCtrl = new TodoController(new TodoRepository());

    public Urls() {
        path("/api/v1", this::createTodosEndpoints);
    }

    private void createTodosEndpoints() {
        path("/todos/:id", () -> {
            get("", (request, response) -> {
                String id = request.params("id");
                List<TodoItem> list = todoCtrl.getItems(id);
                return toJsonString(list);

            });
//            post("", (request, response) -> {
//
//            });
        });
    }

}
