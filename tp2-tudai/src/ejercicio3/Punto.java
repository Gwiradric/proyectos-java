package ejercicio3;

public class Punto {
	private int x, y;
	
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setCoordenadas(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void trasladarX(int x) {
		this.setX(this.getX() + x);
	}
	
	public void trasladarY(int y) {
		this.setY(this.getY() + y);
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
