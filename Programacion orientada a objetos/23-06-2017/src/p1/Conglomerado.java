package p1;

import java.util.Vector;

public class Conglomerado implements CA{
	private final int cantCriterio;
	
	private Vector<CA> conglomerados;
	private Estandar estandar;
	
	public Conglomerado(int cantCriterio, Vector<CA> conglomerados, Estandar estandar) {
		super();
		this.cantCriterio = cantCriterio;
		this.conglomerados = conglomerados;
		this.estandar = estandar;
	}
	
	public void setEstandar(Estandar e) {
		this.estandar = e;
	}

	@Override
	public int getLong() {
		int res = 0;
		for (CA i : conglomerados) {
			res += i.getLong();
		}
		return res;
	}

	@Override
	public int getLongmax() {
		// TODO Auto-generated method stub
		int res = 0;
		for (CA i : conglomerados) {
			res += i.getLongmax();
		}
		return res;
	}

	@Override
	public int getVelocidad() {
		// TODO Auto-generated method stub
		Vector<Integer> velocidades = new Vector<Integer>();
		for (CA i : conglomerados) {
			velocidades.add(i.getVelocidad());
		}
		return estandar.getVelocidad(velocidades);
	}

	@Override
	public double getCosto() {
		double res = 0;
		for (CA i : conglomerados) {
			res += i.getCosto();
		}
		return (res + res * estandar.getCostoExtra());
	}

	@Override
	public boolean cumpleCriterio(Filtro f) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
