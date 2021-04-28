/*1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente
 * no final o total do somat�rio, a m�dia e o total de valores lidos. O programa deve fazer
 * as leituras dos valores enquanto o usu�rio estiver fornecendo valores positivos. Ou seja,
 * o programa deve parar quando o usu�rio fornecer um valor negativo.
 */

package lista3_lacos_de_repeticao;

import java.util.Scanner;

public class lista3_ex2_1 {
	public static void main(String[] args) {
		double num=0.0, numFornecido=0.0;
		int cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor num�rico: ");
		numFornecido = leia.nextDouble();
		
		while(numFornecido > 0) {
			cont++;
			num+=numFornecido;
			
			System.out.println("Digite outro valor num�rico: ");
			numFornecido = leia.nextDouble();
		}
		
		System.out.println("O somat�rio total dos valores fornecidos �: " + num);
		System.out.println("A m�dia dos valores lidos �: " + num/cont);
		System.out.println("O total de valores lidos �: " + cont);
		
		leia.close();
	}
	
	
}
