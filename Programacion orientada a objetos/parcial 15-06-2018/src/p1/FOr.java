package p1;

public class FOr extends FComp{

	public FOr(Filtro f1, Filtro f2) {
		super(f1, f2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumple(Noticia n) {
		// TODO Auto-generated method stub
		return (f1.cumple(n) || f2.cumple(n));
	}

}
