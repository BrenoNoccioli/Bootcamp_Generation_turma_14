programa{
	funcao inicio(){
		cadeia nomePessoa //nome da pessoa que será perguntado
		inteiro anoNascimento //ano de nascimento a ser perguntado
		
		escreva("Digite seu nome: ")
		leia(nomePessoa)
		escreva("Digite seu ano de nascimento: ")
		leia(anoNascimento)
		
		inteiro idade = (2020 - anoNascimento)

		escreva("Olá " + nomePessoa + ", nós estamos na Generation e você tem aproximadamente " + idade + " anos.")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */