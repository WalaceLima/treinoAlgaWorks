package br.com.walacelima.treinoBasico.heranca;

public class EnvolvidosNaPartida {

	public static void main(String[] args) {
		Jogador j= new Jogador();
		j.nome="Walace Lima";
		j.idade=37;
		
		
		Tecnico t= new Tecnico();
		t.nome="Pep Gardiola";
		t.idade=52;
		
		Juiz ju= new Juiz();
		ju.nome="C.Henrique Simon";
		ju.idade=60;
		
		Bandeirinha b= new Bandeirinha();
		b.nome="Ana Paula";
		b.idade=32;
	Gandula g= new Gandula();
	g.nome="Jefferson";
	g.idade=28;
	
	System.out.println("XXXXXXXX  Envolvidos na partida!   XXXXXXX");
	System.out.println("\n");
	
	j.partida();
	System.out.println("\n");
	System.out.println("--------  Jogador   -------");
	
	System.out.println("Jogador: " +j.nome);
	System.out.println("Idade: " +j.idade);
	
	System.out.println("\n");
	System.out.println("--------  Técnico   -------");
	
	System.out.println("Técnico: " +t.nome);
	System.out.println("Idade: " +t.idade);
	
	System.out.println("\n");
	System.out.println("--------  Juiz   -------");
	
	System.out.println("Juiz: " +ju.nome);
	System.out.println("Idade: " +ju.idade);
	
	System.out.println("\n");
	System.out.println("--------  Bandeirinha   -------");
	
	System.out.println("Bandeirinha: " +b.nome);
	System.out.println("Idade: " +b.idade);
	
	System.out.println("\n");
	System.out.println("--------  Gandula   -------");
	
	System.out.println("Gandula: " +g.nome);
	System.out.println("Idade: " +g.idade);
	}

}
