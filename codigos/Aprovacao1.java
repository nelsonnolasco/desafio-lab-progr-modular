import java.util.Scanner;

public class Aprovacao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira a disciplina e a nota final
        System.out.print("Digite o nome da disciplina: ");
        String disciplina = scanner.nextLine();
        System.out.print("Digite a nota final (múltipla de 0,5): ");
        double notaFinal = scanner.nextDouble();
        
        // Verifica o resultado com base na nota final
        if (notaFinal >= 5 && notaFinal <= 10) {
            System.out.println("Aprovado em " + disciplina + " com nota " + notaFinal);
        } else if (notaFinal == 4 || notaFinal == 4.5) {
            System.out.println("Segunda época em " + disciplina + " com nota " + notaFinal);
        } else {
            System.out.println("Reprovado em " + disciplina + " com nota " + notaFinal);
        }
        
        scanner.close();
    }
}
