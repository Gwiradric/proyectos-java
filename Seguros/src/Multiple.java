import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Multiple implements Buscar {
	private List<Buscar> requisitos = new ArrayList<Buscar>();
	
	public Multiple(){
		
	}
	
	public void agregarElementos(Buscar o) {
		requisitos.add(o);
	}
	
	public boolean comparar(Individual s) {
		Iterator<Buscar> iterador = requisitos.iterator();
		Buscar condicion;
		boolean resultado = true;
		while ((iterador.hasNext()) && (resultado)) {
			condicion = iterador.next();
			resultado = condicion.comparar(s);
		}
		return resultado;
	}

}
