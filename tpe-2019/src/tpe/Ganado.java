package tpe;

import java.util.Vector;

public class Ganado extends SHacienda {
	private int id, edad;
	private double peso;
	private String raza, sexo;
	private boolean capado;
	
	public Ganado(int id, int edad, double peso, String raza, String sexo, boolean capado) {
		super();
		this.id = id;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.capado = capado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isCapado() {
		return capado;
	}

	public void setCapado(boolean capado) {
		this.capado = capado;
	}

	@Override
	public int getCantidad() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Vector<SHacienda> buscar(Criterio c) {
		// TODO Auto-generated method stub
		Vector<SHacienda> v = new Vector<SHacienda>();
		if (c.cumple(this))
			v.add(this);
		return v;
	}
	
}
