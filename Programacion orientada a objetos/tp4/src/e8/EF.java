package e8;

public abstract class EF {
	private String nombre;

	public EF(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getTam();
	
	public abstract int getCant();
}
