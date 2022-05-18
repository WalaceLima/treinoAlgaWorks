package Metodos;

public class FolhaPagamentoMetodoPassagemParametro {

	double calculoFolhaSalarial(double valorHoraExtra,double valorHoraNormal, int quantidadeHoraNormal,int quantidadeHoraExtra) {

		double totalValorHoraNormal = valorHoraNormal * quantidadeHoraNormal;
		double totalValorHoraExtra = valorHoraExtra * quantidadeHoraExtra;
		return totalValorHoraNormal + totalValorHoraExtra;		
	}
	
}
