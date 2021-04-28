/*
 * 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
 * múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 */

package lista3_lacos_de_repeticao;

public class lista3_ex1_2 {
	public static void main(String[] args) {
		int i=1;
		for(i=1; i<500; i++) {
			if(i%2!=0 && i%3==0) {
				
				i+=i;
				
			}
		}
		System.out.println("A soma dos números ímpares multiplos de 3 é: " + i);
	}
}
