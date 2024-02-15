import java.util.Scanner;

public class MaiorDe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira três números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();
        
        // Determina o maior número
        double maiorNumero = numero1;
        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }
        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }
        
        // Exibe o maior número
        System.out.println("O maior número é: " + maiorNumero);
        
        scanner.close();
    }
}

