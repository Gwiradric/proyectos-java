package ejercicio3;

public class Punto{
	private int x, y;
	
	public Punto() {
		x = 0;
		y = 0;
	}
	
	public Punto(int x, int y) {
		this.setCoordX(x);
		this.setCoordY(y);
	}

	public void setCoordX(int x) {
		this.x = x;
	}
	
	public int getCoordX() {
		return x;
	}
	
	public void setCoordY(int y) {
		this.y = y;
	}
	
	public int getCoordY() {
		return y;
	}
	
	public void trasladarPunto(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public double getDistancia(Punto p) {
		double distX = Math.sqrt(p.getCoordX() - this.getCoordX());
		double distY = Math.sqrt(p.getCoordY() - this.getCoordY());
		return (distX + distY);
	}

	public void invertirPunto() {
		x = -x;
		y = -y;
	}

	public String toString() {
		return ("(" + this.getCoordX() + "," + this.getCoordY() + ")");
	}
}