/*
Elabore um programa que calcule o que deve ser pago por um produto,
considerando o preço normal de etiqueta e a escolha da condição de pagamento.
Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%

 */
package lista5_revisao;

import java.util.Scanner;

public class lista5_ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double precoEtiqueta, precoTotal;
		int opcaoPgt;
		
		System.out.println("Digite o preço de etiqueta:_ ");
		precoEtiqueta = leia.nextDouble();
		System.out.println("Escolha a forma de pagamento: ");
		System.out.println("[1] - À vista em dinheiro ou cheque (20% de desconto);");
		System.out.println("[2] - À vista no cartão de crédito (15% de desconto);");
		System.out.println("[3] - Duas vezes (sem juros);");
		System.out.println("[4] - Três vezes (juros de 10%); ");
		opcaoPgt = leia.nextInt();
		
		if(opcaoPgt == 1) {
			precoTotal = precoEtiqueta-(precoEtiqueta*0.2);
			System.out.println("O preço a ser pago será de: R$" + precoTotal);
		} else if(opcaoPgt == 2) {
			precoTotal = precoEtiqueta - (precoEtiqueta*0.15);
			System.out.println("O preço a ser pago será de: R$" + precoTotal);
		} else if(opcaoPgt == 3) {
			precoTotal = precoEtiqueta/2;
			System.out.println("O preço a ser pago em cada parcela será de: R$" + precoTotal);
		} else if(opcaoPgt == 4) {
			precoTotal = (precoEtiqueta + (precoEtiqueta*0.1))/3;
			System.out.printf("O preço a ser pago em cada parcela será de: R$%.2f", precoTotal);
		} else {
			System.out.println("opção inválida!");
		}
		
		
	}
}
