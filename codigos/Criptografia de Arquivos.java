import java.io.*;

public class CriptografiaDeArquivos {
    public static void main(String[] args) {
        String caminhoDoArquivoOriginal = "caminho/para/o/arquivo/original.txt"; // Substitua pelo caminho do arquivo original no seu HD/SD usando 2 barras na separação dos diretórios
        String caminhoDoArquivoCriptografado = "caminho/para/o/arquivo/criptografado.txt"; // Substitua pelo caminho do arquivo criptografado no seu HD/SD usando 2 barras na separação dos diretórios

        try (FileInputStream entrada = new FileInputStream(caminhoDoArquivoOriginal);
             FileOutputStream saida = new FileOutputStream(caminhoDoArquivoCriptografado)) {

            int byteLido;
            while ((byteLido = entrada.read()) != -1) {
                saida.write(byteLido + 1);
            }

            System.out.println("Arquivo criptografado com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na criptografia: " + e.getMessage());
        }
    }
}
