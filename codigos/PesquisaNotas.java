import java.util.Scanner;
import java.util.Arrays;

public class PesquisaNotas {
    private static final int NUMERO_DE_NOTAS = 10;
    private static double[] notas = new double[NUMERO_DE_NOTAS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Ler notas");
            System.out.println("2 - Pesquisar nota");
            System.out.println("3 - Mostrar todas as notas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lerNotas(scanner);
                    break;
                case 2:
                    pesquisarNota(scanner);
                    break;
                case 3:
                    mostrarNotas();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void lerNotas(Scanner scanner) {
        int contador = 0;
        while (contador < NUMERO_DE_NOTAS) {
            System.out.printf("Digite a nota %d (deve ser entre 0 e 10): ", contador + 1);
            double nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notas[contador] = nota;
                contador++;
            } else {
                System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
            }
        }
    }

    private static void pesquisarNota(Scanner scanner) {
        System.out.print("Digite a nota a ser pesquisada: ");
        double notaPesquisa = scanner.nextDouble();
        boolean encontrada = Arrays.stream(notas).anyMatch(n -> n == notaPesquisa);
        if (encontrada) {
            System.out.println("A nota " + notaPesquisa + " foi encontrada no vetor.");
        } else {
            System.out.println("A nota " + notaPesquisa + " não foi encontrada no vetor.");
        }
    }

    private static void mostrarNotas() {
        System.out.println("Notas armazenadas:");
        for (double nota : notas) {
            System.out.println(nota);
        }
    }
}
