package lista1_poo;

public class ProdutoEletronico {
	private String tipo;
	private String cor;
	private double preco;
	private boolean ligado;
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean isLigado() {
		return ligado;
	}
}
