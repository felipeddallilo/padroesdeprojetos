package Bridge;

public abstract class JanelaAbstract {

    protected JanelaImplementada janela;
	  
    public JanelaAbstract(JanelaImplementada j) {
        janela = j;
    }
 
    public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }
 
    public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }
 
    public abstract void desenhar();
	
}
