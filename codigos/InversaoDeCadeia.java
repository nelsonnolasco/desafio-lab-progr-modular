import java.util.Scanner;

public class InversaoDeCadeia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadeia;

        while (true) {
            System.out.print("Digite uma cadeia de caracteres (ou pressione Enter para sair): ");
            cadeia = scanner.nextLine();
            if (cadeia.isEmpty()) {
                break;
            }

            String cadeiaInvertida = new StringBuilder(cadeia).reverse().toString();
            System.out.println("Cadeia invertida: " + cadeiaInvertida);
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
