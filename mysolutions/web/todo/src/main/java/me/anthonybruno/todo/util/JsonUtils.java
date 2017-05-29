package me.anthonybruno.todo.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtils {

    public static <T> T convertStringToObject(Class<T> convertingClass, String toConvert) {
        try {
            return new ObjectMapper().readValue(toConvert, convertingClass);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
