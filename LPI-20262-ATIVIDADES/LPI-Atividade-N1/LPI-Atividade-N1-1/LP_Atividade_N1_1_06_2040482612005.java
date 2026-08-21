import java.util.Scanner;
public class LP_Atividade_N1_1_06_2040482612005
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print ("Informe o nome do usuario: ");
	    String texto = sc.nextLine();
	    
	    if (texto != null && texto.length() > 0) {
	        System.out.println ("Usuario valido fornecido: " + texto);
	    } else {
	        System.out.println ("Entrada rejeitada: O texto esta nulo ou vazio.");
	    }

		//Pois se usar o operador '&' simples, o programa obrigatoriamente precisará ler ambas condições no 'if'. Se o texto estiver nulo o a expressão "!null"
		//o declarará como false, porém ao tentar verificar a segunda parte das condições, tentará chamar o método length() e disparará um erro do tipo
		//NullPointerException, quebrando a execução do programa.

		sc.close();
	}
}