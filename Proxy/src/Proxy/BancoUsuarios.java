package Proxy;

public class BancoUsuarios {
	private int quantidadeDeUsuarios;
    private int usuariosConectados;
 
    public BancoUsuarios() {
        quantidadeDeUsuarios = (int) (Math.random() * 100);
        usuariosConectados = (int) (Math.random() * 10);
    }
 
    public String getNumeroDeUsuarios() {
        return new String("Total de usu�rios: " + quantidadeDeUsuarios);
    }
 
    public String getUsuariosConectados() {
        return new String("Usu�rios conectados: " + usuariosConectados);
    }
	
}
