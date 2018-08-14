package me.anthonybruno.todo.login;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import me.anthonybruno.todo.transformer.JsonTransformer;
import spark.Session;

import static me.anthonybruno.todo.util.JsonUtils.convertStringToNode;
import static spark.Spark.*;

/**
 * Created by anthony on 16/07/17.
 */
public class LoginController {

    private final LoginService loginService = new LoginService();

    public LoginController() {
        setUpEndpoints();
    }

    private void setUpEndpoints() {
        post("/api/login", (req, res) -> {
            ObjectNode node = (ObjectNode) convertStringToNode(req.body());
            String username = node.get("username").asText();
            String password = node.get("password").asText();

            if (loginService.authenticate(username, password)) {
                Session session = req.session(true);
                session.attribute("user", loginService.getUser(username));
                res.status(200);
                return "";
            } else {
                res.status(401);
                return "";
            }
        });

        post("/api/logout", (req, res) -> {
            req.session().invalidate();
            return "";
        });

        path("/api/user", () -> {
            get("", (req, res) -> {
                User user = req.session().attribute("user");
                return user;
            }, new JsonTransformer());

            post("", (req, res) -> {
                ObjectNode node = (ObjectNode) convertStringToNode(req.body());
                String username = node.get("username").asText();
                String password = node.get("password").asText();
                loginService.addUser(username, password);
                return "";
            });

        });

    }
}
