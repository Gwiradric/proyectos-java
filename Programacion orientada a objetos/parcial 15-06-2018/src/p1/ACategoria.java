package p1;

public class ACategoria implements IAccion {
	private String palabra;

	@Override
	public void realizarAccion(Noticia n) {
		n.setCategoria(palabra);
	}

}
