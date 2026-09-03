/*-------------------------------------------------------- *
* Disciplina: Linguagem de Programacao                     *
*          Prof. Verissimo                                 *
*--------------------------------------------------------- *
* Objetivo do Programa: Simulação da sequência Xeque       *
*                       Pastor usando matriz bidimensional *
*                       8x8.                               *
* Data - 02/09/2026                                        *
* Autor: Giovana Yuri Nakamura                             *
*--------------------------------------------------------- */
public class LP_Atividade_N1_4_01_2040482612005
{
	private static final int TAMANHO_TABULEIRO = 8;
	public static void main(String[] args) {
	    String[][] tabuleiro = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];
	    
	    // Exibição da posição inicial do tabuleiro
	    posicaoInicial(tabuleiro);
	    System.out.println("===========================================");
	    System.out.println("\n       Posicao Inicial do tabuleiro\n");
	    System.out.println("===========================================");
	    System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");
        exibirTabuleiro(tabuleiro);
        
        // Primeira jogada
        System.out.println("\n===========================================");
        System.out.println("                 Jogada #1             ");
        System.out.println("===========================================\n");

        novaPosicao(tabuleiro, 6, 4, 4, 4);
        System.out.println("---------Brancas jogam e4---------");
        exibirTabuleiro(tabuleiro);
        System.out.println("");
        novaPosicao(tabuleiro, 1, 4, 3, 4);
        System.out.println("---------Pretas jogam e5---------");
        exibirTabuleiro(tabuleiro);

        // Segunda jogada
        System.out.println("\n===========================================");
        System.out.println("                 Jogada #2             ");
        System.out.println("===========================================\n");

        novaPosicao(tabuleiro, 7, 5, 4, 2);
        System.out.println("--------- Brancas jogam Bc4 ---------");
        exibirTabuleiro(tabuleiro);
        System.out.println("");
        novaPosicao(tabuleiro, 0, 1, 2, 2);
        System.out.println("--------- Pretas jogam Cc6 ---------");
        exibirTabuleiro(tabuleiro);

        // Terceira jogada
        System.out.println("\n===========================================");
        System.out.println("                 Jogada #3             ");
        System.out.println("===========================================\n");

        novaPosicao(tabuleiro, 7, 3, 3, 7);
        System.out.println("--------- Brancas jogam Dh5 ---------");
        exibirTabuleiro(tabuleiro);
        System.out.println("");
        novaPosicao(tabuleiro, 0, 6, 2, 5);
        System.out.println("--------- Pretas jogam Cf6 ---------");
        exibirTabuleiro(tabuleiro);

        // Quarta e última jogada
        System.out.println("\n===========================================");
        System.out.println("          Jogada #4 (Xeque Mate)       ");
        System.out.println("===========================================\n");

        novaPosicao(tabuleiro, 3, 7, 1, 5); 
        System.out.println("---Brancas capturam Peao PP6 em f7 e Xeque MATE (Dxf7#)---");
        exibirTabuleiro(tabuleiro);
	}
	private static void posicaoInicial (String[][] tabuleiro) {
	    for (int x = 0; x<TAMANHO_TABULEIRO; x++) {
	        for (int y = 0; y<TAMANHO_TABULEIRO; y++) {
	            tabuleiro[x][y] = "   ";
	        }
	    }
	    // Peças pretas especiais
		tabuleiro[0][0] = "tP1"; // torre
		tabuleiro[0][1] = "cP2"; // cavalo
		tabuleiro[0][2] = "bP3"; // bispo
		tabuleiro[0][3] = "dP4"; // dama
		tabuleiro[0][4] = "rP5"; // rei
		tabuleiro[0][5] = "bP6"; // bispo
		tabuleiro[0][6] = "cP7"; // cavalo
		tabuleiro[0][7] = "tP8"; // torre
		
		// Peças pretas peões
		for (int p = 0; p<TAMANHO_TABULEIRO; p++) {
		    tabuleiro[1][p] = "PP" + (p + 1);
		}
		
		// Peças brancas especiais
		tabuleiro[7][0] = "TB1"; // torre
		tabuleiro[7][1] = "CB2"; // cavalo
		tabuleiro[7][2] = "BB3"; // bispo
		tabuleiro[7][3] = "DB4"; // dama
		tabuleiro[7][4] = "RB5"; // rei
		tabuleiro[7][5] = "BB6"; // bispo
		tabuleiro[7][6] = "CB7"; // cavalo
		tabuleiro[7][7] = "TB8"; // torre
		
		// Peças brancas peões
		for (int b = 0; b<TAMANHO_TABULEIRO; b++) {
		    tabuleiro[6][b] = "PB" + (b + 1);
		}
		
	}
	private static void exibirTabuleiro(String[][] tabuleiro) {

		for (int x=0; x<TAMANHO_TABULEIRO ; x++) {
		    // Número das linhas (números inverso como pede nas demonstração da especificação)
		    System.out.print((TAMANHO_TABULEIRO - x) + " ");
			for(int y=0; y<TAMANHO_TABULEIRO ; y++ ) {
				System.out.print(tabuleiro[x][y] + " ");
			}
			// Quebra de linha
			System.out.println();
		}
		

	}
	// mudança da peça para a sua nova posição e marcação da posição de origem com '...'
	private static void novaPosicao(String[][] tabuleiro, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		tabuleiro[linhaDestino][colunaDestino] = tabuleiro[linhaOrigem][colunaOrigem];
		tabuleiro[linhaOrigem][colunaOrigem] = "...";
	}
}