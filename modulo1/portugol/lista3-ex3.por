/*
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
 * apresente no final o total do somatório, a média e o total de valores lidos.
 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo
 * valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
 * negativo.
 */

programa
{
	
	funcao inicio()
	{
		real num, total=0, media=0, totalLido =0, contador=0
		escreva("Digite um número (0 ou negativo para parar o programa): "4)
		leia(num)
		
		
		enquanto(num > 0){
			contador++
			total += num
			media = total/contador
			totalLido = contador

			escreva("Digite outro número: ")
			leia(num)
		}
			escreva("O somatório total do números fornecidos é: " + total)
			escreva("\nA média da soma dos números fornecidos é: " + media)
			escreva("\nA quantidade de números fornecidos é: " + totalLido)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */