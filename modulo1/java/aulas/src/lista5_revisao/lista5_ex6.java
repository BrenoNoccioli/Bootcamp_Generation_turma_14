/*
* Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos.
* Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
*/

package lista5_revisao;

import java.util.Random;

public class lista5_ex6 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int vetor[] = new int[3];
		int matriz[][] = new int [3][3];
		int newMatriz[][] = new int [3][3];
		
		
		//popula vetor
		System.out.println("Vetor: ");
		for(int i=0; i<3; i++) {
			vetor[i] = random.nextInt(5);
			System.out.print(vetor[i] + " ");
		}
		
		//popula matriz
		System.out.println("\nMatriz:");
		for(int l=0; l<3; l++) {
			System.out.println();
			for(int c=0; c<3; c++) {
				matriz[l][c] = random.nextInt(5);
				System.out.print(matriz[l][c] + " ");
			}
		}
		
		//multiplica vetor por matriz
		System.out.print("\nNova matriz:");
		for(int l=0; l<3; l++) {
			System.out.println();
			for(int c=0; c<3; c++) {
				newMatriz[l][c] = vetor[l] * matriz[l][c];
				System.out.print(newMatriz[l][c] + " ");
			}
		}
		
	}
}
