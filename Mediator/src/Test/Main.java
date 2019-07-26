package Test;

import Mediator.AndroidColleague;
import Mediator.IOSColleague;
import Mediator.MensagemMediator;
import Mediator.SymbianColleague;

public class Main {
	
	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
	
		AndroidColleague android = new AndroidColleague(mediador);
		IOSColleague ios = new IOSColleague(mediador);
		SymbianColleague symbian = new SymbianColleague(mediador);
	
		mediador.adicionarColleague(android);
		mediador.adicionarColleague(ios);
		mediador.adicionarColleague(symbian);
		
		symbian.enviarMensagem("Oi, eu sou um Symbian!");
		System.out.println("=========");
		android.enviarMensagem("Oi Symbian! Eu sou um Android!");
		System.out.println("=========");
		ios.enviarMensagem("Olá todos, sou um iOs!");
	}

}
