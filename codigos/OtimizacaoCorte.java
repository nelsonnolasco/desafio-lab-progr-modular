public class OtimizacaoCorte {

    public static void main(String[] args) {
        // Comprimentos das tábuas em centímetros. (fiz muitos destes exercícios em Python em Cálculo Numárico)
        int[] comprimentosTabuas = {300, 400, 500};
        int comprimentoPeca = 45;

        for (int comprimentoTabua : comprimentosTabuas) {
            int quantidadePecas = comprimentoTabua / comprimentoPeca;
            int sobra = comprimentoTabua % comprimentoPeca;

            System.out.println("Para uma tábua de " + comprimentoTabua / 100 + " metros:");
            System.out.println("Quantidade de peças: " + quantidadePecas);
            System.out.println("Sobra: " + sobra + " cm\n");
        }
    }
}
