package paquetePrueba;

public class Jugador {
	private int puntos;
	private String nombre;
	
	public Jugador(String nombre) {
		this.setNombre(nombre);
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void incrementar() {
		puntos++;
	}
	
	public int tirar(Cubilete c) {
		return c.tirar();
	}
	
	public Jugador getGanador(Jugador j) {
		if (this.getPuntos() > j.getPuntos())
			return this;
		else if (this.getPuntos() < j.getPuntos())
			return j;
		else
			return null;
	}
}
