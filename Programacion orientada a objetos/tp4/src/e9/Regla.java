package e9;

import java.util.Vector;

public class Regla {
	private Filtro f;
	private Vector<Noticia> destino;
	
	
	public Regla(Filtro f, Vector<Noticia> destino) {
		super();
		this.f = f;
		this.destino = destino;
	}
	
	public void clasificar(Noticia n) {
		if (f.cumple(n)) {
			destino.add(n);
		}
	}
}
