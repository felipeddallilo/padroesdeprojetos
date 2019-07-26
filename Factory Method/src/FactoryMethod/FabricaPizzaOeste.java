package FactoryMethod;

public class FabricaPizzaOeste extends FabricaPizza {

	@Override
	public void criarPizza(String tipo) {
		switch (tipo) {
			case "calabresa":
				pizza = new PizzaCalabresa();
				break;
			case "queijo":
				pizza = new PizzaQueijo();
				break;
		}		
	}

}
