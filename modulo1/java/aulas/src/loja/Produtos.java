package loja;

public class Produtos {
	private String nomeProduto;
	private String codigoProduto;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	private int qtdeProdCarrinho;
	
	public Produtos(String nomeProduto, String codigoProduto, double precoUnitario) {
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
	}
	
	public Produtos(String nomeProduto, String codigoProduto, double precoUnitario, int qtdeProdutoEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}



	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}
	
	public boolean testaEstoque(int valor) {
		if(valor > this.qtdeProdutoEstoque) {
			return false;
		} else if(valor <= 0){
			return false;
		}else if(this.qtdeProdutoEstoque <= 0){
			return false;
		}else {
			return true;
		}
	}
	
	public void tiraEstoque(int saida) {
		if(testaEstoque(saida)) {
			this.qtdeProdutoEstoque -= saida;
		}else {
			System.out.println("Quantidade pedida maior que estoque!");
		}
	}
	
	public void adicionaEstoque(int entrada) {
		this.qtdeProdutoEstoque += entrada;
	}
	
	public double venda(int qtdeVendida) {
			if(testaEstoque(qtdeVendida)) {
				tiraEstoque(qtdeVendida);
				return this.precoUnitario*qtdeVendida;
			} else {
				System.out.println("Estoque indisponível! Para realizar sua compra escolha uma quantidade compatível com o estoque.");
				return 0;
			}
	}
}
