package lista1;
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/

import java.util.Scanner;


public class Lista1_ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos=0, horas=0, minutos=0, segundos=0;
		
		System.out.println("Digite o total de tempo em segundos: ");
		
		tempoSegundos = leia.nextInt();
		
		horas = tempoSegundos/3600;
		minutos = (tempoSegundos%3600)/60;
		segundos = (tempoSegundos%3600)%60;
		System.out.println("O tempo total é de " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)");
	
		leia.close();
	}
	
	
}
