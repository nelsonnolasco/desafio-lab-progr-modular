public class CalculoNotas {
    public static void main(String[] args) {
            // Notas do aluno
            double N1 = 8.0;
            double N2 = 7.5;
            double N3 = 10.0;
            double N4 = 9.0;
    
            // Cálculo da média ponderada
            double media = (N1 + N2 * 2 + N3 * 3 + N4 * 4) / 10;
    
            // Exibição das notas e da média
            System.out.printf("Notas do aluno: %.1f - %.1f - %.1f - %.1f\n", N1, N2, N3, N4);
            System.out.printf("Média do aluno: %.1f\n", media);
        }
    }
   