import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosBrancos = 0;
        int votosNulos = 0;
        int totalVotos = 0;
        
        System.out.println("Digite os votos (para terminar digitar qualquer valor negativo):");
        
        while(true) {
            int voto = scanner.nextInt();
            if (voto < 0) break;
            
            switch (voto) {
                case 1: votosCandidato1++; break;
                case 2: votosCandidato2++; break;
                case 3: votosCandidato3++; break;
                case 0: votosBrancos++; break;
                case 4: votosNulos++; break;
            }
            
            totalVotos++;
        }
        
        int vencedor = 1;
        int maxVotos = votosCandidato1;
        
        if (votosCandidato2 > maxVotos) {
            vencedor = 2;
            maxVotos = votosCandidato2;
        }
        
        if (votosCandidato3 > maxVotos) {
            vencedor = 3;
        }
        
        System.out.println("Número do vencedor da eleição: " + vencedor);
        System.out.println("Quantidade de votos brancos: " + votosBrancos);
        System.out.println("Quantidade de votos nulos: " + votosNulos);
        System.out.println("Número de eleitores que compareceram às urnas: " + totalVotos);
        
        scanner.close();
    }
}
