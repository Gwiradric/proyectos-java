package e9;

import java.util.Vector;

public class FTituloFrase implements Filtro{
	private Vector<String> frase;
	
	public FTituloFrase(Vector<String> frase) {
		super();
		this.frase = frase;
	}

	@Override
	public boolean cumple(Noticia n) {
		return n.getTitulo().equals(frase);
	}
	
	

}
