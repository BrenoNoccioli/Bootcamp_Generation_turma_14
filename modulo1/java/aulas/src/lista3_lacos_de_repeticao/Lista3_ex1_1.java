/*
 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
 coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.
 */

package lista3_lacos_de_repeticao;

import java.util.Random;

public class Lista3_ex1_1 {
	public static void main(String[] args) {
		double salario =0.0, mediaSalario=0.0, salarioTotal=0.0, mediaNumFilhos=0.0;
		double maiorSalario=0.0, percentualAte100=0.0;
		int numFilhos =0, totalFilhos=0, totalHabitantes=0, cont100=0;
		
		Random sortear = new Random();
		
		for(int i=0; i<3; i++) {
			totalHabitantes++;
			
			//atribui salario e numero de filhos
			salario = sortear.nextInt(500);
			numFilhos = sortear.nextInt(5);
			System.out.println("Sal�rio do habitante " + (i+1) + ": R$" + salario + " ");
			System.out.println("N�mero de filhos habitante " + (i+1) + ": " + numFilhos + " ");
			
			//calcula media salario
			salarioTotal += salario;
			mediaSalario = salarioTotal/totalHabitantes;
			
			//calcula media filhos
			totalFilhos += numFilhos;
			mediaNumFilhos = totalFilhos/totalHabitantes;
			
			//pega maior salario
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			
			//pega percentual salario at� R$100
			if(salario <= 100) {
				cont100 ++;
				percentualAte100 = (cont100 / totalHabitantes)*100;
			}
		}
		
		System.out.println("\nA m�dia de sal�rio da popula��o �: R$" + mediaSalario);
		System.out.println("\nA m�dia do numero de filhos �: " + mediaNumFilhos);
		System.out.println("\nO maior sal�rio �: R$" + maiorSalario);
		System.out.println("\nO percentual de pessoas com salario at� R$100,00 �: " + percentualAte100 + "%");
		
	}
}
