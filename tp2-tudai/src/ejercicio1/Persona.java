package ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Vector;

public class Persona {
	private final double pesoMinimo = 18.5;
	private final double pesoMaximo = 25;
	private final int mayorDeEdad = 18;
	private final int edadParaVotar = 16;
	
	private String nombre, apellido, sexo;
	private LocalDate fechaNacimiento;
	private int dni;
	private double peso, altura;
	
	public Persona(int dni) {
		this.dni = dni;
		this.fechaNacimiento = LocalDate.of(2000, 1, 1);
		this.setSexo("Femenino");
		this.setNombre("N");
		this.setApellido("N");
		this.setPeso(1);
		this.setAltura(1);
	}
	
	public Vector<Integer> getEdad() {
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, ahora);
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(periodo.getYears());
		v1.add(periodo.getMonths());
		v1.add(periodo.getDays());
		
		return (v1);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
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
		return (peso / Math.pow(altura, 2));
	}

	public boolean estaEnForma() {
		double masaCorporal = this.getMasaCorporal();
		return ((masaCorporal > this.pesoMinimo) && (masaCorporal < this.pesoMaximo));
	}
	
	public boolean esMayor() {
		Vector<Integer> year = this.getEdad();
		return (year.elementAt(0) >= mayorDeEdad);
	}
	
	public boolean puedeVotar() {
		Vector<Integer> year = this.getEdad();
		return (year.elementAt(0) >= edadParaVotar);
	}
	
	public String toString() {
		
		Vector<Integer> v1 = this.getEdad();
		
		return ("Nombre: " + this.getNombre() + "\nApellido: " + this.getApellido()
		+ "\nDNI: " + this.getDni() + "\nFecha de nacimiento: " + this.getFechaNacimiento()
		+ "\nSexo: " + this.getSexo() + "\nPeso: " + this.getPeso() + "\nAltura: " +
		this.getAltura() + "\nEdad: " + v1.elementAt(0) + " años, " + v1.elementAt(1) + " meses y " + v1.elementAt(2) + " dias.");
		
		
	}
	
}	