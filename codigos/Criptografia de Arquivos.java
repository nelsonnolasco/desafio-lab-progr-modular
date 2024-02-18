import java.io.*;

public class CriptografiaDeArquivos {
    public static void main(String[] args) {
        String caminhoDoArquivoOriginal = "caminho/para/o/arquivo/original.txt"; // Substitua pelo caminho do arquivo original
        String caminhoDoArquivoCriptografado = "caminho/para/o/arquivo/criptografado.txt"; // Substitua pelo caminho do arquivo criptografado

        try (FileInputStream entrada = new FileInputStream(caminhoDoArquivoOriginal);
             FileOutputStream saida = new FileOutputStream(caminhoDoArquivoCriptografado)) {

            int byteLido;
            while ((byteLido = entrada.read()) != -1) {
                saida.write(byteLido + 1);
            }

            System.out.println("Arquivo criptografado com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro durante a criptografia: " + e.getMessage());
        }
    }
}
