import java.util.Scanner;
public class LP-Atividade-N1-1-08-2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = sc.nextDouble();
        System.out.print("Informe o numero de parcelas: ");
        int numeroParcelas = sc.nextInt();
        
        long valorCentavos = Math.round(valorTotalReais * 100);
        long valorDiv = Math.round(valorCentavos/numeroParcelas);
        double valorExibicao = valorDiv / 100.0;
        System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + valorCentavos + " centavos.");
        System.out.println("Divisao de R$" + valorTotalReais + " por " + numeroParcelas + " em centavos: " + valorDiv + " centavos por parcela.");
        System.out.println("Valor convertido para exibicao: R$ " + valorExibicao);
        
        //Como vantagem, este código apresenta alto desempenho e baixo consumo de memória por usar o tipo primitivo (long).
        //Já como desvantagem temos a falta de arrendondamento no sistema, o que pode causar descarte de centavos na divisão.
        
		sc.close();
	}
}