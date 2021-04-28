package lista3_poo;

public class Cavalo extends Animal {
	private boolean corre;
	
	public Cavalo(String nome) {
		super(nome);
	}
	
	public boolean getCorre() {
		return this.corre;
	}
	
	public void setCorre(boolean correndo) {
		this.corre = correndo;
	}
	
	@Override
	public void emiteSom() {
		System.out.println("relincha");
	}
}
