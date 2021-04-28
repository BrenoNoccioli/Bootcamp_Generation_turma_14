/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
 * diagonal, ou seja, diagonal principal.
 */

programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro LINHA = 3, COLUNA = 3
		inteiro matriz[LINHA][COLUNA], total=0, diagonalPrincipal=0
		escreva("MATRIZ: \n")
		para(inteiro linha=0; linha < LINHA; linha++){
			para(inteiro coluna=0; coluna < COLUNA; coluna++){
				matriz[linha][coluna] = Util.sorteia(1,4)
				escreva(matriz[linha][coluna] + " ")
				total+=matriz[linha][coluna]

				se(linha == coluna){
					diagonalPrincipal+=matriz[linha][coluna]
				}
			}
			escreva("\n")
		}
		escreva("------------------------------------------------\n")
		escreva("O valor total de todos os campos da matriz é: " + total)
		escreva("\nO valor total da diagonal principal é: " + diagonalPrincipal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 692; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */