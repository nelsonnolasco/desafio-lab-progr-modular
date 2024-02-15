import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        
        do {
            System.out.print("Digite um número de 1 a 9 para ver sua tabuada: ");
            int numero = scanner.nextInt();
            
            // Verifica se o número está dentro do intervalo permitido
            if(numero < 1 || numero > 9) {
                System.out.println("Número inválido. Por favor, digite um número de 1 a 9.");
            } else {
                // Exibe a tabuada do número
                for(int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            }
            
            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja ver outra tabuada? (S/N): ");
            continuar = scanner.next().charAt(0);
            
        } while(continuar == 'S' || continuar == 's');
        
        scanner.close();
    }
}
