package ExercicioIII.XIV;

public class Passeio {
public static void main(String[] args) {
	Pessoa p1= new Pessoa();
	p1.nome="Walace";
	p1.cachorro= new Cachorro();
	p1.cachorro.nome="Bidu";
	p1.cachorro.idade=1;
	p1.cachorro.raca="Boxer";
	p1.cachorro.sexo="Macho";
	
	Caminhada c= new Caminhada();
	c.andar(p1);
}
}
