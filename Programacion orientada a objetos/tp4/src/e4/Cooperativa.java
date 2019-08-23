package e4;

import java.util.Vector;

public class Cooperativa {
	private Vector<Lote> lotes = new Vector<Lote>();
	private Vector<String> intPrimario = new Vector<String>();
	
	public void add(Lote l) {
		lotes.add(l);
	}
	
	public int getCantidadLotes() {
		return lotes.size();
	}
	
	public Lote getLoteEspecifico(int posicion) {
		return lotes.elementAt(posicion);
	}

	public Vector<String> getIntPrimario() {
		return intPrimario;
	}

	public void setIntPrimario(Vector<String> intPrimario) {
		this.intPrimario = intPrimario;
	}
	
	public Vector<Lote> getLotesCerealEspecifico(Cereal c) {
		Vector<Lote> v1 = new Vector<Lote>();
		for (int i = 0; i < lotes.size(); i++) {
			if (c.getC().cumple(lotes.elementAt(i)))
				v1.add(lotes.elementAt(i));
		}
		return v1;
	}
	
	public Vector<Cereal> getCerealesLoteEspecifico(int posicion, Vector<Cereal> c) {
		Vector<Cereal> v1 = new Vector<Cereal>();
		for (int i = 0; i < c.size(); i++) {
			if (c.elementAt(i).getC().cumple(lotes.elementAt(posicion)))
				v1.add(c.elementAt(i));
		}
		return v1;
	}
	
	public boolean esEspecial(int posicion) {
		Criterio c = new CMinerales(intPrimario);
		return (c.cumple(lotes.elementAt(posicion)));
	}
}
