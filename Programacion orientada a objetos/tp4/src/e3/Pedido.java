package e3;

import java.time.LocalDate;

public class Pedido {
	private String nombre, material, lugarEntrega;
	private LocalDate fechaEntrega, fechaPedido;
	private float costo;
	
	public Pedido(String nombre, String material, String lugarEntrega, LocalDate fechaEntrega, LocalDate fechaPedido,
			float costo) {
		this.nombre = nombre;
		this.material = material;
		this.lugarEntrega = lugarEntrega;
		this.fechaEntrega = fechaEntrega;
		this.fechaPedido = fechaPedido;
		this.costo = costo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getLugarEntrega() {
		return lugarEntrega;
	}

	public void setLugarEntrega(String lugarEntrega) {
		this.lugarEntrega = lugarEntrega;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

}
