package AbstractFactory;

public class FabricaPizzaOeste extends FabricaPizza {

	@Override
	public void criarPizza(String franquia, String tipo) {
		switch (tipo) {
			case "calabresa":
				pizza = new PizzaCalabresa(getIngredientes(franquia));
				break;
			case "queijo":
				pizza = new PizzaQueijo(getIngredientes(franquia));
				break;
		}		
	}

}
