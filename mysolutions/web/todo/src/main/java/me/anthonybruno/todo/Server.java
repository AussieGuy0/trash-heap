package me.anthonybruno.todo;

import me.anthonybruno.todo.login.LoginController;
import me.anthonybruno.todo.todo.TodoController;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.before;
import static spark.Spark.staticFileLocation;

public class Server {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private static final SessionFactory sessionFactory = setupSessionFactory();

    public Server() {
        staticFileLocation("webapp");
        setupControllers();
        before((request, response) -> {
            log.debug("Received request: "+ request.requestMethod() + " " + request.url());
        });
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private static SessionFactory setupSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    private void setupControllers() {
        new TodoController();
        new LoginController();
    }

    public static void main(String[] args) {
        new Server();
    }
}
