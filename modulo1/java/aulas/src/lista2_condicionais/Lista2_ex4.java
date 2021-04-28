/*
 4) Faça um sistema que leia um número inteiro e mostre uma mensagem
 indicando se este número é par ou ímpar, e se é positivo ou negativo.
*/

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex4 {
	public static void main(String[] args) {
		int num=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();
		
		System.out.println(parImpar(num));
		
		leia.close();
	}
	
	public static String parImpar(int num) {
		String numero = (num % 2 == 0)?"PAR":"ÍMPAR";
		return numero;
		
	}
	
}

