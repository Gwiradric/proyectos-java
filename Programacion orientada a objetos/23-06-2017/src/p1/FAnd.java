package p1;

public class FAnd extends FComp {

	public FAnd(Filtro f1, Filtro f2) {
		super(f1, f2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumple(CA c) {
		// TODO Auto-generated method stub
		return (f1.cumple(c) && f2.cumple(c));
	}
	
	
}
