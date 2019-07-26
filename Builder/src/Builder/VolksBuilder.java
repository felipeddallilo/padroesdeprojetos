package Builder;

public class VolksBuilder extends CarroBuilder{

	//Operações complexas podem ser implementadas nestes métodos
	@Override
    public void buildPreco() {
        carro.preco = 50000.00;
    }
 
    @Override
    public void buildAnoDeFabricacao() {
        carro.anoDeFabricacao = 2020;
    }
 
    @Override
    public void buildModelo() {
        carro.modelo = "up tsi";
    }
 
    @Override
    public void buildMontadora() {
        carro.montadora = "Volkswagen";
    }
	
}
