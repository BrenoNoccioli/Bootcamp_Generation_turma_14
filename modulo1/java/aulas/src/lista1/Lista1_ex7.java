package lista1;
import java.util.Scanner;

public class Lista1_ex7 {
	public static void main(String[] args) {
		double nA=0.0, nB=0.0, nC=0.0, nD=0.0, nE=0.0, nF=0.0, nX=0.0, nY=0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o n�mero A: ");
		nA = leia.nextDouble();
		System.out.println("Digite o n�mero B: ");
		nB = leia.nextDouble();
		System.out.println("Digite o n�mero C: ");
		nC = leia.nextDouble();
		System.out.println("Digite o n�mero D: ");
		nD = leia.nextDouble();
		System.out.println("Digite o n�mero E: ");
		nE = leia.nextDouble();
		System.out.println("Digite o n�mero F: ");
		nF = leia.nextDouble();
		
		nX = ((nC*nE)-(nB*nF)) / ((nA*nE)-(nB*nD));
		nY = ((nA*nF)-(nC*nD)) / ((nA*nE)-(nB*nD));
		
		System.out.println("O valor de X �: " + nX);
		System.out.println("O valor de Y �: " + nY);
		
		leia.close();
		
		
	}
}
