package lista1_poo;

public class Cliente {
	//atributos
	public String nome;
	public char genero;
	public int anoNascimento;
	public int idade;
	public String cpf;
	
	//métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public int calculaIdade(int anoAtual) {
		idade = anoAtual - this.anoNascimento;
		return idade;
	}
	public int getIdade() {
		return idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
