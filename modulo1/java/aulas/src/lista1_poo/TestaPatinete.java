package lista1_poo;

public class TestaPatinete {
	public static void main(String[] args) {
		Patinete patinete = new Patinete();
		
		patinete.setCor("prata");
		patinete.setMaterial("alumínio");
		patinete.setPreco(500.00);
		patinete.setDobravel(true);
		
		System.out.printf("Patinete dobrável em %s, cor %s, no valor de R$%.2f.", patinete.getMaterial(), patinete.getCor(), patinete.getPreco());
	}
}
