import java.util.Scanner;
public class LP-Atividade-N1-1-03-2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer idade = null;
		System.out.println ("Tentando realizar operação aritmética com Integer nulo...");
		try {
		    System.out.println (idade + 1);
		} catch (NullPointerException e) {
		    System.out.println ("Erro Capturado com sucesso: Nao foi possivel calcular porque a idade não foi informada(null)");
            System.out.println ("Detalhe da excecao: java.lang.NullPointerException");
		}
		System.out.println ("Informe uma idade válida: ");
		int novaIdade = sc.nextInt();
		System.out.println ("Reatribuindo valor válido para a variavel...");
		int contaAritmetica = novaIdade + 1;
		System.out.println ("Operação bem sucedida! Idade atual: " + novaIdade + " | Idade no proximo ano: " + contaAritmetica);
		sc.close();
	}
}