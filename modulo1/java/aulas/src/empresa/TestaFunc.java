package empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaFunc {
	public static void main(String[] args) {
		//instanciação completa de objeto
		Scanner leia = new Scanner(System.in);
		
		//usar uma interface
		List<Funcionario> lista = new ArrayList<>();
		System.out.println("Quantos funcionarios serão cadastrados?");
		int qtde = leia.nextInt();
		
		for(int i=1; i<=qtde; i++) {
			System.out.printf("FUNCIONARIO %d - DIGITE OS DADOS: \n", i);
			System.out.println("Funcionario Terceiro [S/N]: ");
			char op = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o nome: ");
			String nome = leia.next();
			System.out.println("Horas mensais: ");
			int horas = leia.nextInt();
			System.out.println("Qual o valor da hora: ");
			double valor = leia.nextDouble();
			if(op == 'S') {
				System.out.println("Digite o adicional terceiro: ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(nome, horas, valor, adicional)); 
			} else {
				lista.add(new Funcionario(nome, horas, valor));
			}
		}
		System.out.println();
		System.out.println("PAGEMENTOS");
		for(Funcionario func : lista) {
			System.out.println(func.getNome()+" - horas: "+func.getHorasMensais()+" - valor hora: "+func.getValorHora()+" - salario: "+func.pagamentoSalario());
		}
		
		
	}
}
