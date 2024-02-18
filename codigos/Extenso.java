import java.text.DecimalFormat;
import java.util.Scanner;

public class Extenso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor monetário: ");
        double valor = scanner.nextDouble();

        String valorExtenso = numeroPorExtenso(valor);
        System.out.println("Valor por extenso: " + valorExtenso);

        scanner.close();
    }

    public static String numeroPorExtenso(double valor) {
        // Formatação do número para evitar problemas com ponto flutuante
        DecimalFormat df = new DecimalFormat("#.00");
        String valorFormatado = df.format(valor);

        // Dividir o valor em reais e centavos
        String[] partes = valorFormatado.split("\\.");
        String reais = partes[0];
        String centavos = partes[1];

        // Converter para extenso
        String reaisExtenso = converteParaExtenso(reais) + " reais";
        String centavosExtenso = converteParaExtenso(centavos) + " centavos";

        return reaisExtenso + " e " + centavosExtenso;
    }

    public static String converteParaExtenso(String numero) {
        // Implementação da conversão de números para extenso
        // Esta é uma função simplificada e deve ser expandida para cobrir todos os casos
        switch (numero) {
            case "1":
                return "um";
            case "2":
                return "dois";
            case "3":
                return "três";
            // Adicione mais casos conforme necessário
            default:
                return "zero";
        }
    }
}

