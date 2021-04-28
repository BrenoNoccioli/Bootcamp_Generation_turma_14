package loja;

import java.util.Scanner;

public class CadLoja {
	public static void main(String[] args) {
		char opcaoMenu = 0, opcaoVolta=0;
		String nomeCliente = "";
		int emEstoque=0, quantidadeCompra=0;
		
		//vetores
		final int CONST = 10;
		String codigosProdutos[] = new String[CONST];
		String produtos[] = {"BATERIA SELADA 12V", "COOLER FAN LED C3TECH", "MOUSE OFFICE CM10 COM FIO", "MOUSE GAMER SEM FIO", "MOUSEPAD SIMPLES", "TECLADO OFFICE CM20 COM FIO", "TECLADO GAMER SEM FIO ", "HEADPHONE GAMER", "OCULOS REALIDADE VIRTUAL 3D", "CARTUCHO TONNER"};
		double precosProdutos[] = {90, 50, 15, 80, 20, 35, 120, 150, 50, 45};
		int estoque[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		String carrinho[] = new String[CONST];
		
		Scanner leia = new Scanner(System.in);
		
		//faz vetor códigosProdutos
		for(int i=0; i<CONST; i++) {
			if(i >= 9) {
				String codigo = "DL-0" + (i+1);
				codigosProdutos[i] = codigo;
			} else {
				String codigo = "DL-00" + (i+1);
				codigosProdutos[i] = codigo;
			}
			
			
		}
	
		do {
		//inicio do programa
		linha(20);
		nomeEmpresa();
		linha(20);
		menuInicial();
		
		System.out.print("Escolha uma opção: ");
		opcaoMenu = leia.next().charAt(0);
		
			
		switch(opcaoMenu) {
			case '1': //comprar produtos
				System.out.println("\nCADASTRO");
				linha(10);
				
				//pega nome e genero
				System.out.println("\n" + "Informe o seu nome completo: ");
				leia.nextLine();
				nomeCliente = leia.nextLine().toUpperCase();
				System.out.println("GENERO - [1]MASCULINO | [2]FEMININO | [3]OUTRO: ");
				char genero = leia.next().charAt(0);
				
				//saudação com nome e genero
				if(retornaGenero(genero) == 'M') {
					System.out.println("Seja bem-vindo à loja, Sr. " + nomeCliente + "!!!");
				} else if(retornaGenero(genero) == 'F') {
					System.out.println("Seja bem-vinda à loja, Sra. " + nomeCliente + "!!!");
				} else if(retornaGenero(genero) == 'X') {
					System.out.println("Seja bem-vindx à loja, " + nomeCliente + "!!!");
				}else {
					System.out.println("OPÇÃO INVÁLIDA!");
				}
				
				//gera lista de produtos
				System.out.println("CÓDIGO\tPREÇO\tPRODUTO\t\t\t\tESTOQUE");//cabeçalho
				for(int i=0; i<CONST; i++) {
					System.out.printf("\n%s\t%.2f\t%s\t%d",codigosProdutos[i], precosProdutos[i], produtos[i], estoque[i]);
				}
				//escolhe produto
				System.out.println("\n\nDigite o código do produto escolhido: ");
				String codigo = leia.next();
				System.out.println("Produto escolhido: ");
				for(int i=0; i<CONST; i++) {
					if(codigo.equals(codigosProdutos[i])) {
						emEstoque = estoque[i];
						System.out.println(produtos[i]);
					}
				}
				//escolhe quantidade
				for(int i=0; i<CONST; i++) {
					
				}
				System.out.printf("Digite quantas unidades deseja comprar:\n(%d unidades em estoque)", emEstoque);
				quantidadeCompra = leia.nextInt();
					
				
			
				///!!!!! PAREI AQUI - ESCOLHENDO QUANTIDADE DE PRODUTO !!!!!!
			
				
				
				
				
				//volta ao menu S ou N
				System.out.println("\nDeseja volta ao Menu? [1]SIM [2]NÃO:_");
				opcaoVolta = leia.next().toUpperCase().charAt(0);
				if(opcaoVolta == '2') {
					System.out.println("OBRIGADO PELA SUA VISITA, VOLTE SEMPRE!!!");
					break;
				}
				
				while(opcaoVolta != '1' && opcaoVolta != '2') {
					if(opcaoVolta != '1' && opcaoVolta != '2') {
						System.out.println("Por favor, escolha uma opção válida - [1]SIM | [2]NÃO");
						opcaoVolta = leia.next().toUpperCase().charAt(0);
					} else {
						break;
					}
				
				}

			break;
			
			case '2': //gerenciar estoque
				System.out.println("W.I.P. - EM BREVE ESTAREMOS PRONTOS!");
				
				//volta ao menu S ou N
				System.out.println("\nDeseja volta ao Menu? [1]SIM [2]NÃO:_");
				opcaoVolta = leia.next().toUpperCase().charAt(0);
				if(opcaoVolta == '2') {
					System.out.println("OBRIGADO PELA SUA VISITA, VOLTE SEMPRE!!!");
					break;
				}
				
				while(opcaoVolta != '1' && opcaoVolta != '2') {
					if(opcaoVolta != '1' && opcaoVolta != '2') {
						System.out.println("Por favor, escolha uma opção válida - [1]SIM | [2]NÃO");
						opcaoVolta = leia.next().toUpperCase().charAt(0);
					} else {	
						break;
					}
				};
				
			break;
			
			case '3': //sair
				System.out.println("OBRIGADO PELA SUA VISITA, VOLTE SEMPRE!!!");
				
			break;
		}
		}while(opcaoVolta == '1' && opcaoMenu !='3');
	}
	
	//FUNCOES
	
	//fazer linha
	public static void linha(int tamanho) {
		for(int x=0; x<tamanho; x++) {
			System.out.print("-");
		}
	}
	
	//retorna genero
	public static char retornaGenero(char genero) {
		if(genero == '1') {
			return 'M';
		} else if(genero == '2') {
			return 'F';
		} else {
			return 'X';
		}
	}
	
	//nome empresa
	public static void nomeEmpresa() {
		System.out.println("\nDL SUPRIMENTOS");
	}
	
	//menu inicial
	public static void menuInicial() {
		System.out.println("\n");
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
	}
	
	
}
