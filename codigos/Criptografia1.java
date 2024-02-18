import java.util.Scanner;

public class Criptografia1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Codificar cadeia");
            System.out.println("2 - Decodificar cadeia");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a cadeia a ser codificada: ");
                    String cadeia = scanner.nextLine();
                    System.out.println("Cadeia codificada: " + codificar(cadeia));
                    break;
                case 2:
                    System.out.print("Digite a cadeia a ser decodificada: ");
                    cadeia = scanner.nextLine();
                    System.out.println("Cadeia decodificada: " + decodificar(cadeia));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static String codificar(String cadeia) {
        StringBuilder cadeiaCodificada = new StringBuilder();
        for (char caractere : cadeia.toCharArray()) {
            cadeiaCodificada.append((char) (caractere + 1));
        }
        return cadeiaCodificada.toString();
    }

    public static String decodificar(String cadeia) {
        StringBuilder cadeiaDecodificada = new StringBuilder();
        for (char caractere : cadeia.toCharArray()) {
            cadeiaDecodificada.append((char) (caractere - 1));
        }
        return cadeiaDecodificada.toString();
    }
}
