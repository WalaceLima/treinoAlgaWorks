package Metodos;

public class CarroRetornoVazio {
	String fabricante ="Chevrolet";
	String modelo ="Classic";
	String cor="Preto";
	int anoFabricacao =2012;
	boolean biCombustivel = true;
	Proprietario proprietario;
	
	void ligarCarro() {
		System.out.println("Ligando o carro! ");
	}
	void desligandoCarro() {
		System.out.println("Desligando o carro para não gastar combustivel! " );
	}
}
