package Prototype;

public class GolPrototype extends CarroPrototype{
	
	//Construtor protegido
	protected GolPrototype(GolPrototype golPrototype) {
		//c�pia de valores
        this.valorCompra = golPrototype.getValorCompra();
    }
 
	//Construtor p�blico para a primeira cria��o e defini��o de valor padr�o
    public GolPrototype() {
        valorCompra = 0.0;
    }
 
    @Override
    public String exibirInfo() {
        return "Modelo: Gol\nMontadora: Volks\n" + "Valor: R$"
                + getValorCompra();
    }
 
    //Nova inst�ncia recebendo est� como par�metro para c�pia dos valores.
    @Override
    public CarroPrototype clonar() {
        return new GolPrototype(this);
    }

}
