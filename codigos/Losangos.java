import java.util.Scanner;

public class Losangos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário a linha e a coluna para o topo do primeiro losango
        System.out.print("Digite a linha para o topo do primeiro losango: ");
        int linha = scanner.nextInt();
        System.out.print("Digite a coluna para o topo do primeiro losango: ");
        int coluna = scanner.nextInt();
        
        // Define a altura do losango
        int altura = 5;
        
        // Desenha os losangos
        for (int i = 0; i < altura * 2 - 1; i++) {
            for (int j = 0; j < coluna + altura * 2 + 15; j++) {
                // Calcula a posição do 'X' para o primeiro losango
                if (j == coluna + Math.abs(altura - i - 1)) {
                    System.out.print("X");
                }
                // Calcula a posição do 'X' para o segundo losango
                else if (j == coluna + 15 + Math.abs(altura - i - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
çççççç