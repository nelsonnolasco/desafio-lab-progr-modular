import java.util.Scanner;

public class DividirCadeia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma cadeia de caracteres
        System.out.print("Digite uma cadeia de caracteres (até 255 caracteres): ");
        String cadeia = scanner.nextLine();
        
        // Verifica se a cadeia tem até 255 caracteres
        if (cadeia.length() > 255) {
            System.out.println("A cadeia de caracteres é muito longa. Por favor, digite até 255 caracteres.");
        } else {
            // Calcula o índice para dividir a cadeia
            int meio = cadeia.length() / 2;
            
            // Exibe as metades da cadeia
            System.out.println("Primeira metade: " + cadeia.substring(0, meio));
            System.out.println("Segunda metade: " + cadeia.substring(meio));
        }
        
        scanner.close();
    }
}
