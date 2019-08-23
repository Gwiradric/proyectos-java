package e5;

import java.util.Vector;

public class Trabajo {
	private Vector<String> temas;
	private Criterio filtro;
	
	public Vector<String> getTemas() {
		return temas;
	}

	public void setTemas(Vector<String> temas) {
		this.temas = temas;
	}

	public Criterio getFiltro() {
		return filtro;
	}

	public void setFiltro(Criterio filtro) {
		this.filtro = filtro;
	}

	public Trabajo(Vector<String> temas, Criterio filtro) {
		this.temas = temas;
		this.filtro = filtro;
	}

	
}
