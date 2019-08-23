package e9;

public class FCantPal implements Filtro{
	private int cantPal;

	public FCantPal(int cantPal) {
		super();
		this.cantPal = cantPal;
	}

	@Override
	public boolean cumple(Noticia n) {
		return (n.getCuerpo().getCantPal() == cantPal);
	}
	
	

}
