package api;

import com.google.gson.Gson;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class Connection {

    public static void main(String[] args) {

        final String key = "9c669a74faaada81ba36788e";
        // Setting URL
        URI urlConnection = URI.create("https://v6.exchangerate-api.com/v6/" + key + "/latest/USD");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(urlConnection)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.uri());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("OPPSS");
        }

    }
}
