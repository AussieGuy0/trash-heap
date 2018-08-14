package au.com.anthonybruno.temptodo.exception;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

import static au.com.anthonybruno.temptodo.json.JsonMapper.newObjectNode;

public class HttpException extends RuntimeException {

    private final int statusCode;

    HttpException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public ObjectNode toJson() {
        ObjectNode objectNode = newObjectNode();
        objectNode.set("error", new TextNode(this.getClass().getSimpleName()));
        objectNode.set("message", new TextNode(this.getMessage()));
        return objectNode;
    }
}
