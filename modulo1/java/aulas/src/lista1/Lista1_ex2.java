package lista1;
import java.util.Scanner;

/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias
 * e mostre-a expressa em anos, meses e dias.
 */
public class Lista1_ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tempoEmDias=0, ano=0, mes=0, dia=0;
		
		System.out.println("Digite sua idade total em dias: ");
		tempoEmDias = leia.nextInt();
		
		ano = tempoEmDias/365;
		mes = (tempoEmDias%365)/30;
		dia = (tempoEmDias%365)%30;
		
		System.out.println("Você tem " + ano + " ano(s), " + mes + " mes(es) e " + dia + " dia(s).");
		
		leia.close();
	}
}
