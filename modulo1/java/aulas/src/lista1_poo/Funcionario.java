package lista1_poo;

public class Funcionario {
	private String nome;
	private String codigo;
	private double salario;
	private boolean deFerias;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void setDeFerias(boolean deFerias) {
		this.deFerias = deFerias;
	}
	public boolean isDeFerias() {
		return deFerias;
	}
}
