programa
{
	
	funcao inicio()
	{
		const inteiro RODADAS = 4
		inteiro corinthias = 0, palmeiras = 0, santos = 0, saoPaulo = 0
		caracter pontosCorinthians, pontosPalmeiras, pontosSantos, pontosSaoPaulo

		para(inteiro contador = 0; contador <= RODADAS; contador++){
			escreva("Para cada time, igite [G] para ganhou, [P] para perdeu ou [E] para empatou: ")
			escreva("\nCorinthians: ")
			leia(pontosCorinthias)
			escreva("\nPalmeiras: ")
			leia(pontosPalmeiras)
			escreva("\nSantos: ")
			leia(pontosSantos)
			escreva("\nsaoPaulo: ")
			leia(pontosSaoPaulo)

			se(pontosCorinthias == 'G' ou pontosCorinthians =='g'){
				corinthias += 3
			} senao se (pontosCorinthinas == 'E' ou pontosCorinthinas == 'e'){
				corinthians++
			} senao se (pontosCorinthinas == 'P' ou pontosCorinthinas == 'p'){
				corinthinas+= 0
			}

			se(pontosPalmeiras == 'G' ou pontosPalmeiras == 'g'){
				palmeiras+=3
			} senao se(pontosPalmeiras == 'E' ou pontosPalmeiras == 'e'){
				palmeiras++
			} senao se (pontosPalmeiras == 'P' ou pontosPalmeiras == 'p'){
				palmeiras+= 0
			}

			se(pontosSantos == 'G' ou pontosSantos == 'g'){
				santos+=3
			} senao se(pontosSantos == 'E' ou pontosSantos == 'e'){
				santos++
			} senao se (pontosSantos == 'P' ou pontosSantos == 'p'){
				santos+= 0
			}

			se(pontosSaoPaulo == 'G' ou pontosSaoPaulo == 'g'){
				saoPaulo+=3
			} senao se(pontosSaoPaulo == 'E' ou pontosSaoPaulo == 'e'){
				saoPaulo++
			} senao se (pontosSaoPaulo == 'P' ou pontosSaoPaulo == 'p'){
				saoPaulo+= 0
			}
		}
		/*escreva("A soma dos pontos do Corinthians é: " + corinthians)
		escreva("\nDo Palmeiras é " + palmeiras)
		escreva("\nDo Santos é: " + santos)
		escreva("\nDo São Paulo é: " + saoPaulo)
	*/
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */