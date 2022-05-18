package Metodos;

public class RunProduto {

	public static void main(String[] args) {
		Preco preco =new Preco();
		preco.ValorCustos = 140;
		
		ProdutoPorArgumentoOuReferencia produto= new ProdutoPorArgumentoOuReferencia();
		produto.definirPreco(preco, 20, 15);
		
		System.out.println("Valor de Custo: " + preco.ValorCustos);
		System.out.println("Valor de Imposto: " + preco.valorImposto);
		System.out.println("Valor de lucro: " + preco.valorLucro);
		System.out.println("Valor de venda: " + preco.precoVenda);

	}

}
