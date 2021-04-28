package lista2_poo;

public class Vendedor extends Pessoa {
	private double salarioBase;
	private double salarioComComissao;
	private double valorVendas;
	private double comissao;
	
	
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	public void setSalarioBase(double valor) {
		this.salarioBase = valor;
	}
	
	public double getSalarioComComissao() {
		this.salarioComComissao = this.salarioBase + this.comissao;
		return this.salarioComComissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}


	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public void calculaComissao() {
		this.comissao = this.valorVendas*0.05;
	}

}
