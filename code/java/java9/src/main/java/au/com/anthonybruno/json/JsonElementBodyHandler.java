package au.com.anthonybruno.json;

import com.google.gson.JsonElement;
import jdk.incubator.http.HttpHeaders;
import jdk.incubator.http.HttpResponse;

public class JsonElementBodyHandler implements HttpResponse.BodyHandler<JsonElement> {

    @Override
    public HttpResponse.BodyProcessor<JsonElement> apply(int statusCode, HttpHeaders responseHeaders) {
        return new JsonElementBodyProcessor(statusCode, responseHeaders);
    }

}
