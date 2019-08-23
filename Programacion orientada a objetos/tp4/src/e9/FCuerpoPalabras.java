package e9;

import java.util.Vector;

public class FCuerpoPalabras implements Filtro{
	private Vector<String> palabras;
	
	

	public FCuerpoPalabras(Vector<String> palabras) {
		super();
		this.palabras = palabras;
	}



	@Override
	public boolean cumple(Noticia n) {
		return (n.getCuerpo().tienePalabras(palabras));
	}

}
