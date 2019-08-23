package paquetePrueba;

public class Csize implements Criterio {
	private int maxCantDados;
	
	public Csize(int max) {
		maxCantDados = max;
	}
	
	public boolean cumple(Cubilete c) {
		return (c.getSize() < maxCantDados);
	}
}
