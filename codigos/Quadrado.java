public class Quadrado {
    public static void main(String[] args) {
        int largura = 5; // Número de "X" na parte superior e inferior
        int altura = 5; // Número total de linhas

        // Desenha a parte superior do retângulo
        for (int i = 0; i < largura; i++) {
            System.out.print("X ");
        }
        System.out.println();

        // Desenha as laterais do retângulo
        for (int i = 2; i < altura; i++) {
            System.out.print("X ");
            for (int j = 2; j < largura; j++) {
                System.out.print("  "); // Espaços no meio
            }
            System.out.println("X ");
        }

        // Desenha a parte inferior do retângulo
        for (int i = 0; i < largura; i++) {
            System.out.print("X ");
        }
    }
}
