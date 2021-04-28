programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva("Digite um número inteiro e maior que zero: ")
		leia(num)

		se(num > 0){
			se(num % 2 == 0){
				escreva("O número é par!")
			} senao {
				escreva("O número é ímpar!")
			} 
		} senao {
			escreva("Caractere inválido, escolha um número inteiro maior que 0!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */