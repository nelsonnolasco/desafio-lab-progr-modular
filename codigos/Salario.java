import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o valor nominal do salário: R$ ");
        double salarioNominal = scanner.nextDouble();
        
        System.out.print("Digite o número de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();
        
        // Cálculos
        double valorHoraExtra = (salarioNominal / 176) * horasExtras * 1.5;
        double inss = Math.min(salarioNominal * 0.12557, 150);
        double salarioLiquido = salarioNominal + valorHoraExtra - inss;
        
        // Saída de resultados
        System.out.printf("Valor adicional de horas extras: R$ %.2f\n", valorHoraExtra);
        System.out.printf("Valor descontado para o INSS: R$ %.2f\n", inss);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);
        
        scanner.close();
    }
}
