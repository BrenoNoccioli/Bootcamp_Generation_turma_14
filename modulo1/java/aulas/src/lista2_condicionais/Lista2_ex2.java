/*
 2) Elabore um sistema que leia as vari�veis C e N, respectivamente
 c�digo e n�mero de horas trabalhadas de um oper�rio. E calcule o
 sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero
 de horas exceder a 50 calcule o excesso de pagamento armazenando-o
 na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente
 de trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio
 total e o sal�rio excedente.
 */

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex2 {
	public static void main(String[] args) {
		final double horaTrabalho = 10.00, horaExcedente = 20.00;
		final double limiteHoras = 50.00;
		double horasTrabalhadas = 0.0, salario = 0.0;
		double horasExtras=0.0, salarioExcedente = 0.0;
		double salarioTotal=0.0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o total de horas trabalhadas: ");
		horasTrabalhadas = leia.nextDouble();
		
		if(horasTrabalhadas <= limiteHoras) {
			salarioExcedente = 0.0;
			horasExtras = 0.0;
			salario = horasTrabalhadas * horaTrabalho;
			
			System.out.println("O sal�rio do funcion�rio ser� de: R$" + salario);
			System.out.println("Horas extras: " + horasExtras);
			System.out.println("Salario excedente: R$" + salarioExcedente);
		} else if(horasTrabalhadas > limiteHoras) {
			horasExtras = horasTrabalhadas - limiteHoras;
			salario = limiteHoras*horaTrabalho;
			salarioExcedente = horasExtras*horaExcedente;
			salarioTotal = salario + salarioExcedente;
			System.out.println("O sal�rio total ser� de: R$" + salarioTotal);
			System.out.println("Horas extras: " + horasExtras);
			System.out.println("Sal�rio excedente: R$" + salarioExcedente);
		}
		
		leia.close();
	}
	
}
