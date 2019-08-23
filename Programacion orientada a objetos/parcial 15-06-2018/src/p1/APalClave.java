package p1;

public class APalClave implements IAccion{
	private String palabra;
	

	public APalClave(String palabra) {
		super();
		this.palabra = palabra;
	}


	@Override
	public void realizarAccion(Noticia n) {
		n.addPalabraClave(palabra);
	}
	
	

}
