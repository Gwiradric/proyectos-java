package e8;

public class Archivo extends EF {
	private double tam;

	public Archivo(String nombre, double tam) {
		super(nombre);
		this.tam = tam;
	}

	@Override
	public double getTam() {
		return tam;
	}

	@Override
	public int getCant() {
		return 1;
	}

}
