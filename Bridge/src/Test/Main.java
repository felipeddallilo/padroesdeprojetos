package Test;

import Bridge.JanelaAbstract;
import Bridge.JanelaAviso;
import Bridge.JanelaDialogo;
import Bridge.JanelaLinux;
import Bridge.JanelaWindows;

public class Main {
	public static void main(String[] args) {
	    JanelaAbstract janela = new JanelaDialogo(new JanelaLinux());
	    janela.desenhar();
	    janela = new JanelaAviso(new JanelaLinux());
	    janela.desenhar();
	 
	    janela = new JanelaDialogo(new JanelaWindows());
	    janela.desenhar();
	}
	
	

}
