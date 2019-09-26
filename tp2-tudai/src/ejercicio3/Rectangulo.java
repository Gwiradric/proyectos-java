package ejercicio3;

public class Rectangulo {
	private Punto p1, p2, p3, p4;

	public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
		this.setP1(p1);
		this.setP2(p2);
		this.setP3(p3);
		this.setP4(p4);
	}
	
	public Punto getP4() {
		return p4;
	}

	public void setP4(Punto p) {
		this.p4 = new Punto(p);
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
	
	public Punto getP1() {
		return p1;
	}
	
	public Punto getP2() {
		return p2;
	}
	
	public Punto getP3() {
		return p3;
	}
	
	public void trasladar(int x, int y) {
		p1.trasladar(x, y);
		p2.trasladar(x, y);
		p3.trasladar(x, y);
		p4.trasladar(x, y);
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
	
	public double getLargo() {
		return (this.getP1().getDistancia(p3));
	}
	
	public double getAncho() {
		return (this.getP1().getDistancia(p2));
	}
	
	private void invertirVerticalmente() {
		this.getP3().trasladarY((-2)*(this.getLargo()));
		this.getP4().trasladarY((-2)*(this.getLargo()));
	}
	
	private void invertirHorizontalmente() {
		this.getP2().trasladarX((-2) * this.getAncho());
		this.getP4().trasladarX((-2) * this.getAncho());
	}
	
	public void invertirRectangulo() {
		if (!this.esCuadrado()) {
			if (this.estaParado())
				this.invertirVerticalmente();
			else
				this.invertirHorizontalmente();
		}
	}
	
	public boolean esCuadrado() {
		return (this.getAncho() == this.getLargo());
	}
	
	public double getLargoSuperior() {
		if (this.getAncho() > this.getLargo())
			return this.getAncho();
		return this.getLargo();
	}
	
	public boolean estaParado() {
		if (!this.esCuadrado()) {
			if (this.getLargo() > this.getAncho())
				return (true);
		}
		return false;
	}
	
	public String toString() {
		return ("Puntos del rectangulo son: " + p1.toString() + ", " + p2.toString() + ", " + p3.toString() + ", " + p4.toString());
	}

}
