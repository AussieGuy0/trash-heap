package me.anthonybruno.todo.login;

import me.anthonybruno.todo.Server;
import org.hibernate.Session;

public class LoginService {

    public User getUser(String username) {
        try (Session session = Server.getSessionFactory().openSession()) {
            session.beginTransaction();
            User user = session.get(User.class, username);
            session.getTransaction().commit();
            return user;
        }
    }

    public boolean authenticate(String username, String password) {
        User user = getUser(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public User addUser(String username, String password) {
        try (Session session = Server.getSessionFactory().openSession()) {
            session.beginTransaction();
            User user = new User(username, password);
            session.save(user);
            session.getTransaction().commit();
            return user;
        }
    }
}
