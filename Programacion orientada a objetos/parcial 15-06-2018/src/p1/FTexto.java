package p1;

public class FTexto implements Filtro{
	private String frase;

	
	
	public FTexto(String frase) {
		super();
		this.frase = frase;
	}



	@Override
	public boolean cumple(Noticia n) {
		return (n.getTexto().contains(frase));
	}
	
}
