/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente
 * no final o total do somatório, a média e o total de valores lidos. O programa deve fazer
 * as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja,
 * o programa deve parar quando o usuário fornecer um valor negativo.
 */

package lista3_lacos_de_repeticao;

import java.util.Scanner;

public class lista3_ex2_1 {
	public static void main(String[] args) {
		double num=0.0, numFornecido=0.0;
		int cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor numérico: ");
		numFornecido = leia.nextDouble();
		
		while(numFornecido > 0) {
			cont++;
			num+=numFornecido;
			
			System.out.println("Digite outro valor numérico: ");
			numFornecido = leia.nextDouble();
		}
		
		System.out.println("O somatório total dos valores fornecidos é: " + num);
		System.out.println("A média dos valores lidos é: " + num/cont);
		System.out.println("O total de valores lidos é: " + cont);
		
		leia.close();
	}
	
	
}
