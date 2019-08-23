package e4;

public class Cereal {
	private String nombre;
	private Criterio c;
	
	public Cereal(String nombre, Criterio c) {
		super();
		this.nombre = nombre;
		this.setC(c);
	}

	public String getNombre() {
		return nombre;
	}

	public Criterio getC() {
		return c;
	}

	public void setC(Criterio c) {
		this.c = c;
	}
	
}
