package ejercicio8;

import java.time.LocalDate;

public class CDia implements Criterio {
	private LocalDate dia;
	
	public CDia(LocalDate dia) {
		this.dia = dia;
	}
	
	public LocalDate getDia() {
		return dia;
	}

	@Override
	public boolean cumple() {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.now();
		return (ld.equals(this.getDia()));
	}

	
}
