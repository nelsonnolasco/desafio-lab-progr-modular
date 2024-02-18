import java.util.Scanner;

public class Criptografia2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 'c' para criptografar ou 'd' para decifrar:");
        char opcao = scanner.nextLine().charAt(0);

        if (opcao == 'c') {
            System.out.println("Digite a mensagem para criptografar:");
            String mensagem = scanner.nextLine();
            String criptografada = criptografar(mensagem);
            System.out.println("Mensagem criptografada: " + criptografada);
        } else if (opcao == 'd') {
            System.out.println("Digite a mensagem para decifrar:");
            String mensagem = scanner.nextLine();
            String decifrada = decifrar(mensagem);
            System.out.println("Mensagem decifrada: " + decifrada);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public static String criptografar(String mensagem) {
        StringBuilder criptografada = new StringBuilder();
        mensagem = mensagem.replace(" ", ""); // Remover espaços
        int tamanho = mensagem.length();
        int colunas = 5;
        int linhas = (int) Math.ceil(tamanho / (double) colunas);

        for (int c = 0; c < colunas; c++) {
            for (int l = 0; l < linhas; l++) {
                int index = l * colunas + c;
                if (index < tamanho) {
                    criptografada.append(mensagem.charAt(index));
                }
            }
            if (c < colunas - 1) {
                criptografada.append('/');
            }
        }
        return criptografada.toString();
    }

    public static String decifrar(String mensagem) {
        String[] blocos = mensagem.split("/");
        int linhas = blocos.length;
        int colunas = blocos[0].length();
        StringBuilder decifrada = new StringBuilder();

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                if (l < blocos[c].length()) {
                    decifrada.append(blocos[c].charAt(l));
                }
            }
        }
        return decifrada.toString();
    }
}

