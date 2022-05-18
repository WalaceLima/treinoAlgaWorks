package ExercicioIV.XXIV;

public class Notebook implements Seguravel{

	private double valor;
	private String marca;
	
	
	
	public Notebook(double valor, String marca) {
		super();
		this.valor = valor;
		this.marca = marca;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valor * 0.08;
		if (valorApolice >= 18) {
			valorApolice = valorApolice * 0.90;
		}
		return valorApolice;
	
	}

	@Override
	public String obterDescricao() {
		return "Notebook marca " + this.marca + " com valor de mercado " + this.valor;
	}

}
