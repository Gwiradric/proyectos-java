package e9;

import java.util.Vector;

public class Texto extends Cuerpo {
	private Vector<String> texto;


	@Override
	public boolean tienePalabra(String s) {
		return (texto.contains(s));
	}

	@Override
	public boolean tienePalabras(Vector<String> p) {
		return (texto.containsAll(p));
	}

	@Override
	public int getCantPal() {
		return texto.size();
	}

}
