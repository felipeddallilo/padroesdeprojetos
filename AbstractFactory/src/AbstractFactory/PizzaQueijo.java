package AbstractFactory;

public class PizzaQueijo implements Pizza  {

    private PizzaIngredientesFactory ingredientes;
    private Massa massa;
    private Queijo queijo;
    private Molho molho;
    private Salsa salsa;

    public PizzaQueijo( PizzaIngredientesFactory ingredientes ){
        this.ingredientes = ingredientes;
    }

    public void prepara(){
        massa = ingredientes.criarMassa();
        queijo = ingredientes.criarQueijo();
        molho = ingredientes.criarMolho();
        salsa = ingredientes.criarSalsa();
    }
}
