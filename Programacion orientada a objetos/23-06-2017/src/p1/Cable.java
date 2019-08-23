package p1;

public class Cable implements CA{
	private double costo;
	private int velocidad, longitud, longitudMax;
	
	public Cable(double costo, int velocidad, int longitud, int longitudMax) {
		super();
		this.costo = costo;
		this.velocidad = velocidad;
		this.longitud = longitud;
		this.longitudMax = longitudMax;
	}

	@Override
	public int getLong() {
		// TODO Auto-generated method stub
		return longitud;
	}

	@Override
	public int getLongmax() {
		// TODO Auto-generated method stub
		return longitudMax;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return costo;
	}

	@Override
	public boolean cumpleCriterio(Filtro f) {
		// TODO Auto-generated method stub
		return f.cumple(this);
	}
	
	
	
}
