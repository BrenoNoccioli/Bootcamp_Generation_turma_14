package lista1_poo;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		ProdutoEletronico computador = new ProdutoEletronico();
		
		computador.setCor("preto");
		computador.setTipo("notebook");
		computador.setPreco(3500.00);
		computador.setLigado(false);
		
		if(!computador.isLigado()) {
			System.out.printf("O computador � um %s %s, tem o pre�o de R$%.2f e est� desligado.", computador.getTipo(), computador.getCor(), computador.getPreco(), computador.isLigado());
		} else {
			System.out.printf("O computador � um %s %s, tem o pre�o de R$%.2f e est� ligado.", computador.getTipo(), computador.getCor(), computador.getPreco(), computador.isLigado());
		}

	}

}
