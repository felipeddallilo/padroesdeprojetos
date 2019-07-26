package State;

public class SonicForte  implements SonicState {

	@Override
	public SonicState pegarMoeda() {
		System.out.println("Sonic ganhou 1000 pontos");
		return this;
	}

	@Override
	public SonicState pegarEscudo() {
		System.out.println("Sonic pegou escudo");
		return new SonicFogo();
	}

	@Override
	public SonicState pegarTenis() {
		System.out.println("Sonic pegou Tenis");
		return null;
	}

	@Override
	public SonicState levarDano() {
		System.out.println("Sonic levou Dano");
		return new SonicForte();
	}


}
