package br.com.walacelima.treinoBasico.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
	/**
	 * Uma classe estendida de uma classe pai, pode sobrescrever seus metodos
	 * quando criado seus atributos e metodos.
	 * Nesse caso, para que aaplicação possa apresentar os metodos e atributos da classe pai,
	 * devemos usar o método "super" para que os atributos e métodos da classe pai possa aparecer
	 * 
	 * **/
	protected Date dataValidade;
	
	public void identificar() {
		
		super.identificar();
		System.out.println("Minha data de validade é: " + dataValidade +".");
	}
	
	

}
