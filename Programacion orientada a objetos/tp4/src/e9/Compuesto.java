package e9;

import java.util.Vector;

public class Compuesto extends Cuerpo {
	private Vector<Cuerpo> combinaciones = new Vector<Cuerpo>();
	
	public void add(Cuerpo c) {
		combinaciones.add(c);
	}

	@Override
	public boolean tienePalabra(String s) {
		for (int i = 0; i < combinaciones.size(); i++) {
			if (combinaciones.elementAt(i).tienePalabra(s)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean tienePalabras(Vector<String> p) {
		for (int i = 0; i < combinaciones.size(); i++) {
			if (combinaciones.elementAt(i).tienePalabras(p)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int getCantPal() {
		int res = 0;
		for (int i = 0; i < combinaciones.size(); i++) {
			res += combinaciones.elementAt(i).getCantPal();
		}
		return res;
	}
	
	

}
