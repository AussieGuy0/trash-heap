package au.com.anthonybruno.json;

import com.google.gson.JsonArray;
import jdk.incubator.http.HttpHeaders;
import jdk.incubator.http.HttpResponse;

public class JsonArrayBodyHandler implements HttpResponse.BodyHandler<JsonArray> {

    @Override
    public HttpResponse.BodyProcessor<JsonArray> apply(int statusCode, HttpHeaders responseHeaders) {
        return new JsonArrayBodyProcessor(statusCode, responseHeaders);
    }

}
