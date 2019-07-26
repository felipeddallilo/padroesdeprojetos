package FactoryMethod;

public abstract class FabricaPizza {

	protected Pizza pizza;
	
	public abstract void criarPizza(String tipo);
	
	public Pizza delivery() {
		return pizza;
	}
	
}
