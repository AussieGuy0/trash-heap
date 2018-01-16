package au.com.anthonybruno.temptodo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonMapper {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String toJsonString(Object data) {
        try {
            return mapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonNode toJsonObject(String data) {
        try {
            return mapper.readTree(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T toJsonObject(String data, Class<T> type) {
        return type.cast(toJsonObject(data));
    }
}
