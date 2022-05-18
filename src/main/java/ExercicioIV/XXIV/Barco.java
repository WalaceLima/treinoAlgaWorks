package ExercicioIV.XXIV;

public class Barco implements Seguravel {
private double tamanho;
private double valor;

	
	public Barco(double tamanho, double valor) {
	super();
	this.tamanho = tamanho;
	this.valor = valor;
}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valor * 0.04;
		if (valorApolice >= 10) {
			valorApolice = valorApolice * 0.90;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco tamanho " + this.tamanho + " com valor de mercado " + this.valor;
	}

}
