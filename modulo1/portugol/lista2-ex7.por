/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
 (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/
programa
{
	
	funcao inicio()
	{
		real altura, base, area

		escreva("Altura do triângulo: ")
		leia(altura)
		escreva("Base do triângulo: ")
		leia(base)

		se(altura <= 0 ou base <= 0){
			escreva("Valor inválido! Por favor, selecione valores positivos e maiores que 0.")
		} senao {
			area = (base * altura)/2
			escreva("A área do triângulo é: " + area)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */