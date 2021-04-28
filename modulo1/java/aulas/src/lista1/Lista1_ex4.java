package lista1;
import java.util.Scanner;

public class Lista1_ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double a=0.0, b=0.0, c=0.0, d=0.0, r=0.0, s=0.0;
		
		System.out.println("Escreva o número A: ");
		a = leia.nextDouble();
		
		System.out.println("Escreva o número B: ");
		b = leia.nextDouble();
		
		System.out.println("Escreva o número C: ");
		c = leia.nextDouble();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.println("O resultado é: " + d);
		leia.close();
	}
}
