package me.anthonybruno.todo.controller;

import me.anthonybruno.todo.service.TodoService;
import me.anthonybruno.todo.transformer.JsonTransformer;

import static spark.Spark.*;

public class TodoController {

    private final TodoService todoService = new TodoService();

    public TodoController() {

        setupEndpoints();
    }

    private void setupEndpoints() {
        path("/api/todo", () -> {
            get("/:id", (req, res) -> null, new JsonTransformer());
            post("", (req, res) -> null, new JsonTransformer());
            delete("/:id", (req, res) -> null, new JsonTransformer());
            put("", (req, res) -> null, new JsonTransformer());
        });
    }


}
