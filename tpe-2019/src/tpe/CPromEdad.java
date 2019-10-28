package tpe;

public class CPromEdad implements Criterio{
	private double edad;

	public CPromEdad(double edad) {
		super();
		this.edad = edad;
	}
	
	public boolean cumple(SHacienda s) {
		return (s.getPromEdad() > edad);
	}
}
