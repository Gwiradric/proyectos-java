package tpe;

public class CAnd implements Criterio {
	private Criterio c1, c2;

	public CAnd(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(SHacienda s) {
		// TODO Auto-generated method stub
		return (c1.cumple(s) && c2.cumple(s));
	}
	
	

}
