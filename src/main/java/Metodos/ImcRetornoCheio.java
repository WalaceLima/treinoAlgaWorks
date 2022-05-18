package Metodos;

public class ImcRetornoCheio {
	double peso = 79;
	double altura = 1.68;
	
	double calculoImcCorporal() {
		double imc= peso/(altura*altura);
		
		return imc;
	}
}
