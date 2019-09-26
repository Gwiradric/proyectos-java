package ejercicio5;

import java.time.LocalDate;

public class Congelados extends Frescos {
	private int codigoSupervision, temperaturaRecomendada;

	public Congelados(int numeroLote, String granjaOrigen, int codigoSupervision, int temperaturaRecomendada) {
		super(numeroLote, granjaOrigen);
		this.codigoSupervision = codigoSupervision;
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	public Congelados(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen,
			int codigoSupervision, int temperaturaRecomendada) {
		super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen);
		this.codigoSupervision = codigoSupervision;
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	public int getCodigoSupervision() {
		return codigoSupervision;
	}

	public void setCodigoSupervision(int codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}

	public int getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(int temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	
	public String toString() {
		return (super.toString() + "\nCodigo de supervision: " + this.getCodigoSupervision() + "\nTemperatura recomendada: " + this.getTemperaturaRecomendada());
	}
}
