package tpe;

import java.util.Vector;

public class Hacienda extends SHacienda{
	private Vector<SHacienda> elem;

	public Hacienda(Vector<SHacienda>s) {
		elem=s;
	}
	
	public Hacienda() {
		super();
		elem=new Vector<SHacienda>();
	}

	public Vector<SHacienda> getElem() {
		return elem;
	}

	public void setElem(Vector<SHacienda> elem) {
		this.elem = elem;
	}
	
	public void add(SHacienda s) {
		elem.add(s);
	}
	
	public void eliminar(int i) {
		elem.removeElementAt(i);
	}
	
	@Override
	public int getCantidad() {
		// TODO Auto-generated method stub
		int total = 0;
		for (SHacienda sHacienda : elem) {
			total += sHacienda.getCantidad();
		}
		return total;
	}
	
	@Override
	public int getEdad() {
		// en este caso retorna la sumatoria de edades de todos los elementos del vector.
		int total = 0;
		for (SHacienda sHacienda : elem) {
			total += sHacienda.getEdad();
		}
		return total;
	}
	
	@Override
	public double getPeso() {
		// retorna la sumatoria de todos los pesos
		int total = 0;
		for (SHacienda sHacienda : elem) {
			total += sHacienda.getPeso();
		}
		return total;
	}
	
	@Override
	public Vector<SHacienda> buscar(Criterio c) {
		// TODO Auto-generated method stub
		Vector<SHacienda>h; 
		h = new Vector<SHacienda>();
		if (c.cumple(this))
			h.add(this);
		else {
			for (SHacienda s : elem) {
				h.addAll(s.buscar(c));
			}
		}
		return h;
	}
	
	
}
