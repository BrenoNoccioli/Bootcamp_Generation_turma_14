
public class lista_alunos {
	public static void main(String[] args) {
		
		//vetor de 40 alunos
		String nomeAlunos[] = {"Allen de Lima Vieira","Andr� de Brito Silva da Costa","B�rbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco Jos� Pires","Gabriel S�rgio Nascimento Santos Gon�alves","Gide�o da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","Jos� Jorge Hauck J�nior","Juliana Santos Andr�","K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni barros","Lucas Gon�alves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalh�es","Marcos Eduardo Gomes Gon�alves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Ver�nica Navarro Almenara", "Vin�cius Miranda","Gabriel Henrique Cabral Silva"};
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
