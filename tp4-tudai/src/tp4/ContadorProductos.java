package tp4;

public class ContadorProductos {
	private Producto producto;
	private int cantidad;
	
	public ContadorProductos(Producto producto) {
		this.producto = producto;
		cantidad = 1;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public void aumentarCantidad() {
		cantidad++;
	}

	public double getMonto() {
		return (producto.getPrecio() * getCantidad());
	}
	
}
