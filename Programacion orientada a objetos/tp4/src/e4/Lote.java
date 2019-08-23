package e4;

import java.util.Vector;

public class Lote {
	private int numeroLote;
	private float superficie;
	private Vector<String> minerales;
	
	public Lote(int numeroLote, float superficie, Vector<String> minerales) {
		super();
		this.numeroLote = numeroLote;
		this.setSuperficie(superficie);
		this.setMinerales(minerales);
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public Vector<String> getMinerales() {
		return minerales;
	}

	public void setMinerales(Vector<String> minerales) {
		this.minerales = minerales;
	}
	
	public int getNumeroLote() {
		return numeroLote;
	}
}
