package tpe;

public class CPromPeso implements Criterio{
	private double peso;

	public CPromPeso(double peso) {
		super();
		this.peso = peso;
	}
	
	public boolean cumple(SHacienda s) {
		return (s.getPromPeso() > peso);
	}
}
