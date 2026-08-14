import java.util.Scanner;
public class LP_Atividade_N1_1_09_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe o nota final do aluno: ");
        double notaFinal = sc.nextDouble();
        
        System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
        if (notaFinal >= 6){
            System.out.println("Situação (if-else): Aprovado");
        } else{
            System.out.println("Situação (if-else): Desaprovado");
        }
        
        String notaTernario = (notaFinal >= 6) ? "Aprovado" : "Reprovado";
        System.out.println("--- Abordagem 2: Operador Ternario Simples ---");
        System.out.println(" Situacao (Ternario): " + notaTernario);
        
        // Se houvesse ternário encadeado (nested ternary):
        // String situacaoEscolar = (notaFinal >= 6) ? "Aprovado"
        //                      : (notaFinal >= 4) ? "Exame"
        //                      : "Reprovado";
        // Essa forma deve ser evitada por  dificil de entender e dar confusão à primeira vista,
        // principalmente ao adicionar mais condições ao ternário, o deixando mais complicado.
		sc.close();
	}
}