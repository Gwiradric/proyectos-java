package p1;

import java.util.SortedSet;
import java.util.Vector;

public abstract class NAbs {
	
	public abstract void clasificar(Vector<Clasificador> vC);
	public abstract String getCategoria();
	public abstract SortedSet<String> getPalClave();
	public abstract Vector<NAbs> buscar(Filtro f);
	public abstract NAbs getCopia(Filtro f);
	public abstract String toString();
}
