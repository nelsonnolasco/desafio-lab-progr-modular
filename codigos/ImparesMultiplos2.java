import java.util.Scanner;

public class ImparesMultiplos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o limite inferior e superior da faixa
        System.out.print("Digite o limite inferior da faixa: ");
        int limiteInferior = scanner.nextInt();
        System.out.print("Digite o limite superior da faixa: ");
        int limiteSuperior = scanner.nextInt();
        
        int soma = 0;
        StringBuilder numerosDecrescentes = new StringBuilder();
        
        // Ajusta o limite superior para ser o próximo número ímpar múltiplo de três, se necessário
        if (limiteSuperior % 2 == 0 || limiteSuperior % 3 != 0) {
            limiteSuperior -= (limiteSuperior % 6 == 0) ? 3 : limiteSuperior % 3 + ((limiteSuperior % 2 == 0) ? 2 : 1);
        }
        
        // Calcula a soma e constrói a string com os números em ordem decrescente
        for (int i = limiteSuperior; i >= limiteInferior; i -= 6) {
            if (i % 2 != 0 && i % 3 == 0) {
                soma += i;
                numerosDecrescentes.append(i).append(" ");
            }
        }
        
        // Exibe a soma e os números ímpares múltiplos de três em ordem decrescente
        System.out.println("A soma dos números ímpares múltiplos de três na faixa é: " + soma);
        System.out.println("Números ímpares múltiplos de três na faixa, em ordem decrescente:");
        System.out.println(numerosDecrescentes.toString().trim());
        
        scanner.close();
    }
}
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
