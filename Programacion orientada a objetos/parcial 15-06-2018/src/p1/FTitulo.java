package p1;

public class FTitulo implements Filtro{
	private String palabra;
	
	

	public FTitulo(String palabra) {
		super();
		this.palabra = palabra;
	}



	@Override
	public boolean cumple(Noticia n) {
		return (n.getTitulo().equals(palabra));
	}

}
