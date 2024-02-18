import java.io.FileInputStream;
import java.io.IOException;

public class ComparacaoDeArquivos {
    public static void main(String[] args) {
        String caminhoArquivo1 = "C:\\Users\\nelso\\Desktop\\Lab_Progr_modular\\Texto1.txt"; // Substitua pelo caminho do primeiro arquivo
        String caminhoArquivo2 = "C:\\Users\\nelso\\Desktop\\Lab_Progr_modular\\Texto2.txt"; // Substitua pelo caminho do segundo arquivo

        try (FileInputStream arquivo1 = new FileInputStream(caminhoArquivo1);
             FileInputStream arquivo2 = new FileInputStream(caminhoArquivo2)) {

            int posicao = 1;
            int byteArquivo1;
            int byteArquivo2;

            while ((byteArquivo1 = arquivo1.read()) != -1 && (byteArquivo2 = arquivo2.read()) != -1) {
                if (byteArquivo1 != byteArquivo2) {
                    System.out.println("Os arquivos diferem no caractere número: " + posicao);
                    return;
                }
                posicao++;
            }

            if (arquivo1.read() == -1 && arquivo2.read() == -1) {
                System.out.println("Os arquivos são iguais.");
            } else {
                System.out.println("Os arquivos diferem no caractere número: " + posicao);
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler os arquivos: " + e.getMessage());
        }
    }
}

