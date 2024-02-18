import java.io.*;
import java.util.*;

public class ValidacaoDeSenha {
    private static final String ARQUIVO_USUARIOS = "usuarios.txt";
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {
        carregarUsuarios();
        boolean executando = true;
        while (executando) {
            System.out.println("Escolha uma opção: \n1. Cadastrar \n2. Autenticar \n3. Terminar");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha restante
            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    autenticarUsuario();
                    break;
                case 3:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }

    private static void carregarUsuarios() {
        try (BufferedReader leitor = new BufferedReader(new FileReader(ARQUIVO_USUARIOS))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(":");
                usuarios.put(partes[0], partes[1]);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar usuários: " + e.getMessage());
        }
    }

    private static void cadastrarUsuario() {
        System.out.print("Digite o nome de usuário: ");
        String nome = scanner.nextLine();
        if (nome.length() < 4 || nome.length() > 8) {
            System.out.println("O nome deve ter entre 4 e 8 caracteres.");
            return;
        }
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        System.out.print("Confirme a senha: ");
        String confirmacaoSenha = scanner.nextLine();
        if (!senha.equals(confirmacaoSenha)) {
            System.out.println("As senhas não coincidem.");
            return;
        }
        if (senha.length() < 4 || senha.length() > 8) {
            System.out.println("A senha deve ter entre 4 e 8 caracteres.");
            return;
        }
        usuarios.put(nome, senha);
        salvarUsuarios();
        System.out.println("Usuário cadastrado com sucesso.");
    }

    private static void autenticarUsuario() {
        System.out.print("Digite o nome de usuário: ");
        String nome = scanner.nextLine();
        int tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            if (usuarios.containsKey(nome) && usuarios.get(nome).equals(senha)) {
                System.out.println("Usuário autenticado com sucesso.");
                return;
            } else {
                System.out.println("Nome de usuário ou senha incorretos.");
                tentativas++;
            }
        }
        System.out.println("Número máximo de tentativas alcançado.");
    }

    private static void salvarUsuarios() {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ARQUIVO_USUARIOS))) {
            for (Map.Entry<String, String> usuario : usuarios.entrySet()) {
                escritor.write(usuario.getKey() + ":" + usuario.getValue());
                escritor.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar usuários: " + e.getMessage());
        }
    }
}
