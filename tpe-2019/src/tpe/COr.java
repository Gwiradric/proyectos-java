package tpe;

public class COr {
	private Criterio c1, c2;

	public COr(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean cumple(SHacienda s) {
		return (c1.cumple(s) || c2.cumple(s));
	}
}
