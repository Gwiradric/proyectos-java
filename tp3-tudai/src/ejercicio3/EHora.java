package ejercicio3;

public class EHora extends Empleado{
	private final double horasMinimas = 8;
	private final double montoExtra = 100;

	public EHora(double salario, double horasTrabajadas) {
		super(salario, horasTrabajadas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPago() {
		// TODO Auto-generated method stub
		
		return ((super.getHorasTrabajadas() - horasMinimas) * montoExtra + super.getSalario());
	}

	
	
}
