package Teste;

import Facade.Computador;

public class Main {

	
	//N�o h� visualiza��o de nenhuma outra classe a n�o ser a Computador
	public static void main(String [] args) {
		Computador facade = new Computador();
		facade.startComputer();
		
	}
	
}
