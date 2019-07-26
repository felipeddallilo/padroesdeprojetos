package Test;

import Command.Loja;
import Command.PagamentoBoleto;
import Command.PagamentoCartaoCredito;

public class Main {

	public static void main(String[] args) {
	    Loja lojasAmericanas = new Loja("Americanas");
	    lojasAmericanas.executarCompra(999.00, new PagamentoCartaoCredito());
	    lojasAmericanas.executarCompra(49.00, new PagamentoBoleto());
	    lojasAmericanas.executarCompra(99.00, new PagamentoCartaoDebito());
	 
	    Loja submarino = new Loja("Submarino");
	    submarino.executarCompra(19.00, new PagamentoCartaoCredito());
	 
	}
	
}
