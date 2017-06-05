package me.anthonybruno.todo;

import me.anthonybruno.todo.controller.TodoController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Filter;
import spark.Request;
import spark.Response;

import static spark.Spark.before;
import static spark.Spark.staticFileLocation;

public class Server {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public Server() {
        staticFileLocation("webapp");
        setupControllers();
        before((request, response) -> {
            log.debug("Received request: "+ request.requestMethod() + " " + request.url());
        });
    }

    public void setupControllers() {
        new TodoController();
    }

    public static void main(String[] args) {
        new Server();
    }
}
