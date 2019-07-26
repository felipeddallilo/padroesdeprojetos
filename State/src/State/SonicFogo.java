package State;

public class SonicFogo implements SonicState {

	@Override
	public SonicState pegarMoeda() {
		System.out.println("Sonic ganhou 1000 pontos");
		return new SonicForte();
	}

	@Override
	public SonicState pegarEscudo() {
		System.out.println("Sonic pegou Escudo");
		return new SonicForte();
	}

	@Override
	public SonicState pegarTenis() {
		System.out.println("Sonic pegou Tenis");
		return new SonicForte();
	}

	@Override
	public SonicState levarDano() {
		System.out.println("Sonic levou Dano");
		return new SonicFogo();
	}

}
