/*
 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde
 * para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula
 * é IMC = peso / ( altura )2 
 * Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
 * IMC em adultos
 * Condição 
 * Abaixo de 18,5 Abaixo do peso 
 * Entre 18,5 e 25 Peso normal 
 * Entre 25 e 30 Acima do peso 
 * Acima de 30 obeso
 */

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real peso = 0.0, altura = 0.0, imc = 0.0

		//pede peso e altura
		escreva("VAMOS CALCULAR SEU IMC!")
		escreva("\nDigite seu peso (Kg): ")
		leia(peso)
		escreva("Digite sua altura (m): ")
		leia(altura)
		imc = mat.arredondar(peso / (altura * altura), 2) //calcula imc

		//condicoes de retorno
		se(imc < 18.5){
			escreva("Seu IMC é: " + imc)
			escreva("\nAtenção! Você está abaixo do peso.")
		} senao se(imc >= 18.5 e imc < 25){
			escreva("Seu IMC é: " + imc)
			escreva("\nPeso normal!")
		} senao se(imc >= 25 e imc <30){
			escreva("Seu IMC é: " + imc)
			escreva("\nAtenção! Você está com sobrepeso")
		} senao {
			escreva("Seu IMC é: " + imc)
			escreva("\nCuidado! Você está obeso.")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */