package lista2_poo;

public class Testa_Lista_2_POO {
	public static void main(String[] args) {
		System.out.println("EXERCÍCIO 2: ");
		Fornecedor f1 = new Fornecedor("Breno", "Rua X");
		
		f1.setValorCredito(10000);
		f1.setValorDivida(5000);
		
		double saldo = f1.obterSaldo();
		
		System.out.println("Nome do fornecedor: " + f1.getNome());
		System.out.println("Valor Crédito: R$" + f1.getValorCredito());
		System.out.println("Valor Dívida: R$" + f1.getValorDivida());
		System.out.printf("Saldo: R$%.2f", saldo);
		System.out.println("\n==========================================");
		
		System.out.println("EXERCÍCIO 3: ");
		Empregado e1 = new Empregado();
		
		e1.setSalarioBase(2500.00);
		e1.setImposto(0.10);
		e1.calcularSalario();
		
		System.out.printf("O salário base é: R$%.2f.\nO salário líquido é: R$%.2f.", e1.getSalarioBase(), e1.getSalarioLiquido());
		System.out.println("\n==========================================");
		
		System.out.println("EXERCÍCIO 4: ");
		Administrador a1 = new Administrador();
		
		a1.setNome("Paulo");
		a1.calculaAjudaDeCusto(350, 500, 300);
		System.out.printf("O administrador %s recebe R$%.2f de ajuda de custo total.", a1.getNome(), a1.getAjudaDeCusto());
		System.out.println("\n==========================================");
		
		System.out.println("EXERCÍCIO 5: ");
		Operario o1 = new Operario();
		o1.setValorProducao(5000.00);
		o1.calculaComissao();
		
		System.out.printf("O operário recebeu R$%.2f de comissão este mês.", o1.getComissao());
		System.out.println("\n==========================================");
		
		System.out.println("EXERCÍCIO 6: ");
		Vendedor v1 = new Vendedor();
		
		v1.setSalarioBase(2000.00);
		v1.setValorVendas(35000);
		v1.calculaComissao();
		System.out.printf("O salário base total de um vendedor que recebe R$%.2f e vendeu R$%.2f é: R$%.2f", v1.getSalarioBase(), v1.getValorVendas(), v1.getSalarioComComissao());
		
	
	}
}
