package me.anthonybruno.todo.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class JsonUtils {

    public static JsonNode convertStringToNode(String json) {
        try {
            return new ObjectMapper().readTree(json);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static <T> T convertStringToObject(Class<T> convertingClass, String toConvert) {
        try {
            return new ObjectMapper().readValue(toConvert, convertingClass);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
