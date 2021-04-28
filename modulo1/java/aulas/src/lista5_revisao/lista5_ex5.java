/*Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e,
 * depois, um c�digo inteiro. Se o c�digo for zero, finalize o programa;
 * se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na
 * ordem inversa. Caso, o c�digo for diferente de 1 e 2, escreva uma
 * mensagem informando que o c�digo inv�lido.
 */

package lista5_revisao;

import java.util.Random;

public class lista5_ex5 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int vetor[] = new int[5];
		int codigo=0;
		
		System.out.print("Vetor = ");
		for(int i=0; i<5; i++) {
			vetor[i] = random.nextInt(10);
			System.out.print("|" + vetor[i] + "|");
		}
		
		codigo = random.nextInt(4);
		System.out.println("\nC�digo = " + codigo);

		if(codigo == 0) {
			System.out.println("\nFim do programa!");
			
		} else if(codigo == 1) {
			for(int i=0; i<5; i++) {
				System.out.print("|" + vetor[i] + "|");
			}
		} else if(codigo == 2) {
			for(int i=4; i>=0; i--) {
				System.out.print("|" + vetor[i] + "|");
			}
		} else {
			System.out.println("c�digo inv�lido!");
		}
		
	}
}
