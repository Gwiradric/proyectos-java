package e5;

import java.util.Vector;

public class Evaluador {
	private Vector<String> conocimientos;
	private Vector<Trabajo> trabajos;
	
	public Evaluador(Vector<String> conocimientos) {
		this.conocimientos = conocimientos;
		trabajos = new Vector<Trabajo>();
	}

	public Vector<String> getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(Vector<String> conocimientos) {
		this.conocimientos = conocimientos;
	}

	public Vector<Trabajo> getTrabajos() {
		return trabajos;
	}
	
	void addTrabajo(Trabajo t) {
		if (t.getFiltro().cumple(this, t))
			trabajos.add(t);
	}
	
	public int getCantidadTrabajos() {
		return (trabajos.size());
	}
}
