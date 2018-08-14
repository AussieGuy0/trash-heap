package me.anthonybruno.todo.todo;

import com.fasterxml.jackson.databind.JsonNode;
import me.anthonybruno.todo.todo.TodoItem;
import me.anthonybruno.todo.todo.TodoService;
import me.anthonybruno.todo.transformer.JsonTransformer;
import me.anthonybruno.todo.util.JsonUtils;
import me.anthonybruno.todo.util.RequestUtils;

import static spark.Spark.*;

public class TodoController {

    private final TodoService todoService = new TodoService();

    public TodoController() {
        setupEndpoints();
    }

    private void setupEndpoints() {
        path("/api/todo", () -> {
            get("/:id", (req, res) -> {
                long id = Long.parseLong(req.params(":id"));
                return todoService.getTodoItem(id);
            }, new JsonTransformer());

            post("", (req, res) -> {
                JsonNode node = JsonUtils.convertStringToNode(req.body());
                return todoService.addTodoItem(node.get("text").textValue());
            });

            delete("/:id", (req, res) -> {
                long id = Long.parseLong(req.params(":id"));
                return todoService.deleteTodoItem(id);
            });

            put("", (req, res) -> {
                TodoItem todoItem = RequestUtils.convertRequestToObject(TodoItem.class, req);
                return todoService.editTodoItem(todoItem.getId(), todoItem);
            }, new JsonTransformer());
        });

        get("/api/todos", (req, res) -> todoService.getAll().toArray(new TodoItem[0]), new JsonTransformer());
    }


}
