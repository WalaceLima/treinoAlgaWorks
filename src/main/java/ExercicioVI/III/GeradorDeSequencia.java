package ExercicioVI.III;

import java.util.ArrayList;
import java.util.Iterator;

/* Programa para gerar os números a serem marcados nos jogos da Mega Sena. 

- programa que recebe do usuário a quantidade de jogos a serem feitos(jogo comum, os jogadores devem marcar 6 números entre os 60 disponíveis, sendo de 1 a 60)
- gera e exibe na tela a sequência de números de cada jogo.(Use a classe Math para gerar números aleatórios e fazer arredondamentos)

 Lembre-se de verificar se não existem números repetidos em uma sequência, pois os 6 números devem ser únicos.*/

public class GeradorDeSequencia {

	public static final int NUMERO_MAXIMO = 60;
	public static final int QUANTIDADE_NUMEROS = 6;

	private int[] numerosSorteados;

	public void sortear() {
		this.numerosSorteados = new int[QUANTIDADE_NUMEROS];

		for (int i = 1; i <= QUANTIDADE_NUMEROS; i++) {
			// gera número aleatório, arredonda e converte para inteiro
			int numeroSorteado = (int) Math.round(Math.random() * NUMERO_MAXIMO);

			// verifica se número ainda não foi sorteado e não é 0
			if (!this.jaFoiSorteado(numeroSorteado) && numeroSorteado != 0) {
				// adiciona o número sorteado no array de números sorteados
				this.numerosSorteados[i - 1] = numeroSorteado;
			} else {
				// decrementa i para refazer o sorteio da mesma posição
				i--;
			}
		}
	}

	public void exibirNumeros() {
		for (int numeroSorteado : numerosSorteados) {
			System.out.print(numeroSorteado + " ");
		}
		// quebra de linha
		System.out.println();
	}

	private boolean jaFoiSorteado(int numero) {
		boolean resultado = false;
		for (int i = 0; i < this.numerosSorteados.length; i++) {
			if (this.numerosSorteados[i] == numero) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}

}
