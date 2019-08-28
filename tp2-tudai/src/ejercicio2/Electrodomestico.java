package ejercicio2;

public class Electrodomestico {
	private final int consumoBajoConsumo = 45;
	private final int altaGama = 3;
	
	private String nombre, color;
	private int consumo;
	private double  precio, peso;
	
	public Electrodomestico(String nombre) {
		this.setNombre(nombre);
		this.setColor("Gris plata");
		this.setConsumo(10);
		this.setPrecio(100);
		this.setPeso(2);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean esBajoConsumo() {
		return (this.getConsumo() < consumoBajoConsumo);
	}
	
	public double getBalance() {
		return (this.getPrecio() / this.getPeso());
	}
	
	public boolean esAltaGama() {
		return (this.getBalance() > altaGama);
	}
	
	public String toString() {
		return ("Nombre: " + this.getNombre() + "\nColor: " + this.getColor() + "\nConsumo: " + this.getConsumo() +
				"\nPrecio: " + this.getPrecio() + "\nPeso: " + this.getPeso());
	}
	
}
