package p1;

public class Clasificador {
	private Filtro f;
	private IAccion a;
	
	public Clasificador(Filtro f, IAccion a) {
		super();
		this.f = f;
		this.a = a;
	}
	
	public void clasificar(Noticia n) {
		if (f.cumple(n))
			a.realizarAccion(n);
	}

}
