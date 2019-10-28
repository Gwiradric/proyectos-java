package tpe;

import java.util.Vector;

public abstract class SHacienda {
	public abstract int getCantidad();
	public abstract int getEdad();
	
	public double getPromEdad() {
		//METODO TEMPLATE
		return (this.getEdad() / this.getCantidad());
	}
	
	public abstract double getPeso();
	
	public double getPromPeso() {
		//METODO TEMPLATE
		return (this.getPeso() / this.getCantidad());
	}
	
	public abstract Vector<SHacienda> buscar(Criterio c);
}
