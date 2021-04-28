/*
 5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m
 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente. O
 �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para
 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades,
 se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a
 suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem
 ser notificados a paralisarem suas atividades. Fa�a um sistema que leia o
 �ndice de polui��o medido e emita a notifica��o adequada aos diferentes
 grupos de empresas.
 */

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex5 {
	public static void main(String[] args) {
		double indicePoluicao = 0.0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o n�vel de polui��o medido: ");
		indicePoluicao = leia.nextDouble();
		
		if(indicePoluicao >= 0.05 && indicePoluicao <= 0.25) {
			System.out.println("N�vel aceit�vel.");
		} else if(indicePoluicao >= 0.3 && indicePoluicao < 0.4) {
			System.out.println("Aten��o. As empresas do primeiro grupo devem suspender suas atividades");
		} else if(indicePoluicao >= 0.4 && indicePoluicao < 0.5) {
			System.out.println("Aten��o! As empresas dos grupos 1 e 2 devem suspender suas atividades");
		} else {
			System.out.println("Cuidado! Todas as empresas devem suspender suas atividades!");
		}
		
		leia.close();
	}
}
