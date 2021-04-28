package bancos;

import java.util.Scanner;

public class TestaContaUniversitaria {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ContaUniversitaria contaU = new ContaUniversitaria(001, 1000.00);
		
		char op = '0', opcaoMenu = '0';
		
		
		
		linha(15);
		pula();
		System.out.println(" <====== G1-bank ======>");
		menuInicial();
		opcaoMenu = leia.next().charAt(0);
		
		switch(opcaoMenu) {
			case '1':
				System.out.println("[C]-CRÉDITO / [D]-DÉBITO:_");
				op = leia.next().toUpperCase().charAt(0);
				
				if(op == 'C') {
					System.out.println("Digite o valor creditado:_");
					double valorCredito = leia.nextDouble();
					contaU.testarSaldo(valorCredito);
					contaU.restituiLimiteCadastrado();
				} else if(op == 'D') {
					System.out.println("Digite o valor a ser debitado:_");
					double valorDebito = leia.nextDouble();
					contaU.testarSaldo(valorDebito);
					
				}
			break;
		
			case '2':
				System.out.println("NÚMERO DA CONTA: "+ contaU.getNumeroConta());
				System.out.println("SALTO ATUAL: "+ contaU.getSaldo());
				System.out.println("LIMITE DISPONÍVEL: R$" + contaU.getLimite());
				System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
				//continuaMenu = leia.next().toUpperCase().charAt(0);
			break;
			
			case '3':
			break;
		}
		
		
	}
	
	
	public static void menuInicial() {
		linha(15);
		pula();
		System.out.println("[1] - MOVIMENTAÇÃO");
		System.out.println("[2] - SALDO");
		System.out.println("[3] - SAIR");
		linha(15);			
	}
	
	public static void linha(int tamanho) {
		for(int x=0; x<tamanho; x++) {
			System.out.print("💸");
		}
	}

	static void pula() {
		System.out.println();
	}
}
