package api;

import coin.Coin;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class Connection {

    public Connection(String baseValue, String targetValue, double value) {

        final String key = "9c669a74faaada81ba36788e";
        // Setting URL
        URI urlConnection = URI.create("https://v6.exchangerate-api.com/v6/" + key + "/pair/" + baseValue + "/" + targetValue);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(urlConnection)
                .build();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            CoinApi coinApi = gson.fromJson(json, CoinApi.class);

            Coin coin = new Coin();
            coin.coin(coinApi, value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

    }
}
