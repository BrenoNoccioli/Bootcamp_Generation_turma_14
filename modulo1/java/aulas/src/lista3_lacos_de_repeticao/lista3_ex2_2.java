/*2- Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s
 * (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5,
 * deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
 */


package lista3_lacos_de_repeticao;

import java.util.Scanner;

public class lista3_ex2_2 {
	public static void main(String[] args) {
		double num =0.0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
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
