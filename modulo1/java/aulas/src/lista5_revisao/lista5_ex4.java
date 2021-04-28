/*Faça um programa que calcula e escreve a seguinte soma:
* soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
*/

package lista5_revisao;

public class lista5_ex4 {
	public static void main(String[] args) {
		double soma=0.0, somaL=0.0;
		int dividendo=1;
		
		for(int i=1; i<50; i++) {
			dividendo += 2;
			somaL += (dividendo/(i+1)); 
			System.out.print(dividendo +  "/" +  (i+1) + " + ");			
		}
		soma = 1 + somaL;
		System.out.println("\nA soma das frações é: " + soma);
	}
}
