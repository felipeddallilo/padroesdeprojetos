package Test;

import AbstractFactory.FabricaPizza;
import AbstractFactory.FabricaPizzaCentro;
import AbstractFactory.FabricaPizzaOeste;
import AbstractFactory.Pizza;

public class Main {


    public static void main( String[] args ){
        /* Pizzaria Centro  */
        FabricaPizza pizzariaCentro = new FabricaPizzaCentro();
        pizzariaCentro.criarPizza("centro", "frango");
        Pizza pizza = pizzariaCentro.delivery();

        /* Pizzaria Oeste */
        FabricaPizza pizzariaOeste = new FabricaPizzaOeste();
        pizzariaOeste.criarPizza("oeste", "calabresa");
        pizza = pizzariaOeste.delivery();
    }
	
}
