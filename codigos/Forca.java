import java.util.*;

public class Forca {
    private static final String[] PALAVRAS = {"palavra", "forca", "jogo", "java"};
    private static final Scanner scanner = new Scanner(System.in);
    private static final Set<Character> letrasTentadas = new HashSet<>();
    private static final Map<String, int[]> historicoJogadores = new HashMap<>(); // [jogadas ganhas, jogadas perdidas]

    public static void main(String[] args) {
        System.out.print("Digite seu nome: ");
        String nomeJogador = scanner.nextLine();
        historicoJogadores.putIfAbsent(nomeJogador, new int[2]);

        String palavra = PALAVRAS[new Random().nextInt(PALAVRAS.length)];
        char[] palavraOculta = new char[palavra.length()];
        Arrays.fill(palavraOculta, '_');

        int tentativasRestantes = 6;
        while (tentativasRestantes > 0 && new String(palavraOculta).contains("_")) {
            System.out.println("\nPalavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            mostrarAlfabeto();
            System.out.print("Escolha uma letra: ");
            char letra = scanner.nextLine().toLowerCase().charAt(0);

            if (letrasTentadas.contains(letra)) {
                System.out.println("Letra já foi tentada.");
                continue;
            }

            letrasTentadas.add(letra);
            if (palavra.indexOf(letra) >= 0) {
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        palavraOculta[i] = letra;
                    }
                }
            } else {
                tentativasRestantes--;
            }
        }

        if (new String(palavraOculta).equals(palavra)) {
            System.out.println("Parabéns, você ganhou! A palavra era: " + palavra);
            historicoJogadores.get(nomeJogador)[0]++;
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavra);
            historicoJogadores.get(nomeJogador)[1]++;
        }

        System.out.println("Histórico de " + nomeJogador + ": " +
                "Jogadas ganhas: " + historicoJogadores.get(nomeJogador)[0] +
                ", Jogadas perdidas: " + historicoJogadores.get(nomeJogador)[1]);
    }

    private static void mostrarAlfabeto() {
        for (char letra = 'a'; letra <= 'z'; letra++) {
            if (letrasTentadas.contains(letra)) {
                System.out.print("(" + letra + ") ");
            } else {
                System.out.print(letra + " ");
            }
        }
        System.out.println();
    }
}

