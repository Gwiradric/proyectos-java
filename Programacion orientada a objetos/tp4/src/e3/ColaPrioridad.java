package e3;

import java.util.Collections;
import java.util.Vector;

public class ColaPrioridad {
	Vector<Pedido> pedidos;
	Comparador c;

	public ColaPrioridad(Comparador c1) {
		pedidos = new Vector<Pedido>();
		this.c = c1;
	}

	public void add(Pedido p) {
		pedidos.add(p);
		ordenarPedidos();
	}
	
	public void setComparador(Comparador c) {
		this.c = c;
	}
	
	public Vector<Pedido> getPedidos() {
		Vector<Pedido> res = new Vector<Pedido>();
		for (int i = 0; i < pedidos.size(); i++) {
			res.add(pedidos.elementAt(i));
		}
		return res;
	}
	
	public void ordenarPedidos() {
		Collections.sort(pedidos, c);
	}
}
