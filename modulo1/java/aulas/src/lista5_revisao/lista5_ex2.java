/*
O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para dar uma indica��o sobre
a condi��o de peso de uma pessoa adulta. A f�rmula � IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condi��o de acordo com a tabela abaixo. 
IMC em adultos Condi��o 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso
*/


package lista5_revisao;

import java.util.Scanner;

public class lista5_ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("VAMOS CALCULAR SEU IMC!");
		System.out.println("Digite seu peso (Kg): ");
		peso = leia.nextDouble();
		System.out.println("Digite sua altura (m): ");
		altura = leia.nextDouble();
		imc = peso/Math.pow(altura, 2);
		
		if(imc < 18.5) {
			System.out.printf("Seu IMC � de %.2f, voc� est� abixo do peso ideal.", imc);
		} else if(imc >=18.5 && imc < 25) {
			System.out.printf("Seu IMC � de %.2f, seu peso � normal.", imc);
		} else if(imc>=25 && imc <=30) {
			System.out.printf("Seu IMC � de %.2f, voc� est� acima do peso.", imc);
		} else {
			System.out.printf("Seu IMC � de %.2f, voc� est� obeso.", imc);
		}
	}
}
