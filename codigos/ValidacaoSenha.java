import java.util.HashMap;
import java.util.Scanner;

public class ValidacaoSenha {
    private static HashMap<String, String> usuariosAutorizados = new HashMap<>();
    static {
        // Lista de usuários e senhas autorizados
        usuariosAutorizados.put("usuario1", "senha123");
        usuariosAutorizados.put("usuario2", "senha321");
        // Adicione mais usuários e senhas conforme necessário
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        boolean acessoPermitido = false;

        while (tentativas < 3 && !acessoPermitido) {
            System.out.print("Digite seu nome de usuário: ");
            String nome = scanner.nextLine();
            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (senha.length() >= 4 && senha.length() <= 8) {
                if (usuariosAutorizados.containsKey(nome) && usuariosAutorizados.get(nome).equals(senha)) {
                    System.out.println("Acesso permitido!");
                    acessoPermitido = true;
                } else {
                    System.out.println("Nome de usuário ou senha incorretos.");
                }
            } else {
                System.out.println("A senha deve ter entre 4 e 8 caracteres.");
            }
            tentativas++;
        }

        if (!acessoPermitido) {
            System.out.println("Número máximo de tentativas alcançado. Acesso negado.");
        }

        scanner.close();
    }
}
