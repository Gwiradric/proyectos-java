
public class FOr extends FComp{

	public FOr(Filtro f1, Filtro f2) {
		super(f1, f2);
	}

	@Override
	public boolean cumple(STurismo p) {
		return (f1.cumple(p) || f2.cumple(p));
	}
	
	

}
