import java.util.*;

public class Acha5 {
    private static final List<String> BANCO_DE_PALAVRAS = Arrays.asList(
        // Adicione aqui as palavras do banco de dados
        "sagaz", "âmago", "negro", "termo", "êxito", "mexer", "nobre", "senso", "afeto", "algoz"
        // Continue adicionando palavras conforme necessário
    );
    private static final Random random = new Random();
    private static String palavraSecreta;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        palavraSecreta = BANCO_DE_PALAVRAS.get(random.nextInt(BANCO_DE_PALAVRAS.size()));
        System.out.println("Bem-vindo ao jogo Acha-5! Tente adivinhar a palavra secreta.");
        String tentativa;
        do {
            System.out.print("Digite uma palavra de 5 letras: ");
            tentativa = scanner.next();
            if (tentativa.length() != 5) {
                System.out.println("A palavra deve ter exatamente 5 letras.");
                continue;
            }
            int letrasCorretas = verificarPalavra(tentativa);
            if (letrasCorretas == 5) {
                System.out.println("Parabéns! Você acertou a palavra secreta: " + palavraSecreta);
            } else {
                System.out.println("A palavra tem " + letrasCorretas + " letras corretas.");
            }
        } while (!tentativa.equals(palavraSecreta));
    }

    private static int verificarPalavra(String tentativa) {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (palavraSecreta.indexOf(tentativa.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }
}
