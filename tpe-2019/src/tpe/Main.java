package tpe;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPromPeso c1 = new CPromPeso(650);
		
		Ganado g1 = new Ganado(1, 9, 700, "Negra sucia", "Macho", false);
		Ganado g2 = new Ganado(2, 9, 500, "Negra", "Machirulo", true);
		Ganado g3 = new Ganado(3, 9, 650, "Negra negra", "Hembra", false);
		Ganado g4 = new Ganado(4, 9, 10000, "Negra fea", "Hembra", true);
		Ganado g5 = new Ganado(5, 9, 200, "Negra linda", "Macho", true);
		
		Vector<SHacienda> s1 = new Vector<SHacienda>();
		s1.add(g1);
		s1.add(g2);
		s1.add(g3);
		s1.add(g4);
		s1.add(g5);
		
		
		Hacienda h1 = new Hacienda();
		h1.add(g3);
		h1.add(g5);
		
		Hacienda h2 = new Hacienda(s1);
		
		h1.add(h2);
		h1.add(g1);
		h1.add(g2);
		
		System.out.println(h1.buscar(c1));
		
		
		
	}

}
