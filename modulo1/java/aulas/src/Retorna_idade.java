import java.util.Scanner;

public class Retorna_idade {
	public static void main(String[] args) {
		int anoNascimento = 0;
		int idade = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		idade = calcularIdade(anoNascimento);
		
		if(idade < 18 && idade > 0) {
			System.out.println("Voc� tem " + idade + " anos e � considerado infanto-juvenil");
		} else if(idade <=60) { //como o c�digo � encadeado, pode-se suprimir a primeira parte do primeiro else if
			System.out.println("Voc� tem " + idade + " anos e � considerado adulto");
		} else if(idade >60) {
			System.out.println("Voc� tem " + idade + " anos e � considerado idoso");
		} else {
			System.out.println("idade inv�lida!!!");
		}
		
		
		
		
	}
	
	//funcao calcular idade
	public static int calcularIdade(int anoNascimento) {
		final int anoAtual = 2020;
		int idade = 0;
		
		idade = anoAtual - anoNascimento;
		return idade;
		
	}
}
