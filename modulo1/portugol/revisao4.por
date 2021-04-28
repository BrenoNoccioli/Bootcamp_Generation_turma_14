/*
 * Faça um programa que calcula e escreve a seguinte soma:
 * soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
 */

programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real soma=0.0, somaI=0.0,
		inteiro d=1
		
		para(inteiro i=1; i<50; i++){
			d+=2
			somaI += (d/(i+1))

			escreva(d + "/" + (i+1) + " + ")
		}
		
		soma = 1 + somaI
		escreva("A soma total dos valores é: " + mat.arredondar(soma, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */