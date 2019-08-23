package p1;

public class FCategoria implements Filtro {
	private String categoria;
	
	

	public FCategoria(String categoria) {
		super();
		this.categoria = categoria;
	}



	@Override
	public boolean cumple(Noticia n) {
		return (n.getCategoria().equals(categoria));
	}

}
