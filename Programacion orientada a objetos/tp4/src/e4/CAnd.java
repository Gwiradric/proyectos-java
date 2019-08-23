package e4;

public class CAnd implements Criterio {
	
	private Criterio c1;
	private Criterio c2;

	public CAnd(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Lote l) {
		return (c1.cumple(l) && c2.cumple(l));
	}

}
