
public class lista_alunos {
	public static void main(String[] args) {
		
		//vetor de 40 alunos
		String nomeAlunos[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara", "Vinícius Miranda","Gabriel Henrique Cabral Silva"};
		char generoAlunos[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M', 'M'};
		String matricula[] = new String[40];
		
		//cria matricula
		for(int i = 0; i<40; i++) {
			if(i>=9) {
				matricula[i] = "M-0" + (i+1);
			} else {
				matricula[i] = "M-00" + (i+1);
			}
			
		}
		
		//cria lista matricula + alunos por genero
		System.out.println("LISTA COMPLETA:");
		for(int i = 0; i<40; i++) {
			if(generoAlunos[i] == 'M') {
				System.out.println(matricula[i] + " - ALUNO: " + nomeAlunos[i]);
			} else {
				System.out.println(matricula[i] + " - ALUNA: " + nomeAlunos[i]);
			}
			
		}
	}
}
