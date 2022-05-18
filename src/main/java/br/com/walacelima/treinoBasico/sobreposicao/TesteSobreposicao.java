package br.com.walacelima.treinoBasico.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {

	public static void main(String[] args) {
		ProdutoPerecivel pp= new ProdutoPerecivel();
		pp.descricao="Feijão";
		pp.dataValidade= new Date();
		pp.identificar();

	}

}
