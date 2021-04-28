/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 * 
 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma
 * posição das matrizes N1 e N2;
 * 
 * b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de
 * mesma posição das matrizes N1 e N2.
 */

programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		//Matriz N1
		escreva("N1: \n")
		para(inteiro l = 0; l < 4; l++ ){
			para(inteiro c=0; c < 6; c++){
				N1[l][c] = Util.sorteia(1, 5)
				escreva("[ " + N1[l][c] + " ]")
			}
		escreva("\n")
		}

		escreva("\n")

		//Matriz N2
		escreva("N2: \n")
		para(inteiro l = 0; l < 4; l++ ){
			para(inteiro c=0; c < 6; c++){
				N2[l][c] = Util.sorteia(1, 4)
				escreva("[ " + N2[l][c] + " ]")
			}
		escreva("\n")
		}

		//Matriz M1
		escreva("\nM1: \n")
		para(inteiro l=0; l<4; l++){
			para(inteiro c=0; c<6; c++){
				escreva("[ " + (N1[l][c] + N2[l][c]) + " ]")
			}
			escreva("\n")
		}

		//Matriz M2
		escreva("\nM2: \n")
		para(inteiro l=0; l<4; l++){
			para(inteiro c=0; c<6; c++){
				escreva("[ " + (N1[l][c] - N2[l][c]) + " ]")
			}
			escreva("\n")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 658; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */