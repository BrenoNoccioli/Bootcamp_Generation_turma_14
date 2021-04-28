package lista3_poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class EstoqueLoja_lista3 {
	public static void main(String[] args) {
		char opcao = '0', continua ='0', continuaProg ='0';
		
		Scanner leia = new Scanner(System.in);
		
		Collection <String> produtosEstoque = new ArrayList(); //cria lista de produtos iniciais
		Collection <String> produtosAdicionados = new ArrayList();
		Collection <String> todosOsProdutos = new ArrayList();
		
		produtosEstoque.add("MOUSE");
		produtosEstoque.add("TECLADO");
		produtosEstoque.add("NOTEBOOK");
		produtosEstoque.add("CABO HDMI");
		produtosEstoque.add("FONE");
		todosOsProdutos.addAll(produtosEstoque);
		
		
		do {
			System.out.println();
		System.out.println("1 - Mostar lista inicial de produtos;");
		System.out.println("2 - Adicionar produtos;");
		System.out.println("3 - Remover produtos;");
		
		System.out.println("\nDIGITE A OPÇÃO DESEJADA:_");
		opcao = leia.next().toUpperCase().charAt(0);
		switch(opcao) {
			case '1':
				System.out.println(produtosEstoque);
				System.out.println("\nVoltar ao menu inicial? S/N");
				continuaProg = leia.next().toUpperCase().charAt(0);
			break;
			
			case '2':
				do {
					
					System.out.println("Escreva o nome do produto que deseja adicionar: ");
					produtosAdicionados.add(leia.next());
					System.out.println("Deseja adicionar mais produtos? S/N");
					continua = leia.next().toUpperCase().charAt(0);
				}while(continua == 'S');
				todosOsProdutos.addAll(produtosAdicionados);
				System.out.println("Lista de produtos adicionados: "+produtosAdicionados);
				System.out.println("Lista atualizada: "+todosOsProdutos);
				System.out.println("\nVoltar ao menu inicial? S/N");
				continuaProg = leia.next().toUpperCase().charAt(0);
			break;
			
			case '3':
				do {
				System.out.println(todosOsProdutos);
				System.out.println("Escreva o nome do produto que deseja remover:_");
				String prodRemov = leia.next();
				boolean encontra = todosOsProdutos.contains(prodRemov);
				if(encontra) {
					todosOsProdutos.remove(prodRemov);
					System.out.println(todosOsProdutos);
				} else {
					System.out.println("Produto não encontrado. Por favor, certifique-se de que a grafia está correta e o produto está na lista");
				}
				System.out.println("Deseja remover mais produtos? S/N");
				continua = leia.next().toUpperCase().charAt(0);
				}while(continua == 'S');
				System.out.println("Lista atualizada: "+todosOsProdutos);
				System.out.println(produtosEstoque);
				System.out.println("\nVoltar ao menu inicial? S/N");
				continuaProg = leia.next().toUpperCase().charAt(0);
				
			break;
		}
		
		}while(continuaProg == 'S');
	}
}
