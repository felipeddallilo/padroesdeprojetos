package Bridge;

public class JanelaAviso extends JanelaAbstract {
 
    public JanelaAviso(JanelaImplementada j) {
        super(j);
    }
 
    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
 
}
 
