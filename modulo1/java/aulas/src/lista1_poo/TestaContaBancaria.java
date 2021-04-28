package lista1_poo;

public class TestaContaBancaria {
	public static void main(String[] args) {
		String tipoConta="";
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setNumero(3105);
		conta.setCpf("112.112.112-12");
		conta.setSaldo(5520.78);
		conta.setTipo('E');
		
		if(conta.getTipo() == 'C') {
			tipoConta = "corrente";
		} else if(conta.getTipo() == 'P') {
			tipoConta = "poupança";
		} else if(conta.getTipo() == 'E') {
			tipoConta = "especial";
		} else if(conta.getTipo() == 'U') {
			tipoConta = "universitária";
		}
		
		System.out.println("Número da conta: "+conta.getNumero());
		System.out.println("CPF cliente: "+conta.getCpf());
		System.out.println("Saldo: "+conta.getSaldo());
		System.out.println("Tipo de conta: "+tipoConta);
	}
}
