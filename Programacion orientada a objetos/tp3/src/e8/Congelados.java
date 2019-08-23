package e8;

import java.time.LocalDate;

public class Congelados extends Producto{
	private int codigoSupervision;
	private int temperaturaRecomendada;

	public Congelados(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote, String granjaOrigen,
			int codigoSupervision, int temperaturaRecomendada) {
		super(fechaVencimiento, fechaEnvasado, lote, granjaOrigen);
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

	@Override
	public String getEtiqueta() {
		return super.getEtiqueta() + ". CODIGO SUPERVISION: " + this.getCodigoSupervision()
				+ ". TEMPERATURA RECOMENDADA: " + this.getTemperaturaRecomendada();
	}
	
	

}
