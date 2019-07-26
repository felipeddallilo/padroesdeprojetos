package Test;

import Observer.BarraObserver;
import Observer.Dados;
import Observer.DadosSubject;
import Observer.PorcentoObserver;
import Observer.TabelaObserver;

public class Main {

	public static void main(String[] args) {
		DadosSubject dados = new DadosSubject();
		dados.attach(new TabelaObserver(dados));
		dados.attach(new BarraObserver(dados));
		dados.attach(new PorcentoObserver(dados));

		dados.setState(new Dados(7, 3, 1));
		dados.setState(new Dados(2, 3, 1));
	}
	
}
