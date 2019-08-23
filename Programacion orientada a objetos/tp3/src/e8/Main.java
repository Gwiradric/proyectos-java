package e8;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fv = LocalDate.now();
		LocalDate fe = LocalDate.of(2017, 11, 27);
		
		TipoCongelado pescadoNitrogeno = new TipoCongelado(fv, fe, 10, "LA GRANJA", 27, 27);
		
		pescadoNitrogeno.add("POLVO DE DIAMANTE");
		
		System.out.println(pescadoNitrogeno.getEtiqueta());
		
	}
}
