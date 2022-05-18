package ExercicioVI.III;

import java.util.Scanner;

public class Gerador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos jogos?");
		int quantidadeJogos = entrada.nextInt();

		System.out.println("----------------------------");

		for (int i = 1; i <= quantidadeJogos; i++) {
			GeradorDeSequencia mega = new GeradorDeSequencia();
			mega.sortear();
			mega.exibirNumeros();
			System.out.println("----------------------------");
		}

	}
}
