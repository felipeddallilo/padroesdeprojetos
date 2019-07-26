package Test;

import Builder.Carro;
import Builder.Garagem;
import Builder.VolksBuilder;

public class Main {

	public static void main(String [] args) {
		
		Garagem garagem = new Garagem(new VolksBuilder());	 
		garagem.construirCarro();
	    Carro carro = garagem.getCarro();
	    System.out.println(carro);
	 
	    System.out.println();
	 
	    garagem = new Garagem(new VolksBuilder());
	    garagem.construirCarro();
	    carro = garagem.getCarro();
	    System.out.println(carro);
	}
}
