package lista3_poo;

public class Preguica extends Animal {
	private boolean emCimaDaArvore;
	
	public Preguica(String nome) {
		super(nome);
	}
	
	public boolean isEmCimaDaArvore() {
		return emCimaDaArvore;
	}
	
	public void setEmCimaDaArvore(boolean subiu) {
		this.emCimaDaArvore = subiu;
	}
	
	@Override
	public void emiteSom() {
		System.out.println("grunhe");
	}
}
