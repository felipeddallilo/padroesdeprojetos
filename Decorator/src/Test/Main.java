package Test;

import Decorator.DecoradorBarraVertical;
import Decorator.Janela;
import Decorator.JanelaSimples;

public class Main {

	public static void main(String args[]) {
        Janela janelaDecorada = new DecoradorBarraVertical(new JanelaSimples());
        janelaDecorada.draw();
    }
	
}
