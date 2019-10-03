package ejercicio8;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String n, double p) {
		this.setNombre(n);
		this.setPrecio(p);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean equals(Producto p) {
		return (this.getNombre().equals(p.getNombre()) && this.getPrecio() == p.getPrecio());
	}
}
