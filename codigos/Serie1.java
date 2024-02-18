import java.util.Scanner;
S
public class Série1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número (ou '0' para sair): ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            double s = calcularS(n);
            System.out.printf("O valor de S para N=%d é: %.2f%n", n, s);
        }
        scanner.close();
    }

    public static double calcularS(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += (double) i / (n - i + 1);
        }
        return s;
    }
}
