package e8;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		EF a1 = new Archivo("Archivo 1", 10);
		EF a2 = new Archivo("Archivo 2", 20);
		EF a3 = new Archivo("Archivo 3", 15);
		Vector<EF> v1 = new Vector<EF>();
		v1.add(a1);
		v1.add(a2);
		v1.add(a3);
		EF d1 = new Directorio("Directorio 1", v1);
		
		System.out.println("CANTIDAD DE ARCHIVOS/DIRECTORIO: " + d1.getCant());
		System.out.println("TAMANIO DEL ARCHIVO/DIRECTORIO: " + d1.getTam());
	}

}
