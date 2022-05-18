package ExercicioIII.VI;

/*
 * 2. Crie uma outra classe chamada "PetShop" para testarmos nossa classe "Cachorro". 
 * Adicione o método "main".
 * */
public class PetShop {
	
	public static void main(String[] args) {
	Cachorro cachorro0= new Cachorro();
	
	cachorro0.nome="Bidu";
	cachorro0.idade=1;
	cachorro0.raça="Boxer";
	cachorro0.sexo='M';

	Cachorro cachorro1= new Cachorro();

	cachorro1.nome="Tonus";
	cachorro1.idade=1;
	cachorro1.raça="PitBull";
	cachorro1.sexo='F';

	System.out.println("-------Pet 1---------------");
	System.out.println("Nome:  " + cachorro0.nome);
	System.out.println("Idade: "+cachorro0.idade);
	System.out.println("Raça:  " +cachorro0.raça);
	System.out.println("Sexo:  " +cachorro0.sexo);

	System.out.println("-------Pet 2---------------");
	System.out.println("Nome:  " + cachorro1.nome);
	System.out.println("Idade: "+cachorro1.idade);
	System.out.println("Raça:  " +cachorro1.raça);
	System.out.println("Sexo:  " +cachorro1.sexo);
	
	}
}
