import java.util.Scanner;
public class LP_Atividade_N2_02_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double valorVenda;
		double valorTotal = 0;
		int quantidadeVenda = -1;
		// escolhi a repetição 'do-while' por fazer o loop ao menos uma vez, o qual
		// esta questão precisa por causa do 0 para terminar o operador
		do{
		    System.out.print("Valor da venda (ou 0 para encerrar): ");
		    valorVenda = sc.nextDouble();
		    valorTotal = valorTotal + valorVenda;
		    quantidadeVenda++;
		} while (valorVenda != 0);
		double valorMedio = valorTotal / quantidadeVenda;
		
		System.out.println("Total vendido no turno: R$ " + valorTotal);
		System.out.println("Quantidade de vendas: " + quantidadeVenda);
		System.out.println("Valor medio por venda: R$ " + valorMedio);
		sc.close();
	}
}