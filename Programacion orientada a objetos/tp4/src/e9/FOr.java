package e9;

public class FOr extends FComp {

	public FOr(Filtro f1, Filtro f2) {
		super(f1, f2);
	}

	@Override
	public boolean cumple(Noticia n) {
		return (getF1().cumple(n) || getF2().cumple(n));
	}
	
	

}
