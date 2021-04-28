package lista4_vetor_e_matriz;

import java.util.Random;

public class lista4_ex4 {
	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int total = 0, totalDiagonal=0;
		
		final int linha = 3;
		final int coluna = 3;
		
		Random random = new Random();
		
		//faz matriz[3][3]
		System.out.println("MATRIZ: ");
		for(int l=0; l<linha; l++) {
			System.out.println();
			for(int c=0; c<coluna; c++) {
				matriz[l][c] = random.nextInt(10);
				System.out.print(matriz[l][c] + " ");
				total += matriz[l][c];
				
				if(l == c) {
					totalDiagonal += matriz[l][c];
				}
			}
		}
		
		System.out.println("\nA soma total dos valores é: " + total);
		System.out.println("A soma dos valores da diagonal principal é: " + totalDiagonal);
		
	}
}
