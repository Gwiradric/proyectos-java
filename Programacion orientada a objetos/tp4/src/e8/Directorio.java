package e8;

import java.util.Vector;

public class Directorio extends EF{
	private Vector<EF> els = new Vector<EF>();
	
	public Directorio(String nombre) {
		super(nombre);
	}

	public Directorio(String nombre, Vector<EF> els) {
		super(nombre);
		this.els = els;
	}

	public void addElemento(EF e) {
		els.add(e);
	}

	@Override
	public double getTam() {
		int res = 0;
		for (int i = 0; i < els.size(); i++) {
			EF aux = els.elementAt(i);
			res += aux.getTam();
		}
		return res;
	}

	@Override
	public int getCant() {
		int res = 0;
		for (int i = 0; i < els.size(); i++) {
			res += els.elementAt(i).getCant();
		}
		return res;
	}

}
