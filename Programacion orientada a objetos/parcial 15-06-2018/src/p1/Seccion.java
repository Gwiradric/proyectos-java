package p1;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Seccion extends NAbs{
	private Vector<NAbs> secciones = new Vector<NAbs>();
	
	public Seccion() {
		super();
	}
	
	public Seccion(Vector<NAbs> secciones) {
		super();
		this.secciones = secciones;
	}

	public void add(NAbs n) {
		secciones.add(n);
	}
	
	public String getSecciones() {
		return null;
	}

	@Override
	public String getCategoria() {
		String cat = secciones.elementAt(0).getCategoria();
		
		return cat;
	}
	

	@Override
	public Vector<NAbs> buscar(Filtro f) {
		Vector<NAbs> res = new Vector<NAbs>();
		for (int i = 0; i < secciones.size(); i++) {
			NAbs n = secciones.elementAt(i);
			res.addAll(n.buscar(f));
		}
		return res;
	}

	@Override
	public SortedSet<String> getPalClave() {
		SortedSet<String> set = new TreeSet<String>();
		for (NAbs i : secciones) {
			set.addAll(i.getPalClave());
		}
		return set;
	}

	@Override
	public void clasificar(Vector<Clasificador> vC) {
		for (NAbs seccion : secciones) {
			seccion.clasificar(vC);
		}
		
	}

	@Override
	public NAbs getCopia(Filtro f) {
		Vector<NAbs> res = new Vector<NAbs>();
		Seccion sec = null;
		for (NAbs n:secciones) {
			if (n.getCopia(f) != null) {
				res.add(n);
			}
		}
		if (!res.isEmpty()) {
			sec = new Seccion();
			sec.addAll(res);
		}
		return sec;
	}
	
	public void addAll(Vector<NAbs> s) {
		secciones.addAll(s);
	}
	
	@Override
	public String toString() {
		String res = "";
		for (NAbs i:secciones) {
			res += (i.toString());
		}
		return res;
	}

}
