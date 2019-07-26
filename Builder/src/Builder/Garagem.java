package Builder;

public class Garagem {

	protected CarroBuilder montadora;
	 
    public Garagem(CarroBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirCarro() {
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildModelo();
        montadora.buildMontadora();
    }
 
    public Carro getCarro() {
        return montadora.getCarro();
    }
    
}
