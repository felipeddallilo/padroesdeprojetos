package AbstractFactory;

public class PizzaFrango implements Pizza {
	  
    private PizzaIngredientesFactory ingredientes;
    private Massa massa;
    private Queijo queijo;
    private Molho molho;
    private Salsa salsa;

    public PizzaFrango( PizzaIngredientesFactory ingredientes ){
        this.ingredientes = ingredientes;
    }

    public void prepara(){
        massa = ingredientes.criarMassa();
        queijo = ingredientes.criarQueijo();
        molho = ingredientes.criarMolho();
        salsa = ingredientes.criarSalsa();
    }

	
	
}
