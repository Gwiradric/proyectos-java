package ejercicio8;

public class CompraDescuento extends Compra {
	private double descuento;
	
	public CompraDescuento(double d) {
		this.setDescuento(d);
	}
	
	public void setDescuento(double d) {
		this.descuento = d;
	}
	
	public double getDescuento() {
		return descuento;
	}
	
	public double getMontoTotal() {
		return (super.getMontoTotal() - (super.getMontoTotal() * this.getDescuento()));
	}
	
	public String toString() {
		return ("Descuento del " + this.getDescuento() * 100 + "%\n" + super.toString());
	}

}
