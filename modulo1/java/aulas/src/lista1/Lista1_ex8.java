package lista1;
import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica
 * com a percentagem do distribuidor e dos impostos (aplicados ao custo
 * de fábrica). Supondo que a percentagem do distribuidor seja de 28% e
 * os impostos de 45%, escrever um sistema que leia o custo de fábrica de
 * um carro e escreva o custo ao consumidor.
 */

public class Lista1_ex8 {
	public static void main(String[] args) {
		double custoConsumidor=0.0, custoFabrica=0.0;
		double porcentagemDistribuidor=0.0, impostos=0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica: ");
		custoFabrica = leia.nextDouble();
		
		porcentagemDistribuidor = custoFabrica*0.28;
		impostos = custoFabrica*0.45;
		
		custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos;
		
		System.out.println("O custo ao consumidor será de: R$" + custoConsumidor);
		
		leia.close();
	}
}
