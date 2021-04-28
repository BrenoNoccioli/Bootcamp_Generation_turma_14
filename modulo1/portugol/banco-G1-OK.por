programa
{
	
	funcao inicio()
	{
		inteiro numeroConta = 01
		real saldo = 0.00
		cadeia cpf = "123.123.123-12"
		real movimentos[10]
		real credito = 0.0, debito = 0.0, saldoComEmprestimo = 0.0
		real emprestimoEstudantil = 1000.00, solicitaEmprestimo = 0.0
		caracter resposta, continua='0'
		

		escreva("CONFIRME OS SEUS DADOS: ")       
		escreva("\n")         
		escreva("----------------------")         
		escreva("\nNumero da Conta: ", numeroConta)         
		escreva("\nNumero do CPF: ", cpf)
		escreva("\nDigite [S] SIM ou [N] NÃO para continuar: ")
		leia(resposta)

		
		se(resposta == 'S' ou resposta == 's'){
			faca{
			//percorre vetor movimentos
			para(inteiro x=0; x<2; x++){
				escreva("\nTRANSACAO " + (x+1) + "  - [C] Credito | [D] Debito: ")
				leia(resposta) //define natureza da transacao
				se(resposta == 'C' ou resposta =='c'){
					escreva("\nDIGITE O VALOR A SER CREDITADO: ")
					leia(credito)
					saldo+=credito
					escreva("\nTRANSACAO REALIZADA COM SUCESSO!")
					escreva("\n\nSALDO: R$" + saldo)
					escreva("\nVALOR LIBERADO PARA EMPRESTIMO: R$" + emprestimoEstudantil)
				} senao{
					escreva("\nDIGITE O VALOR A SER DEBITADO: ")
					leia(debito)
					saldo-=debito
					escreva("\nTRANSACAO REALIZADA COM SUCESSO!")
					escreva("\n\nSALDO: R$" + saldo)
					escreva("\nVALOR LIBERADO PARA EMPRESTIMO: R$" + emprestimoEstudantil)
				}

				se(saldo >= 0){ //oferece emprestimo
					escreva("\nDESEJA SOLICITAR UM EMPRESTIMO? [S] SIM | [N] NAO:")
					leia(resposta)
					se(resposta == 'S' ou resposta == 's'){
						escreva("\nDIGITE O VALOR DE EMPRESTIMO SOLICITADO: ")
						leia(solicitaEmprestimo)
						se(solicitaEmprestimo > emprestimoEstudantil){
							escreva("\nOPERACAO NAO REALIZADA! - VALOR SOLICITADO MAIOR QUE LIMITE DE CREDITO")
							escreva("\nSALDO " + saldo)	
						} senao {
							escreva("\nOPERACAO REALIZADA COM SUCESSO!")
							saldo+=solicitaEmprestimo
							emprestimoEstudantil-=solicitaEmprestimo
							escreva("\nSALDO: R$" + saldo)
							escreva("\nVALOR LIBERADO PARA EMPRESTIMO: " + emprestimoEstudantil)
						}
					}
				} senao {
					escreva("\nSEU SALDO ESTA NEGATIVO!")
					escreva("\nDESEJA SOLICITAR UM EMPRESTIMO? [S] SIM | [N] NAO:")
					leia(resposta)
					se(resposta == 'S' ou resposta == 's'){
						escreva("\nDIGITE O VALOR DE EMPRESTIMO SOLICITADO: ")
						leia(solicitaEmprestimo)
						se(solicitaEmprestimo > emprestimoEstudantil){
							escreva("\nOPERACAO NAO REALIZADA! - VALOR SOLICITADO MAIOR QUE LIMITE DE CREDITO")
							escreva("\nSALDO " + saldo)	
						} senao {
							escreva("\nOPERACAO REALIZADA COM SUCESSO!")
							saldo+=solicitaEmprestimo
							emprestimoEstudantil-=solicitaEmprestimo
							escreva("\nSALDO: R$" + saldo)
							escreva("\nVALOR LIBERADO PARA EMPRESTIMO: " + emprestimoEstudantil)
						}
					}
				}
			}
			
				//continuar
				escreva("\nDeseja continuar? [S] SIM OU [N] NAO: ")
				leia(continua)
			
			}enquanto(continua == 'S' ou continua == 's')
		}
		senao
		{
			escreva("\nDigite o numero da conta: ")
			escreva("\nDigite o CPF: ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */