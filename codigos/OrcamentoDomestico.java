import java.util.*;

public class OrcamentoDomestico {
    private Map<String, Double> receitas = new HashMap<>();
    private Map<String, Double> despesas = new HashMap<>();
    private Map<String, Map<String, Double>> categorias = new HashMap<>();

    public void adicionarReceita(String descricao, double valor) {
        receitas.put(descricao, valor);
    }

    public void adicionarDespesa(String descricao, double valor, String categoria) {
        despesas.put(descricao, valor);
        categorias.computeIfAbsent(categoria, k -> new HashMap<>()).put(descricao, valor);
    }

    public double calcularSaldo() {
        double totalReceitas = receitas.values().stream().mapToDouble(Double::doubleValue).sum();
        double totalDespesas = despesas.values().stream().mapToDouble(Double::doubleValue).sum();
        return totalReceitas - totalDespesas;
    }

    public void imprimirRelatorio() {
        System.out.println("Relatório de Orçamento Doméstico:");
        System.out.println("Receitas:");
        receitas.forEach((descricao, valor) -> System.out.println(descricao + ": " + valor));
        System.out.println("Despesas:");
        despesas.forEach((descricao, valor) -> System.out.println(descricao + ": " + valor));
        System.out.println("Categorias:");
        categorias.forEach((categoria, valores) -> {
            System.out.println(categoria + ":");
            valores.forEach((descricao, valor) -> System.out.println("  " + descricao + ": " + valor));
        });
        System.out.println("Saldo disponível: " + calcularSaldo());
    }

    public static void main(String[] args) {
        OrcamentoDomestico orcamento = new OrcamentoDomestico();
        orcamento.adicionarReceita("Salário", 5000.00);
        orcamento.adicionarDespesa("Aluguel", 1500.00, "Moradia");
        orcamento.adicionarDespesa("Supermercado", 300.00, "Alimentação");
        orcamento.adicionarDespesa("Gasolina", 200.00, "Automóvel");
        // Continue adicionando receitas e despesas conforme necessário

        orcamento.imprimirRelatorio();
    }
}

