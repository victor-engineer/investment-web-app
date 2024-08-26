package service;

import model.Investment;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class InvestmentService {
    private Map<String, Investment> portfolio = new HashMap<>();

    // Método para adicionar um investimento
    public void addInvestment(String ticker, String type, int quantity) {
        // Integrar lógica para pegar o preço atual via API
        double purchasePrice = getCurrentPrice(ticker); // Exemplo
        Investment investment = new Investment(ticker, type, quantity, purchasePrice);
        portfolio.put(ticker, investment);
    }

    // Método para pegar a cotação atual de um ativo via API
    public double getCurrentPrice(String ticker) {
        try {
            // Exemplo usando Alpha Vantage API
            String apiKey = "JO363YEDQMTC3C8V."; // Substitua com sua chave de API
            String url = String.format("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=%s&interval=1min&apikey=%s", ticker, apiKey);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // Parse do JSON para obter o preço (exemplo básico)
            // (Você pode usar Jackson ou Gson para processar o JSON)

            // Exemplo simplificado:
            return parsePriceFromResponse(response.body());

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private double parsePriceFromResponse(String responseBody) {
        // Implementar lógica para extrair o preço do JSON (parse)
        return 150.0; // Exemplo de valor fixo para fins de demonstração
    }
    /*// Método para extrair o preço da resposta JSON
    private double parsePriceFromResponse(String responseBody) {
        try {
            JSONObject jsonObject = new JSONObject(responseBody);

            // Acessa o time series "Time Series (1min)"
            JSONObject timeSeries = jsonObject.getJSONObject("Time Series (1min)");

            // Pega o primeiro ponto de dados (o mais recente)
            String firstKey = timeSeries.keys().next(); // Obtém a primeira chave (timestamp mais recente)
            JSONObject firstDataPoint = timeSeries.getJSONObject(firstKey);

            // Retorna o valor de "4. close", que é o preço de fechamento
            return firstDataPoint.getDouble("4. close");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0; // Retorna 0.0 em caso de erro
    }*/

    // Método para simular lucro/prejuízo
    public double simulateProfit(String ticker, double sellPrice) {
        Investment investment = portfolio.get(ticker);
        if (investment != null) {
            double purchasePrice = investment.getPurchasePrice();
            int quantity = investment.getQuantity();
            return (sellPrice - purchasePrice) * quantity;
        }
        return 0;
    }
}