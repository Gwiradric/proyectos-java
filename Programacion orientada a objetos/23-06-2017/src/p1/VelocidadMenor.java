package p1;

import java.util.Vector;

public class VelocidadMenor extends Estandar{

	public VelocidadMenor(double costoExtra) {
		super(costoExtra);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getVelocidad(Vector<Integer> velocidades) {
		// TODO Auto-generated method stub
		int res = velocidades.elementAt(0);
		for (Integer i : velocidades) {
			if (res > i)
				res = i;
		}
		return res;
	}
	
	
}
