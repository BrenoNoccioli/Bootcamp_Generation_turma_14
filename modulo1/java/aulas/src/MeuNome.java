import java.util.Scanner;

public class MeuNome {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); //Instanciar uso do teclado
		
		String nome;
		int anoNascimento;
		
		System.out.println("Digite o nome do usuário: ");
		nome = leia.nextLine();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + (2020-anoNascimento));
		
		leia.close();
	}
}
