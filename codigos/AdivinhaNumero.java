import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instruções para o usuário
        System.out.println("Pense em um número (não diga em voz alta).");
        System.out.println("Multiplique esse número por 2.");
        System.out.println("Some 6 ao resultado.");
        System.out.println("Divida o resultado por 2.");
        System.out.print("Informe o resultado final: ");
        
        // Lê o resultado fornecido pelo usuário
        double resultadoFinal = scanner.nextDouble();
        
        // "Adivinha" o número pensado
        double numeroPensado = resultadoFinal - 3;
        
        // Exibe o número "adivinhado"
        System.out.println("Você pensou no número: " + numeroPensado);
        
        scanner.close();
    }
}