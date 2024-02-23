import java.util.Scanner;

public class IniciaisNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira o nome, nome do meio e o sobrenome
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite seu nome do meio: ");
        String nomeMeio = scanner.next();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        // Obtém as iniciais, no caso, utilizando também o nome do meio como é comum no aqui no Brasil
        char inicialNome = nome.charAt(0);
        char inicialNomeMeio = nomeMeio.charAt(0);
        char inicialSobrenome = sobrenome.charAt(0);
        
        // Exibe as iniciais
        System.out.println("As iniciais são: " + inicialNome + inicialNomeMeio + inicialSobrenome);
        
        scanner.close();
    }
}
