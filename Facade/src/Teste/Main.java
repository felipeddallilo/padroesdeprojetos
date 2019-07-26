package Teste;

import Facade.Computador;

public class Main {

	
	//Não há visualização de nenhuma outra classe a não ser a Computador
	public static void main(String [] args) {
		Computador facade = new Computador();
		facade.startComputer();
		
	}
	
}
