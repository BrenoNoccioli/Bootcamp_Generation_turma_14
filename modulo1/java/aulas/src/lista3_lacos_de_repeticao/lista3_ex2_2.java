/*2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três
 * (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,
 * deveremos observar na tela a seguinte sequência: 5 15 45 135.
 */


package lista3_lacos_de_repeticao;

import java.util.Scanner;

public class lista3_ex2_2 {
	public static void main(String[] args) {
		double num =0.0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num = leia.nextDouble();
		
		System.out.print(num + " | ");
		while(num <= 100) {
			num*=3;
			if(num > 100) {
				System.out.print(num );
			} else {
				System.out.print(num + " | ");
			}
			
		}
		leia.close();
	}
}
