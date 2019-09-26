package ejercicio3;

public class Empleado {
	private double salario;
	private double horasTrabajadas;
	
	public Empleado(double salario, double horasTrabajadas) {
		this.salario = salario;
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getPago() {
		return (this.getSalario());
	}
	
	public String toString() {
		return ("Salario: " + this.getSalario() + ", Horas Trabajadas: " + this.getHorasTrabajadas() + ", Pago: " + this.getPago());
	}
}
