package Metodos;

public class ProdutoPorArgumentoOuReferencia {
	double percentualImposto = 6;
	void definirPreco(Preco preco, double percentualImpostos, double margemLucro) {
		preco.valorImposto = preco.ValorCustos * (percentualImposto / 100);
		preco.valorLucro = preco.ValorCustos * (margemLucro / 100);
		preco.precoVenda = preco.ValorCustos + preco.valorImposto + preco.valorLucro;
	}
}
