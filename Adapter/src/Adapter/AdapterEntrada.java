package Adapter;

//Heran�a da classe EntradaUSB
public class AdapterEntrada extends EntradaUSB {

	private EntradaPS2 entradaPS2;
	
	public AdapterEntrada(EntradaPS2 entradaPS2) {
		this.entradaPS2 = entradaPS2;
	}
	
	//Sobreescrita do m�todo conectarEntradaUSB chamando m�todo da classe EntradaPS2.
	public void conectarEntradaUSB() {
		entradaPS2.conectarEntradaPS2();
	}
	
}
