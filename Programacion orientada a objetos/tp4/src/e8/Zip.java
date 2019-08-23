package e8;

public class Zip extends Directorio {
	private int fc;

	public Zip(String nombre) {
		super(nombre);
	}

	public int getFc() {
		return fc;
	}

	public void setFc(int fc) {
		this.fc = fc;
	}
	
	public int getSize() {
		int suma = 0;
		suma += super.getTam();
		return (suma/fc);
	}
	
	public int getCant() {
		return 1;
	}

}
