programa
{
	
	funcao inicio()
	{
		inteiro numeroConta = 01
		real saldo = 0.00
		cadeia cpf = "123.123.123-12"
		real movimentos[10]
		real credito, debito, saldoComEmprestimo = 0.0
		real emprestimoEstudantil = 1000.00, solicitaEmprestimo = 0.0
		cadeia resposta
		

		escreva("CONFIRME OS SEUS DADOS: ")       
		escreva("\n")         
		escreva("----------------------")         
		escreva("\nNúmero da Conta: ", numeroConta)         
		escreva("\nNúmero do CPF: ", cpf)
		escreva("\nDigite SIM ou Não para continuar: ")
		leia(resposta)

		//lançamentos
		se(resposta == "SIM" ou resposta == "sim"){
			escreva("\nVamos prosseguir!\n")
			
			para(inteiro x=0; x<10; x++){
			escreva("\nDigite a movimentação " + (x+1) + ": " )
			leia(movimentos[x])
			saldo += movimentos[x]
			escreva("Saldo: R$" + saldo)
			
			se(saldo >= 0)
			{
				escreva("\nVocê tem empréstimo pré-aprovado no valor de R$" + emprestimoEstudantil)
				escreva("\nDeseja solicitar um empréstimo? SIM / NÃO: ")
				leia(resposta)
			
				se(resposta == "SIM" ou resposta == "sim")
				{
					escreva("\nDigite o valor de empréstimo: ")
					leia(solicitaEmprestimo)
					emprestimoEstudantil-=solicitaEmprestimo
					saldo+=solicitaEmprestimo
					escreva("\nSeu novo saldo é: R$" + saldo)
					escreva("\nVocê ainda pode pedir R$" + emprestimoEstudantil + " de empréstimo")
				
			}
			
		}
		senao
		{
			escreva("\nSeu saldo está negativo!")
			escreva("\nVocê tem empréstimo pré-aprovado no valor de R$" + emprestimoEstudantil)
			escreva("\nDeseja solicitar um empréstimo? SIM / NÃO: ")
			leia(resposta)
			se(resposta == "SIM" ou resposta == "sim")
			{
				escreva("\nDigite o valor de empréstimo: ")
				leia(solicitaEmprestimo)
				emprestimoEstudantil-=solicitaEmprestimo
				saldo+=solicitaEmprestimo
				escreva("\nSeu novo saldo é: R$" + saldo)
				escreva("\nVocê ainda pode pedir R$" + emprestimoEstudantil + " de empréstimo")
				
			}
			
		}
		}


		//mostra movimentação do dia e saldo
		escreva("Movimentação do dia: [ ")
		para(inteiro x=0; x<10; x++){
			se(x==9){
				escreva(movimentos[x])
				
	
			} senao{
				escreva(movimentos[x] + ", ")
				
			}
			
		}
			escreva(" ]")
			escreva("\nO saldo final é: R$" + saldo)

		/*
		//pega empréstimo
		se(saldo < 0){
			/
			escreva("\nSeu saldo está negativo! Você tem R$" + emprestimoEstudantil + " de empréstimo liberado." )
			escreva("\nDigite o valor do empréstimo que deseja pegar: ")
			leia(solicitaEmprestimo)
				
			se(solicitaEmprestimo <= emprestimoEstudantil){
				saldo+=solicitaEmprestimo
				escreva("\nVocê pegou um empréstimo!")
				escreva("\nO novo saldo é: R$" + saldo)
				escreva("\nVocê ainda tem R$" + (emprestimoEstudantil - solicitaEmprestimo) + " de crédito para solicitar.")
					
			} senao {
				escreva("Espertinho! Você não pode pegar um valor de empréstimo maior que o liberado!")
			}
		}*/

			//Prosseguir
			escreva("\n\nDeseja proseguir?\nDigite SIM ou NAO: ")
			leia(resposta)
			se(resposta == "SIM" ou resposta == "sim"){
				escreva("Vamos lá!")
				
			} senao {
				escreva("Obrigado! Tenha um bom dia!")
			}

		} senao {
			escreva("Digite o número da conta: ")
			escreva("Digite o CPF: ")
		}
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 541; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */