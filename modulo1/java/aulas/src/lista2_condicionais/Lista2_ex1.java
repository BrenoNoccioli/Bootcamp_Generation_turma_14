/*
1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para
controlar o rendimento di�rio de seu trabalho. Toda vez que ele traz um
peso de tomate maior que o estabelecido pelo regulamento do estado de S�o
Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o
precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar
tais vari�veis com o conte�do ZERO.
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
			System.out.println("Aten��o! Excedeu o peso permitido!");
			System.out.println("Excesso: " + excesso + "Kg\nMulta: R$" + multa);
		} else {
			System.out.println("Peso inv�lido!");
		}

		leia.close();
	}

}
