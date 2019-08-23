package e9;

public class FAnd extends FComp {

	public FAnd(Filtro f1, Filtro f2) {
		super(f1, f2);
	}

	@Override
	public boolean cumple(Noticia n) {
		return (super.getF1().cumple(n) && super.getF2().cumple(n));
	}
	
	

}
