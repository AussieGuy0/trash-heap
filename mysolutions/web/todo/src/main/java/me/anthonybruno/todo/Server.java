package me.anthonybruno.todo;

import me.anthonybruno.todo.controller.TodoController;

/**
 * Created by anthony on 28/05/17.
 */
public class Server {

    public Server() {
       setupControllers();
    }

    public void setupControllers() {
        new TodoController();
    }

    public static void main(String[] args) {
       new Server();
    }
}
