package ejercicio8;

public class ContProductos {
	private Producto producto;
	private int cantidad;
	
	public ContProductos(Producto p) {
		producto = p;
		cantidad = 1;	
	}
	
	public Producto getProducto() {
		return (producto);
	}
	
	public int getCantidad() {
		return (cantidad);
	}
	
	public void incrementarCantidad() {
		cantidad++;
	}
	
	public double getPrecio() {
		return (this.getProducto().getPrecio() * this.getCantidad());
	}
	
	public boolean contains(ContProductos c) {
		return (this.getProducto().equals(c.getProducto()));
	}
}
