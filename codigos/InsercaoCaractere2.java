import java.util.Scanner;

public class InsercaoCaractere2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caractere;
        String texto;

        while (true) {
            System.out.print("Digite uma cadeia de caracteres (ou pressione Enter para sair): ");
            texto = scanner.nextLine();
            if (texto.isEmpty()) {
                break;
            }

            System.out.print("Digite o caractere a ser inserido: ");
            caractere = scanner.nextLine();

            String textoModificado = texto.replaceAll("(.)", "$1" + caractere).replaceAll(caractere + "$", "");
            System.out.println("Cadeia de caracteres modificada: " + textoModificado);
        }
        scanner.close();
    }
}

