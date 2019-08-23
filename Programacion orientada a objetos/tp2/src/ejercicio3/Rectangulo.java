package ejercicio3;

public class Rectangulo{
	private Punto punto1, punto2, punto3, punto4;
	
	public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
		punto1 = p1;
		punto2 = p2;
		punto3 = p3;
		punto4 = p4;
	}
	
	public void trasladarRectangulo(int x, int y) {
		this.punto1.trasladarPunto(x, y);
		this.punto2.trasladarPunto(x, y);
		this.punto3.trasladarPunto(x, y);
		this.punto4.trasladarPunto(x, y);
	}
	
	public int getArea() {
		int base = (punto2.getCoordX() - punto1.getCoordX());
		int altura = (punto3.getCoordY() - punto1.getCoordY());
		return (base * altura);
	}
	
	public Punto getPunto1() {
		return punto1;
	}
	
	public Punto getPunto2() {
		return punto2;
	}
	
	public Punto getPunto3() {
		return punto3;
	}
	
	public Punto getPunto4() {
		return punto4;
	}
	
	public void invertirRectangulo() {
		punto1.invertirPunto();
		punto2.invertirPunto();
		punto3.invertirPunto();
		punto4.invertirPunto();
	}
	
	public boolean esCuadrado() {
		return ((punto1.getDistancia(punto2)) == (punto1.getDistancia(punto3)));
	}
	
	public String toString() {
		return (punto1.toString() + "," + punto2.toString() + "," + punto3.toString() + ","+ punto4.toString());
	}
}
