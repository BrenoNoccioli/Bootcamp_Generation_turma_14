package lista1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1_ex6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		double x1=0.0, x2=0.0, y1=0.0, y2=0.0, radicando=0.0, distancia=0.0;
		
		System.out.println("Digite X1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite X2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite Y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite Y2: ");
		y2 = leia.nextDouble();
		
		radicando = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
		distancia = Math.sqrt(radicando);
		
		System.out.println("A distância é: " + df.format(distancia));
		
		leia.close();
	}
}
