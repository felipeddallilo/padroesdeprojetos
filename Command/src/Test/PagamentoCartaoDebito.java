package Test;

import Command.Compra;
import Command.PagamentoCommand;

public class PagamentoCartaoDebito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		 System.out.println("Transa��o no Debido efetuada!\n" + compra.getInfoNota());

	}

}
