package Metodos;

public class RunFolhaDePagamento {

	public static void main(String[] args) {
		FolhaPagamentoMetodoPassagemParametro folha= new FolhaPagamentoMetodoPassagemParametro();
		double totalSalario = folha.calculoFolhaSalarial(8.25, 16.25, 160, 8);
		System.out.println("Salário Caculado: " + totalSalario);

	}

}
