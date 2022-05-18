package br.com.walacelima.treinoBasico.operadorTernario;

import java.util.Scanner;

public class VerificacaoAdultoCrianca {

Scanner idade = new Scanner(System.in);


System.out.print("Entre com a idade");
int entrada= idade.nextInt();

String resultado = (entrada >= 18) ? "Adulto" : "Criançã/Adolescente";

}
