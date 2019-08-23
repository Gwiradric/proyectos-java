package p1;

public class AAnd implements IAccion{
	private IAccion a1;
	private IAccion a2;
	
	public AAnd(IAccion a1, IAccion a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}

	@Override
	public void realizarAccion(Noticia n) {
		a1.realizarAccion(n);
		a2.realizarAccion(n);
	}
	
	
	
}
