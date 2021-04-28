programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		cadeia nomes[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara"}
		caracter generos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
		cadeia matriculas[39], matricula
		real notas[39], nota
		caracter opcao, referencia, continua='0'

		
		faca{
		//cria vetor de matriculas
		para(inteiro i=0; i<38; i++){
			se(i < 9){
				matriculas[i] = "G1-0" + (i+1)
				notas[i] = Util.sorteia(0, 10)
					
			} senao {
				matriculas[i] = "G1-"+ (i+1)
				notas[i] = Util.sorteia(0, 10)
				
			}
		}

		escreva("Selecione a opcao desejada: ")
		escreva("\n[1] - LISTA COMPLETA | [2] - LISTA ALUNOS | [3] - LISTA ALUNAS")
		escreva("\n[4] - LISTA APROVADOS(AS) | [5] - REPROVADOS(AS) | [0] - FILTRAR POR NOTA ")
		leia(opcao)

		escolha(opcao){
			caso '0':
			escreva("Filtrar por NOTA.")
			escreva("\nEscolha uma NOTA de referencia: ")
			leia(nota)
			escreva("\nNOTAS [1] - ABAIXO DA REFERENCIA | [2] - ACIMA DA REFERENCIA: ")
			leia(referencia)
			
			se(referencia == '1'){
				para(inteiro i=0; i<38; i++){
					se (notas[i] <= nota){
						se(generos[i] == 'M'){
							se(notas[i] > 5){
								escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - APROVADO!")
							} senao {
								escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADO!")
							}
						} senao {
							se(notas[i] > 5){
								escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - APROVADA!")
							} senao {
								escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADA!")
							}
						}
					} 
				}
			} senao se (referencia == '2'){
				para(inteiro i=0; i<38; i++){
					se (notas[i] >= nota){
						se(generos[i] == 'M'){
							se(notas[i] > 5){
								escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - APROVADO!")
							} senao {
								escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADO!")
							}
						} senao {
							se(notas[i] > 5){
								escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - APROVADA!")
							} senao {
								escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADA!")
							}
						}
					} 
				}	
			} 
			
			escreva("\n\nDeseja consultar mais listas? [1] - SIM | [2] - NAO ")
			leia(continua)
			
			pare

			caso '1':
			//lista com todos os dados
			escreva("LISTA COMPLETA: \n")
			para(inteiro i=0; i<38; i++){
				se(generos[i] == 'M'){
					se(notas[i] > 5){
						escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - APROVADO!")
					} senao {
						escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADO!")
					}
					
			} senao {
				se(notas[i] > 5){
					escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - APROVADA!")
				} senao {
					escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADA!")
				}
			}
			}
			escreva("\n\nDeseja consultar mais listas? [1] - SIM | [2] - NAO ")
			leia(continua)
			pare

			caso '2':
			//lista homens
			escreva("\nLista ALUNOS: ")
			para(inteiro i=0; i<38; i++){
			se(generos[i] == 'M'){
				se(notas[i] > 5){
					escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - APROVADO!")
				} senao {
					escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADO!")
				}
			}
			}
			escreva("\n\nDeseja consultar mais listas? [1] - SIM | [2] - NAO ")
			leia(continua)
			pare

			caso '3':
			//lista mulheres
			escreva("\nLista ALUNAS: ")
			para(inteiro i=0; i<38; i++){
			se(generos[i] == 'F'){
				se(notas[i] > 5){
					escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - AROVADA!")
				} senao {
					escreva("\n" + matriculas[i] + ": " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADA!")
				}
			}
			}
			escreva("\n\nDeseja consultar mais listas? [1] - SIM | [2] - NAO ")
			leia(continua)
			pare

			caso '4':
			//lista aprovados
			escreva("\nALUNOS(AS) APROVADOS(AS): ")
			para(inteiro i=0; i<38; i++){
			se(notas[i] > 5){
				se(generos[i] == 'M'){
					escreva("\n" + matriculas[i] + " - " + nomes[i] + " tirou NOTA: " + notas[i] + " - APROVADO!")	
				} senao {
					escreva("\n" + matriculas[i] + " - " + nomes[i] + " tirou NOTA: " + notas[i] + " - APROVADA!")
				}
				
			}
			}
			escreva("\n\nDeseja consultar mais listas? [1] - SIM | [2] - NAO ")
			leia(continua)
			pare

			caso '5':
			//lista reprovados
			escreva("\nALUNOS(AS) REPROVADOS(AS): ")
			para(inteiro i=0; i<38; i++){
			se(notas[i] < 5){
				se(generos[i] == 'M'){
					escreva("\n" + matriculas[i] + " - " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADO!")	
				} senao {
					escreva("\n" + matriculas[i] + " - " + nomes[i] + " tirou NOTA: " + notas[i] + " - REPROVADA!")
				}
				
			}
		}
			escreva("\n\nDeseja consultar mais listas? [1] - SIM | [2] - NAO ")
			leia(continua)
			pare
			
		}
				
		}enquanto(continua == '1')
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */