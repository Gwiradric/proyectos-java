import java.time.LocalDate;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		//CREO TODOS LOS PASAJEROS
		LocalDate fechaPartida = LocalDate.of(2018, 11, 18);
		LocalDate fechaLlegada = LocalDate.of(2019, 1, 1);
		Pasajero p1 = new Pasajero("Federico Fuhr", "Necochea", fechaPartida, fechaLlegada, 230, 100);
		Pasajero p2 = new Pasajero("Juan Barthes", "Balcarce", fechaPartida, fechaLlegada, 300, 50);
		Pasajero p3 = new Pasajero("David Leguizamon", "Balcarce", fechaPartida, fechaLlegada, 300, 75);
		Pasajero p4 = new Pasajero("Erick Andersson", "Misiones", fechaPartida, fechaLlegada, 600, 200);
		Pasajero p5 = new Pasajero("Carolina Forte", "Necochea", fechaPartida, fechaLlegada, 230, 0);
		fechaPartida = LocalDate.of(2018, 12, 12);
		fechaLlegada = LocalDate.of(2020, 12, 12);
		Pasajero p6 = new Pasajero("Valentina Garcia", "Balcarce", fechaPartida, fechaLlegada, 300, 25);
		Pasajero p7 = new Pasajero("Marco Cordoba", "Tucuman", fechaPartida, fechaLlegada, 750, 0);
		Pasajero p8 = new Pasajero("David D'Ambrosio", "Mar del Plata", fechaPartida, fechaLlegada, 400, 175);
		Pasajero p9 = new Pasajero("Horacio Casado", "Mar del Plata", fechaPartida, fechaLlegada, 400, 55.5);
		Pasajero p10 = new Pasajero ("Mainque Menjolou", "Loberia", fechaPartida, fechaLlegada, 260, 0.5);
		
		Vector<Pasajero> pasajeros = new Vector<Pasajero>();
		pasajeros.add(p1);
		pasajeros.add(p2);
		pasajeros.add(p3);
		pasajeros.add(p4);
		pasajeros.add(p5);
		pasajeros.add(p6);
		pasajeros.add(p7);
		pasajeros.add(p8);
		pasajeros.add(p9);
		pasajeros.add(p10);
		
		Contingente c1 = new Contingente("El Rapido", "Misiones", fechaPartida, fechaLlegada, new FDestino("Misiones"));
		for (int i = 0; i < pasajeros.size(); i++) {
			c1.addElemento(pasajeros.elementAt(i));
		}
		
		fechaPartida = LocalDate.of(2018, 11, 18);
		Contingente c2 = new Contingente("Via Tac", "Necochea", fechaPartida, fechaLlegada, new FAnd(new FDestino("Necochea"), new FPartida(fechaPartida)));
		for (Pasajero pasajero : pasajeros) {
			c2.addElemento(pasajero);
		}
		
		Contingente c3 = new Contingente("Via Cargo", "Balcarce", fechaPartida, fechaLlegada, new FDestino("Balcarce"));
		for (Pasajero pasajero : pasajeros) {
			c3.addElemento(pasajero);
		}
		
		Contingente c4 = new Contingente("Algo", "COSA", fechaPartida, fechaLlegada, new FDeudaMayor(0));
		c4.addElemento(c1);
		c4.addElemento(c2);
		c4.addElemento(c3);
		for (Pasajero pasajero : pasajeros) {
			c4.addElemento(pasajero);
		}
		
		Vector<STurismo> r2 = c4.buscar(new FDeudaMayor(0));
		for (STurismo s : r2) {
			System.out.println(s.getNombre() + ". ");
		}
		
		System.out.println("");
		System.out.println("PASAJERO MAYOR DEUDA: " + c4.getPasajeroMayorDeuda().getNombre());
		System.out.println("CANTIDAD DE PASAJEROS: " + c4.getCantPasajeros());
		System.out.println("TOTAL DEUDA: " + c4.getDeuda());
		
		
	}

}
