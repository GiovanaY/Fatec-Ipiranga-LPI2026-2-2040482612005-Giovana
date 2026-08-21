import java.util.Scanner;
public class LP_Atividade_N2_01_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantidade de alunos na turma: ");
		int quantidadeAlunos = sc.nextInt();
		double somaNota = 0;
		double notaMaior = 0;
		// escolhi a repetição 'for' por já existir uma quantidade de repetição predefinida
		// nessa situação
		for (int i = 1; i <= quantidadeAlunos; i++) {
		    System.out.print("Nota do aluno: ");
		    double nota = sc.nextDouble();
		    somaNota = somaNota + nota;
		    if (notaMaior < nota) {
		        notaMaior = nota;
		    }
		}
		double notaMedia = somaNota / quantidadeAlunos;
		System.out.println("Soma total das notas: " + somaNota);
		System.out.println("Media da turma: " + notaMedia);
		System.out.println("Maior nota da turma: " + notaMaior);
		sc.close();
	}
}