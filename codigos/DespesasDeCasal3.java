import java.util.Scanner;

public class DespesasDeCasal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o total de despesas pagas pelo marido:");
        double despesasMarido = scanner.nextDouble();
        
        System.out.println("Digite o total de despesas pagas pela esposa:");
        double despesasEsposa = scanner.nextDouble();
        
        System.out.println("Digite a renda do marido:");
        double rendaMarido = scanner.nextDouble();
        
        System.out.println("Digite a renda da esposa:");
        double rendaEsposa = scanner.nextDouble();
        
        double totalRenda = rendaMarido + rendaEsposa;
        double proporcaoMarido = rendaMarido / totalRenda;
        double proporcaoEsposa = rendaEsposa / totalRenda;
        
        double totalDespesas = despesasMarido + despesasEsposa;
        double valorDevidoMarido = totalDespesas * proporcaoMarido;
        double valorDevidoEsposa = totalDespesas * proporcaoEsposa;
        
        double saldoMarido = despesasMarido - valorDevidoMarido;
        double saldoEsposa = despesasEsposa - valorDevidoEsposa;
        
        System.out.printf("Total de Despesas: R$ %.2f\n", totalDespesas);
        System.out.printf("Valor Devido pelo Marido: R$ %.2f\n", valorDevidoMarido);
        System.out.printf("Valor Devido pela Esposa: R$ %.2f\n", valorDevidoEsposa);
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
