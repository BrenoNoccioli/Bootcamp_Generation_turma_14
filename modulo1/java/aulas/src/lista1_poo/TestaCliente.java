package lista1_poo;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Breno");
		cliente1.setCpf("111.111.111-11");
		cliente1.setGenero('M');
		cliente1.setAnoNascimento(1990);
		cliente1.calculaIdade(2020);
		cliente1.getIdade();
		
		System.out.printf("Nome do cliente: %s", cliente1.getNome());
		System.out.printf("\nCPF: %s", cliente1.getCpf());
		System.out.println("\nGênero: "+cliente1.getGenero());
		System.out.printf("Idade: %d", cliente1.getIdade());
		
	}
}
