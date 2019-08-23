package ejercicio1;

import java.time.LocalDate;
import java.time.Month;

public class Persona {
	
	private int dni;
	private String nombre, sexo;
	private LocalDate fechaNacimiento;
	private double peso, altura;
	
	public Persona(int dni) {
		nombre = "N N";
		sexo = "Femenino";
		fechaNacimiento = LocalDate.of(2000, Month.JANUARY, 1);
		peso = 1;
		altura = 1;
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getMasaCorporal() {
		return (peso / (altura * altura));
	}
	
	public boolean getEstaEnForma(double min, double max) {
		if ((getMasaCorporal() >= min) && (getMasaCorporal() <= max))
			return true;
		else
			return false;
	}
	
	public boolean getCumpleAnios() {
		LocalDate hoy = LocalDate.now();
		return (fechaNacimiento.getDayOfYear() == hoy.getDayOfYear()); 
	}
	
	public boolean getMayorEdad() {
		LocalDate hoy = LocalDate.now();
		return ((hoy.getYear() - fechaNacimiento.getYear()) >= 18);
	}
	
	public boolean getPuedeVotar() {
		LocalDate hoy = LocalDate.now();
		return ((hoy.getYear() - fechaNacimiento.getYear()) >= 16);
	}
	
	public String getInfoPersona() {
		return (dni + ", " + nombre +  ", " + sexo + ", " +  fechaNacimiento.toString() + ", " +  peso + ", " +  altura);
	}
}
