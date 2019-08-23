package p1;

public abstract class FComp implements Filtro{
	protected Filtro f1, f2;

	public FComp(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}
	
	
}
