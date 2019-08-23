package paquetePrueba;

public class Juego {
	public static final int MAX = 10;
	
	private Jugador j1;
	private Jugador j2;
	private Cubilete c;
	private Dado d1;
	private Dado d2;
	
	public Juego() {
		j1 = new Jugador("Jugador 1");
		j2 = new Jugador("Jugador 2");
		d1 = new Dado(6);
		d2 = new Dado(6);
		Criterio cr = new Csize(5);
		c = new Cubilete(cr);
	}

	public void jugar() {
		c.agregarDado(d1);
		c.agregarDado(d2);
		for (int i = 0; i < MAX; i++) {
			int t1 = j1.tirar(c);
			int t2 = j2.tirar(c);
			if (t1 > t2)
				j1.incrementar();
			else if (t1 < t2)
				j2.incrementar();
		}
		if (j1.getGanador(j2) != null)
			System.out.println("Gano: " + j1.getGanador(j2).getNombre());
		else
			System.out.println("Empate");
	}
}
