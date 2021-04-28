package lista1_poo;

public class Aviao {
	private String cor;
	private boolean voando;
	private double velocidade;
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public boolean isVoando() {
		return voando;
	}
	public void setVoando(boolean voando) {
		this.voando = voando;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
}
