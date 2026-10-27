package currecyconverter;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class CurrencyConvert {
    public double convertMoney(String currencyCode, double amount) throws IllegalArgumentException {
        try {
            HashMap<String, Double> conversionRates = getConversionRates();
            if (!conversionRates.containsKey(currencyCode.toUpperCase())) {
                System.out.println("Currency does not exist");
                throw new IllegalArgumentException();
            }

            return conversionRates.get(currencyCode.toUpperCase()) * amount;

        } catch (InterruptedException | IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return amount;
    }

    private HashMap<String, Double> getConversionRates() throws InterruptedException, IOException {
        String apiKey = this.getAPIKey();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request =  HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/GBP"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        APIDTO results = gson.fromJson(response.body(), APIDTO.class);

        return results.conversion_rates;
    }

    private String getAPIKey() {
        return "94045d5f321ac9ff6dc4f60b";
    }
}
