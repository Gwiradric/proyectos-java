package ejercicio8;

import java.util.Vector;

public class Stock {
	private Vector<ContProductos> productos;
	
	public Stock() {
		productos = new Vector<ContProductos>();
	}
	
	public void addProducto(ContProductos c) {
		productos.add(c);
	}
	
	public void agregarProductos(Vector<ContProductos> p) {
		for (int i = 0; i < p.size(); i++) {
			int j = 0;
			while ((j < productos.size()) && (!productos.elementAt(j).equals(p.elementAt(i)))) {
				j++;
			}
			if (j == productos.size()) {
				productos.add(p.elementAt(i));
			} else {
				productos.elementAt(j).incrementarCantidad(p.elementAt(i).getCantidad());
			}
		}
	}
	
	public void eliminarProductos(Compra c) {
		Vector<ContProductos> p = c.getProductos();
		for (int i = 0; i < p.size(); i++) {
			int j = 0;
			while ((j < productos.size()) && (!productos.elementAt(j).equals(p.elementAt(i)))) {
				j++;
			}
				productos.elementAt(j).disminuirCantidad(p.elementAt(i).getCantidad());
			}
		}

}
