import java.util.Scanner;

public class ComponentesData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma data no formato 'dd/mm/aa'
        System.out.print("Digite uma data no formato 'dd/mm/aa': ");
        String data = scanner.nextLine();
        
        // Divide a string da data em dia, mês e ano
        String[] partesData = data.split("/");
        
        // Exibe o dia, mês e ano separadamente
        System.out.println("Dia: " + partesData[0]);
        System.out.println("Mês: " + partesData[1]);
        System.out.println("Ano: " + partesData[2]);
        
        scanner.close();
    }
}

