public class FuncoesAninhadas {
    public static void main(String[] args) {
        // Calcula a raiz quadrada de 3
        double raiz = Math.sqrt(3);

        // Arredonda o resultado
        long resultadoArredondado = Math.round(raiz);

        // Calcula a exponencial do valor arredondado
        double exponencial = Math.exp(resultadoArredondado);

        // Exibe os resultados
        System.out.println("Raiz quadrada de 3: " + raiz);
        System.out.println("Resultado arredondado: " + resultadoArredondado);
        System.out.println("Exponencial do valor arredondado: " + exponencial);
    }
}

