/*
1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para
controlar o rendimento diário de seu trabalho. Toda vez que ele traz um
peso de tomate maior que o estabelecido pelo regulamento do estado de São
Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João
precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
variável M o valor da multa que João deverá pagar. Caso contrário mostrar
tais variáveis com o conteúdo ZERO.
 */

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex1 {

	public static void main(String[] args) {
		final double pesoPermitido = 50.00;
		final double valorMulta = 4.00;
		double pesoTomate = 0.0, excesso = 0.0, multa=0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o peso do tomate: ");
		pesoTomate = leia.nextDouble();
		
		if(pesoTomate > 0 && pesoTomate <= 50) {
			excesso = 0.0;
			multa = 0.0;
			System.out.println("Peso dentro do permitido!\nExcesso: " + excesso + "\nMulta: " + multa);
		} else if(pesoTomate > 50) {
			excesso = pesoTomate - pesoPermitido;
			multa = excesso * valorMulta;
			System.out.println("Atenção! Excedeu o peso permitido!");
			System.out.println("Excesso: " + excesso + "Kg\nMulta: R$" + multa);
		} else {
			System.out.println("Peso inválido!");
		}

		leia.close();
	}

}
