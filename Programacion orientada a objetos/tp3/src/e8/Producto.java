package e8;

import java.time.LocalDate;

public abstract class Producto {
	private LocalDate fechaVencimiento, fechaEnvasado;
	private int lote;
	private String granjaOrigen;
	
	public Producto(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote, String granjaOrigen) {
		this.fechaVencimiento = fechaVencimiento;
		this.fechaEnvasado = fechaEnvasado;
		this.lote = lote;
		this.granjaOrigen = granjaOrigen;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}

	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	public String getEtiqueta() {
		return ("FECHA VENCIMIENTO: " + this.getFechaVencimiento().toString()
				+ ". NUMERO DE LOTE: " + this.getLote() + ". FECHA ENVASADO: " + this.getFechaEnvasado().toString()
				+ ". GRANJA DE ORIGEN: " + this.getGranjaOrigen());
	}
	

}
