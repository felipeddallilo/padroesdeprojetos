package Facade;

public class Computador {

	private CPU cpu;
	private Memoria memoria;
	private HardDrive hd;
	
	// Ao instanciar o PC, é gerada a instância de várias classes
	public Computador() {
		this.cpu = new CPU();
		this.memoria = new Memoria();
		this.hd = new HardDrive();
	}
	
	
	//O método de fachada gerencia os métodos de todas as demais classes
	public void startComputer() {
		cpu.freeze();
		memoria.load(0L, null);
		cpu.jump(0L);
		cpu.execute();
		hd.read(0L, 0);
		
	}
	
}
