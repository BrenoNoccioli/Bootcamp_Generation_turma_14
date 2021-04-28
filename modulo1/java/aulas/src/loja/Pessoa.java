package loja;

public abstract class Pessoa {
	private String nome;
	private char genero;
	private int anoNascimento;
	private int idade;
	
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}
	
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public int retornaIdade(int anoAtual) {
		if(anoAtual == 0 || this.anoNascimento <= 1900) {
			System.out.println("Dados inválidos!");
			return 0;
		} else {
			return anoAtual - anoNascimento;			
		}
	}
}
