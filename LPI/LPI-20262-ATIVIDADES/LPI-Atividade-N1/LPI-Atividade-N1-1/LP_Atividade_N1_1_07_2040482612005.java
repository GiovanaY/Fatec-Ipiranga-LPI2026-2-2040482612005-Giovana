import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class LP_Atividade_N1_1_07_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print ("Informe o valor A (ex.: 1.00): ");
		String valorA = sc.nextLine();
		System.out.print ("Informe o valor B (ex.: 0.90): ");
		String valorB = sc.nextLine();
		System.out.print ("Informe o valor total da compra: ");
		String valorCompra = sc.nextLine();
		System.out.print ("Informe o numero de parcelas: ");
		int numeroParcelas = sc.nextInt();
		
		System.out.println ("--- Demonstracao da imprecisao de padrao IEEE 754 (double) ---");
		double aDouble = Double.valueOf (valorA);
		double bDouble = Double.valueOf (valorB);
		System.out.println ("Resultado obtido com double: " + (aDouble - bDouble));
		
		System.out.println ("\n--- Correcao exata utilizando java.math.BigDecimal ---");
		BigDecimal bdA = new BigDecimal (valorA);
		BigDecimal bdB = new BigDecimal (valorB);
		System.out.println ("Resultado obtido com BigDecimal: " + (bdA.subtract(bdB)));
		
		System.out.println ("\n--- Divisao de parcelas com Escala e RoundingMode.HALP_UP ---");
		BigDecimal bdCompra = new BigDecimal (valorCompra);
		BigDecimal bdParcelas = new BigDecimal (numeroParcelas);
		System.out.println ("Compra de R$ " + valorCompra + " dividida em " + (numeroParcelas) + "x: R$ " + (bdCompra.divide(bdParcelas, 2, RoundingMode.HALF_UP)) + " por parcela.");

		sc.close();
	}
}