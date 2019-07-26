package AbstractFactory;

public abstract class FabricaPizza {

	protected Pizza pizza;

    public void criarPizza( String franquia, String tipo ){

        if( tipo.equals("queijo") ){
            pizza = new PizzaQueijo( getIngredientes(franquia) );
        }
        else if( tipo.equals("frango") ){
            pizza = new PizzaFrango( getIngredientes(franquia) );
        }
        else if( tipo.equals("calabresa") ){
            pizza = new PizzaCalabresa( getIngredientes(franquia) );
        }
    }
    
    public PizzaIngredientesFactory getIngredientes( String franquia ){
        if( franquia.equals("centro") ){
            return new PizzaIngredienteFactoryCentro();
        }
        return new PizzaIngredienteFactoryOeste();
    }
	
    public Pizza delivery() {
    	return pizza;
    }
}
