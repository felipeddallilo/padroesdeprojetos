package Command;

public class PagamentoCartaoCredito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		 System.out.println("Transa��o no Cart�o de Cr�dito efetuada!\n" + compra.getInfoNota());

	}


}
