package lista4_vetor_e_matriz;

import java.util.Random;

public class lista4_ex3 {
	public static void main(String[] args) {
		int n1[][] = new int [4][6];
		int n2[][] = new int [4][6];
		int m1[][] = new int [4][6];
		int m2[][] = new int [4][6];
		
		int LINHA = 4;
		int COLUNA = 6;
		
		Random random = new Random();
		
		//faz matriz n1
		System.out.print("MATRIZ N1: ");
		for(int linha=0; linha<LINHA; linha++) {
			System.out.println();
			for(int coluna=0; coluna<COLUNA; coluna++) {
				n1[linha][coluna]= random.nextInt(10);
				System.out.print(n1[linha][coluna] + " ");
			}
		}
		
		//faz matriz n2
		System.out.print("\n\nMATRIZ N2: ");
		for(int linha=0; linha<LINHA; linha++) {
			System.out.println();
			for(int coluna=0; coluna<COLUNA; coluna++) {
				n2[linha][coluna]= random.nextInt(10);
				System.out.print(n2[linha][coluna] + " ");
			}
		}
		
		//faz matriz m1
		System.out.print("\n\nMATRIZ M1: ");
		for(int linha=0; linha<LINHA; linha++) {
			System.out.println();
			for(int coluna=0; coluna<COLUNA; coluna++) {
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				System.out.print( m1[linha][coluna] + " ");
			}
		}
		
		//faz matriz m2
		System.out.print("\n\nMATRIZ M2: ");
		for(int linha=0; linha<LINHA; linha++) {
			System.out.println();
			for(int coluna=0; coluna<COLUNA; coluna++) {
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
				System.out.print(m2[linha][coluna] + " ");
			}
		}
		
	}
}
