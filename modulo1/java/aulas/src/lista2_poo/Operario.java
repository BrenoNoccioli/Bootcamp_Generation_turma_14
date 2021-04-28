package lista2_poo;

public class Operario extends Pessoa {
	private double valorProducao;
	private double comissao;
	
	public double getValorProucao() {
		return this.valorProducao;
	}
	public void setValorProducao(double valor) {
		this.valorProducao = valor;
	}
	public double getComissao() {
		return comissao;
	}
	public void calculaComissao() {
		this.comissao = valorProducao*0.10;
	}
}
