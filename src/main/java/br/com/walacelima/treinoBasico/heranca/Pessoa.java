package br.com.walacelima.treinoBasico.heranca;

public class Pessoa {
	//Conceito de herança em que todos que herdarem ou extenderem, 
	//devem receber seus atríbutos encapsulados como protected  
protected int idade;
protected String nome;
	//métodos também podem ser herdados
public void partida() {
	System.out.println("Flamengo x Palmeiras");
}

}
