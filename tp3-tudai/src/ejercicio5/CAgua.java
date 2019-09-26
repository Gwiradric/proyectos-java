package ejercicio5;

import java.time.LocalDate;

public class CAgua extends Congelados{
	private double sal, agua;

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getAgua() {
		return agua;
	}

	public void setAgua(double agua) {
		this.agua = agua;
	}

	public CAgua(int numeroLote, String granjaOrigen, int codigoSupervision, int temperaturaRecomendada, double sal,
			double agua) {
		super(numeroLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		this.sal = sal;
		this.agua = agua;
	}

	public CAgua(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, String granjaOrigen,
			int codigoSupervision, int temperaturaRecomendada, double sal, double agua) {
		super(fechaVencimiento, fechaEnvasado, numeroLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
		this.sal = sal;
		this.agua = agua;
	}
	
	public double getPorcentajeSalinizacion() {
		return (this.getSal() / this.getAgua());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "\nPorcentaje de salinizacion: " + this.getPorcentajeSalinizacion());
	}
	
	
}
