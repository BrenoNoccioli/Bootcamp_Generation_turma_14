package lista1_poo;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Jo�o");
		f1.setCodigo("F-01112");
		f1.setSalario(2500.00);
		f1.setDeFerias(false);
		
		if(f1.isDeFerias()) {
			System.out.printf("O funcion�rio %s tem o codigo %s, recebe R$%.2f por m�s e est� de f�rias atualmente.", f1.getNome(), f1.getCodigo(), f1.getSalario(), f1.isDeFerias());
		} else {
			System.out.printf("O funcion�rio %s tem o codigo %s, recebe R$%.2f por m�s e est� trabalhando atualmente.", f1.getNome(), f1.getCodigo(), f1.getSalario(), f1.isDeFerias());
		}
	}
}
