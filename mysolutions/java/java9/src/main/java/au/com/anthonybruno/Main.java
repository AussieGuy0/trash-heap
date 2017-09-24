package au.com.anthonybruno;

import au.com.anthonybruno.json.JsonHandlers;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();

        URI url = generateUrl("test@example.com");
        HttpRequest request = HttpRequest.newBuilder()
                .setHeader("User-Agent", "java9-test")
                .GET()
                .uri(url)
                .build();

        HttpResponse<JsonArray> response = httpClient.send(request, JsonHandlers.asJsonArray());

        for (JsonElement object : response.body()) {
            System.out.println(object);
        }
    }

    private static URI generateUrl(String account) {
        try {
            return new URI("https://haveibeenpwned.com/api/v2/breachedaccount/" + account);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
