/* Para calcular a distância total percorrida ao final de um ano, considerando que você caminha 800 metros para ir e mais 800 metros para voltar do trabalho, 
5 dias por semana durante 45 semanas, a operação matemática seria:
{Distância diária (ida e volta)} = 800m \vezes 2
{Distância semanal} = {Distância diária} \vezes 5
{Distância anual} = {Distância semanal} \vezes 45
para converter metros em quilômetros, dividimos a distância anual por 1000.
*/

public class DevagarLonge {

    public static void main(String[] args) {
        // Distância de ida e volta em metros
        int distanciaIdaVolta = 800 * 2;
        
        // Distância percorrida em uma semana
        int distanciaSemanal = distanciaIdaVolta * 5;
        
        // Distância percorrida em um ano
        int distanciaAnual = distanciaSemanal * 45;
        
        // Conversão de metros para quilômetros
        double distanciaAnualKm = distanciaAnual / 1000.0;
        
        // Exibe o resultado
        System.out.printf("Distância percorrida em um ano: %.1f km\n", distanciaAnualKm);
    }
}

