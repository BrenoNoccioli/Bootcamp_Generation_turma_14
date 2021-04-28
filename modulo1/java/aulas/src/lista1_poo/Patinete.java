package lista1_poo;

public class Patinete {
	private String cor;
	private String material;
	private double preco;
	private boolean dobravel;
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial(){
		return material;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	public void setDobravel(boolean dobravel) {
		this.dobravel = dobravel;
	}
	public boolean isDobravel() {
		return dobravel;
	}
}
