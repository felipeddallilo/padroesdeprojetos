package Singleton;

public class Singleton {

	//variável estática
	private static Singleton singleton;
	
	//Construtor privado 
	private Singleton() {
		
	}
	
	
	//Método estático para coletar a instância
	public static Singleton getInstance() {
		if (singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	
}
