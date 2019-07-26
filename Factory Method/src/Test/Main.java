package Test;

import FactoryMethod.FabricaPizza;
import FactoryMethod.FabricaPizzaCentro;
import FactoryMethod.FabricaPizzaOeste;
import FactoryMethod.Pizza;

public class Main {


    public static void main( String[] args ){
        /* Pizzaria Centro  */
        FabricaPizza pizzariaCentro = new FabricaPizzaCentro();
        pizzariaCentro.criarPizza("frango");
        Pizza pizza = pizzariaCentro.delivery();

        /* Pizzaria Oeste */
        FabricaPizza pizzariaOeste = new FabricaPizzaOeste();
        pizzariaOeste.criarPizza("calabresa");
        pizza = pizzariaOeste.delivery();
    }
	
}
