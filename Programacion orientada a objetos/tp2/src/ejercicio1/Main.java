package ejercicio1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona(35590913);
		
		System.out.println(p.getInfoPersona());
		System.out.println(p.getCumpleAnios());
		System.out.println(p.getPuedeVotar());
		System.out.println(p.getEstaEnForma(18.5, 25));
		System.out.println(p.getMayorEdad());
		System.out.println(" ");
		
		Persona p1 = new Persona(1000);
		
		LocalDate fechaNacimiento = LocalDate.now();
		p1.setFechaNacimiento(fechaNacimiento);
		System.out.println(p1.getInfoPersona());
		System.out.println(p1.getCumpleAnios());
		System.out.println(p1.getPuedeVotar());
		System.out.println(p1.getEstaEnForma(18.5, 25));
		System.out.println(p1.getMayorEdad());
	}

}
