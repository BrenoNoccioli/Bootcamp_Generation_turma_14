/*
 4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem
 indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
*/

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex4 {
	public static void main(String[] args) {
		int num=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		num = leia.nextInt();
		
		System.out.println(parImpar(num));
		
		leia.close();
	}
	
	public static String parImpar(int num) {
		String numero = (num % 2 == 0)?"PAR":"�MPAR";
		return numero;
		
	}
	
}

