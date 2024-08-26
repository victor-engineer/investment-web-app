import service.InvestmentService;

public class InvestmentApp {
    public static void main(String[] args) {
        // Inicializar o serviço de investimentos
      InvestmentService investmentService = new InvestmentService();

        // Exemplo de adicionar um ativo à carteira
        investmentService.addInvestment("AAPL", "Ação", 10); // Exemplo de adicionar 10 ações da Apple

        // Consultar a cotação atual
        double currentPrice = investmentService.getCurrentPrice("AAPL");
        System.out.println("Cotação atual da AAPL: $" + currentPrice);

        // Simulação de lucro/prejuízo
        double potentialProfit = investmentService.simulateProfit("AAPL", 15); // Simula vender a $15 por ação
        System.out.println("Lucro potencial: $" + potentialProfit);
    }
}
