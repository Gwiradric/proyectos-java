import java.time.LocalDate;
import java.util.Iterator;
import java.util.Vector;

public class Contingente extends STurismo {
	private Vector<STurismo> contingente = new Vector<STurismo>();
	private Filtro criterio;
	
	public Vector<STurismo> getContingente() {
		return contingente;
	}
	
	public void setContingente(Vector<STurismo> contingente) {
		this.contingente = contingente;
	}
	
	public Filtro getCriterio() {
		return criterio;
	}
	
	public void setCriterio(Filtro criterio) {
		this.criterio = criterio;
	}
	
	public Contingente(String nombre, String destino, LocalDate fechaPartida, LocalDate fechaLlegada, Filtro criterio) {
		super(nombre, destino, fechaPartida, fechaLlegada);
		this.criterio = criterio;
	}
	
	public Contingente(Contingente c) {
		super(c.getNombre(), c.getDestino(), c.getFechaPartida(), c.getFechaLlegada());
		this.setContingente(c.getContingente());
		this.setCriterio(c.getCriterio());
	}
	
	public void addElemento(STurismo p) {
		if (criterio.cumple(p))
			contingente.add(p);
	}
	
	@Override
	public double getPrecio() {
		int res = 0;
		for (STurismo i:contingente) {
			res += i.getPrecio();
		}
		return res;
	}
	@Override
	public double getDeuda() {
		double res = 0;
		for (STurismo i:contingente) {
			res += i.getDeuda();
		}
		return res;
	}
	@Override
	public int getCantPasajeros() {
		int res = 0;
		for (STurismo i:contingente) {
			res += i.getCantPasajeros();
		}
		return res;
	}
	@Override
	public STurismo getCopia() {
		Vector<STurismo> pas = new Vector<STurismo>();
		for (STurismo i:contingente) {
			pas.add(i.getCopia());
		}
		Contingente aux = new Contingente(this);
		aux.addAll(pas);
		return aux;
	}
	@Override
	public Vector<STurismo> buscar(Filtro f) {
		Vector<STurismo> res = new Vector<STurismo>();
		for (STurismo i:contingente) {
			if (f.cumple(this))
				res.add(i);
			else
				res.addAll(i.buscar(f));
		}
		return res;
	}
	@Override
	public boolean getContValido(Filtro f) {
		boolean res = true;
		Iterator<STurismo> i = contingente.iterator();
		while (i.hasNext() && res) {
			res = i.next().getContValido(f);
		}
		return res;
	}
	
	public void addAll(Vector<STurismo> a) {
		contingente.addAll(a);
	}
	@Override
	public Pasajero getPasajeroMayorDeuda() {
		STurismo res = contingente.elementAt(0).getPasajeroMayorDeuda();
		for (STurismo s : contingente) {
			if (res.getDeuda() < s.getPasajeroMayorDeuda().getDeuda()) {
				res = s.getPasajeroMayorDeuda();
			}
		}
		return (Pasajero)res;
	}
	
}
