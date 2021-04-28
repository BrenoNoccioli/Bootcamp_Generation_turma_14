package lista1;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final
 * deste aluno. Considerar que a média é ponderada e que o peso das notas é:
 * 2, 3 e 5, respectivamente.
 */

public class Lista1_ex5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		
		double nota1=2.0, nota2=3.0, nota3=5.0, media=0.0;
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("A média das notas é: " + df.format(media));
		
		leia.close();
	}
}
