package e5;

import java.util.Vector;

public class Organizador {
	private Vector<Evaluador> evaluadores;
	private Vector<String> conocimientosExpertos;
	
	public Organizador(Vector<String> conocimientosExpertos) {
		evaluadores = new Vector<Evaluador>();
		this.conocimientosExpertos = conocimientosExpertos;
	}
	
	public void addEvaluador(Evaluador e) {
		evaluadores.addElement(e);
	}
	
	public Vector<String> getConocimientosExperto() {
		return conocimientosExpertos;
	}
	
	public Evaluador getEvaluador(int pos) {
		return evaluadores.elementAt(pos);
	}
	
	public boolean getExperto(int pos) {
		boolean res = false;
		int i = 0;
		while (i < conocimientosExpertos.size() && !res) {
			if (this.getEvaluador(pos).getConocimientos().contains(conocimientosExpertos.elementAt(i))) {
				res = true;
			}	
			else
				i++;
		}
		return res;
	}
	
	public int getCantidadEvaluadores() {
		return (evaluadores.size());
	}
	
	public Vector<Evaluador> getRecomendacionEvaluadores(Trabajo t) {
		Vector<Evaluador> res = new Vector<Evaluador>();
		for (int i = 0; i < this.getCantidadEvaluadores(); i++) {
			if (t.getFiltro().cumple(this.getEvaluador(i), t))
				res.add(this.getEvaluador(i));
		}
		return res;
	}
	
	public Vector<Trabajo> getTrabajosEvaluadorDeterminado(int pos, Vector<Trabajo> trabajos) {
		Vector<Trabajo> res = new Vector<Trabajo>();
		for (int i = 0; i < trabajos.size(); i++) {
			if (trabajos.elementAt(i).getFiltro().cumple(this.getEvaluador(pos), trabajos.elementAt(i)))  {
				res.add(trabajos.elementAt(i));
			}
		}
		return res;
	}

	public int getCantidadTrabajosEvaluador(int pos) {
		return (evaluadores.elementAt(pos).getCantidadTrabajos());
	}
	
	public void addTrabajo(int pos, Trabajo t) {
		evaluadores.elementAt(pos).addTrabajo(t);
	}
}
