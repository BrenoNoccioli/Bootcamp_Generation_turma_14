programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real raioCirculo=0.0
		real base=0.0,altura=0.0,area=0.0		 
		caracter tipo
		escreva("Olá, escolha uma figura geométrica")
		escreva ("\n0-Triangulo\n1- Retangulo\n2- Circulo\n")
		leia(tipo)
		
		escolha (tipo)
		{
		caso '0':	//triangulo	
		escreva("---------------------------------------")
		escreva ("\nDigite o valor da altura do triangulo: ")
		leia(altura)	
		escreva ("Digite o valor da base do triangulo: ")
		leia(base)
		//Processamento de dados
		se (altura>0 e base>0)
			{
		 	area = (base*altura)/2
			escreva ("A área do triangulo é: ", mat.arredondar(area,2))
			}
		senao
		{
			escreva("Os valores precisam ser positivos.")
		}
		pare
		
		caso '1':	//retangulo
		escreva("---------------------------------------")
		escreva("\nDigite o valor da altura do retângulo: ")
		leia(altura)
		escreva("Digite o valor da base do retângulo: ")
		leia(base)

		se(base > 0 ou altura > 0){
			area = calculaAreaRetangulo(base, altura)
			escreva("A área do retâgulo é " + mat.arredondar(area, 2))
		} senao {
			escreva("Valor inválido! Digite um valor maior que 0 para base e para altura.")
			
		}
		
		pare
		
		caso '2': //circulo
		escreva("---------------------------------------")		
		escreva ("\nDigite o raio do Círculo: ")
		leia(raioCirculo)

		se(raioCirculo > 0){
			area = calculaAreaCirculo(raioCirculo)
			escreva("A área do círculo é: " + mat.arredondar(area, 2))
		} senao {
			escreva("Valor inválido! Digite um valor maior que 0 para o raio.")
		}	
		pare
		
		caso contrario:
		escreva ("o valor não é igual a 0, 1 ou 2")
		}
	}

	funcao real calculaAreaRetangulo(real base, real altura){
		se (base > 0 e altura > 0){
			
		}
		real area
		area = mat.arredondar(base * altura, 2)
		
		retorne area
	}

	funcao real calculaAreaCirculo(real raioCirculo){
			real area=mat.PI*(mat.potencia(raioCirculo,2))
			retorne area	
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1782; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */