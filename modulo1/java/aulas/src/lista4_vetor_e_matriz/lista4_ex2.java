package lista4_vetor_e_matriz;

import java.util.Random;

public class lista4_ex2 {
	public static void main(String[] args) {
		int lancamentos[] = new int[10];
		double media = 0.0, total =0;
		int cont =0, maiorValor=0, contMaior=0;
		
		
		Random random = new Random();
		
		System.out.println("LANÇAMENTOS: ");
		for(int i=0; i<10; i++) {
			cont++;
			lancamentos[i] = random.nextInt(6)+1;
			System.out.println("Lançamento " + (i+1) + ": " + lancamentos[i]);
			
			total += lancamentos[i];
			
			if(maiorValor < lancamentos[i]) {
				maiorValor = lancamentos[i];
			}
		}
		
		
		media = (total/cont);
		
		
		for(int i=0; i<10; i++) {
			if(lancamentos[i] == maiorValor) {
				contMaior++;
			}
		}
		
		System.out.print("\nA média dos valores é: " + media);
		System.out.println("\nO maior valor foi: " + maiorValor + " e ele saiu " + contMaior + " vezes");
	}
}
