

import java.util.Scanner;

public class TestaLoja {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Produto produtos = new Produto();
		
		
		
		System.out.println("Produto\tPreço\tEstoque");
		for(int i=0; i<3; i++) {
			System.out.printf("\n%s\t%.2f\t%d", produtos.nomeProduto[i], produtos.valorUnitario[i], produtos.qtdeEstoque[i]);
		}
		
		System.out.println("\nEscolha o produto pelo nome: ");
		String produtoEscolhido = leia.nextLine();
		System.out.println("Escolha a quantidade: ");
		int quantidadeEscolhida = leia.nextInt();
		
		
		for(int i=0; i<3; i++) {
			if(produtoEscolhido.equals(produtos.nomeProduto[i]) ) {
				System.out.println("Produto escollhido: " + produtos.nomeProduto[i]);
				System.out.println("Quantidade escolhida: " + quantidadeEscolhida);
				System.out.println("Preço total: R$" + (produtos.valorUnitario[i]*quantidadeEscolhida));
			}
		}
		
		
		

	}

}
