package ejercicio8;

import java.util.Vector;

public class Compra {
	private Vector<ContProductos> productos = new Vector<ContProductos>();
	
	public void addProducto(Producto p) {
		ContProductos cp = new ContProductos(p);
		int i = 0;
		while (i < productos.size() && !productos.elementAt(i).getProducto().equals(p)) {
			i++;
		}
		if (i == productos.size()) {
			productos.add(cp);
		} else {
			productos.elementAt(i).incrementarCantidad();
		}
	}
	
	public double getMontoTotal() {
		double suma = 0;
		for (int i = 0; i < productos.size(); i++) {
			suma += productos.elementAt(i).getPrecio();
		}
		return suma;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < productos.size(); i++) {
			s += (productos.elementAt(i).getProducto().getNombre() + " por unidad $" + productos.elementAt(i).getProducto().getPrecio() + "\n x " + productos.elementAt(i).getCantidad() + " = " + productos.elementAt(i).getPrecio() + "\n");
		}
		s += ("----------------------------------\nTotal: $" + this.getMontoTotal() + "\n");
		return s;
	}
}
