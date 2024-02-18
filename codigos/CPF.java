import java.util.Scanner;

public class CPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os 9 primeiros dígitos do CPF: ");
        String cpf = scanner.nextLine();
        scanner.close();

        if (cpf.length() == 9 && cpf.matches("\\d+")) {
            int dv1 = calcularDV1(cpf);
            int dv2 = calcularDV2(cpf, dv1);

            System.out.println("Os dígitos verificadores são: " + dv1 + " e " + dv2);
            System.out.println("O número de controle do CPF é: " + dv1  + dv2);
        } else {
            System.out.println("CPF inválido. Por favor, digite exatamente 9 dígitos numéricos.");
        }
    }

    private static int calcularDV1(String cpf) {
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int resto = (soma * 10) % 11;
        return (resto == 10) ? 0 : resto;
    }

    private static int calcularDV2(String cpf, int dv1) {
        int soma = dv1 * 2;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int resto = (soma * 10) % 11;
        return (resto == 10) ? 0 : resto;
    }
}
