package Test;

import Adapter.AdapterEntrada;
import Adapter.EntradaPS2;

public class Main {

	//efetua a chamada ao conectarEntradaUSB com uma classe EntradaPS2.
	public static void main(String [] args) {
		EntradaPS2 entradaPS2 = new EntradaPS2();
		AdapterEntrada adapter = new AdapterEntrada(entradaPS2);
		adapter.conectarEntradaUSB();
	}
	
}
