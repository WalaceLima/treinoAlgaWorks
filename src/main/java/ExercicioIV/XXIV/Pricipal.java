package ExercicioIV.XXIV;

public class Pricipal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();

		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		Notebook not = new Notebook(4350, "Sony");
		Barco brc = new Barco(15, 25000);

		corretora.fazerPropostaSeguro(brc);
		corretora.fazerPropostaSeguro(not);
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
	}

}
