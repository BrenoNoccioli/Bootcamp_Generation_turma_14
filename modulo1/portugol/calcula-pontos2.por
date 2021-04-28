programa
{
	
	funcao inicio()
	{
		const inteiro RODADAS = 4
		cadeia time1, time2, time3, time4
		inteiro pontosCorinthians = 0, pontosPalmeiras = 0, pontosSantos = 0, pontosSaoPaulo = 0
		caracter tipo
		time1 = "Corinthians"
		time2 = "Palmeiras"
		time3 = "Santos"
		time4 = "São Paulo"

		para(inteiro rodada = 1; rodada <= RODADAS; rodada++){
			escreva("Para cada time, escolha [G] - ganhou, [P] - perdeu, [E] - empatou.\nRodada " + rodada)
			escreva(time1 + ": ")
			leia(tipo)
			pontosCorinthians = calculaPontos(tipo, pontosCorinthians)
			
			escreva(time2 + ": ")
			leia(tipo)
			pontosPalmeiras = calculaPontos(tipo, pontosPalmeiras)

			escreva(time3 + ": ")
			leia(tipo)
			pontosSantos = calculaPontos(tipo, pontosSantos)

			escreva(time4 + ": ")
			leia(tipo)
			pontosSaoPaulo = calculaPontos(tipo, pontosSaoPaulo)
		}
		escreva("Fim da rodada!!! \nResultado: ")
		escreva("\nPontos " + time1 + "= " + pontosCorinthians)
		escreva("\nPontos " + time2 + "= " + pontosPalmeiras)
		escreva("\nPontos " + time3 + "= " + pontosSantos)
		escreva("\nPontos " + time4 + "= " + pontosSaoPaulo)
	}
	funcao inteiro calculaPontos(caracter tipo, inteiro time){
		se(tipo == 'G' ou tipo == 'g'){
			time+=3
			retorne time
		} senao se (tipo == 'E' ou tipo == 'e'){
			time+=1
			retorne time
		} senao se (tipo == 'P' ou tipo == 'p'){
			time+=0
			retorne time
		} senao {
			time+=0
			retorne time
		}
	}
	

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 781; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */