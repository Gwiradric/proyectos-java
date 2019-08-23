package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Electrodomestico e = new Electrodomestico();
		System.out.println("ES BAJO CONSUMO?: " + e.getBajoConsumo());
		System.out.println("ES GAMA ALTA: " + e.getEsGamaAlta());
	}

}
