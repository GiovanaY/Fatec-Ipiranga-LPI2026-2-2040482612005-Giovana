import java.util.Scanner;
public class LP_Atividade_N1_1_10_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe o valor A: ");
        double a = sc.nextDouble();
        System.out.print("Informe o valor B: ");
        double b = sc.nextDouble();
        System.out.print("Informe o valor C: ");
        double c = sc.nextDouble();
        System.out.print("Informe o valor D: ");
        double d = sc.nextDouble();
        System.out.print("Informe a media do aluno: ");
        double media = sc.nextDouble();
        System.out.print("Informe o percentual de presenca: ");
        double presenca = sc.nextDouble();
        
        double contaAritmetica1 = a * b / c + d - c;
        double contaAritmetica2 = (((a * b) / c) + d) - c;
        
        boolean aprovadoDireto;
        if ((media >= 6) && (presenca >= 75)) {
            aprovadoDireto = true;
        } else {
            aprovadoDireto = false;
        }
        
        System.out.println("--- Demostracao de Precendencia Aritmetica ---");
        System.out.println("Entradas -> A: " + a + " | B: " + b + " | C: " + c + " | D: " + d);
        System.out.println("Resultado sem pareteses: " + contaAritmetica1);
        System.out.println("Resultado com pareteses: " + contaAritmetica2);
        System.out.println("Nota: Ambos dao o mesmo resultado pela precedencia natural (*, / depois +), mas a segunda forma eh mais legivel.");
        
        System.out.println("\n--- Validacao do Criterio de Aprovacao ---");
        System.out.println("Entradas -> Media: " + media + " | Presença: " + presenca + "%");
        System.out.println("Resultado da avaliacao: " + aprovadoDireto);
        
		sc.close();
	}
}