/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que
 * gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima
 * a média aritmética dos lançamentos, contabilize e apresente também quantas foram as
 * ocorrências da maior pontuação.
 */

programa
{
	inclua biblioteca Util
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real valores[10],  
		real media=0, totalValores=0, cont=0, maiorValor=0, contMaior=0
		escreva("[ ")
		para(inteiro i = 0; i < 9; i++){
			cont++
			valores[i] = Util.sorteia(1, 6)
			escreva(valores[i] + ", ")
			
			se(i == 8){
				escreva(valores[i])			
			}
			totalValores+=valores[i]
			media = totalValores/cont

			se(maiorValor <= valores[i]){
				maiorValor = valores[i]
			}
			se(maiorValor == valores[i]){
					contMaior++
				}
			
		}
		escreva(" ]")

		escreva("\nA média dos valores digitados é: " + mat.arredondar(media, 2))
		escreva("\nO maior valor sorteado foi: " + maiorValor)
		escreva("\nO maior valor foi sorteado " + contMaior + " vezes")
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 842; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */