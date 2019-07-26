package Command;

public class PagamentoCartaoCredito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		 System.out.println("Transação no Cartão de Crédito efetuada!\n" + compra.getInfoNota());

	}


}
