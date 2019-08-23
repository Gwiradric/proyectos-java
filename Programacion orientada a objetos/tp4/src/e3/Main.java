package e3;

import java.time.LocalDate;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Comparador c1 = new Comparador();
		
		Criterio c2 = new CNotMaterial("Pino");
		Criterio c3 = new CNotMaterial("Cosa");
		
		ColaPrioridad cola = new ColaPrioridad(c1);
		ColaPrioridad cola2 = new ColaPrioridad(c1);
		
		
		Fabrica f = new Fabrica(cola, c2, null);
		Fabrica f2 = new Fabrica(cola2, c3, null);
		f.setSig(f2);
		
		LocalDate fP = LocalDate.now();
		LocalDate fE = LocalDate.of(2019, 9, 21);
		
		Pedido p0 = new Pedido("Silla", "Cosa", "La Plata", fE, fP, 1000);
		Pedido p1 = new Pedido("Mesa", "Roble", "Necochea", fE, fP, 300);
		Pedido p2 = new Pedido("Techo", "Pino", "La Plata", fE, fP, 1000);
		Pedido p3 = new Pedido("Cama", "Cahoba", "Tandil", fE, fP, 200);
		Pedido p4 = new Pedido("Hamaca", "Pino", "Buenos Aires, Capital", fE, fP, 150);
		Pedido p5 = new Pedido("Ventana", "Tierra", "Necochea", fE, fP, 300);
		
		f.add(p0);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		
		Vector<Pedido> v1 = f.getPedidos();
		System.out.println("FABRICA 1: ");
		for (int i = 0; i < v1.size(); i++)
			System.out.println(v1.elementAt(i).getNombre() + "," + v1.elementAt(i).getCosto());
		
		v1 = f2.getPedidos();
		System.out.println("FABRICA 2: ");
		for (int i = 0; i < v1.size(); i++)
			System.out.println(v1.elementAt(i).getNombre() + "," + v1.elementAt(i).getCosto());
		
	
	}

}
