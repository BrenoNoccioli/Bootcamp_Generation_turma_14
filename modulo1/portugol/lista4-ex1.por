/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
 * atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
 */

programa
{
	
	funcao inicio()
	{
		inteiro valores[4], maiorValor=0
		
		para (inteiro i = 0; i < 4; i++){
			escreva("Digite um valor: ")
			leia(valores[i])
			

			se(valores[i] > maiorValor){
				maiorValor = valores[i]
			}
		}
		escreva("O maior valor digitado foi: " + maiorValor)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */