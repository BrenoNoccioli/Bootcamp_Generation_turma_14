programa
{
	funcao inicio()
	{
		real nA, nB, nC, nD, nE, nF, nX, nY

		escreva("Digite o número A: ")
		leia(nA)
		escreva("Digite o número B: ")
		leia(nB)
		escreva("Digite o número C: ")
		leia(nC)
		escreva("Digite o número D: ")
		leia(nD)
		escreva("Digite o número E: ")
		leia(nE)
		escreva("Digite o número F: ")
		leia(nF)

		nX = ((nC*nE) - (nB*nF)) / ((nA*nE) - (nB*nD))
		nY = ((nA*nF) - (nC*nD)) / ((nA*nE) - (nB*nD))

		escreva("O valor de X é: " + nX + "\nO valor de Y é: " + nY)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 501; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */