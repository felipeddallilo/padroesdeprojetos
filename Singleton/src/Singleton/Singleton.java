package Singleton;

public class Singleton {

	//vari�vel est�tica
	private static Singleton singleton;
	
	//Construtor privado 
	private Singleton() {
		
	}
	
	
	//M�todo est�tico para coletar a inst�ncia
	public static Singleton getInstance() {
		if (singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	
}
