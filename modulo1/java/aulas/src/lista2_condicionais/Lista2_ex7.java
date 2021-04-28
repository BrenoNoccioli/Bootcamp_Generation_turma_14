/*
 7) Receber valores de base e altura de um triângulo e verificar se
 são valores válidos (positivos maiores que zero).
 Em caso afirmativo, calcular a área do triângulo.
 */

package lista2_condicionais;

import java.util.Scanner;

public class Lista2_ex7 {
	public static void main(String[] args) {
		double altura=0.0, base=0.0, areaTriangulo = 0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a altura do triângulo: ");
		altura = leia.nextDouble();
		System.out.println("Digite a base do triângulo: ");
		base = leia.nextDouble();
		
		areaTriangulo = (base*altura)/2;
		
		if(base <= 0 || altura <= 0) {
			System.out.println("Valores inválidos! Digite valores maiores que 0.");
		} else {
			System.out.println("A área do triângulo é: " + areaTriangulo);
		}
		
		leia.close();
	}
}
