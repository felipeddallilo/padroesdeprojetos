package Test;

import ChainOfResponsability.BancoA;
import ChainOfResponsability.BancoB;
import ChainOfResponsability.BancoC;
import ChainOfResponsability.BancoChain;
import ChainOfResponsability.BancoD;
import ChainOfResponsability.IDBancos;

public class Main {

	public static void main(String [] args) {
		BancoChain bancos = new BancoA();
	    bancos.setNext(new BancoB());
	    bancos.setNext(new BancoC());
	    bancos.setNext(new BancoD());
	     
	    try {
	        bancos.efetuarPagamento(IDBancos.bancoC);
	        bancos.efetuarPagamento(IDBancos.bancoD);
	        bancos.efetuarPagamento(IDBancos.bancoA);
	        bancos.efetuarPagamento(IDBancos.bancoB);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	
	}
}
