package lista3_poo;

public class TestaAnimais {
	public static void main(String[] args) {
		Animal cachorro = new Cachorro("cachorro");
		Animal cavalo = new Cavalo("cavalo");
		Animal preguica = new Preguica("preguiça");
		
		
		
		System.out.printf("O %s ", cachorro.getNome());
		cachorro.emiteSom();
		System.out.printf("O %s ", cavalo.getNome());
		cavalo.emiteSom();
		System.out.printf("A %s ", preguica.getNome());
		preguica.emiteSom();
	}
}
