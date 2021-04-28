package lista1_poo;

public class Paciente {
	private String nome;
	private char genero;
	private String cpf;
	private String codigo;
	private boolean internado;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public char getGenero() {
		return genero;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setInternado(boolean internado) {
		this.internado = internado;
	}
	public boolean isInternado() {
		return internado;
	}
}
