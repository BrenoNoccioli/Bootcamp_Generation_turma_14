/*
 7) Receber valores de base e altura de um tri�ngulo e verificar se
 s�o valores v�lidos (positivos maiores que zero).
 Em caso afirmativo, calcular a �rea do tri�ngulo.
 */

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex7 {
	public static void main(String[] args) {
		double altura=0.0, base=0.0, areaTriangulo = 0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a altura do tri�ngulo: ");
		altura = leia.nextDouble();
		System.out.println("Digite a base do tri�ngulo: ");
		base = leia.nextDouble();
		
		areaTriangulo = (base*altura)/2;
		
		if(base <= 0 || altura <= 0) {
			System.out.println("Valores inv�lidos! Digite valores maiores que 0.");
		} else {
			System.out.println("A �rea do tri�ngulo �: " + areaTriangulo);
		}
		
		leia.close();
	}
}
