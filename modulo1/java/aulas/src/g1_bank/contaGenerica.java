package g1_bank;

import java.util.Scanner;

public class contaGenerica {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		
		double movimentos[] = new double[3];
		
		char continuaMenu = 0;
		char debitoCredito = 0;
		char continuaLoop = 0;
		double credito=0, debito = 0;
		double saldo=0;
		String nomeClientes = "Davi Vieira";
		String numeroConta = "01";

		
		do{
		switch(menuInicial(leia)){
		
			case '1': 
			{		
				for(int i=0; i<3; i++){
					
					System.out.println("MOVIMENTAÇÃO "+ (i+1)+ " - [D]DÉBITO OU [C] CRÉDITO");
					debitoCredito = leia.next().toUpperCase().charAt(0);
					if(debitoCredito == 'D') {
						System.out.println("DIGITE O VALOR DO DÉBITO: R$");
						debito = leia.nextDouble();
						if(saldo >= debito) {
							if(i == 2){
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);

							}else{
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("DESEJA CONTINUAR? S/N");
								continuaLoop = leia.next().toUpperCase().charAt(0);
									if(continuaLoop == 'N'){
										break;	
									}
							}
						}else if(saldo < debito) {
							pula();
							System.out.println("SALDO INSULFICIENTE");
							System.out.println("DESEJA CONTINUAR? S/N");
							continuaLoop = leia.next().toUpperCase().charAt(0);
								if(i == 2) {
									pula();
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								}
								if(continuaLoop == 'N'){
									break;
								}
						}
					}else if(debitoCredito == 'C') {
							if(i == 2) {
								System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
								credito = leia.nextDouble();
								movimentos[i] = credito;
								saldo += movimentos[i]; 
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("MOVIMENTAÇÕES ENCERRADAS.");
								linha();
								pula();
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

			case '2' : System.out.println("NOME DO CLIENTE: "+ nomeClientes);
					   System.out.println("NÚMERO DA CONTA: "+ numeroConta);
				       System.out.println("SALTO ATUAL: "+ saldo);	
				       System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
				       continuaMenu = leia.next().toUpperCase().charAt(0);
				       break;
			
			case '3' : System.out.println("OBRIGADO POR UTILIZAR O G1-BANK");
					   break;
			
			}
		}while(continuaMenu == 'S' ||  continuaLoop == 'N');
		
		leia.close();
		
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
