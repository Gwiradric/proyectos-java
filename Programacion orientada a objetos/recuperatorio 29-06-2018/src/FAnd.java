
public class FAnd extends FComp{

	public FAnd(Filtro f1, Filtro f2) {
		super(f1, f2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumple(STurismo p) {
		return (f1.cumple(p) && f2.cumple(p));
	}
	
	
}
