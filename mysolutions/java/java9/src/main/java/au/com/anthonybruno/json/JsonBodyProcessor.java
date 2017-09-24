package au.com.anthonybruno.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import jdk.incubator.http.HttpHeaders;
import jdk.incubator.http.HttpResponse;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Flow;

public abstract class JsonBodyProcessor<T extends JsonElement> implements HttpResponse.BodyProcessor<T> {

    protected  static Gson gson = new Gson();

    private final HttpResponse.BodyProcessor<String> wrappedProcessor;

    public JsonBodyProcessor(int statusCode, HttpHeaders responseHeaders) {
       wrappedProcessor = HttpResponse.BodyHandler.asString().apply(statusCode, responseHeaders);
    }


    @Override
    public CompletionStage<T> getBody() {
        return wrappedProcessor.getBody().thenApply(this::convertStringToJson);
    }

    protected abstract T convertStringToJson(String body);

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
