package State;

public class Sonic {

	protected SonicState estado;
	
	public Sonic() {
		estado = new SonicFraco();
	}

	public void pegarMoeda() {
		estado = estado.pegarMoeda();
	}

	public void pegarEscudo() {
		estado = estado.pegarEscudo();
	}

	public void pegarTenis() {
		estado = estado.pegarTenis();
	}

	public void levarDano() {
		estado = estado.levarDano();
	}
	
}
