package Prototype;

public class GolPrototype extends CarroPrototype{
	
	//Construtor protegido
	protected GolPrototype(GolPrototype golPrototype) {
		//cópia de valores
        this.valorCompra = golPrototype.getValorCompra();
    }
 
	//Construtor público para a primeira criação e definição de valor padrão
    public GolPrototype() {
        valorCompra = 0.0;
    }
 
    @Override
    public String exibirInfo() {
        return "Modelo: Gol\nMontadora: Volks\n" + "Valor: R$"
                + getValorCompra();
    }
 
    //Nova instância recebendo está como parâmetro para cópia dos valores.
    @Override
    public CarroPrototype clonar() {
        return new GolPrototype(this);
    }

}
