/*
 8) Construa um sistema para ler uma vari�vel num�rica N e imprimi-la
 somente se a mesma for maior que 100, caso contr�rio imprimi-la com
 o valor zero.
 */

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex8 {
	public static void main(String[] args) {
		double num=0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextDouble();
		
		if(num > 100) {
			System.out.println(num);
		} else {
			num = 0.0;
			System.out.println(num);
		}
		
		leia.close();
	}
}
