package me.anthonybruno.todo;

import me.anthonybruno.todo.controller.TodoController;

import static spark.Spark.staticFileLocation;

public class Server {

    public Server() {
        staticFileLocation("webapp");
        setupControllers();
    }

    public void setupControllers() {
        new TodoController();
    }

    public static void main(String[] args) {
        new Server();
    }
}
