package e9;

import java.util.Vector;

public class Usuario {
	private Vector<Noticia> subscripcion = new Vector<Noticia>();
	private Vector<Regla> reglas = new Vector<Regla>();
	
	public void addRegla(Regla r) {
		reglas.add(r);
	}
	
	public Vector<Noticia> getNoticiasUsuario() {
		return subscripcion;
	}
}
