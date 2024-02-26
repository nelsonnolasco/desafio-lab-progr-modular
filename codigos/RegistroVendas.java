import java.util.Scanner;

public class RegistroVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Preços dos produtos
        final int precoCachorroQuente = 8;
        final int precoHamburgao = 12;
        final int precoMacarrao = 14;
        final int precoAgua = 3;
        final int precoRefrigerante = 5;
        
        // Quantidade vendida de cada produto
        int qtdCachorroQuente = 0;
        int qtdHamburgao = 0;
        int qtdMacarrao = 0;
        int qtdAgua = 0;
        int qtdRefrigerante = 0;
        
        // Variáveis para controle do loop e entrada do usuário
        int produto, quantidade;
        boolean continuar = true;
        
        // Loop de registro de vendas
        while (continuar) {
            System.out.println("Digite o código do produto e a quantidade vendida (ou 0 0 para encerrar):");
            System.out.println("1 = Cachorro quente");
            System.out.println("2 = Hamburgão");
            System.out.println("3 = Macarrão na chapa");
            System.out.println("4 = Água");
            System.out.println("5 = Refrigerante");
            System.out.println("0 0 = SAIR");
            produto = scanner.nextInt();
            quantidade = scanner.nextInt();
            
            // Verifica o produto e adiciona à quantidade vendida
            switch (produto) {
                case 1:
                    qtdCachorroQuente += quantidade;
                    break;
                case 2:
                    qtdHamburgao += quantidade;
                    break;
                case 3:
                    qtdMacarrao += quantidade;
                    break;
                case 4:
                    qtdAgua += quantidade;
                    break;
                case 5:
                    qtdRefrigerante += quantidade;
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Produto inválido!");
                    break;
            }
        }
        
        // Cálculo do faturamento total e médio
        int faturamentoTotal = qtdCachorroQuente * precoCachorroQuente +
                               qtdHamburgao * precoHamburgao +
                               qtdMacarrao * precoMacarrao +
                               qtdAgua * precoAgua +
                               qtdRefrigerante * precoRefrigerante;
                               
        int totalProdutosVendidos = qtdCachorroQuente + qtdHamburgao + qtdMacarrao + qtdAgua + qtdRefrigerante;
        double valorMedioPorProduto = totalProdutosVendidos > 0 ? (double) faturamentoTotal / totalProdutosVendidos : 0;
        
        // Identificação do produto mais vendido e que gerou maior faturamento
        int[] quantidades = {qtdCachorroQuente, qtdHamburgao, qtdMacarrao, qtdAgua, qtdRefrigerante};
        int[] faturamentos = {qtdCachorroQuente * precoCachorroQuente,
                              qtdHamburgao * precoHamburgao,
                              qtdMacarrao * precoMacarrao,
                              qtdAgua * precoAgua,
                              qtdRefrigerante * precoRefrigerante};
        String[] produtos = {"Cachorro quente", "Hamburgão", "Macarrão na chapa", "Água", "Refrigerante"};
        
        int maxQuantidadeIndex = 0;
        int maxFaturamentoIndex = 0;
        for (int i = 1; i < quantidades.length; i++) {
            if (quantidades[i] > quantidades[maxQuantidadeIndex]) {
                maxQuantidadeIndex = i;
            }
            if (faturamentos[i] > faturamentos[maxFaturamentoIndex]) {
                maxFaturamentoIndex = i;
            }
        }
        
        // Resultados
        System.out.println("Produto mais vendido em quantidade: " + produtos[maxQuantidadeIndex]);
        System.out.println("Produto que gerou o maior faturamento: " + produtos[maxFaturamentoIndex]);
        System.out.printf("Valor médio por produto vendido: R$ %.2f\n", valorMedioPorProduto);
        System.out.println("Faturamento total do carrinho: R$ " + faturamentoTotal);
        
        scanner.close();
    }
}
