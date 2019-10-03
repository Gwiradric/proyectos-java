package ejercicio8;

import java.time.LocalDate;

public class CDia implements Criterio {
	private String dia;
	
	public CDia(String dia) {
		this.dia = dia;
	}

	@Override
	public boolean cumple() {
		// TODO Auto-generated method stub
		LocalDate l = LocalDate.now();
		return (dia.equals(l.getDayOfWeek().toString()));
	}

	
}
