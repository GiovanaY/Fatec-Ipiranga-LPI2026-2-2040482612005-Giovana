import java.util.Scanner;
public class LP_Atividade_N1_1_05_2040482612005
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println ("Estoque inicial: ");
		int estoque = sc.nextInt();
		if (estoque < 0){
		    do {
                System.out.println ("Erro! Digite um numero positivo: ");
                estoque = sc.nextInt();
		    } while (estoque < 0);
		}
		System.out.println ("Quatidade de entrada: ");
		int qtdEntrada = sc.nextInt();
		if (qtdEntrada < 0){
		    do {
                System.out.println ("Erro! Digite um numero positivo/nulo: ");
                qtdEntrada = sc.nextInt();
		    } while (qtdEntrada < 0);
		}
		System.out.println ("Quantidade de saida 1: ");
		int qtdSaida1 = sc.nextInt();
		if (qtdSaida1 < 0){
		    do {
                System.out.println ("Erro! Digite um numero positivo/nulo: ");
                qtdSaida1 = sc.nextInt();
		    } while (qtdSaida1 < 0);
		}
		System.out.println ("Quantidade de saida 2: ");
		int qtdSaida2 = sc.nextInt();
		if (qtdSaida2 < 0){
		    do {
                System.out.println ("Erro! Digite um numero positivo/nulo: ");
                qtdSaida2 = sc.nextInt();
		    } while (qtdSaida2 < 0);
		}
		System.out.println ("Estoque minimo: ");
		int estoqueMinimo = sc.nextInt();
		if (estoqueMinimo < 0){
		    do {
                System.out.println ("Erro! Digite um numero positivo: ");
                estoqueMinimo = sc.nextInt();
		    } while (estoqueMinimo < 0);
		}
		System.out.println ("Tamanho do lote (caixa): ");
		int tamanhoLote = sc.nextInt();
		if (tamanhoLote < 0){
		    do {
                System.out.println ("Erro! Digite um numero positivo: ");
                tamanhoLote = sc.nextInt();
		    } while (tamanhoLote < 0);
		}
		
		System.out.println ("Estoque inicial: " + estoque + " unidades.");
		if (qtdEntrada > 0) {
            System.out.println ("Apos entrada (+" + qtdEntrada + "): " + (estoque + qtdEntrada) + " unidades.");
		} else{
		    System.out.println ("Apos entrada (=" + qtdEntrada + "): " + (estoque + qtdEntrada) + " unidades.");
		}
		estoque = estoque + qtdEntrada;
		if (qtdSaida1 > 0) {
            System.out.println ("Apos saida (-" + qtdSaida1 + "): " + (estoque - qtdSaida1) + " unidades.");
		} else{
		    System.out.println ("Apos saida (=" + qtdSaida1 + "): " + (estoque - qtdSaida1) + " unidades.");
		}
		estoque = estoque - qtdSaida1;
		if (qtdSaida2 > 0) {
            System.out.println ("Apos saida (-" + qtdSaida2 + "): " + (estoque - qtdSaida2) + " unidades.");
		} else{
		    System.out.println ("Apos saida (=" + qtdSaida2 + "): " + (estoque - qtdSaida2) + " unidades.");
		}
		estoque = estoque - qtdSaida2;
		System.out.print ("O nivel de estoque atual (" + estoque + ") esta abaixo do minimo (" + estoqueMinimo +")? ");
		if (estoque/estoqueMinimo < 1) {
		    System.out.println ("true");
		} else {
		    System.out.println ("false");
		}
		System.out.println ("Unidades fora de caixas fechadas de 12: " + (estoque%tamanhoLote));
		System.out.print ("O estoque esta perfeitamente fracionado em caixas completas? ");
		if (estoque/tamanhoLote == 0){
		    System.out.println ("true");
		} else {
		    System.out.println ("false");
		}
		sc.close();
	}
}