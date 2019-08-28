package ejercicio3;

public class Punto {
	private int x, y;
	
	public Punto() {
		this.setX(0);
		this.setY(0);
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
	
	public void trasladarX(int x) {
		this.setX(this.getX() + x);
	}
	
	public void trasladarY(int y) {
		this.setY(this.getX() + y);
	}
	
	public String toString() {
		return ("(" + this.getX() + ", " + this.getY() + ")");
	}
	
}
