package au.com.anthonybruno.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Instant;


public class Main {

   private static final String updateUrl = "http://anthonybruno.com.au/last-update";

   public Instant useUrlConnection() throws IOException {
      // 1. Create URL object
      URL updateUrl = new URL("http://anthonybruno.com.au/last-update");

      // 2. We use openConnection() on the url to get a HttpURLConnection,
      //    that we have to cast(?!). Also, this doesn't actually make a
      //    network request(?!?!?)
      HttpURLConnection connection = (HttpURLConnection) updateUrl.openConnection();

      // 3. We can then set things like set request methods, headers.
      connection.setRequestMethod("GET");

      // 4. Then we actually connect! Note: connect doesn't return anything, it
      //    mutates the connection object!
      connection.connect();
      int statusCode = connection.getResponseCode();
      if (statusCode != 200) {
         throw new RuntimeException("Got non 200 response code! " + statusCode);
      }

      // 5. Content is returned in an InputStream (Don't forget to close it!)
      InputStream content = connection.getInputStream();

      Instant timestamp = processIntoInstant(content);

      connection.disconnect();

      return timestamp;
   }

   private Instant processIntoInstant(final InputStream content) throws IOException {
      try (content) {
         String parsedContent = new String(content.readAllBytes());
         return processIntoInstant(parsedContent);
      }
   }

   private Instant processIntoInstant(final String content) {
      return Instant.ofEpochSecond(Long.parseLong(content));
   }

   public Instant useHttpClient() throws IOException, InterruptedException {
      // 1. Create HttpClient object
      HttpClient httpClient = HttpClient.newHttpClient();

      // 2. Create URI object
      URI uri = URI.create(updateUrl);

      // 3. Build a request
      HttpRequest request = HttpRequest.newBuilder(uri).GET().build();

      // 4. Send the request and get a HttpResponse object back!
      //    Note: HttpResponse.BodyHandlers.ofString() just parses the response body
      //          as a String
      HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
      int statusCode = response.statusCode();
      if (statusCode != 200) {
         throw new RuntimeException("Got non 200 response code! " + statusCode);
      }
      Instant timestamp = processIntoInstant(response.body());

      return timestamp;
   }

}
