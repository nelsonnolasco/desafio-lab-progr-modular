public class CPF2 {

    public static void main(String[] args) {
        String cpf = "397589236"; // Exemplo de CPF sem os dígitos verificadores
        int dv1 = calcularDV(cpf, 2, 10);
        int dv2 = calcularDV(cpf, 3, 11, dv1);

        System.out.println("DV1: " + dv1);
        System.out.println("DV2: " + dv2);
        System.out.println("Número de controle do CPF: " + (dv1 * 10 + dv2));
    }

    // Função auxiliar para calcular a soma ponderada
    private static int calcularSomaPonderada(String cpf, int pesoInicial, int pesoFinal) {
        int soma = 0;
        for (int i = 0; i < cpf.length(); i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (pesoFinal - i);
        }
        return soma;
    }

    // Função para calcular o DV1 ou DV2
    private static int calcularDV(String cpf, int pesoInicial, int pesoFinal) {
        int soma = calcularSomaPonderada(cpf, pesoInicial, pesoFinal);
        int resto = (soma * 10) % 11;
        return (resto == 10) ? 0 : resto;
    }

    // Sobrecarga da função para calcular o DV2
    private static int calcularDV(String cpf, int pesoInicial, int pesoFinal, int dv1) {
        int soma = calcularSomaPonderada(cpf, pesoInicial, pesoFinal) + (dv1 * 2);
        int resto = (soma * 10) % 11;
        return (resto == 10) ? 0 : resto;
    }
}

