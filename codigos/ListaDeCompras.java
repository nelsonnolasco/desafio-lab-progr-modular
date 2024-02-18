import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {
    private List<String> listaDeProdutos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ListaDeCompras() {
        // Lista inicial baseada em um serviço de delivery
        listaDeProdutos.add("banana");
        listaDeProdutos.add("melancia");
        listaDeProdutos.add("abacaxi");
        listaDeProdutos.add("manga");
        listaDeProdutos.add("maçã");
        // Adicione mais itens conforme necessário
    }

    public void imprimirLista() {
        System.out.println("Lista de Compras:");
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeProdutos.get(i));
        }
    }

    public void adicionarItem() {
        System.out.print("Digite o nome do produto para adicionar: ");
        String produto = scanner.nextLine();
        listaDeProdutos.add(produto);
        System.out.println(produto + " adicionado à lista.");
    }

    public void removerItem() {
        imprimirLista();
        System.out.print("Digite o número do item para remover: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir nova linha restante
        if (indice >= 0 && indice < listaDeProdutos.size()) {
            System.out.println(listaDeProdutos.remove(indice) + " removido da lista.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\nEscolha uma opção: \n1. Imprimir lista \n2. Adicionar item \n3. Remover item \n4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha restante

            switch (opcao) {
                case 1:
                    listaDeCompras.imprimirLista();
                    break;
                case 2:
                    listaDeCompras.adicionarItem();
                    break;
                case 3:
                    listaDeCompras.removerItem();
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}

