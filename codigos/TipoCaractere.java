import java.util.Scanner;

public class TipoCaractere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira um caractere
        System.out.print("Digite um caractere: ");
        String entrada = scanner.nextLine();
        
        // Verifica se o usuário digitou apenas um caractere
        if (entrada.length() != 1) {
            System.out.println("Erro: Por favor, digite apenas um único caractere.");
        } else {
            char caractere = entrada.charAt(0);
            
            // Verifica se o caractere é uma letra ou o "ç"
            if (Character.isLetter(caractere) || caractere == 'ç') {
                System.out.println("O caractere é uma letra.");
            }
            // Verifica se o caractere é um dígito
            else if (Character.isDigit(caractere)) {
                System.out.println("O caractere é um dígito.");
            }
            // Verifica se o caractere é um operador aritmético
            else if ("+-*/%".indexOf(caractere) != -1) {
                System.out.println("O caractere é um operador aritmético.");
            }
            // Se não for nenhum dos anteriores
            else {
                System.out.println("O caractere não é letra, dígito, nem operador aritmético.");
            }
        }
        
        scanner.close();
    }
}

