package au.com.anthonybruno.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import jdk.incubator.http.HttpHeaders;
import jdk.incubator.http.HttpResponse;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Flow;

public class JsonElementBodyProcessor implements HttpResponse.BodyProcessor<JsonElement> {

    private static Gson gson = new Gson();

    private final HttpResponse.BodyProcessor<String> wrappedProcessor;

    public JsonElementBodyProcessor(int statusCode, HttpHeaders responseHeaders) {
       wrappedProcessor = HttpResponse.BodyHandler.asString().apply(statusCode, responseHeaders);
    }


    @Override
    public CompletionStage<JsonElement> getBody() {
        return wrappedProcessor.getBody().thenApply((body) -> gson.fromJson(body, JsonElement.class));
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        wrappedProcessor.onSubscribe(subscription);
    }

    @Override
    public void onNext(ByteBuffer item) {
        wrappedProcessor.onNext(item);
    }

    @Override
    public void onError(Throwable throwable) {
        wrappedProcessor.onError(throwable);
    }

    @Override
    public void onComplete() {
        wrappedProcessor.onComplete();
    }
}
