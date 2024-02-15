import java.util.Scanner;

public class JogoDeFichas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira as cores das duas fichas
        System.out.print("Digite a cor da primeira ficha (Branca ou Preta): ");
        String primeiraFicha = scanner.nextLine();
        System.out.print("Digite a cor da segunda ficha (Branca ou Preta): ");
        String segundaFicha = scanner.nextLine();
        
        // Calcula o rateio
        double rateio;
        if ("Branca".equalsIgnoreCase(primeiraFicha) && "Branca".equalsIgnoreCase(segundaFicha)) {
            rateio = 0;
        } else if ("Branca".equalsIgnoreCase(primeiraFicha) && "Preta".equalsIgnoreCase(segundaFicha)) {
            rateio = 0.5;
        } else if ("Preta".equalsIgnoreCase(primeiraFicha) && "Branca".equalsIgnoreCase(segundaFicha)) {
            rateio = 1;
        } else if ("Preta".equalsIgnoreCase(primeiraFicha) && "Preta".equalsIgnoreCase(segundaFicha)) {
            rateio = 2;
        } else {
            System.out.println("Erro: As cores inseridas são inválidas.");
            return;
        }
        
        // Exibe o rateio
        System.out.println("O rateio é: " + rateio);
        
        scanner.close();
    }
}
