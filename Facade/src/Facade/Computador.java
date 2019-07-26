package Facade;

public class Computador {

	private CPU cpu;
	private Memoria memoria;
	private HardDrive hd;
	
	// Ao instanciar o PC, � gerada a inst�ncia de v�rias classes
	public Computador() {
		this.cpu = new CPU();
		this.memoria = new Memoria();
		this.hd = new HardDrive();
	}
	
	
	//O m�todo de fachada gerencia os m�todos de todas as demais classes
	public void startComputer() {
		cpu.freeze();
		memoria.load(0L, null);
		cpu.jump(0L);
		cpu.execute();
		hd.read(0L, 0);
		
	}
	
}
