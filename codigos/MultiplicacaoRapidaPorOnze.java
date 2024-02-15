import java.util.Scanner;

public class MultiplicacaoRapidaPorOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira um número de dois dígitos
        System.out.print("Digite um número de dois dígitos para multiplicar por 11: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número está no intervalo de 10 a 99
        if (numero < 10 || numero > 99) {
            System.out.println("Erro: Por favor, digite um número de dois dígitos.");
        } else {
            int digitoEsquerda = numero / 10;
            int digitoDireita = numero % 10;
            int somaDigitos = digitoEsquerda + digitoDireita;
            
            // Constrói o resultado final
            String resultado;
            if (somaDigitos < 10) {
                resultado = "" + digitoEsquerda + somaDigitos + digitoDireita;
            } else {
                resultado = "" + (digitoEsquerda + 1) + (somaDigitos % 10) + digitoDireita;
            }
            
            // Exibe o resultado da multiplicação
            System.out.println("O resultado de " + numero + " x 11 é: " + resultado);
        }
        
        scanner.close();
    }
}

