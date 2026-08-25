import java.util.Scanner;
public class LP_Atividade_N1_3_01_2040482612005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quatidade de leitura: ");
		int quantidadeLeituras = sc.nextInt();
		if (quantidadeLeituras < 1){
		    while (quantidadeLeituras < 1) {
                System.out.println ("Erro! Digite um numero positivo: ");
                quantidadeLeituras = sc.nextInt();
		    }
		}
		double[] temperatura = new double [quantidadeLeituras];
		
		for (int i = 0; i < quantidadeLeituras; i++){
		    System.out.print("Temperatura (ºC): ");
		    temperatura[i] = sc.nextDouble();
		}
		
		double maior = temperatura[0];
		double menor = temperatura[0];
		int indiceMaior = 0;
		int indiceMenor = 0;
		
		System.out.println("-- Leituras Registradas --");
		for (int j = 0; j < quantidadeLeituras; j++) {
		    System.out.println("Leitura [" + j +"]: " + temperatura[j] + "ºC");
		    if (temperatura[j] > maior) {
		        maior = temperatura[j];
		        indiceMaior = j;
		    }
		    if (temperatura[j] < menor) {
		        menor = temperatura[j];
		        indiceMenor = j;
		    }
		}
		
		System.out.println("-- Acesso Direto --");
		System.out.println("Primeira leitura (indice 0): " + temperatura[0] + "ºC");
		System.out.println("Ultima leitura (indice " + (temperatura.length - 1) + "): " + temperatura[temperatura.length - 1] + "ºC");
		
		System.out.println("-- Busca Linear: Extremos --");
		System.out.println("Maior temperatura: " + maior + "ºC (indice " + indiceMaior + ")");
		System.out.println("Menor temperatura: " + menor + "ºC (indice " + indiceMenor + ")");
		
		System.out.print("Temperatura critica de alerta (ºC): ");
		double temperaturaCritica = sc.nextDouble();
		boolean encontrouAlerta = false;
		System.out.println("-- Busca Linear: Alerta --");
		for (int k = 0; k < quantidadeLeituras; k++) {
		    if (temperaturaCritica < temperatura [k]) {
		        System.out.println("Alerta: temperatura critica atingida na leitura de indice " + k + "(" + temperatura[k] + "ºC).");
		        encontrouAlerta = true;
		    }
		}
	    if (!encontrouAlerta) {
	        System.out.println("Nenhuma leitura atingiu ou ultrapassou a temperatura critica informada.");
	    }	
	}
}