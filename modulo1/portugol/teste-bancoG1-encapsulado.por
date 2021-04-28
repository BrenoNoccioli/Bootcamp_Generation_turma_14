programa
{
	
	funcao inicio()
	{
		inteiro numeroConta = 01
		real saldo = 0.00
		cadeia cpf = "123.123.123-12"
		real movimentos[10]
		real valorCredito = 0.0, valorDebito = 0.0, saldoComEmprestimo = 0.0
		real emprestimoEstudantil = 1000.00, solicitaEmprestimo = 0.0
		caracter resposta, continua = '0'

		escreva("CONFIRME OS SEUS DADOS: \n")                
		escreva("----------------------")         
		escreva("\nNumero da Conta: ", numeroConta)         
		escreva("\nNumero do CPF: ", cpf)
		escreva("\nDigite [S] SIM ou [N] NÃO para continuar: ")
		leia(resposta)

		faca{
			para(inteiro x=0; x<2; x++){
				escreva("\nTRANSACAO " + (x+1) + "  - [C] Credito | [D] Debito: ")
				leia(resposta) //define natureza da transacao
				se(resposta == 'C' ou resposta =='c'){
					credito()
					emprestimo()
				} senao se(resposta == 'D' ou resposta == 'd'){
					debito()
					emprestimo()
				}
			}
			
			//continuar
			escreva("\nDESEJA CONTINUAR? [1] - SIM | [2] - NAO ")
			leia(continua)
	
		}enquanto(continua == '1')
	}


	funcao real credito(saldo){
		real valorCredito=0.0, saldo=0.0, emprestimoEstudantil=1000.00
		
		escreva("\nDIGITE O VALOR A SER CREDITADO: ")
		leia(valorCredito)
		saldo+=valorCredito
		escreva("\nTRANSACAO REALIZADA COM SUCESSO!")
		escreva("\n\nSALDO: R$" + saldo)
		escreva("\nVALOR LIBERADO PARA EMPRESTIMO: R$" + emprestimoEstudantil)

		retorne saldo
	}


	funcao real debito(saldo){
		real valorDebito =0.0, saldo=0.0, emprestimoEstudantil=1000.00
		
		escreva("\nDIGITE O VALOR A SER DEBITADO: ")
		leia(valorDebito)
		saldo-=valorDebito
		escreva("\nTRANSACAO REALIZADA COM SUCESSO!")
		escreva("\n\nSALDO: R$" + saldo)
		escreva("\nVALOR LIBERADO PARA EMPRESTIMO: R$" + emprestimoEstudantil)

		retorne saldo
	}
	

	funcao emprestimo(saldo){
		real saldo=0.0, solicitaEmprestimo=0.0, emprestimoEstudantil=1000.0
		caracter resposta
		
		
		se(saldo>=0){
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
			
		} senao{
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
	
	
}
	

	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */