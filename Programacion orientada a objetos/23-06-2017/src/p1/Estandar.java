package p1;

import java.util.Vector;

public abstract class Estandar {
	private double costoExtra;

	public Estandar(double costoExtra) {
		super();
		this.costoExtra = costoExtra;
	}
	
	public double getCostoExtra() {
		return (costoExtra);
	}
	
	public abstract int getVelocidad(Vector<Integer> velocidades);
	
}
