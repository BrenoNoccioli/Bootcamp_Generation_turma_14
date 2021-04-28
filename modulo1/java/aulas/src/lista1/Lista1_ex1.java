package lista1;
import java.util.Scanner;

/*
 *1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 *meses e dias e mostre-a expressa apenas em dias. 
*/
public class Lista1_ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int ano=0, mes=0, dia=0, idadeEmDias=0;
		
		//lendo ano
		System.out.println("Digite sua idade em anos: ");
		ano = leia.nextInt();
		
		//lendo mes
		System.out.println("Digite sua idade em meses (excetuando anos completos): ");
		mes = leia.nextInt();
		
		//lendo dias
		System.out.println("Digite sua idade em dias (excetuando anos e meses completos): ");
		dia = leia.nextInt();
		
		idadeEmDias = (ano*365) + (mes*30) + dia;
		System.out.println("Sua idade total em dias é: " + idadeEmDias);
		
		leia.close();
	}
}
