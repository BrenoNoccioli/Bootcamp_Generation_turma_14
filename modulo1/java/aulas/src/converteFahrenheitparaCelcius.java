import java.text.DecimalFormat;
import java.util.Scanner;

public class converteFahrenheitparaCelcius {
	public static void main(String[] args) {
		
		double grausCelcius = 0.0, grausFahrenheit=0.0;
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		
		System.out.println("Qual a temperatura em graus Fahrenhei (ºF)?");
		grausFahrenheit = leia.nextDouble();
		
		grausCelcius = (grausFahrenheit-32) / 1.8;
		
		System.out.println("A temperatura em graus Celcius é: " + df.format(grausCelcius) + "ºC");

		leia.close();
	}
	
}
