import java.util.*;

public class PalavraEmbaralhada {
    private static final String[] BANCO_DE_PALAVRAS = {"exemplo", "palavra", "embaralhada", "jogo"};
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        String palavraSelecionada = BANCO_DE_PALAVRAS[random.nextInt(BANCO_DE_PALAVRAS.length)];
        String palavraEmbaralhada = embaralharPalavra(palavraSelecionada);

        System.out.println("Adivinhe a palavra: " + palavraEmbaralhada);
        long tempoInicial = System.currentTimeMillis();
        long tempoLimite = 30000; // 30 segundos para adivinhar

        System.out.print("Digite sua resposta (tempo limite de 30 segundos): ");
        while (System.currentTimeMillis() - tempoInicial < tempoLimite) {
            String tentativa = scanner.nextLine();
            if (tentativa.equalsIgnoreCase(palavraSelecionada)) {
                System.out.println("Parabéns! Você acertou a palavra.");
                return;
            } else {
                System.out.println("Tente novamente: " + palavraEmbaralhada);
            }
        }
        System.out.println("O tempo acabou! A palavra correta era: " + palavraSelecionada);
    }

    private static String embaralharPalavra(String palavra) {
        List<Character> letras = new ArrayList<>();
        for (char letra : palavra.toCharArray()) {
            letras.add(letra);
        }
        Collections.shuffle(letras);
        StringBuilder palavraEmbaralhada = new StringBuilder();
        for (char letra : letras) {
            palavraEmbaralhada.append(letra);
        }
        return palavraEmbaralhada.toString();
    }
}
