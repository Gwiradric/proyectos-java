package e3;

import java.util.Vector;

public class Fabrica {
	private ColaPrioridad cola;
	private Criterio c;
	private Fabrica sig;
	
	public Fabrica(ColaPrioridad cola, Criterio c, Fabrica sig) {
		this.cola = cola;
		this.c = c;
		this.sig = sig;
	}
	
	public void add(Pedido p) {
		if (c.cumple(p))
			cola.add(p);
		else
			if (sig != null)
				sig.add(p);
	}
	
	public void setCriterio(Criterio c) {
		this.c = c;
	}
	
	public void setSig(Fabrica f) {
		sig = f;
	}
	
	public Vector<Pedido> getPedidos() {
		return cola.getPedidos();
	}
	
	
	
}
