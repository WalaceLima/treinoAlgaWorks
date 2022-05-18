package Metodos;

import java.util.Scanner;

public class RunRetornoCheio {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		ImcRetornoCheio i= new ImcRetornoCheio();
		
		/*
		System.out.println("Altura: ");
		double alt= s.nextDouble();
		
		System.out.println("Peso: ");
		double pes= s.nextDouble();
		*/
		
		double result = i.calculoImcCorporal();
		
		System.out.println("Seu IMC é: " + result);
	}

}
