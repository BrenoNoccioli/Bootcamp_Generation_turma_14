/*
 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém
 3 grupos de indústrias que são altamente poluentes do meio ambiente. O
 índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para
 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades,
 se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a
 suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem
 ser notificados a paralisarem suas atividades. Faça um sistema que leia o
 índice de poluição medido e emita a notificação adequada aos diferentes
 grupos de empresas.
 */

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex5 {
	public static void main(String[] args) {
		double indicePoluicao = 0.0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nível de poluição medido: ");
		indicePoluicao = leia.nextDouble();
		
		if(indicePoluicao >= 0.05 && indicePoluicao <= 0.25) {
			System.out.println("Nível aceitável.");
		} else if(indicePoluicao >= 0.3 && indicePoluicao < 0.4) {
			System.out.println("Atenção. As empresas do primeiro grupo devem suspender suas atividades");
		} else if(indicePoluicao >= 0.4 && indicePoluicao < 0.5) {
			System.out.println("Atenção! As empresas dos grupos 1 e 2 devem suspender suas atividades");
		} else {
			System.out.println("Cuidado! Todas as empresas devem suspender suas atividades!");
		}
		
		leia.close();
	}
}
