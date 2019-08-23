package p1;

public class FAnd extends FComp {

	public FAnd(Filtro f1, Filtro f2) {
		super(f1, f2);
	}

	@Override
	public boolean cumple(Noticia n) {
		return (f1.cumple(n) && f2.cumple(n));
	}

}
