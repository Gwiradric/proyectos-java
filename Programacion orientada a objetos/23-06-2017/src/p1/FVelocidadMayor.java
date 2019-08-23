package p1;

public class FVelocidadMayor implements Filtro{
	private int velocidad;

	public FVelocidadMayor(int velocidad) {
		super();
		this.velocidad = velocidad;
	}

	@Override
	public boolean cumple(CA c) {
		// TODO Auto-generated method stub
		return (c.getVelocidad() > velocidad);
	}
	
	
}
