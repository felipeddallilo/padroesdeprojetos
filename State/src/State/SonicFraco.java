package State;

public class SonicFraco  implements SonicState {

	@Override
	public SonicState pegarMoeda() {
		System.out.println("Sonic forte");
		return null;
	}

	@Override
	public SonicState pegarEscudo() {
		System.out.println("Sonic com escudo");
		return null;
	}

	@Override
	public SonicState pegarTenis() {
		System.out.println("Sonic rápido");
		return null;
	}

	@Override
	public SonicState levarDano() {
		System.out.println("Sonic levou dano");
		return null;
	}

}
