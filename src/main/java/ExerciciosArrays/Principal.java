package ExerciciosArrays;

import java.util.Scanner;

public class Principal {

	static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Quantos produtos?");
		int quantidadeProdutos= entrada.nextInt();
		
		entrada.nextLine(); 
		
		Estoque estoque= new Estoque();
		
		estoque.produtos= new Produtos[quantidadeProdutos];
}
}
