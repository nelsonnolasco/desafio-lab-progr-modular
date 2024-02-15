import java.util.Scanner;

public class ValidadorData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma data
        System.out.print("Digite uma data no formato 'DD/MM/AAAA': ");
        String data = scanner.nextLine();
        
        // Verifica se a data tem o tamanho correto
        if (data.length() != 10) {
            System.out.println("Erro: A data deve ter o formato 'DD/MM/AAAA'.");
        } else if (data.charAt(2) != '/' || data.charAt(5) != '/') {
            System.out.println("Erro: As barras não estão nas posições corretas.");
        } else {
            // Extrai o dia, mês e ano da data
            String[] partesData = data.split("/");
            int dia = Integer.parseInt(partesData[0]);
            int mes = Integer.parseInt(partesData[1]);
            int ano = Integer.parseInt(partesData[2]);
            
            // Verifica a validade do dia e do mês
            if (dia < 1 || dia > 31) {
                System.out.println("Erro: O dia deve estar entre 1 e 31.");
            } else if (mes < 1 || mes > 12) {
                System.out.println("Erro: O mês deve estar entre 1 e 12.");
            } else {
                System.out.println("A data está correta.");
            }
        }
        
        scanner.close();
    }
}

