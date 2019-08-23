package ejercicio3;

public class Main {

	public static void main(String[] args) {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(6,0);
		Punto p3 = new Punto(0,5);
		Punto p4 = new Punto(6,5);
		
		Rectangulo r1 = new Rectangulo(p1, p2, p3, p4);
		
		System.out.println(r1.toString());
		
		r1.invertirRectangulo();
		System.out.println(r1.toString());
		System.out.println("ES CUADRADO: " + r1.esCuadrado());
		
		Punto p5 = new Punto(0,0);
		Punto p6 = new Punto(2,0);
		Punto p7 = new Punto(0,2);
		Punto p8 = new Punto(2,2);
		
		Rectangulo r2 = new Rectangulo(p5, p6, p7, p8);
		System.out.println("ES CUADRADO: " + r2.esCuadrado());
	}

}
