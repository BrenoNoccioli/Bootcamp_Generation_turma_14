/*
Elabore um programa que calcule o que deve ser pago por um produto,
considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento.
Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento
escolhida e efetuar o c�lculo adequado. 
C�digo Condi��o de pagamento 
1 � vista em dinheiro ou cheque, recebe 20% de desconto 
2 � vista no cart�o de cr�dito, recebe 15% de desconto 
3 Em duas vezes, pre�o normal de etiqueta sem juros 
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%

 */
package lista5_revisao;

import java.util.Scanner;

public class lista5_ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double precoEtiqueta, precoTotal;
		int opcaoPgt;
		
		System.out.println("Digite o pre�o de etiqueta:_ ");
		precoEtiqueta = leia.nextDouble();
		System.out.println("Escolha a forma de pagamento: ");
		System.out.println("[1] - � vista em dinheiro ou cheque (20% de desconto);");
		System.out.println("[2] - � vista no cart�o de cr�dito (15% de desconto);");
		System.out.println("[3] - Duas vezes (sem juros);");
		System.out.println("[4] - Tr�s vezes (juros de 10%); ");
		opcaoPgt = leia.nextInt();
		
		if(opcaoPgt == 1) {
			precoTotal = precoEtiqueta-(precoEtiqueta*0.2);
			System.out.println("O pre�o a ser pago ser� de: R$" + precoTotal);
		} else if(opcaoPgt == 2) {
			precoTotal = precoEtiqueta - (precoEtiqueta*0.15);
			System.out.println("O pre�o a ser pago ser� de: R$" + precoTotal);
		} else if(opcaoPgt == 3) {
			precoTotal = precoEtiqueta/2;
			System.out.println("O pre�o a ser pago em cada parcela ser� de: R$" + precoTotal);
		} else if(opcaoPgt == 4) {
			precoTotal = (precoEtiqueta + (precoEtiqueta*0.1))/3;
			System.out.printf("O pre�o a ser pago em cada parcela ser� de: R$%.2f", precoTotal);
		} else {
			System.out.println("op��o inv�lida!");
		}
		
		
	}
}
