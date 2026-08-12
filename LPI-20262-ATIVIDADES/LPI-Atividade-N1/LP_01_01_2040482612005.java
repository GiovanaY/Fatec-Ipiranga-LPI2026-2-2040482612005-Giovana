import java.util.Scanner;
public class LP_01_01_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Digite a idade: ");
		byte idade = sc.nextByte(); //tamanho: 8 bits; intevalo: -128 a 127
		
		System.out.println ("Digite a qtd. de faltas: ");
		short faltas = sc.nextShort(); //tamanho: 16 bits; intervalo: -32.768 a 32.767
		
		System.out.println ("Digite o ID: ");
		int matriculaId = sc.nextInt(); //tamanho: 32 bits; intervalo: -2.147.483.648 a 2.147.483.647
		
		System.out.println ("Digite o codigo nacional do estudante: ");
		long codigoNacional = sc.nextLong(); //tamanho: 64 bits; intervalo: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
		
		System.out.println ("Digite a nota de trabalho: ");
		float notaTrabalho = sc.nextFloat(); //tamanho: 32 bits; intervalo: ±1.4E-45 a ±3.4028235E38
		
		System.out.println ("Digite a nota de prova final: ");
		double notaProvaFinal = sc.nextDouble(); //tamanho: 64 bits; intervalo: ±4.9E-324 a ±1.7976931348623157E308
		
		System.out.println ("Digite o conceito final do aluno: ");
		char conceitoFinal = sc.next().charAt(0); //tamanho: 16 bits; intervalo: 0 a 65.535
		
		System.out.println ("Digite se o aluno esta aprovado/reprovado (true/false): ");
		boolean aprovado = sc.nextBoolean(); // tamanho: 1 bit; intervalo: true ou false (duas possibilidades)
		
		System.out.println ("Idade do Aluno: " + idade);
		System.out.println ("Numero de Faltas: " + faltas);
		System.out.println ("Matricula ID: " + matriculaId);
		System.out.println ("Codigo Nacional do Estudante: " + codigoNacional);
		System.out.println ("Nota do Trabalho: " + notaTrabalho);
		System.out.println ("Nota da Prova Final do Aluno: " + notaProvaFinal);
		System.out.println ("Conceito Final do Aluno: " + conceitoFinal);
		System.out.println ("Aluno esta Aprovado (true/false): " + aprovado);
	}
}