/*
 * Faça um programa que leia um vetor de 5 posições para números reais e,
 * depois, um código inteiro. Se o código for zero, finalize o programa;
 * se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na
 * ordem inversa. Caso, o código for diferente de 1 e 2, escreva uma mensagem
 * informando que o código inválido.
 */

programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro vetor[5], codigo=0

		escreva("O vetor é: ")
		
		para(inteiro i=0; i<5; i++){
		vetor[i]+=Util.sorteia(0, 1)
		codigo += vetor[i]
		escreva(vetor[i] + " ")
		}
		
		se(codigo == 1){
			para(inteiro i=0; i<5; i++){
				escreva(vetor[i] + " ")
			}
		}senao se(codigo == 2){
			para(inteiro i=5; i<1; i--){
				escreva(vetor[i] + " ")
			}
		}senao {
			escreva("\nCódigo inválido")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */