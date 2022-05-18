package Exercicio.IV.Wrappers;

public class Televisor {
Integer canal=130;
Integer volume=20;
Integer novoCanal=130;
Integer novoVolume=20;

void mudarCanal(Integer canal){
	if(canal.equals(novoCanal)) {
		System.out.println("Canal é o mesmo do anterior!");
	}else {
		System.out.println("Assista seu novo canal, "+ canal);
	}
}

void mudarVolume(Integer volume) {
	if (volume.equals(novoVolume)) {
		System.out.println("Novo volume é o mesmo!");
	} else {
System.out.println("Seu novo volume foi: " + volume);
	}
}
}
