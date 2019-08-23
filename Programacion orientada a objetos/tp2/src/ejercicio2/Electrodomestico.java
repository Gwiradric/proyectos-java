package ejercicio2;

public class Electrodomestico {
	private static final int MAX_CONSUMO = 45, MAX_BALANCE = 3;
	
	private String color;
	private int consumo;
	private double precio, peso;
	
	public Electrodomestico() {
		color = "Gris plata";
		consumo = 10;
		precio = 100;
		peso = 2;
	}
	
	public Electrodomestico(String color, int consumo, double precio, double peso) {
		this.color = color;
		this.consumo = consumo;
		this.precio = precio;
		this.peso = peso;
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
	
	public boolean getBajoConsumo() {
		return (getConsumo() < MAX_CONSUMO);
	}
	
	public double getBalance() {
		return (getPrecio() / peso);
	}
	
	public boolean getEsGamaAlta() {
		return (this.getBalance() > MAX_BALANCE);
	}
}
