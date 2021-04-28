package lista1_poo;

public class TestaAviao {
	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		
		aviao.setCor("azul");
		aviao.setVelocidade(300.00);
		aviao.setVoando(true);
		
		System.out.printf("O aviao é %s e está voando (%b) a %.2fKm/h.", aviao.getCor(), aviao.isVoando(), aviao.getVelocidade());
	}
	
	
}
