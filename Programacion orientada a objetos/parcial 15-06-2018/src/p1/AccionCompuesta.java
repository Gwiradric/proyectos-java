package p1;

import java.util.Vector;

public class AccionCompuesta implements IAccion{
	private Vector<IAccion> acciones = new Vector<IAccion>();
	
	public void add(IAccion a) {
		acciones.add(a);
	}

	@Override
	public void realizarAccion(Noticia n) {
		for (IAccion accion : acciones) {
			accion.realizarAccion(n);
		}	
	}
	
	
}
