package p1;

public class FAutor implements Filtro{
	private String autor;

	@Override
	public boolean cumple(Noticia n) {
		return (n.getAutor().equals(autor));
	}

}
