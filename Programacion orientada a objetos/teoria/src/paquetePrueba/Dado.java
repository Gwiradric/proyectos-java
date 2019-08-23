package paquetePrueba;

public class Dado {
	private int cara;
	private int cantCaras;
	
	public Dado(int cantCaras) {
		this.setCantCaras(cantCaras);
	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int getCantCaras() {
		return cantCaras;
	}

	public void setCantCaras(int cantCaras) {
		this.cantCaras = cantCaras;
	}
	
	public int roll() {
		cara = (int)(Math.random() * cantCaras) + 1;
		return cara;
	}
	
	
}
