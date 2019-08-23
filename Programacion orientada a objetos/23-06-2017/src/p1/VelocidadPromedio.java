package p1;

import java.util.Vector;

public class VelocidadPromedio extends Estandar{

	public VelocidadPromedio(double costoExtra) {
		super(costoExtra);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getVelocidad(Vector<Integer> velocidad) {
		// TODO Auto-generated method stub
		int res = 0;
		for (Integer i : velocidad) {
			res += i;
		}
		return (res / velocidad.size());
	}
	
	

}
