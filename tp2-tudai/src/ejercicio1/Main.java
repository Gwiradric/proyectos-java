package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona(30021);
		
		p1.setAltura(1.84);
		p1.setPeso(66);
		
		System.out.println(p1.toString());
		System.out.println("Es mayor de edad? " + p1.esMayor());
		System.out.println("Puede votar? " + p1.puedeVotar());
		System.out.println("Esta en forma? " + p1.estaEnForma());
		System.out.println("Masa corporal: " + p1.getMasaCorporal());
		
	}

}
