/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.walacelima.treinoBasico.pagamentoIpva;

import java.util.Scanner;

/**
 *
 * @author walace.souza
 */
public class FinalPlacaCarro {
	Scanner placa = new Scanner(System.in);
	

	System.out.println("Entre com a placa do seu carro:");
	int finalPlacaCarro= placa.nextInt();

	switch(finalPlaca){
    case 1:
        System.out.println("Vencimento 11 janeiro");
        break;
    case 2:
        System.out.print("Vencimento 29 janeiro");
        break;
    case 3:
        System.out.print("Vencimento 15 fevereiro");
        break;
    default:
        System.out.print("Vencimento sem data, desculpe!");
		}
	
	}

