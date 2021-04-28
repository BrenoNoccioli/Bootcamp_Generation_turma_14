package lista3_poo;

public abstract class Animal {
	private String nome;
	private int idade;
	protected int anoNascimento;
	private String som;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void calculaIdade(int anoAtual) {
		this.idade = (anoAtual - this.anoNascimento);
	}
	public void emiteSom() {
		System.out.println("Qual animal eu sou??");
	}
	
	
}
