import java.util.Scanner;

public class DespesasDeCasal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o total de despesas pagas pelo marido:");
        double despesasMarido = scanner.nextDouble();
        
        System.out.println("Digite o total de despesas pagas pela esposa:");
        double despesasEsposa = scanner.nextDouble();
        
        double totalDespesas = despesasMarido + despesasEsposa;
        double percentualMarido = (despesasMarido / totalDespesas) * 100;
        double percentualEsposa = (despesasEsposa / totalDespesas) * 100;
        double valorDevido = totalDespesas / 2;
        double saldoMarido = despesasMarido - valorDevido;
        double saldoEsposa = despesasEsposa - valorDevido;
        
        System.out.printf("Total de Despesas: R$ %.2f\n", totalDespesas);
        System.out.printf("Percentual Pago pelo Marido: %.2f%%\n", percentualMarido);
        System.out.printf("Percentual Pago pela Esposa: %.2f%%\n", percentualEsposa);
        System.out.printf("Valor Devido por Cada Um: R$ %.2f\n", valorDevido);
        System.out.printf("Saldo do Marido: R$ %.2f\n", saldoMarido);
        System.out.printf("Saldo da Esposa: R$ %.2f\n", saldoEsposa);
        
        if (saldoMarido > 0) {
            System.out.printf("A esposa deve ao marido: R$ %.2f\n", saldoMarido);
        } else if (saldoEsposa > 0) {
            System.out.printf("O marido deve à esposa: R$ %.2f\n", saldoEsposa);
        } else {
            System.out.println("Os saldos estão equilibrados, não há dívidas entre o casal.");
        }
        
        scanner.close();
    }
}
