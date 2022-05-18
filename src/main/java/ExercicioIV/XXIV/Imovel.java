package ExercicioIV.XXIV;

public class Imovel implements Seguravel {

	private double valorMercado;
	private int areaConstruida;

	public Imovel(double valorMercado, int areaConstruida) {
		super();
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	public String obterDescricao() {
		return "Imóvel com área construída de " + this.areaConstruida + "m2 e valor de mercado " 
			+ this.valorMercado;
	}

	public double calcularValorApolice() {
		
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.5);
		return valorApolice;
	}

}
