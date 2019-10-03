package ejercicio8;

import java.util.Vector;

public class ProductoImpuesto extends Producto{
	private Vector<Impuesto> impuestos = new Vector<Impuesto>();

	public ProductoImpuesto(String n, double p) {
		super(n, p);
		// TODO Auto-generated constructor stub
	}

	public void addImpuesto(Impuesto i) {
		impuestos.add(i);
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		double suma = 0;
		for (int i = 0; i < impuestos.size(); i++) {
			suma += impuestos.elementAt(i).getCalculo(super.getPrecio());
		}
		return (super.getPrecio() + suma);
	}
	
	

}
