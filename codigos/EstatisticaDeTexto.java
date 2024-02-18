import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EstatisticaDeTexto {
    public static void main(String[] args) {
        String caminhoDoArquivo = "C:\\Users\\nelso\\Desktop\\Lab_Progr_modular\\Texto2.txt"; // Substitua pelo caminho do seu arquivo
        Map<Character, Integer> frequenciaLetras = new HashMap<>();
        int numeroDeLinhas = 0;
        int numeroDeLetras = 0;
        int numeroDePalavras = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                numeroDeLinhas++;
                String[] palavras = linha.split("\\s+");
                numeroDePalavras += palavras.length;

                for (char letra : linha.replaceAll("\\s+", "").toCharArray()) {
                    numeroDeLetras++;
                    frequenciaLetras.put(letra, frequenciaLetras.getOrDefault(letra, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("Quantidade de linhas: " + numeroDeLinhas);
        System.out.println("Quantidade de letras: " + numeroDeLetras);
        System.out.println("Quantidade de palavras: " + numeroDePalavras);
        System.out.println("Frequência de cada letra:");
        frequenciaLetras.forEach((letra, frequencia) -> System.out.println(letra + ": " + frequencia));
    }
}

