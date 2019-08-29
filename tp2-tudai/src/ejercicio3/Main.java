package ejercicio3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(1, 0);
		Punto p2 = new Punto(2, 0);
		Punto p3 = new Punto(1, 2);
		Rectangulo r1 = new Rectangulo(p1, p2, p3);
		
		System.out.println(r1.toString());
		System.out.println("Area: " + r1.getArea());
		
		Rectangulo r2 = new Rectangulo(p1, p2, p3);
		
		Punto p4 = new Punto(3, 3);
		Punto p5 = new Punto(7, 3);
		Punto p6 = new Punto(3, 11);
		Rectangulo r3 = new Rectangulo(p4, p5, p6);
		
		Punto p7 = new Punto(1, 1);
		Punto p8 = new Punto(2, 1);
		Punto p9 = new Punto(1, 2);
		Rectangulo r4 = new Rectangulo(p7, p8, p9);
		
		System.out.println("R1 con R2: " + r1.esMayor(r2));
		System.out.println("R1 con R3: " + r1.esMayor(r3));
		System.out.println("R1 con R4: " + r1.esMayor(r4));
		
		
	}

}
