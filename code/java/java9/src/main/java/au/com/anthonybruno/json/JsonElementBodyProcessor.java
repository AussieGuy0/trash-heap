package au.com.anthonybruno.json;

import com.google.gson.JsonElement;
import jdk.incubator.http.HttpHeaders;

public class JsonElementBodyProcessor extends JsonBodyProcessor<JsonElement> {

    public JsonElementBodyProcessor(int statusCode, HttpHeaders responseHeaders) {
        super(statusCode, responseHeaders);
    }

    @Override
    protected JsonElement convertStringToJson(String body) {
        return gson.fromJson(body, JsonElement.class);
    }
}


