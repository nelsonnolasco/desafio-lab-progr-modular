public class ImparesMultiplos1 {
    public static void main(String[] args) {
        int soma = 0;
        
        for (int i = 1; i <= 1000; i++) {
            // Verifica se o número é ímpar e múltiplo de três
            if (i % 2 != 0 && i % 3 == 0) {
                soma += i;
            }
        }
        
        System.out.println("A soma de todos os números ímpares múltiplos de três de 1 a 1000 é: " + soma);
    }
}
