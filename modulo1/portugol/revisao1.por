/*
 * Elabore um programa que calcule o que deve ser pago por um produto, considerando
 * o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os
 * códigos da tabela a seguir para ler qual a condição de pagamento escolhida e
 * efetuar o cálculo adequado. 
 * Código Condição de pagamento 
 * 1 À vista em dinheiro ou cheque, recebe 20% de desconto 
 * 2 À vista no cartão de crédito, recebe 15% de desconto 
 * 3 Em duas vezes, preço normal de etiqueta sem juros 
 * 4 Em três vezes, preço normal de etiqueta mais juros de 10%
*/

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real precoEtiqueta
		caracter condicaoPagamento

		escreva("Digite o preço de etiqueta do produto: R$")
		leia(precoEtiqueta)
		escreva("\nSelecione a forma de pagamento.")
		escreva("\n[1] - À vista em dinheiro ou cheque (20% de desconto)")
		escreva("\n[2] - À vista no cartão de crédito (15% de desconto)")
		escreva("\n[3] - Em duas vezes (sem juros)")
		escreva("\n[4] - Em três vezes (juros de 10%)")
		escreva("\nCódigo: ")
		leia(condicaoPagamento)

		se(condicaoPagamento == '1'){
			precoEtiqueta = precoEtiqueta - (precoEtiqueta*0.2)
			escreva("O preço com desconto é: R$" + precoEtiqueta)
		} senao se(condicaoPagamento == '2'){
			precoEtiqueta = precoEtiqueta - (precoEtiqueta*0.15)
			escreva("O preço com desconto é: R$" + precoEtiqueta)
		} senao se(condicaoPagamento == '3'){
			escreva("Cada parcela terá o valor de: R$" + (precoEtiqueta/2))
		}senao se(condicaoPagamento == '4'){
			precoEtiqueta = (precoEtiqueta + (precoEtiqueta*0.1))/3
			escreva("Cada parcela terá o valro de: R$" + mat.arredondar(precoEtiqueta, 2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */