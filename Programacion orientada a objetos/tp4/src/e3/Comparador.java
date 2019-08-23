package e3;

import java.util.Comparator;

public class Comparador implements Comparator<Pedido>{

	@Override
	public int compare(Pedido p1, Pedido p2) {
		return Float.compare(p1.getCosto(), p2.getCosto());
		//return (int)(p1.getCosto() - p2.getCosto());
	}
	
}
