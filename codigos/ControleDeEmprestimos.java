import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ControleDeEmprestimos {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final List<Emprestimo> emprestimos = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        boolean executando = true;
        while (executando) {
            System.out.println("\nEscolha uma opção: \n1. Registrar empréstimo \n2. Registrar devolução \n3. Relatório de empréstimos \n4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha restante

            switch (opcao) {
                case 1:
                    registrarEmprestimo();
                    break;
                case 2:
                    registrarDevolucao();
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void registrarEmprestimo() throws ParseException {
        System.out.print("Digite o tipo do objeto: ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o nome do objeto: ");
        String nomeObjeto = scanner.nextLine();
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Digite a data de empréstimo (dd/MM/yyyy): ");
        Date dataEmprestimo = sdf.parse(scanner.nextLine());

        Emprestimo emprestimo = new Emprestimo(tipo, nomeObjeto, nomePessoa, dataEmprestimo);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado com sucesso.");
    }

    private static void registrarDevolucao() throws ParseException {
        System.out.print("Digite o nome do objeto devolvido: ");
        String nomeObjeto = scanner.nextLine();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getNomeObjeto().equalsIgnoreCase(nomeObjeto) && emprestimo.getDataDevolucao() == null) {
                System.out.print("Digite a data de devolução (dd/MM/yyyy): ");
                Date dataDevolucao = sdf.parse(scanner.nextLine());
                emprestimo.setDataDevolucao(dataDevolucao);
                System.out.println("Devolução registrada com sucesso.");
                return;
            }
        }
        System.out.println("Objeto não encontrado ou já devolvido.");
    }

    private static void gerarRelatorio() {
        System.out.print("Digite o número de dias para o relatório: ");
        int dias = scanner.nextInt();
        Date dataLimite = new Date(System.currentTimeMillis() - (dias * 24 * 60 * 60 * 1000L));
        System.out.println("Relatório de objetos emprestados há mais de " + dias + " dias:");
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataEmprestimo().before(dataLimite) && emprestimo.getDataDevolucao() == null) {
                System.out.println(emprestimo);
            }
        }
    }

    static class Emprestimo {
        private String tipo;
        private String nomeObjeto;
        private String nomePessoa;
        private Date dataEmprestimo;
        private Date dataUltimaCobranca;
        private Date dataDevolucao;

        public Emprestimo(String tipo, String nomeObjeto, String nomePessoa, Date dataEmprestimo) {
            this.tipo = tipo;
            this.nomeObjeto = nomeObjeto;
            this.nomePessoa = nomePessoa;
            this.dataEmprestimo = dataEmprestimo;
            this.dataUltimaCobranca = null;
            this.dataDevolucao = null;
        }

        // Getters e Setters omitidos para brevidade

        @Override
        public String toString() {
            return "Tipo: " + tipo +
                    ", Objeto: " + nomeObjeto +
                    ", Pessoa: " + nomePessoa +
                    ", Data de Empréstimo: " + sdf.format(dataEmprestimo) +
                    ", Data de Última Cobrança: " + (dataUltimaCobranca != null ? sdf.format(dataUltimaCobranca) : "Não cobrado") +
                    ", Data de Devolução: " + (dataDevolucao != null ? sdf.format(dataDevolucao) : "Não devolvido");
        }
    }
}
