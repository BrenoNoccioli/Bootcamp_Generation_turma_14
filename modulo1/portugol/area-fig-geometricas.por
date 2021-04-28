programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{//area retangulo
		real base, altura, areaRetangulo

		escreva("Digite o valor da altura do retângulo: ")
		leia(altura)
		escreva("Digite o valor da base do retângulo: ")
		leia(base)

		se(base < 0 ou altura < 0){
			escreva("Valor inválido! Digite um valor maior que 0 para base e para altura")
		} senao {
			areaRetangulo = altura * base
			escreva("A área do retângulo é: " + mat.arredondar(areaRetangulo, 2))	
		}
		
		/*
		//area circulo
		real raio, areaCirculo
		const real PI = 3.14

		escreva("\n\nDigite o valor do raio do círculo: ")
		leia(raio)

		areaCirculo = PI * mat.potencia(raio, 2)
		se (raio < 0){
			escreva("Valor inválido! Digite um valor maior que 0 para o raio.")
		} senao {
			escreva("A área do círculo é: " + mat.arredondar(areaCirculo, 2))	
		}
		
		//area triangulo
		real alturaT, baseT, areaT
		
		escreva("\n\nDigite o valor da altura do triângulo: ")
		leia(alturaT)
		escreva("Digite o valor da base do triângulo: ")
		leia(baseT)

		se(baseT < 0 ou alturaT < 0){
			escreva("Valor inválido! Digite um valor maior que 0 para base e para altura")
		} senao {
			areaT = (alturaT * baseT)/2
			escreva("A área do triângulo é: " + mat.arredondar(areaT, 2))	
		}
		*/
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */