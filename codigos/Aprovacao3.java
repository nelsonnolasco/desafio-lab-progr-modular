import java.util.Scanner;

public class Aprovacao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira as informações necessárias
        System.out.print("Digite o nome da disciplina: ");
        String disciplina = scanner.nextLine();
        System.out.print("Digite a nota final (múltipla de 0,5): ");
        double notaFinal = scanner.nextDouble();
        System.out.print("Digite a quantidade total de aulas ministradas: ");
        int totalAulas = scanner.nextInt();
        System.out.print("Digite a quantidade de faltas do aluno: ");
        int totalFaltas = scanner.nextInt();
        
        // Calcula a frequência do aluno
        double frequencia = (totalAulas - totalFaltas) / (double) totalAulas;
        
        // Verifica se o aluno está reprovado por frequência
        if (frequencia < 0.75) {
            System.out.println("Reprovado por frequência em " + disciplina);
        } else {
            // Verifica o resultado com base na nota final
            if (notaFinal >= 5 && notaFinal <= 10) {
                System.out.println("Aprovado em " + disciplina + " com nota " + notaFinal);
            } else if (notaFinal == 4 || notaFinal == 4.5) {
                System.out.println("Segunda época em " + disciplina + " com nota " + notaFinal);
            } else {
                System.out.println("Reprovado em " + disciplina + " com nota " + notaFinal);
            }
        }
        
        scanner.close();
    }
}
