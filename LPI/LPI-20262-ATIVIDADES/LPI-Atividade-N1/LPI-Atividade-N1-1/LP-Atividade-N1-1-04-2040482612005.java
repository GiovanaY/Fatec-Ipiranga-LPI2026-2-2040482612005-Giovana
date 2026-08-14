import java.util.Scanner;
public class LP-Atividade-N1-1-04-2040482612005
{
    public static final String INSTITUICAO = "FATEC Ipiranga";
    public static final int PRAZO_MAXIMO_PADRAO = 14;
    
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número de dias do empréstimo: ");
		final int diasEmprestimo = sc.nextInt();
		System.out.println ("Intituição: " + INSTITUICAO);
		System.out.println ("Prazo Maximo Padrao: " + PRAZO_MAXIMO_PADRAO);
		if (diasEmprestimo > PRAZO_MAXIMO_PADRAO) {
		    System.out.println ("Dias calculados para devolucao: " + PRAZO_MAXIMO_PADRAO);
		} else {
		    System.out.println ("Dias calculados para devolucao: " + diasEmprestimo);
		}
		sc.close();
	}
}