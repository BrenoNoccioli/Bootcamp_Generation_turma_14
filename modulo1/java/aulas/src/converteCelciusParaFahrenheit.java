import java.util.Scanner;


public class converteCelciusParaFahrenheit {
	public static void main(String[] args) {
		double grausCelcius = 0.0, grausFahrenheit=0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em graus Celcius (�C)?");
		grausCelcius = leia.nextDouble();
		
		grausFahrenheit = ((grausCelcius*9)/5) + 32;
		
		System.out.println("A temperatura em Fahrenheit �: " + grausFahrenheit + "�F");
		leia.close();
	}
}
