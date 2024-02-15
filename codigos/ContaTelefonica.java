import java.util.Scanner;

public class ContaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Custos fixos
        final double CUSTO_ASSINATURA = 17.90;
        final double CUSTO_IMPULSO_EXCEDENTE = 0.04;
        final double CUSTO_CHAMADA_CELULAR = 0.09;
        final int LIMITE_IMPULSOS = 90;
        
        // Entrada de dados
        System.out.print("Digite o valor total dos interurbanos: R$ ");
        double valorInterurbanos = scanner.nextDouble();
        System.out.print("Digite a quantidade total de impulsos normais: ");
        int totalImpulsosNormais = scanner.nextInt();
        System.out.print("Digite a quantidade de impulsos para celular: ");
        int impulsosCelular = scanner.nextInt();
        
        // Cálculo do valor da conta
        double valorImpulsosExcedentes = (totalImpulsosNormais > LIMITE_IMPULSOS) ? (totalImpulsosNormais - LIMITE_IMPULSOS) * CUSTO_IMPULSO_EXCEDENTE : 0;
        double valorChamadasCelular = impulsosCelular * CUSTO_CHAMADA_CELULAR;
        double valorTotalConta = CUSTO_ASSINATURA + valorImpulsosExcedentes + valorInterurbanos + valorChamadasCelular;
        
        // Exibição do resultado
        System.out.printf("Valor total da conta: R$ %.2f\n", valorTotalConta);
        
        scanner.close();
    }
}

