package lista1_poo;

public class TestaPaciente {
	public static void main(String[] args) {
		String generoPaciente = "";
		Paciente p1 = new Paciente();
		
		p1.setNome("Maria");
		p1.setGenero('F');
		p1.setCodigo("H-0125");
		p1.setCpf("112.112.112-12");
		p1.setInternado(true);
		
		
		
		if(p1.isInternado()) {
			if(p1.getGenero() == 'F') {
				generoPaciente = "feminino";
				System.out.printf("A paciente %s está internada", p1.getNome());
			} else {
				generoPaciente = "masculino";
				System.out.printf("O paciente %s está internado", p1.getNome());
			}
		} else {
			if(p1.getGenero() == 'F') {
				generoPaciente = "feminino";
				System.out.printf("A paciente %s recebeu alta", p1.getNome());
			} else {
				generoPaciente = "masculino";
				System.out.printf("O paciente %s recebeu alta", p1.getNome());
			}
		}
	}
}
