import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira os valores dos lados do triângulo
        System.out.print("Digite o valor do primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o valor do segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o valor do terceiro lado: ");
        double lado3 = scanner.nextDouble();
        
        // Verifica se os lados podem formar um triângulo
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            // Verifica se o triângulo é equilátero, isósceles ou escaleno
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os valores formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os valores formam um triângulo isósceles.");
            } else {
                System.out.println("Os valores formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }
        
        scanner.close();
    }
}

