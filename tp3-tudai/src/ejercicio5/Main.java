package ejercicio5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frescos f1 = new Frescos(2, "Granja de la ciudad");
		System.out.println(f1);
		
		Congelados c1 = new Congelados(2, "Granja Amanecer", 203, 30);
		System.out.println(c1);
		
		CAire a1 = new CAire(30, "El campito", 55, 29, 0.3, 0.4, 0.2, 0.2);
		System.out.println(a1);
		
		CAgua w1 = new CAgua(785, "Granja la familia", 8293289, 34, 0.6, 0.7);
		System.out.println(w1);
		
		CNitrogeno n1 = new CNitrogeno(1111, "Familia Lopez", 3521, 24, "Congelacion por hielo", 20);
		System.out.println(n1);
	}

}
