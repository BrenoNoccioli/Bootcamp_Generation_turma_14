package lista1_poo;

public class ContaBancaria {
	private int numero;
	private double saldo;
	private String cpf;
	private char tipo; //corrente, poupança, universitaria, especial.
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public char getTipo() {
		return tipo;
	}
}
