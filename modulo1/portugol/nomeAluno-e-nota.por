programa
{
	
	funcao inicio()
	{
		cadeia nomeAluno 
		caracter gen
		real nota

		escreva("Digite o nome do(a) aluno(a): ")
		leia(nomeAluno)
		escreva("Escolha [M] para masculino, [F] para feminino e [O] para outro: ")
		leia(gen)
		escreva("Digite a nota: ")
		leia(nota)

		se(gen == 'M' ou gen == 'm'){
			se(nota <= 5 e nota >= 0){
				escreva("O aluno " + nomeAluno + " foi reprovado com nota " + nota)
			} senao se (nota > 5 e nota <= 10) {
				escreva("O aluno " + nomeAluno + " foi aprovado com nota " + nota)
			} senao {
				escreva("Nota inválida!")
			}
		} senao se(gen == 'F' ou gen == 'f'){
			se(nota <= 5 e nota >= 0){
				escreva("A aluna " + nomeAluno + " foi reprovada com nota " + nota)	
			} senao se (nota > 5 e nota <= 10){
				escreva("A aluna " + nomeAluno + " foi reprovada com nota " + nota)
			} senao {
				escreva("Nota inválida!")
			}
			
		} senao se(gen == 'O' ou gen == 'o'){
			se(nota <= 5 e nota >= 0){
				escreva("Alunx " + nomeAluno + " foi reprovadx com nota " + nota)	
			} senao se (nota > 5 e nota <= 10){
				escreva("Alunx " + nomeAluno + " foi reprovadx com nota " + nota)
			} senao {
				escreva("Nota inválida!")
			}
		} senao {
			escreva("Caractere inválido! Por favor, escolha [M], [F] ou [O].")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */