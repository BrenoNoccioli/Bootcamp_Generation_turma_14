/*
6) Elabore um sistema que dada a idade de um nadador classifique-o
em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
 */

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex6 {
	public static void main(String[] args) {
		int idade =0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
		} else if(idade >= 8 && idade <= 11) {
			System.out.println("Infantil B");
		} else if(idade >= 12 && idade <=13) {
			System.out.println("Juvenil A");
		} else if(idade >=14 && idade <=17) {
			System.out.println("Infantil B");
		} else if(idade >= 18) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idade inv?lida!");
		}
		
		leia.close();
	}
}
