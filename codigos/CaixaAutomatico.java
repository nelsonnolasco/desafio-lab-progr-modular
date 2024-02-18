import java.util.Scanner;

public class CaixaAutomatico {
    private int notasDeDez;
    private int notasDeCinquenta;
    private int totalRetiradas;

    public CaixaAutomatico() {
        notasDeDez = 0;
        notasDeCinquenta = 0;
        totalRetiradas = 0;
    }

    public void adicionarNotas(int dez, int cinquenta) {
        notasDeDez += dez;
        notasDeCinquenta += cinquenta;
    }

    public boolean realizarRetirada(int valor) {
        int necessarioCinquenta = valor / 50;
        int necessarioDez = (valor % 50) / 10;

        if (necessarioCinquenta <= notasDeCinquenta && necessarioDez <= notasDeDez) {
            notasDeCinquenta -= necessarioCinquenta;
            notasDeDez -= necessarioDez;
            totalRetiradas += valor;
            System.out.println("Retirada efetuada com sucesso!");
            System.out.println("Notas de 50 entregues: " + necessarioCinquenta);
            System.out.println("Notas de 10 entregues: " + necessarioDez);
            return true;
        } else {
            System.out.println("Não há notas suficientes para a retirada.");
            return false;
        }
    }

    public void mostrarRelatorio() {
        System.out.println("Relatório do Caixa Automático:");
        System.out.println("Notas de 10 disponíveis: " + notasDeDez);
        System.out.println("Notas de 50 disponíveis: " + notasDeCinquenta);
        System.out.println("Valor total disponível: " + (notasDeDez * 10 + notasDeCinquenta * 50));
        System.out.println("Valor total de retiradas efetuadas: " + totalRetiradas);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaAutomatico caixa = new CaixaAutomatico();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Realizar retirada");
            System.out.println("2 - Adicionar notas");
            System.out.println("3 - Mostrar relatório");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor da retirada: ");
                    int valorRetirada = scanner.nextInt();
                    caixa.realizarRetirada(valorRetirada);
                    break;
                case 2:
                    System.out.print("Digite a quantidade de notas de 10 a adicionar: ");
                    int dez = scanner.nextInt();
                    System.out.print("Digite a quantidade de notas de 50 a adicionar: ");
                    int cinquenta = scanner.nextInt();
                    caixa.adicionarNotas(dez, cinquenta);
                    break;
                case 3:
                    caixa.mostrarRelatorio();
                    break;
                case 0:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
