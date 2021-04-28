/*2- Faça um programa que pegue um número do teclado e calcule a soma de todos os números
 * de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
 */

package lista3_lacos_de_repeticao;

import java.util.Scanner;

public class lista3_ex3_2 {
	public static void main(String[] args) {
		
		int num=0, total=0, numBase=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numBase = leia.nextInt();
		
		do {
			num++;
			total+=num;
			if(num==numBase) {
				System.out.print(num + " = ");
			}else {
				System.out.print(num + " + ");
			}

		}while(num < numBase);
		System.out.println(total);
		
		leia.close();
	}
}
