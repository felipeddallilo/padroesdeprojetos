package Builder;

public class GMBuilder extends CarroBuilder {

	//Opera��es complexas podem ser implementadas nestes m�todos
	@Override
    public void buildPreco() {
        carro.preco = 90000.00;
    }
 
    @Override
    public void buildAnoDeFabricacao() {
        carro.anoDeFabricacao = 2019;
    }
 
    @Override
    public void buildModelo() {
        carro.modelo = "cruze";
    }
 
    @Override
    public void buildMontadora() {
        carro.montadora = "GM";
    }
		
}
