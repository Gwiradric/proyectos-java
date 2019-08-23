package p1;

import java.util.Vector;

public class VelocidadMayor extends Estandar{

	public VelocidadMayor(double costoExtra) {
		super(costoExtra);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getVelocidad(Vector<Integer> velocidad) {
		// TODO Auto-generated method stub
		int res = velocidad.elementAt(0);
		for (Integer i : velocidad) {
			if (res < i)
				res = i;
		}
		return res;
	}
	
	
}
