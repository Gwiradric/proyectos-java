package ejercicio5;

import java.time.LocalDate;

public class CAire extends Congelados{
	private double nitro, oxigeno, carbono, vaporAgua;

	public double getNitro() {
		return nitro;
	}

	public void setNitro(double nitro) {
		this.nitro = nitro;
	}

	public double getOxigeno() {
		return oxigeno;
	}

	public void setOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}

	public double getCarbono() {
		return carbono;
	}

	public void setCarbono(double carbono) {
		this.carbono = carbono;
	}

	public double getVaporAgua() {
		return vaporAgua;
	}

	public void setVaporAgua(double vaporAgua) {
		this.vaporAgua = vaporAgua;
	}

	public CAire(int numeroLote, String granjaOrigen, int codigoSupervision, int temperaturaRecomendada, double nitro,
			double oxigeno, double carbono, double vaporAgua) {
		super(numeroLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		this.nitro = nitro;
		this.oxigeno = oxigeno;
		this.carbono = carbono;
		this.vaporAgua = vaporAgua;
	}

	public CAire(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen,
			int codigoSupervision, int temperaturaRecomendada, double nitro, double oxigeno, double carbono,
			double vaporAgua) {
		super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		this.nitro = nitro;
		this.oxigeno = oxigeno;
		this.carbono = carbono;
		this.vaporAgua = vaporAgua;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "\nNitrogeno: " + this.getNitro() + "\nOxigeno: " + this.getOxigeno() + "\nCarbono: " + this.getCarbono() + "\nVapor de agua: " + this.getVaporAgua());
	}
	
	

}
