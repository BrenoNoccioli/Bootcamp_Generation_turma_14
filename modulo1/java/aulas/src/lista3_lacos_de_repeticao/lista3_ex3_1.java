/*1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3
 *   quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */


package lista3_lacos_de_repeticao;

public class lista3_ex3_1 {
	public static void main(String[] args) {
		double num=233.00;
		System.out.println(num);
		do{
			if(num >= 300 && num <= 400) {
				num+=3;
			}else {
				if(num>=452) {
					break;
				}
				num+=5;
			}
			
			System.out.println(num);
		}while(num < 456);
	}
}
