package au.com.anthonybruno.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import jdk.incubator.http.HttpResponse;

public class JsonHandlers {

    public static HttpResponse.BodyHandler<JsonElement> asJsonElement() {
        return new JsonElementBodyHandler();
    }

    public static HttpResponse.BodyHandler<JsonArray> asJsonArray() {
        return new JsonArrayBodyHandler();
    }
}
