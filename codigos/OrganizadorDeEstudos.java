import java.util.Scanner;

public class OrganizadorDeEstudos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados (Tempo disponível + quantidade de disciplinas)
        System.out.println("Digite o tempo total disponível (horas e minutos - cada um em uma linha):");
        int horas = scanner.nextInt();
        int minutos = scanner.nextInt();
        System.out.println("Digite o número de disciplinas a serem estudadas:");
        int disciplinas = scanner.nextInt();
        
        // Conversão do tempo total passado pelo estudante para minutos
        int tempoTotalMinutos = horas * 60 + minutos;
        
        // Cálculo do tempo de estudo passado pelo estudante já transformado em minutos e intervalos correspondentes ao número de matérias - (uso mod e div)
        int tempoTotalIntervalos = (disciplinas - 1) * 15; // 15 minutos de intervalo entre cada disciplina
        int tempoEstudoDisponivel = tempoTotalMinutos - tempoTotalIntervalos;
        
        if (tempoEstudoDisponivel <= 0) {
            System.out.println("Não há tempo suficiente para estudo e intervalos.");
        } else {
            int tempoPorDisciplina = tempoEstudoDisponivel / disciplinas;
            int sobraMinutos = tempoEstudoDisponivel % disciplinas;
            
            System.out.println("Tempo de estudo por disciplina: " + tempoPorDisciplina + " minutos");
            if (sobraMinutos > 0) {
                System.out.println("Sobrarão " + sobraMinutos + " minutos ao fim do estudo.");
            }
        }
        
        scanner.close();
    }
}