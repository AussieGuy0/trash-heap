package me.anthonybruno.todo.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import spark.Request;

import java.io.IOException;

public class RequestUtils {

    public static boolean hasCorrectKeys(Request req, String... keys) {
        ObjectNode node;
        try {
            node = (ObjectNode) new ObjectMapper().readTree(req.body());
        } catch (IOException  | ClassCastException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < keys.length; i++) {
            if (node.get(keys[i]) == null) {
                return false;
            }
        }

        return true;

    }
}
