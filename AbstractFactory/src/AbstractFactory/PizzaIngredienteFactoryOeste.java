package AbstractFactory;

public class PizzaIngredienteFactoryOeste extends PizzaIngredientesFactory {

	 @Override
    public Massa criarMassa() {
        return new MassaFina();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoParmesao();
    }

    @Override
    public Molho criarMolho() {
        return new MolhoDaRoca();
    }

    @Override
    public Salsa criarSalsa() {
        return new SalsaNobreApimentada();
    }

}
