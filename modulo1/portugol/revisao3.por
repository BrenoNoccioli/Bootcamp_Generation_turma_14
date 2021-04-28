/*
 * Escrever um programa que leia uma quantidade desconhecida de números e
 * conte quantos deles estão nos seguintes intervalos:
 * [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar
 * quando for lido um número negativo.
 */

programa
{
	
	funcao inicio()
	{
		real num=0.0
		real int1=0.0, int2=0.0, int3=0.0, int4=0.0

		faca{
			escreva("Digite um número: ")
			leia(num)

			se(num >= 0 e num <=25){
				int1++
			} senao se(num>=26 e num<=50){
				int2++
			} senao se(num>=51 e num<=75){
				int3++
			} senao se(num>=76 e num<=100){
				int4++
			}
			
		
		}enquanto(num > 0 e num <=100)

		escreva("\nTotal de números no intervalo [0-25]: " + int1)
		escreva("\nTotal de números no intervalo [26-50]: " + int2)
		escreva("\nTotal de números no intervalo [51-75]: " + int3)
		escreva("\nTotal de números no intervalo [76-100]: " + int4)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */