/*
 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
 coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.
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
			System.out.println("Salário do habitante " + (i+1) + ": R$" + salario + " ");
			System.out.println("Número de filhos habitante " + (i+1) + ": " + numFilhos + " ");
			
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
			
			//pega percentual salario até R$100
			if(salario <= 100) {
				cont100 ++;
				percentualAte100 = (cont100 / totalHabitantes)*100;
			}
		}
		
		System.out.println("\nA média de salário da população é: R$" + mediaSalario);
		System.out.println("\nA média do numero de filhos é: " + mediaNumFilhos);
		System.out.println("\nO maior salário é: R$" + maiorSalario);
		System.out.println("\nO percentual de pessoas com salario até R$100,00 é: " + percentualAte100 + "%");
		
	}
}
