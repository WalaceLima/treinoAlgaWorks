/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.walacelima.treinoBasico.calculoIMC;

import java.util.Scanner;

/**
 *
 * @author walace.souza
 */
public class CalculoImc {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Peso: ");
        Integer peso = entrada.nextInt();

        System.out.print("Altura: ");
        Double altura = entrada.nextDouble();

        Double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Imc de " + nome + ": " + imc);

        } else if (imc < 25) {
            System.out.println("Imc de " + nome + ": " + imc + "Peso Ideal");

        } else if (imc < 30) {
            System.out.println("Imc de " + nome + ": " + imc + "Acima do Peso");

        } else if (imc < 40) {
            System.out.println("Imc de " + nome + ": " + imc + "Obesidade grau I ou II");

        } else {
            System.out.println("Imc de " + nome + ": " + imc + "Obesidade grau III");

        }
    }
}
