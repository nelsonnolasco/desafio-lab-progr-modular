import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContagemDeCaracteres {
    public static void main(String[] args) {
        String caminhoDoArquivo = "C:\\Users\\nelso\\Desktop\\Lab_Progr_modular\\Texto1.txt"; // Substitua pelo caminho do seu arquivo

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            int caracteres = 0;
            int lido;
            while ((lido = leitor.read()) != -1) {
                caracteres++;
            }
            System.out.println("O arquivo tem " + caracteres + " caracteres.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
