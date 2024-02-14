import java.util.Scanner;

public class NotasProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê as notas dos exercícios
        System.out.print("Digite a nota do primeiro exercício (0 a 10): ");
        int notaExercicio1 = scanner.nextInt();
        System.out.print("Digite a nota do segundo exercício (0 a 10): ");
        int notaExercicio2 = scanner.nextInt();
        
        // Lê a nota da prova
        System.out.print("Digite a nota da prova (0 a 10): ");
        double notaProva = scanner.nextDouble();
        
        // Calcula a nota dos exercícios
        double notaExercicios = (notaExercicio1 * 1 + notaExercicio2 * 2) / 3.0;
        
        // Calcula a nota final
        double notaFinal = (notaExercicios * 2 + notaProva * 8) / 10;
        
        // Exibe a nota final
        System.out.printf("Nota final do aluno: %.1f\n", notaFinal);
        
        scanner.close();
    }
}
