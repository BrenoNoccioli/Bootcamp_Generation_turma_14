/*3) Desenvolva um sistema em que:
Leia 4 (quatro) n�meros;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
*/

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex3 {
	public static void main(String[] args) {
		double num1=0.0, num2=0.0, num3=0.0, num4=0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = leia.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		num2 = leia.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = leia.nextDouble();
		System.out.println("Digite o quarto n�mero: ");
		num4 = leia.nextDouble();
		
		if(Math.pow(num3, 2) >= 1000) {
			System.out.println("O quadrado do terceiro n�mero �: " + Math.pow(num3, 2));
		} else {
			System.out.println("O quadrado do primeiro n�mero �: " + Math.pow(num1, 2));
			System.out.println("O quadrado do segundo n�mero �: " + Math.pow(num2, 2));
			System.out.println("O quadrado do terceiro n�mero �: " + Math.pow(num3, 2));
			System.out.println("O quadrado do quarto n�mero �: " + Math.pow(num4, 2));
		}
		
		leia.close();
	}
}
