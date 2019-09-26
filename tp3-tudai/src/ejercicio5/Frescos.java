package ejercicio5;

import java.time.LocalDate;

public class Frescos {
	private LocalDate fechaVencimiento, fechaEnvasado;
	private int numeroLote;
	private String granjaOrigen;
	
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
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	public String getGranjaOrigen() {
		return granjaOrigen;
	}
	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	public Frescos(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen) {
		super();
		this.fechaVencimiento = fechaVencimiento;
		this.fechaEnvasado = fechaEnvasado;
		this.numeroLote = numeroLote;
		this.granjaOrigen = granjaOrigen;
	}
	
	public Frescos(int numeroLote, String granjaOrigen) {
		super();
		this.numeroLote = numeroLote;
		this.granjaOrigen = granjaOrigen;
		fechaEnvasado = LocalDate.of(2019, 01, 01);
		fechaVencimiento = LocalDate.of(2020, 01, 01);
		
	}
	
	public String toString() {
		return ("Numero de lote: " + this.getNumeroLote() + "\nGranja de origen: " + this.getGranjaOrigen() + "\nFecha de vencimiento: " + this.getFechaVencimiento() + "\nFecha de envasado: " + this.getFechaEnvasado());
	}
}
