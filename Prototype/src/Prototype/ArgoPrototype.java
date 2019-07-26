package Prototype;

public class ArgoPrototype extends CarroPrototype{

	//Construtor protegido
	protected ArgoPrototype(ArgoPrototype argoPrototype) {
		//cópia de valores
        this.valorCompra = argoPrototype.getValorCompra();
    }
 
	//Construtor público para a primeira criação e definição de valor padrão
    public ArgoPrototype() {
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
        return new ArgoPrototype(this);
    }
	
}
