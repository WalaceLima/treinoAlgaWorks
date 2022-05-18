/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.walacelima.treinoBasico.calculoAnoBissexto;

import java.util.Scanner;

/**
 *
 * @author walace.souza
 */
public class DescobreAnoBissexto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ano:");
        Integer ano = entrada.nextInt();

        if (ano % 400 == 0) {
            System.out.println("Ano Bissexto!");
        } else if (ano % 4 == 0) {
        
        if (ano % 100 != 0) {
            System.out.println("Ano Bissexto!");
        } else {
            System.out.println("Ano não Bissexto!");
        }
    }    
        else{
            System.out.println("Ano não Bissexto!");
    }
    }
}
