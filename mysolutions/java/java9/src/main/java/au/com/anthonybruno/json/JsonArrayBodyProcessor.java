package au.com.anthonybruno.json;

import com.google.gson.JsonArray;
import jdk.incubator.http.HttpHeaders;

public class JsonArrayBodyProcessor extends JsonBodyProcessor<JsonArray> {

    public JsonArrayBodyProcessor(int statusCode, HttpHeaders responseHeaders) {
        super(statusCode, responseHeaders);
    }

    @Override
    protected JsonArray convertStringToJson(String body) {
        return gson.fromJson(body, JsonArray.class);
    }
}


