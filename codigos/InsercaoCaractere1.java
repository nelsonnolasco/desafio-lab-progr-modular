import java.util.Scanner;

public class InsercaoCaractere1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma cadeia de caracteres: ");
        String texto = scanner.nextLine();
        scanner.close();

        String textoComHifens = texto.replaceAll("(.)", "$1-").replaceAll("-$", "");
        System.out.println("Cadeia de caracteres com hifens: " + textoComHifens);
    }
}

