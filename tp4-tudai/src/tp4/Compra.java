package tp4;

import java.util.Vector;

public class Compra {
	private Vector<ContadorProductos> productos;
	
	public Compra() {
		this.productos = new Vector<ContadorProductos>();
	}

	public void addProducto(Producto p) {
		int i = 0;
		while (i < productos.size() && productos.elementAt(i).getProducto().getNombre() != p.getNombre())
			i++;
		if (i == productos.size()) {
			ContadorProductos l = new ContadorProductos(p);
			productos.add(l);
		} else {
			productos.elementAt(i).aumentarCantidad();
		}
	}
	
	public double getMontoTotal() {
		double total = 0;
		for (int i = 0; i < productos.size(); i++) {
			total += productos.elementAt(i).getMonto();
		}
		return total;
	}
	
	public String toString() {
		String s = "--------------------------------\n";
		s += "Factura de compra\n";
		s += "--------------------------------\n";
		for (int i = 0; i < productos.size(); i++) {
			s += (productos.elementAt(i).getProducto().getNombre() + "\n$" + productos.elementAt(i).getProducto().getPrecio() + " x " + productos.elementAt(i).getCantidad() + " = $" + productos.elementAt(i).getMonto() + "\n");
		}
		s += "--------------------------------\n";
		s += ("Monto total: $" + getMontoTotal() + "\n");
		return s;
	}
	
}
