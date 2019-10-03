package ejercicio8;

public class Impuesto {
	private double suma, multiplicacion;

	public Impuesto(double suma, double multiplicacion) {
		super();
		this.suma = suma;
		this.multiplicacion = multiplicacion;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public double getMultiplicacion() {
		return multiplicacion;
	}

	public void setMultiplicacion(double multiplicacion) {
		this.multiplicacion = multiplicacion;
	}
	
	public double getCalculo(double precio) {
		return (precio * this.getMultiplicacion() + this.getSuma());
	}
}
