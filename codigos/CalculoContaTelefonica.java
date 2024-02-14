import java.util.Scanner;

public class CalculoContaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Custos fixos
        final double CUSTO_ASSINATURA = 21.40;
        final double CUSTO_IMPULSO_EXCEDENTE = 0.03;
        final double CUSTO_CHAMADA_CELULAR = 0.40;
        final int LIMITE_IMPULSOS = 90;
        
        // Entrada de dados
        System.out.print("Digite a quantidade de impulsos excedentes: ");
        int impulsosExcedentes = scanner.nextInt();
        System.out.print("Digite o valor total dos interurbanos: R$ ");
        double valorInterurbanos = scanner.nextDouble();
        System.out.print("Digite a quantidade de chamadas para celular: ");
        int chamadasCelular = scanner.nextInt();
        
        // Cálculo do valor da conta
        double valorImpulsosExcedentes = (impulsosExcedentes > LIMITE_IMPULSOS) ? (impulsosExcedentes - LIMITE_IMPULSOS) * CUSTO_IMPULSO_EXCEDENTE : 0;
        double valorChamadasCelular = chamadasCelular * CUSTO_CHAMADA_CELULAR;
        double valorTotalConta = CUSTO_ASSINATURA + valorImpulsosExcedentes + valorInterurbanos + valorChamadasCelular;
        
        // Exibição do resultado
        System.out.printf("Valor total da conta: R$ %.2f\n", valorTotalConta);
        
        scanner.close();
    }
}
