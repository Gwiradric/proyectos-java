package e4;

import java.util.Vector;

public class CMinerales implements Criterio{
	
	private Vector<String> minerales;
	
	public CMinerales(Vector<String> minerales) {
		this.minerales = minerales;
	}

	@Override
	public boolean cumple(Lote l) {
		Vector<String> v = l.getMinerales();
		boolean res = true;
		int i = 0;
		while (i < minerales.size() && res) {
			if (v.contains(minerales.elementAt(i)))
				i++;
			else
				res = false;
		}
		return res;
	}
	
}
