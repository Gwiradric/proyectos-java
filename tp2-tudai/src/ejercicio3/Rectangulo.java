package ejercicio3;

public class Rectangulo {
	private Punto p1, p2, p3;

	public Rectangulo(Punto p1, Punto p2, Punto p3) {
		this.setP1(p1);
		this.setP2(p2);
		this.setP3(p3);
	}
	
	public void setP1(Punto p) {
		this.p1 = new Punto(p);
	}
	
	public void setP2(Punto p) {
		this.p2 = new Punto(p);
	}
	
	public void setP3(Punto p) {
		this.p3 = new Punto(p);
	}
	
	public void trasladar(int x, int y) {
		p1.trasladar(x, y);
		p2.trasladar(x, y);
		p3.trasladar(x, y);
	}
	
	public double getArea() {
		double base = p1.getDistancia(p2);
		double altura = p1.getDistancia(p3);
		return (base * altura);
	}
	
	public int esMayor(Rectangulo r) {
		if (this.getArea() > r.getArea())
			return 1;
		else if (this.getArea() == r.getArea())
			return 0;
		return -1;
	}
	
	public String toString() {
		return ("Puntos del rectangulo son: " + p1.toString() + ", " + p2.toString() + ", " + p3.toString());
	}

}
