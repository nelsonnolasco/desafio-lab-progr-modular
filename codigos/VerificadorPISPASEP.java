import java.util.Scanner;

public class VerificadorPISPASEP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o número do PIS/PASEP sem o dígito verificador
        System.out.print("Digite o número do PIS/PASEP sem o dígito verificador: ");
        String numeroPisPasep = scanner.nextLine();
        
        // Verifica se o número tem 10 dígitos
        if (numeroPisPasep.length() != 10) {
            System.out.println("Erro: O número deve ter 10 dígitos.");
        } else {
            // Pesos para o cálculo do dígito verificador
            int[] pesos = {3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            int soma = 0;
            
            // Calcula a soma dos resultados das multiplicações
            for (int i = 0; i < 10; i++) {
                soma += Character.getNumericValue(numeroPisPasep.charAt(i)) * pesos[i];
            }
            
            // Calcula o dígito verificador
            int resto = soma % 11;
            int digitoVerificador = (resto < 2) ? 0 : 11 - resto;
            
            // Exibe o dígito verificador
            System.out.println("O dígito verificador é: " + digitoVerificador);
        }
        
        scanner.close();
    }
}

