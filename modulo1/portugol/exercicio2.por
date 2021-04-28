programa
{
	funcao inicio()
	{
		inteiro tempoDias, ano, mes, dia

		escreva("Digite o tempo em dias: ")
		leia(tempoDias)

		ano = tempoDias/365
		mes = (tempoDias%365) / 30
		dia = (tempoDias%365) % 30

		escreva(tempoDias + " dia(s) equivale a " + ano + " ano(s), " + mes + " mes(es) e " + dia + " dia(s).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */