import java.util.Scanner;
public class LP_Atividade_N2_03_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o PIN de acesso: ");
		int pinDigitado = sc.nextInt();
		int pinTentativa;
		int quantidadeTentativa = 0;
		// escolhi a repetição 'do-while' por fazer o loop ao menos uma vez, sendo necessária
		// nessa questão por necessitar ao menos uma tentativa para colocar a senha
		do {
		    pinTentativa = sc.nextInt();
		    quantidadeTentativa++;
		    if (pinTentativa != pinDigitado){
		        System.out.println("Pin incorreto. Tente novamente.");
		    }
		} while (pinTentativa != pinDigitado);
		System.out.println("Acesso concedido! Você utilizou " + quantidadeTentativa + " tentativa(s).");
		sc.close();
	}
}