programa
{
	
	funcao inicio()
	{
		inteiro tempoSegundos, horas, minutos, segundos

		escreva("Digite o tempo em segundos: ")
		leia(tempoSegundos)

		horas = tempoSegundos/3600
		minutos = (tempoSegundos % 3600) / 60
		segundos = (tempoSegundos % 3600) % 60

		escreva(tempoSegundos + " segundos é equivalente a " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */