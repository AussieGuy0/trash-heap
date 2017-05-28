package me.anthonybruno.todo.controller;

import me.anthonybruno.todo.service.TodoService;

import static spark.Spark.*;

public class TodoController {

    private final TodoService todoService = new TodoService();

    public TodoController() {

        setupEndpoints();
    }

    private void setupEndpoints() {
        path("/api/todo", () -> {
            get("", (req, res) -> null);
            post("", (req, res) -> null);
            delete("", (req, res) -> null);
            put("", (req, res) -> null);
        });
    }


}
