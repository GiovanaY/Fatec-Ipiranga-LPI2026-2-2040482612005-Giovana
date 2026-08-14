import java.util.Scanner;
public class LP_Atividade_N1_1_02_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Valor para comparacao de primitivos: ");
		int valorPrimitivo = sc.nextInt();
		System.out.println ("Valor para comparacao de objetos (new Integer): ");
		int valorObjeto = sc.nextInt();
		System.out.println ("Valor dentro do Integer Cache (-128 a 127): ");
		int valorCache = sc.nextInt();
		System.out.println ("Valor fora do Integer Cache: ");
		int valorForaCache = sc.nextInt();

		System.out.println ("--- Comparacao de Primitivos (int) ---");
		int aPrimitivo = valorPrimitivo;
		int bPrimitivo = valorPrimitivo;
		System.out.println ("aPrimitivo == bPrimitivo: " + (aPrimitivo==bPrimitivo));

		System.out.println ("\n--- Comparacao de Objetos via 'new Integer()' ---");
		Integer aObjeto = new Integer (valorObjeto);
		Integer bObjeto = new Integer (valorObjeto);
		System.out.println ("aObjeto == bObjeto: " + (aObjeto==bObjeto));
		System.out.println ("aObjeto.equals(bObjeto): " + (aObjeto.equals(bObjeto)));

		System.out.println ("\n--- Comparacao com Autoboxing e Integer Cache ---");
		Integer xCache = valorCache;
		Integer yCache = valorCache;
		Integer xForaCache = valorForaCache;
		Integer yForaCache = valorForaCache;
		System.out.println ("Dentro do Cache -> xCache == yCache: " + (xCache==yCache));
		System.out.println ("Fora do Cache -> xForaCache == yForaCache: " + (xForaCache==yForaCache));
		System.out.println ("Fota do Cache -> xForaCache.equals(yForaCache): " + (xForaCache.equals(yForaCache)));
		sc.close();
	}
}