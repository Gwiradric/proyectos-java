package ejercicio8;

import java.time.LocalDate;

public class CAnioPar implements Criterio{

	@Override
	public boolean cumple() {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.now();
		return (ld.getYear()%2 == 0);
	}
	
	
}
