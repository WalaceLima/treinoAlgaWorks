package br.com.walacelima.treinoBasico.metodoStatic;

public class ExibirContador {

	public static void main(String[] args) {
		//método statico não precisamos estânciar
		Contador.count=1;
		for(int i=1;i<10;i++) {
			Contador.count=Contador.count++;
			System.out.println("Novo valor: "+Contador.count);
		}

	}

}
