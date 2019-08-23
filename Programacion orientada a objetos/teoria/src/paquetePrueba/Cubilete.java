package paquetePrueba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cubilete {
	private List<Dado> dados = new ArrayList<Dado>();
	private Criterio c;
	
	public Cubilete(Criterio c) {
		setCriteria(c);
	}
	
	public int getSize() {
		return dados.size();
	}
	
	public void agregarDado(Dado d) {
		if (c.cumple(this)) {
			dados.add(d);
		}
	}
	
	public int tirar() {
		int contador = 0;
		Iterator<Dado> it = dados.iterator();
		while (it.hasNext()) {
			contador += it.next().roll();
		}
		return contador;
	}
	
	public void setCriteria(Criterio c) {
		this.c = c;
	}
}
