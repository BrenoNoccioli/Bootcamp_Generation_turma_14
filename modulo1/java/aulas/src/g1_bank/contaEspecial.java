package g1_bank;

import java.util.Scanner;

public class contaEspecial {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		
		double movimentos[] = new double[3];
		
		char debitoCredito = 0;
		char continuaLoop = 0;
		double credito=0, debito = 0;
		double saldo=0, limiteSaldo = 1000.0;
		char continuaMenu = 0;
		
		
		do{
		switch(menuInicial(leia)){
		
			case '1': //inicia movimentacao 
			{	
				for(int i=0; i<3; i++){
					System.out.println("MOVIMENTAÇÃO "+ (i+1)+ " - [D]DÉBITO OU [C] CRÉDITO");
					debitoCredito = leia.next().toUpperCase().charAt(0);
					if(debitoCredito == 'D') {//debito
						System.out.println("DIGITE O VALOR DO DÉBITO: R$");
						debito = leia.nextDouble();
						if(saldo >= debito) {
							if(i == 2){//ultima movimentacao - pergunta retorna menu
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);

							}else{
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("DESEJA CONTINUAR? S/N"); //s - continua mov | n- volta menu
								continuaLoop = leia.next().toUpperCase().charAt(0);
									if(continuaLoop == 'N'){
										break;	
									}
							}
						}else if(saldo < debito) {	//usa limite
							if((saldo+limiteSaldo) >= debito) {
								if(i == 2){		//ultima movimentacao - pergunta retorna menu
									limiteSaldo += (-debito);
									movimentos[i]= (-debito);
									saldo += movimentos[i];
									System.out.println("SALDO ATUAL: R$"+saldo);
									System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								} else {
									pula();
									limiteSaldo += (-debito);
									movimentos[i]= (-debito);
									saldo += movimentos[i];
									System.out.println("SALDO ATUAL: R$"+saldo);
									System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
										if(continuaLoop == 'N'){
											break;
										}
								}
							} else {
								if(i == 2){		//ultima movimentacao - pergunta retorna menu
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								} else {
									pula();
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
										if(continuaLoop == 'N'){
											break;
										}
								}
							}
							
						}
					}else if(debitoCredito == 'C') {//credito
							if(i == 2) {
								System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
								credito = leia.nextDouble();
								movimentos[i] = credito;
								saldo += movimentos[i];
								System.out.println("MOVIMENTAÇÕES ENCERRADAS.");
								linha();
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);

							}
						System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
						credito = leia.nextDouble();
						movimentos[i] = credito;
						saldo += movimentos[i]; 
						System.out.println("DESEJA CONTINUAR? S/N");
						continuaLoop = leia.next().toUpperCase().charAt(0);
							if(continuaLoop == 'N'){
								break;								
							}
					}									
				}
			break;
			}

			case '2' : 
				System.out.println("NOME DO CLIENTE: "/*+ nomeClientes*/);
				System.out.println("NÚMERO DA CONTA: "/*+ numeroConta*/);
				System.out.println("SALTO ATUAL: "+ saldo);
				System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
				System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
				continuaMenu = leia.next().toUpperCase().charAt(0);
		       break;
			
			case '3' : 
				System.out.println("OBRIGADO POR UTILIZAR O G1-BANK");
				break;
			
		}
		}while(continuaMenu == 'S' ||  continuaLoop == 'N');
		
		}

		static void linha() {
			int tamanho = 19;
			for (int x = 1; x <= tamanho; x++)
				System.out.print("💸");
		}
	
		static void pula() {
			System.out.println();
		}
		
		public static char menuInicial(Scanner leia) {
			
			linha();
			pula();
			System.out.println("[1] - MOVIMENTAÇÃO");
			System.out.println("[2] - SALDO");
			System.out.println("[3] - SAIR");
			linha();			
			char resposta = leia.next().charAt(0);
			
			return resposta;
		}
}
