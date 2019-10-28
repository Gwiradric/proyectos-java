package tpe;

public class CPeso implements Criterio {
	private double peso;

	public CPeso(double peso) {
		super();
		this.peso = peso;
	}
	
	public boolean cumple(SHacienda s) {
		return (s.getPeso() > peso);
	}
}
