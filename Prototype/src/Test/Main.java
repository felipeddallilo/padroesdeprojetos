package Test;

import Prototype.CarroPrototype;
import Prototype.GolPrototype;

public class Main {

	public static void main (String [] args) {
		GolPrototype prototipoGol = new GolPrototype();
		 
	    CarroPrototype golNovo = prototipoGol.clonar();
	    golNovo.setValorCompra(40000.0);
	    // utilização do objeto anterior para gerar novo objeto
	    CarroPrototype golUsado = prototipoGol.clonar();
	    golUsado.setValorCompra(33000.0);
	 
	    System.out.println(golNovo.exibirInfo());
	    System.out.println(golUsado.exibirInfo());
	}
	
}
