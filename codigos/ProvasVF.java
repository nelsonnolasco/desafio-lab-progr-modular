import java.util.Scanner;

public class ProvasVF {
    private static final int MAX_PROVAS = 50;
    private static final int MAX_QUESTOES = 20;
    private static char[] gabarito = new char[MAX_QUESTOES];
    private static char[][] respostasAlunos = new char[MAX_PROVAS][MAX_QUESTOES];
    private static int numeroDeAlunos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        definirGabarito(scanner);
        receberRespostasAlunos(scanner);
        
        System.out.print("Deseja aplicar um fator de correção? (s/n): ");
        boolean aplicarFatorCorrecao = scanner.nextLine().equalsIgnoreCase("s");
        int fatorCorrecao = 0;
        if (aplicarFatorCorrecao) {
            System.out.print("A cada quantas questões erradas uma certa será anulada? (2 ou 3): ");
            fatorCorrecao = scanner.nextInt();
        }
        
        calcularNotas(fatorCorrecao);
        scanner.close();
    }

    private static void definirGabarito(Scanner scanner) {
        System.out.println("Defina o gabarito das questões (V ou F):");
        for (int i = 0; i < MAX_QUESTOES; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = scanner.nextLine().toUpperCase().charAt(0);
        }
    }

    private static void receberRespostasAlunos(Scanner scanner) {
        System.out.println("Digite as respostas dos alunos (V ou F), ou 'sair' para terminar:");
        String entrada;
        while (numeroDeAlunos < MAX_PROVAS) {
            System.out.println("Aluno " + (numeroDeAlunos + 1) + ":");
            for (int i = 0; i < MAX_QUESTOES; i++) {
                entrada = scanner.nextLine();
                if ("sair".equalsIgnoreCase(entrada)) {
                    return;
                }
                respostasAlunos[numeroDeAlunos][i] = entrada.toUpperCase().charAt(0);
            }
            numeroDeAlunos++;
        }
    }

    private static void calcularNotas(int fatorCorrecao) {
        for (int aluno = 0; aluno < numeroDeAlunos; aluno++) {
            int nota = 0;
            int erros = 0;
            for (int questao = 0; questao < MAX_QUESTOES; questao++) {
                if (respostasAlunos[aluno][questao] == gabarito[questao]) {
                    nota++;
                } else {
                    erros++;
                }
            }
            if (fatorCorrecao > 0) {
                nota -= erros / fatorCorrecao;
            }
            System.out.println("Nota do Aluno " + (aluno + 1) + ": " + Math.max(nota, 0));
        }
    }
}

