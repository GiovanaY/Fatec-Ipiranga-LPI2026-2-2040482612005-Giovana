import java.util.Scanner;
public class LP_Atividade_N1_2_02_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double valorVenda;
		double valorTotal = 0;
		int quantidadeVenda = -1;
		System.out.print("Valor da venda (ou 0 para encerrar): ");
		valorVenda = sc.nextDouble();
		// escolhi a repetição 'while' por não saber a quantidade de repetições e
		// não ser necessário acontecer uma repetição ao menos uma vez
		while (valorVenda != 0){
		    System.out.print("Valor da venda (ou 0 para encerrar): ");
		    valorVenda = sc.nextDouble();
		    valorTotal = valorTotal + valorVenda;
		    quantidadeVenda++;
		}
		double valorMedio = valorTotal / quantidadeVenda;
		
		if (quantidadeVenda == -1){
			System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
		} else {
			System.out.println("Total vendido no turno: R$ " + valorTotal);
			System.out.println("Quantidade de vendas: " + quantidadeVenda);
			System.out.println("Valor medio por venda: R$ " + valorMedio);
		}

		
		sc.close();
	}
}