package lista2_poo;

public class Administrador extends Pessoa {
	private double ajudaDeCusto;
	
	
	public double getAjudaDeCusto() {
		return this.ajudaDeCusto;
	}
	public void calculaAjudaDeCusto(double valorViagens, double valorEstadia, double valorAlimentacao) {
		this.ajudaDeCusto = valorViagens + valorEstadia + valorAlimentacao;
	}
}
