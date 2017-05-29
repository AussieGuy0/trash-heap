package me.anthonybruno.todo.controller;

import me.anthonybruno.todo.model.TodoItem;
import me.anthonybruno.todo.service.TodoService;
import me.anthonybruno.todo.transformer.JsonTransformer;
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
                TodoItem todoItem = RequestUtils.convertRequestToObject(TodoItem.class, req);
                return todoService.addTodoItem(todoItem);
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
    }


}
