package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaLoja {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List <Cliente> Clientes = new ArrayList();
		List <Produtos> produtosCadastrados = new ArrayList();
		List <Produtos> carrinho = new ArrayList();
		
		//CADASTRA PRODUTOS
		produtosCadastrados.add(new Produtos("BATERIA 12V", "DL-001", 90.00));
		produtosCadastrados.add(new Produtos("COOLER C3TECH", "DL-002", 50.00));
		produtosCadastrados.add(new Produtos("MOUSE C/ FIO", "DL-003", 15.00));
		produtosCadastrados.add(new Produtos("MOUSE GAMER", "DL-004", 80.00));
		produtosCadastrados.add(new Produtos("MOUSEPAD", "DL-005", 20.00));
		produtosCadastrados.add(new Produtos("TECLADO C/ FIO", "DL-006", 35.00));
		produtosCadastrados.add(new Produtos("TECLADO GAMER", "DL-007", 120.00));
		produtosCadastrados.add(new Produtos("HEADPHONE", "DL-008", 150.00));
		produtosCadastrados.add(new Produtos("OCULOS 3D", "DL-009", 50.00));
		produtosCadastrados.add(new Produtos("CARTUCHO TONNER", "DL-010", 45.00));
		for(Produtos produto : produtosCadastrados) {//define estoque
			produto.adicionaEstoque(10);
		}
		
		char opcaoMenu = '0', opcaoVolta='0', continuaCompra='0';
		int qtde = 0;
		double valorCompraTotal = 0.0;
		String nomeCliente = null;
		boolean encontrou = false, encontrouCodigo = false;
		
		do {
		linha(23);
		nomeEmpresa();
		linha(23);
		menuInicial();
		linha(23);
		
		System.out.print("\nESCOLHA A OPÇÃO DESEJADA: ");
		opcaoMenu = leia.next().charAt(0);
		
		switch(opcaoMenu) {
			case '1': //compra produtos
				
				System.out.println("\nCADASTRO");
				linha(10);
				
				//pega nome e genero
				System.out.println("\n" + "Informe o seu nome completo: ");
				leia.nextLine();
				nomeCliente = leia.nextLine().toUpperCase();
				System.out.println("GENERO - [1]MASCULINO | [2]FEMININO | [3]OUTRO: ");
				char genero = retornaGenero(leia.next().charAt(0));
				System.out.println("Informe seu ano de nascimento: ");
				int anoNascimentoCliente = leia.nextInt();
				System.out.println("Informe seu CPF: ");
				leia.next();
				String cpfCliente = leia.nextLine();
				Clientes.add(new Cliente(nomeCliente, genero, anoNascimentoCliente, cpfCliente));
				
				//saudação com nome e genero
				if(genero == 'M') {
					System.out.println("Seja bem-vindo à loja, Sr. " + nomeCliente + "!!!");
				} else if(genero == 'F') {
					System.out.println("Seja bem-vinda à loja, Sra. " + nomeCliente + "!!!");
				} else if(genero == 'X') {
					System.out.println("Seja bem-vindx à loja, " + nomeCliente + "!!!");
				}else {
					System.out.println("OPÇÃO INVÁLIDA!");
				}
				
				do {
				//FAZ LISTA DE PRODUTOS
				System.out.println("CÓDIGO\t\tPREÇO\t\tPRODUTO\t\t\tESTOQUE");
				System.out.println("================================================================");
				for(Produtos produto : produtosCadastrados) {
					System.out.printf("%s\t\t%.2f\t\t%s\t\t%d\n",produto.getCodigoProduto(), produto.getPrecoUnitario(), produto.getNomeProduto(), produto.getQtdeProdutoEstoque());
				}
				
				
				//seleciona produto
				System.out.println("Digite o código do produto escolhido:_");
				String codigo = leia.next();
				
				for(Produtos produto : produtosCadastrados) {
					if(codigo.equals(produto.getCodigoProduto())) {
						encontrouCodigo = true;
						System.out.println("Digite a quantidade desejada:_");
						qtde = leia.nextInt();
					}
				}
				
				if(!encontrouCodigo) {
					System.out.println("Código inválido. Para continuar sua compra digite um código válido.");
				}
				

				//coloca produto no carrinho
				for(Produtos produto : produtosCadastrados) {
					if(codigo.equals(produto.getCodigoProduto())) {
						if(qtde <= produto.getQtdeProdutoEstoque() && qtde > 0) {
							valorCompraTotal += produto.venda(qtde);
							for(Produtos prodCarrinho : carrinho) {
								if(codigo.equals(prodCarrinho.getCodigoProduto())) {
									prodCarrinho.adicionaEstoque(qtde);
									encontrou = true;
								} 
							}
								
							if(encontrou == false) {
								carrinho.add(new Produtos(produto.getNomeProduto(), produto.getCodigoProduto(), produto.getPrecoUnitario(), qtde));
							} 
						} else {
							System.out.println("Quantidade indisponível em estoque! Escolha um valor válido para continuar sua compra.");
							break;
						}
					}
				}
				
				System.out.println("\nDESEJA CONTINUAR COMPRANDO? S/N:_");
				continuaCompra = leia.next().toUpperCase().charAt(0);
				}while(continuaCompra == 'S');
				
				System.out.println();
				
				//FAZ LISTA CARRINHO
				System.out.println("CARRINHO: ");
				System.out.println("PRODUTO\t\t\tQUANTIDADE\t\tPREÇO UNI.\t\tPRECO TOTAL");
				for(Produtos prodCarrinho : carrinho) {
					//precisa corrigir quantidade por produto e preco total por produto
					System.out.printf("%s\t\t%d\t\t\t%.2f\t\t\t%.2f\n", prodCarrinho.getNomeProduto(), prodCarrinho.getQtdeProdutoEstoque(), prodCarrinho.getPrecoUnitario(), (prodCarrinho.getPrecoUnitario()*prodCarrinho.getQtdeProdutoEstoque()));
				}
				System.out.println("\nVALOR TOTAL DA COMPRA: R$"+valorCompraTotal);
				
				//pergunta forma de pagamento
				System.out.println("ESCOLHA A FORMA DE PAGAMENTO:");
				System.out.println("1 - À VISTA (10% DE DESCONTO);");
				System.out.println("2 - DEBITO (VALOR TOTAL);");
				System.out.println("3 - CREDITO (5% DE JUROS);");
				System.out.println("4 - CREDITO 3X (10% DE JUROS)");
				char pgto = leia.next().charAt(0);
				
				if(pgto == '1') {
					System.out.printf("PAGAMENTO À VISTA:_\n");
					System.out.printf("TOTAL A PAGAR: R$%.2f \n", (valorCompraTotal-=valorCompraTotal*0.1));
					System.out.printf("TOTAL DE IMPOSTOS PAGOS: R$%.2f \n", ((valorCompraTotal-=valorCompraTotal*0.1)*0.09));
				} else if(pgto == '2') {
					System.out.printf("PAGAMENTO À DEBITO:_\n");
					System.out.printf("TOTAL A PAGAR: R$%.2f \n", (valorCompraTotal));
					System.out.printf("TOTAL DE IMPOSTOS PAGOS: R$%.2f \n", (valorCompraTotal*0.09));
				}else if(pgto == '3') {
					System.out.printf("PAGAMENTO À CRÉDITO:_\n");
					System.out.printf("TOTAL A PAGAR: R$%.2f \n", (valorCompraTotal*1.05));
					System.out.printf("TOTAL DE IMPOSTOS PAGOS: R$%.2f \n", ((valorCompraTotal*1.05)*0.09));
				}else if (pgto == '4') {
					System.out.printf("PARCELAMENTO EM 3X:_\n");
					System.out.printf("TOTAL DAS PARCELAS: R$%.2f \n", ((valorCompraTotal*1.1)/3));
					System.out.printf("TOTAL DE IMPOSTOS PAGOS: R$%.2f \n", ((valorCompraTotal*1.1)*0.09));
				}else {
					System.out.println("Opção inválida!");
				}
				System.out.println("OBRIGADO POR COMPRAR COM A GENTE! VOLTE SEMPRE!");
				
			break;
			
			case '2':
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
			
			case '3':
				System.out.println("OBRIGADO PELA SUA VISITA, VOLTE SEMPRE!!!");
			break;
		}
		}while(opcaoVolta == '1' && opcaoMenu !='3');
		
		leia.close();
	}
	
	//FUNCOES
	
		//faz linha
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
			System.out.println();
			System.out.println("[1] - COMPRAR PRODUTOS");
			System.out.println("[2] - GERENCIAR ESTOQUE");
			System.out.println("[3] - SAIR");			
		}

}
