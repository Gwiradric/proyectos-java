package p1;

public class FCostoMenor implements Filtro {
	private double costo;

	public FCostoMenor(double costo) {
		super();
		this.costo = costo;
	}

	@Override
	public boolean cumple(CA c) {
		// TODO Auto-generated method stub
		return (c.getCosto() < costo);
	}
	
	
}
