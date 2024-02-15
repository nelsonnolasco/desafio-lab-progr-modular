import java.util.Scanner;

public class CalculoImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o valor base
        System.out.print("Digite o valor base para o cálculo do imposto: R$ ");
        double valorBase = scanner.nextDouble();
        
        // Variável para armazenar o valor do imposto
        double impostoAPagar;
        
        // Calcula o imposto com base na tabela fornecida
        if (valorBase <= 1200) {
            impostoAPagar = 0;
        } else if (valorBase <= 2500) {
            impostoAPagar = valorBase * 0.10;
        } else if (valorBase <= 5000) {
            impostoAPagar = valorBase * 0.15;
        } else {
            impostoAPagar = valorBase * 0.20;
        }
        
        // Exibe o valor do imposto a pagar
        System.out.printf("O imposto a pagar é: R$ %.2f\n", impostoAPagar);
        
        scanner.close();
    }
}

