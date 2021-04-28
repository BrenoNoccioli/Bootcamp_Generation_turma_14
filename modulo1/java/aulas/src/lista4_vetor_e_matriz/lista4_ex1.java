
package lista4_vetor_e_matriz;

import java.text.DecimalFormat;

public class lista4_ex1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		double pontuacao[] = new double[5];
		double maior = 0;
		
		System.out.printf("vetor pontucao[]: ");
		for(int i=0; i<5; i++) {
			pontuacao[i] = Math.random()*10;
			
			if(maior < pontuacao[i]) {
				maior = pontuacao[i];
			}
			
			System.out.print(df.format(pontuacao[i]) + "| ");
		}
		System.out.println("\nO maior valor é: " +  df.format(maior));
			
	}
}
