import java.util.Scanner;
import java.util.Random;

public class Adivinhe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Sorteia um número de 1 a 10
        int numeroSorteado = random.nextInt(10) + 1;
        int tentativas = 3;
        int palpite;
        
        System.out.println("Tente adivinhar o número que estou pensando entre 1 e 10.");
        
        // Loop de tentativas
        for (int i = 0; i < tentativas; i++) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            
            if (palpite == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            } else if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior que " + palpite + ".");
            } else {
                System.out.println("O número sorteado é menor que " + palpite + ".");
            }
        }
        
        System.out.println("O número sorteado era: " + numeroSorteado);
        scanner.close();
    }
}

