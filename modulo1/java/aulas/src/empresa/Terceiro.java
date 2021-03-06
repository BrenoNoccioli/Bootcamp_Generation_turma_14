package empresa;

public class Terceiro extends Funcionario {
	private double valorTerceiro;
	
	public Terceiro (String nome, int horasMensais, double valorHora, double valorTerceiro) {
		super(nome, horasMensais, valorHora);
		this.valorTerceiro = valorTerceiro;
	}
	



	@Override
	public double pagamentoSalario() {
		return (super.getHorasMensais()*super.getValorHora())+this.valorTerceiro;
	}
}
