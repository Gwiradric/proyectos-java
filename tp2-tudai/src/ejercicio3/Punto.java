package ejercicio3;

public class Punto {
	private double x, y;
	
	public Punto() {
		this.setX(0);
		this.setY(0);
	}
	
	public Punto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Punto(Punto p) {
		this.setX(p.getX());
		this.setY(p.getY());
	}

	public double getX() {
		return x;
	}

	public void setX(double d) {
		this.x = d;
	}

	public double getY() {
		return y;
	}

	public void setY(double d) {
		this.y = d;
	}
	
	public void setCoordenadas(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void trasladarX(double x) {
		this.setX(this.getX() + x);
	}
	
	public void trasladarY(double d) {
		this.setY(this.getY() + d);
	}
	
	public void trasladar(int x, int y) {
		this.trasladarX(x);
		this.trasladarY(y);
	}
	
	public double getDistancia(Punto p) {
		double a =  Math.pow(p.getX() - this.getX(), 2);
		double b =  Math.pow(p.getY() - this.getY(), 2);
		return (Math.sqrt(a + b));
	}
	
	public String toString() {
		return ("(" + this.getX() + ", " + this.getY() + ")");
	}

	
}
