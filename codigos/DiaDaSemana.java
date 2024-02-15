import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira um número de 1 a 7
        System.out.print("Digite um número de 1 a 7 para saber o dia da semana correspondente: ");
        int numero = scanner.nextInt();
        
        // Verifica o número e informa o dia da semana correspondente
        switch (numero) {
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda-feira");
                break;
            case 3:
                System.out.println("3 - Terça-feira");
                break;
            case 4:
                System.out.println("4 - Quarta-feira");
                break;
            case 5:
                System.out.println("5 - Quinta-feira");
                break;
            case 6:
                System.out.println("6 - Sexta-feira");
                break;
            case 7:
                System.out.println("7 - Sábado");
                break;
            default:
                System.out.println("Erro: O número digitado não corresponde a um dia da semana.");
                break;
        }
        
        scanner.close();
    }
}
