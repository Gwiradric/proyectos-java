package ejercicio5;

import java.time.LocalDate;

public class CNitrogeno extends Congelados{
	private String metodo;
	private int tiempoExposicion;
	
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public int getTiempoExposicion() {
		return tiempoExposicion;
	}
	public void setTiempoExposicion(int tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	public CNitrogeno(int numeroLote, String granjaOrigen, int codigoSupervision, int temperaturaRecomendada,
			String metodo, int tiempoExposicion) {
		super(numeroLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		this.metodo = metodo;
		this.tiempoExposicion = tiempoExposicion;
	}
	public CNitrogeno(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen,
			int codigoSupervision, int temperaturaRecomendada, String metodo, int tiempoExposicion) {
		super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		this.metodo = metodo;
		this.tiempoExposicion = tiempoExposicion;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "\nMetodo de exposicion: " + this.getMetodo() + "\nTiempo de exposicion: " + this.getTiempoExposicion());
	}
	
	
}
